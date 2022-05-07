package Ejercicios;

import java.util.Scanner;

public class ArreglosDesplazarUnaPosicionValoresConsola {

    public static void main(String[] args) {

        int[] numeros = new int[5];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posicion #" + i);
            numeros[i] = scanner.nextInt();
        }
        System.out.println("Numeros ingresados");
        ArreglosDesplazarUnaPosicionValoresConsola.imprimirArreglo(numeros);

        // Desplazando posicion
        int numeroAnterior = 0;
        int numeroActual;
        for (int i = 0; i < numeros.length; i++) {
            if (i == 0) {
                numeroAnterior = numeros[i];
                numeros[i] = numeros[numeros.length - 1];
            } else {
                numeroActual = numeros[i];
                numeros[i] = numeroAnterior;
                numeroAnterior = numeroActual;
            }
        }
        System.out.println("Arreglo con posicion cambiada");
        ArreglosDesplazarUnaPosicionValoresConsola.imprimirArreglo(numeros);


    }


    public static void imprimirArreglo(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numero[" + i + "] = " + numeros[i]);
        }
    }
}
