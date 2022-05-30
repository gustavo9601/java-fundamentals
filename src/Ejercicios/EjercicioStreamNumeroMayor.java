package Ejercicios;

import java.util.Arrays;
import java.util.function.Function;

public class EjercicioStreamNumeroMayor {

    /*
     * El siguiente ejercicio es obtener el numero mayor de un arreglo pero utilizando programación funcional,
     * implementando la expresión lambda Function<T,R> (que viene predefinida) con el api stream y operador reduce.
     * */

    public static void main(String[] args) {
        Function<Integer[], Integer> numeroMayor = (numeros) -> {
            return Arrays.stream(numeros)
                    .reduce(0, (a, b) -> a > b ? a : b); // ordenando el arreglo de estream
        };

        Integer[] numeros = {1, 2, 3, 4, 5, 100, 7, 8, 9, 10};
        System.out.println("numeroMayor=t" + numeroMayor.apply(numeros));

    }

}
