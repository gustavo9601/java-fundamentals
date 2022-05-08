package Ejercicios;

import java.util.Arrays;

public class ArreglosHistogramaManual {
    public static void main(String[] args) {
        int[] numeros = {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1};
        int[] numerosUnicos = Arrays.stream(numeros)
                .distinct()
                .toArray();
        int[] cantidadVecesEnArreglo = new int[numerosUnicos.length];

        imprimirArreglos(numeros, "Numeros iniciales");
        imprimirArreglos(numerosUnicos, "Numeros unicos");

        for (int i = 0; i < numerosUnicos.length; i++) {
            int cantidad = 0;
            for (int j = 0; j < numeros.length; j++) {
                if (numerosUnicos[i] == numeros[j]) {
                    cantidad++;
                }
            }
            cantidadVecesEnArreglo[i] = cantidad;
        }

        imprimirArreglos(cantidadVecesEnArreglo, "Cantidad veces en arreglo");

        System.out.println("** Histograma **");
        for (int i = 0; i < numerosUnicos.length; i++) {
            System.out.println(imprimirLineaHistograma(numerosUnicos, cantidadVecesEnArreglo, i));
        }
    }

    public static void imprimirArreglos(int[] arregloNumeros, String titulo) {
        System.out.println(titulo);
        for (int i = 0; i < arregloNumeros.length; i++) {
            System.out.println("arreglo[" + i + "] = " + arregloNumeros[i]);
        }
    }

    public static String imprimirLineaHistograma(int[] numerosUnicos, int[] cantidadVecesEnArreglo, int posicion) {
        String linea = "";
        for (int i = 0; i < cantidadVecesEnArreglo[posicion]; i++) {
            linea += "*";
        }
        return numerosUnicos[posicion] + ": " + linea;
    }
}
