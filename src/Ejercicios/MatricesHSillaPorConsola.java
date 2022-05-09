package Ejercicios;

import java.util.Scanner;

public class MatricesHSillaPorConsola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamañao de la matrix N*N");
        int sizeMatriz = scanner.nextInt();


        if (sizeMatriz == 0) {
            System.err.println("No se puede crear una matriz de 0*0");
            return;
        }


        int[][] matriz = new int[sizeMatriz][sizeMatriz];
        imprimirMatriz(matriz, "Matriz h o silla");

        int mitad = Math.round(matriz.length / 2);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if( j == 0 || i == mitad || (j == matriz[i].length - 1 && i > mitad)){
                    matriz[i][j] = 1;
                }
            }
        }
        imprimirMatriz(matriz, "Matriz X");

    }

    public static void imprimirMatriz(int[][] matriz, String titulo) {
        System.out.println(titulo);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
