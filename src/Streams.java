import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
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
                .build(); // Necesario para hacer la conversion del tipo Strem Object a Strem Integer


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


        List<Usuario> listUsuarios = streamUsuarios.toList(); // Convierte de strem to list

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
        System.out.println("primerUsuario=\t" + primerUsuario.get()); // .get() para obtener el valor


        Optional<Usuario> culaquierUsuario = Stream.of(new String[]{"Juan", "Pedro Jjavier", "Maria"})
                .map(nombre -> new Usuario(nombre.toLowerCase(), null, ((int) Math.round(Math.random() * 10))))
                .findAny(); // Retorna cualquier elemento
        System.out.println("culaquierUsuario=\t" + culaquierUsuario.get()); // .get() para obtener el valor

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
        return this.apellido;
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
}