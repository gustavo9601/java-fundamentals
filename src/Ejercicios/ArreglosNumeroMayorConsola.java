package Ejercicios;

import java.util.Scanner;

public class ArreglosNumeroMayorConsola {

    public static void main(String[] args) {

        int[] numeros = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 5 numeros enteros");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero #" + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Encontrando el mayor
        int posicionConNumeroMaximo = 0;
        for (int i = 1; i < numeros.length; i++) {
            posicionConNumeroMaximo = (numeros[posicionConNumeroMaximo] > numeros[i]) ? posicionConNumeroMaximo : i;
        }
        System.out.println("El mayor es = " + numeros[posicionConNumeroMaximo]);
    }

}
