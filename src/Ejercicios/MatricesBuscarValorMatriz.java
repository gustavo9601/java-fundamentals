package Ejercicios;

import java.util.Scanner;

public class MatricesBuscarValorMatriz {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese numero a buscar en la matriz");
        int valorABuscar = scanner.nextInt();
        int fila = 0;
        int columna = 0;
        boolean seEncontro = false;

        cicloPadre:
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (valorABuscar == matriz[i][j]) {
                    seEncontro = true;
                    fila = i;
                    columna = j;
                    break cicloPadre;
                }
            }
        }

        String mensaje = (seEncontro) ? "Se encontro el numero: " + valorABuscar + "en la coordinada matriz[" + fila + "][" + columna + "]" : "No se encontro el numero: " + valorABuscar;
        System.out.println(mensaje);


    }
}
