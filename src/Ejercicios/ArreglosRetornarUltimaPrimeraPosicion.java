package Ejercicios;

import java.util.Scanner;

/*
 *
 * Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos.
 * Luego debemos mostrarlos en el siguiente orden: el último, el primero, el penúltimo, el segundo,
 * el antepenúltimo, el tercero, y así sucesivamente.
 *
 * */

public class ArreglosRetornarUltimaPrimeraPosicion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("******************");
        int[] numeros = new int[10];
        int[] numerosOrganizados = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese numero en la posicion " + i + ":");
            numeros[i] = scanner.nextInt();
        }

        ArreglosRetornarUltimaPrimeraPosicion.imprimirArreglos(numeros, "Arreglo Inicial");
        int contador = 0;
        for (int i = 0; i < numeros.length / 2; i++) {
            // Desde el ultimo
            numerosOrganizados[contador++] = numeros[numeros.length - 1 - i];
            // Desde el primero
            numerosOrganizados[contador++] = numeros[i];
        }

        ArreglosRetornarUltimaPrimeraPosicion.imprimirArreglos(numerosOrganizados, "Arreglo Ordenado desde ultimo / primero");
    }


    public static void imprimirArreglos(int[] arregloNumeros, String titulo) {
        System.out.println(titulo);
        for (int i = 0; i < arregloNumeros.length; i++) {
            System.out.println("arreglo[" + i + "] = " + arregloNumeros[i]);
        }
    }
}
