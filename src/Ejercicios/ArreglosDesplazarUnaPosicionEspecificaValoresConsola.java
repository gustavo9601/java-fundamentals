package Ejercicios;

import java.util.Scanner;

public class ArreglosDesplazarUnaPosicionEspecificaValoresConsola {

    public static void main(String[] args) {

        int[] numeros = new int[5];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posicion #" + i);
            numeros[i] = scanner.nextInt();
        }


        System.out.println("Posicion a reemplazar entre 0 y " + (numeros.length - 1));
        int posicionReemplazar = scanner.nextInt();
        System.out.println("Valor entero a agregar");
        int valorAAgregar = scanner.nextInt();

        System.out.println("Numeros ingresados");
        ArreglosDesplazarUnaPosicionEspecificaValoresConsola.imprimirArreglo(numeros);

        // Desplazando posicion
        int numeroAnterior = 0;
        int numeroActual;
        boolean seAgregoElValor = false;
        for (int i = posicionReemplazar; i < numeros.length; i++) {
            if (i == 0) {
                numeroAnterior = numeros[i];
            } else {
                numeroActual = numeros[i];
                if (!seAgregoElValor) {
                    seAgregoElValor = true;
                    numeros[i] = valorAAgregar;
                    numeroAnterior = numeroActual;
                } else {
                    numeros[i] = numeroAnterior;
                    numeroAnterior = numeroActual;
                }

            }
        }
        System.out.println("Arreglo con posicion reemplazada");
        ArreglosDesplazarUnaPosicionEspecificaValoresConsola.imprimirArreglo(numeros);


    }


    public static void imprimirArreglo(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numero[" + i + "] = " + numeros[i]);
        }
    }
}
