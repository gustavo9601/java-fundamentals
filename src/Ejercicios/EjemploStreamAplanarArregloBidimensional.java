package Ejercicios;

import java.util.Arrays;
import java.util.List;


public class EjemploStreamAplanarArregloBidimensional {

    /*
    * El siguiente ejercicio es aplanar un arreglo bidimensional en un nivel y eliminar repetidos usando el api stream.

        Aplanar un arreglo significa quitar los elementos del arreglo anidado y dejarlos en el arreglo de primer nivel.

        Por ejemplo, para el arreglo:

        String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};

        debería quedar:

        {"java", "groovy", "php", "c#", "python", "javascript", "kotlin"};
    *
    * */

    public static void main(String[] args) {
        String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};


        List<String> lenguajesAplanados = Arrays.stream(lenguajes)
                .flatMap((lenguaje) -> Arrays.stream(lenguaje))
                .distinct()
                .toList();

        System.out.println("lenguajesAplanados=\t" + lenguajesAplanados);

    }
}
