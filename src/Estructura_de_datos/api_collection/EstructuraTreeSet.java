package Estructura_de_datos.api_collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EstructuraTreeSet {
    /*
     * Los TreeSet al igual que en python son colleciones agrupadas  unicas de valores (no permite repetidos) pero son ordenables
     * */

    public static void main(String[] args) {
        Set<String> numerosLetras = new TreeSet<>();
        numerosLetras.add("uno");
        numerosLetras.add("dos");
        numerosLetras.add("tres");
        numerosLetras.add("cuatro");

        // Automaticamente los ordena en funcion de la implementacion del metodo CompareTo de la interfaz Comaprable
        System.out.println("numerosLetras:\t" + numerosLetras);


        Set<Integer> numeros = new TreeSet<>(Comparator.reverseOrder());

        // Otra alternativa para modificar el odenamiento de
        // Set<Integer> numeros = new TreeSet<>((Integer a, Integer b) -> {
        //            return b.compareTo(a); // sobrescribiendo para que organize de forma descendente
        //        });

        numeros.add(1);
        numeros.add(10);
        numeros.add(100);
        System.out.println("Numeros:\t" + numeros);
    }

}
