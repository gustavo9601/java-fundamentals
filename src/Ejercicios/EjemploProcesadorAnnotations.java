package Ejercicios;

import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class EjemploProcesadorAnnotations {
    public static void main(String[] args) {
        ProductoConAnotaciones producto = new ProductoConAnotaciones();
        producto.setNombre("Leche");
        producto.setPrecio(900L);
        producto.setFecha(LocalDate.now());

        String json = JsonSerializador.convertirJson(producto);
        System.out.println(json);

        InicializadorClaseFake.inicializar(producto);
    }
}

class InicializadorClaseFake {
    public static void inicializar(Object obj) {

        if (Objects.isNull(obj)) {
            throw new RuntimeException("El objeto no puede ser nulo");
        }

        Method[] metodos = obj.getClass().getDeclaredMethods(); // Obteniendo todos los metodos declarados en la clase

        Arrays.stream(metodos)
                .peek((metodo) -> {
                    System.out.println("Peek=\tMetodo:\t" + metodo.getName());
                })
                .filter(metodo -> metodo.isAnnotationPresent(Init.class))
                .forEach(metodo -> {
                    metodo.setAccessible(true); // Permitiendo acceso al metodo
                    try {
                        // Invocando al metodo que tenga la anotacion Init
                        System.out.println("Invoking:\t" + metodo.getName());
                        metodo.invoke(obj);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new RuntimeException("Error al invocar el metodo, mensaje=\t" + e.getMessage(), e);
                    }
                });

    }
}

class JsonSerializador {
    public static String convertirJson(Object obj) {

        if (Objects.isNull(obj)) {
            throw new RuntimeException("El objeto no puede ser nulo");
        }

        Field[] atributos = obj.getClass().getDeclaredFields(); // Obteniendo todos los atributos declarados la clase

        return Arrays.stream(atributos) // Convertimos el array a strem
                .filter(atributo -> atributo.isAnnotationPresent(JsonAtributo.class)) // Filtramos solo los campos que tengan la anotacion JsonAtributo
                .map(atributo -> {
                    atributo.setAccessible(true); // Permitimos acceder a los atributos privados para ser accedidos mediante reflexion
                    String nombre = atributo.getAnnotation(JsonAtributo.class).nombre()
                            .equals("") // Si no se especifica el nombre, se toma el nombre del atributo
                            ? atributo.getName()
                            : atributo.getAnnotation(JsonAtributo.class).nombre();

                    boolean isCapitalizable = atributo.getAnnotation(JsonAtributo.class).capitalizar();

                    try {
                        return "\"" + ((isCapitalizable && nombre instanceof String) ? JsonSerializador.capitalizarTexto(nombre) : nombre) + "\":\"" + atributo.get(obj) + "\"";
                    } catch (IllegalAccessException e) {
                        // Hacemos que la exepcion de ocurrir se de en ejecucion
                        throw new RuntimeException("Erro al serializar el atributo | Mensaje=\t" + e.getMessage());
                    }

                }).reduce("{", (a, b) -> {
                    // concatenando los valores a un json
                    if ("{".equals(a)) {
                        return a + b;
                    }
                    return a + "," + b;
                })
                .concat("}");
    }

    public static String capitalizarTexto(String texto) {
        return texto.substring(0, 1).toUpperCase() + texto.substring(1).toLowerCase();
    }
}


@Target(ElementType.FIELD) // Target especifica sobre que elemento se podra aplicar la anotacion o decorador
@Retention(RetentionPolicy.RUNTIME)
@interface JsonAtributo {
    String nombre() default "";

    boolean capitalizar() default false;
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD) // Anotacion que aplicara sobre metodos
@interface Init {

}

class ProductoConAnotaciones {
    @JsonAtributo(capitalizar = true)
    private String nombre;
    @JsonAtributo(nombre = "costo_atributo", capitalizar = false)  // Anotacion con valor por defecto
    private Long precio;
    private LocalDate fecha;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Init
    private void init() {
        System.out.println("** No haceee nada el init en ProductoConAnotaciones **");
    }
}
