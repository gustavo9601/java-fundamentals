package Ejercicios;

import java.util.Arrays;

public class ArreglosMayorOcurrenciaModa {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 3, 4, 5, 5, 5, 6, 7};
        int[] numerosUnicos = Arrays.stream(numeros)
                .distinct()
                .toArray();
        int[] cantidadVecesEnArreglo = new int[numerosUnicos.length];

        ArreglosMayorOcurrenciaModa.imprimirArreglos(numeros, "Numeros iniciales");
        ArreglosMayorOcurrenciaModa.imprimirArreglos(numerosUnicos, "Numeros unicos");

        for (int i = 0; i < numerosUnicos.length; i++) {
            int cantidad = 0;
            for (int j = 0; j < numeros.length; j++) {
                if (numerosUnicos[i] == numeros[j]) {
                    cantidad++;
                }
            }
            cantidadVecesEnArreglo[i] = cantidad;
        }

        ArreglosMayorOcurrenciaModa.imprimirArreglos(cantidadVecesEnArreglo, "Cantidad veces en arreglo");

        // Obteniendo el mayor
        // Encontrando el mayor
        int posicionConNumeroMaximo = 0;
        for (int i = 1; i < numerosUnicos.length; i++) {
            posicionConNumeroMaximo = (cantidadVecesEnArreglo[posicionConNumeroMaximo] > cantidadVecesEnArreglo[i]) ? posicionConNumeroMaximo : i;
        }

        System.out.println("Valor que mas se repite = " + numerosUnicos[posicionConNumeroMaximo]);
        System.out.println("Cuantas veces se repite = " + cantidadVecesEnArreglo[posicionConNumeroMaximo]);
    }

    public static void imprimirArreglos(int[] arregloNumeros, String titulo) {
        System.out.println(titulo);
        for (int i = 0; i < arregloNumeros.length; i++) {
            System.out.println("arreglo[" + i + "] = " + arregloNumeros[i]);
        }
    }
}
