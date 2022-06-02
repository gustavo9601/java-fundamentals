import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.Arrays;

public class Annotations {
    /*
     * Util para configuraciones de la aplicacion, usando la notacion de interface, añade o decora con funcionalidades atributos, metodos, clases etc
     * */

    public static void main(String[] args) {
        ProductoConAnotaciones producto = new ProductoConAnotaciones();
        producto.setNombre("Leche");
        producto.setPrecio(900L);
        producto.setFecha(LocalDate.now());

        Field[] atributos = producto.getClass().getDeclaredFields(); // Obteniendo todos los atributos declarados la clase
        for (Field atributo : atributos) {
            System.out.println("atributo = " + atributo);
        }

        String json = Arrays.stream(atributos) // Convertimos el array a strem
                .filter(atributo -> atributo.isAnnotationPresent(JsonAtributo.class)) // Filtramos solo los campos que tengan la anotacion JsonAtributo
                .map(atributo -> {
                    atributo.setAccessible(true); // Permitimos acceder a los atributos privados para ser accedidos mediante reflexion
                    String nombre = atributo.getAnnotation(JsonAtributo.class).nombre()
                            .equals("") // Si no se especifica el nombre, se toma el nombre del atributo
                            ? atributo.getName()
                            : atributo.getAnnotation(JsonAtributo.class).nombre();

                    try {
                        return "\"" + nombre + "\":\"" + atributo.get(producto) + "\"";
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
                .concat("}"); // cerrando el string del json

        // Debera mostrar solo los atributos que tengan la anotacion JsonAtributo
        System.out.println("json = " + json);
    }
}

@Documented //Documentacion de la clase
@Target(ElementType.FIELD) // Target especifica sobre que elemento se podra aplicar la anotacion o decorador
@Retention(RetentionPolicy.RUNTIME) // Retention especifica el tipo sobre el contexto en el que se ejecutara
        // - Runtime en tiempo de ejecucion
        // - Class en tiempo de compilacion
@interface JsonAtributo {
    // default // permite asignar un valor por defecto a la anotacion
    String nombre() default "";

}


class ProductoConAnotaciones {
    @JsonAtributo()
    private String nombre;
    @JsonAtributo(nombre = "costo_atributo")  // Anotacion con valor por defecto
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
}
