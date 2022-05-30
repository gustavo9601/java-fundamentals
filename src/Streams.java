import java.util.*;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
    /*
     * Aplica un iterator y programacion funcional, utilizando el patro pipe
     * */

    public static void main(String[] args) {

        /*
         * Formas de crear un stream
         * */

        // Stream<tipo> variable = Stream.of(cualquier tipo)
        Stream<String> streamNombres = Stream.of("Juan Carlos", "Pedro padrin", "Maria Magdalena");

        String[] words = {"Hello", "World", "!"};
        // Arrays.stream(lista)
        Stream<String> streamWords = Arrays.stream(words);

        // Stream.<Tipo>builder().add(valor).build()
        Stream<Integer> streamNumeros = Stream.<Integer>builder()
                .add(1)
                .add(2)
                .add(3)
                .build(); // Necesario para hacer la conversion del tipo Strem Object a Stream Integer


        List<String> listaCiudades = Arrays.asList("Madrid", "Barcelona", "Valencia", "Sevilla");

        // Collection.stream();
        Stream<String> streamCiudades = listaCiudades.stream();





        /*
         * Operadores
         * */

        // .forEach(action)
        System.out.println("forEach");
        streamNombres.forEach(word -> {
            System.out.println("word=\t" + word);
        });

        // .map(transafomation)
        System.out.println("map");
        streamWords = streamWords.map((String word) -> word.toUpperCase().concat(" 2022"));
        streamWords.forEach(System.out::println);

        Stream<Usuario> streamUsuarios = Stream.of(new String[]{"Juan Carlos", "Pedro padrin", "Maria Magdalena"})
                .map(nombre -> new Usuario(nombre.split(" ")[0].toLowerCase(), nombre.split(" ")[1].toLowerCase(), 1))
                .peek(usuario -> {
                    System.out.println("usuario antes de map= " + usuario);
                })
                .map(usuario -> {
                    usuario.setEdad((int) Math.round(Math.random() * 10));
                    usuario.setNombre(usuario.getNombre().toUpperCase());
                    return usuario;
                })
                .peek(usuario -> {
                    System.out.println("usuario despues de map= " + usuario);
                });


        List<Usuario> listUsuarios = streamUsuarios.toList(); // Convierte de stream to list

        List<Usuario> listUsuarios2 = Stream.of(new String[]{"Juan", "Pedro", "Maria"})
                .map(nombre -> new Usuario(nombre.toLowerCase(), null, 10))
                .toList();  // Otra alternativa directa de conversion


        // .peek(action)  // Flujo intermedio para saber el util para debug del pipe, pero permite modificar al igual que el map
        streamNumeros.peek((Integer numero) -> {
            System.out.println("numero=\t" + numero);
        }).forEach(System.out::println);


        // .filter(predicate)
        List<Usuario> listUsuariosFiltrados = Stream.of(new String[]{"Juan", "Pedro Jjavier", "Maria"})
                .map(nombre -> new Usuario(nombre.toLowerCase(), null, ((int) Math.round(Math.random() * 10))))
                .filter(usuario -> usuario.getEdad() > 2) // Predicado para filtrar todos los usuarios
                .filter(usuario -> usuario.getNombre().contains("j"))
                .toList(); // retornandolos a lista
        listUsuariosFiltrados.forEach(usuario -> {
            System.out.println("usuario filtrado=\t" + usuario);
        });


        Optional<Usuario> primerUsuario = Stream.of(new String[]{"Juan", "Pedro Jjavier", "Maria"})
                .map(nombre -> new Usuario(nombre.toLowerCase(), null, ((int) Math.round(Math.random() * 10))))
                .findFirst(); // Retorna el primer elemento
        // .orElse(defaultValue) // Retorna el primer elemento si existe, sino retorna el defaultValue a cambio del .get()
        // .orElseGet(lambda si es null el valor) // Retorna el primer elemento si existe, sino retorna el defaultValue de una lambda
        // .orElseThrow(lambda si es null el valor) // Retorna el primer elemento si existe, sino lanza una excepcion
        System.out.println("primerUsuario=\t" + primerUsuario.get()); // .get() para obtener el valor, proveniente del Optional
        if (primerUsuario.isPresent()) { // .isPresent() para saber si existe el valor diferente a null
            System.out.println("primerUsuario.isPresent()=\t" + primerUsuario.isPresent());
        }


        Optional<Usuario> culaquierUsuario = Stream.of(new String[]{"Juan", "Pedro Jjavier", "Maria"})
                .map(nombre -> new Usuario(nombre.toLowerCase(), null, ((int) Math.round(Math.random() * 10))))
                .findAny(); // Retorna cualquier elemento
        System.out.println("culaquierUsuario=\t" + culaquierUsuario.get()); // .get() para obtener el valor, proveniente del Optional

        // .anyMatch() // Retorna booleano si al menos un elemento cumple con el predicado
        boolean algunUsuario = Stream.of(new String[]{"Juan", "Pedro Jjavier", "Maria"})
                .anyMatch(nombre -> nombre.contains("j")); // Evalua que almenos algun elemento cumple con el predicado, y detiene la iteracion
        System.out.println("algunUsuario = " + algunUsuario);


        // .count() // Retorna el numero de elementos que cumplen con el predicado
        long numeroUsuarios = Stream.of(new String[]{"Juan", "Pedro Jjavier", "Maria"})
                .count();
        System.out.println("numeroUsuarios = " + numeroUsuarios);


        // .distinct() // Retorna un stream con los elementos unicos
        Stream<String> nombresUnicos = Stream.of("Gus", "Meli", "", "Martha", "sergio", "sergio", "gus")
                .map(String::toLowerCase) // convierte a minusculas
                .distinct(); // deja valores unicos
        System.out.println("nombresUnicos = " + nombresUnicos);
        nombresUnicos.forEach(System.out::println);

        System.out.println("Usuarios unicos");
        Stream.of(new Usuario("Gus", null, 10),
                        new Usuario("Meli", null, 10),
                        new Usuario("Martha", null, 10),
                        new Usuario("Martha", null, 10),
                        new Usuario("sergio", null, 10)
                ).distinct() // Como es de una clase, la clase debe implementar el equals y el hashcode
                .forEach(System.out::println);


        // .reduce(valor_inicial, lambda 2 parametros) // Retorna un valor, aplicando una operacion sobre los elementos anterior y actual de la interacion
        String nombresConcatenadosReduce = Stream.of("Gus", "Meli", "Martha", "sergio", "sergio", "gus")
                .reduce("", (nombreAnterior, nombreActual) -> nombreAnterior + " | " + nombreActual);
        System.out.println("nombresConcatenadosReduce = " + nombresConcatenadosReduce);

        int sumatoriaReduce = Stream.of(1, 2, 3, 4, 5)
                // (acumulador, valorActual) -> acumulador + valorActual == Integer::sum // lambda que suma los elementos
                .reduce(0, (acumulador, valorActual) -> acumulador + valorActual); // inicia en 0 y va sumando la iteracion
        System.out.println("sumatoriaReduce = " + sumatoriaReduce);


        // .range(initial, final - 1) // Retorna un stream con los valores de un rango
        // .sum() // Retorna la suma de los elementos si es de tipo IntStream
        IntStream numeros = IntStream.range(1, 10).peek(System.out::println); // Imprime los valores del rango
        System.out.println("suma con building function sum()= " + numeros.sum()); // Retorna la suma de los valores del rango

        // IntSummaryStatistics // Retorna un objeto con la suma, media, minimo, maximo y cantidad de elementos
        IntSummaryStatistics estadisticas = IntStream.range(500, 1000).summaryStatistics(); // Retorna un objeto con las estadisticas del rango
        System.out.println("Rango: IntStream.range(500, 1000).summaryStatistics()");
        System.out.println("estadisticas.getAverage() = " + estadisticas.getAverage());
        System.out.println("estadisticas.getMax() = " + estadisticas.getMax());
        System.out.println("estadisticas.getMin() = " + estadisticas.getMin());
        System.out.println("estadisticas.getCount() = " + estadisticas.getCount());
        System.out.println("estadisticas.getSum() = " + estadisticas.getSum());

    }
}


class Usuario {

    private String nombre;
    private String apellido;
    private int edad;


    public Usuario(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return (this.apellido != null) ? this.apellido : "";
    }

    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;
        return this.getEdad() == usuario.getEdad() && Objects.equals(this.getNombre(), usuario.getNombre()) && Objects.equals(this.getApellido(), usuario.getApellido());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getApellido(), getEdad());
    }
}