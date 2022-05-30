package Ejercicios;

import java.util.stream.Stream;

public class StreamEjemplos {
    public static void main(String[] args) {

        long cantidadNombresVacios = Stream.of("Gus", "Meli", "", "Martha", "sergio", "")
                .filter(String::isEmpty) // filtra solo los vacios
                .count();
        System.out.println("cantidadNombresVacios = " + cantidadNombresVacios);


        Stream<String> nombresUnicos = Stream.of("Gus", "Meli", "", "Martha", "sergio", "sergio", "gus")
                .map(String::toLowerCase) // convierte a minusculas
                .distinct(); // deja valores unicos
        System.out.println("nombresUnicos = " + nombresUnicos);
        nombresUnicos.forEach(System.out::println);

    }
}
