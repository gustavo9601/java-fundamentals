package Ejercicios;

import java.util.Scanner;

public class MatricesXPorConsola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamañao de la matrix N*N");
        int sizeMatriz = scanner.nextInt();


        if (sizeMatriz == 0) {
            System.err.println("No se puede crear una matriz de 0*0");
            return;
        }


        String[][] matriz = new String[sizeMatriz][sizeMatriz];
        imprimirMatriz(matriz, "Matriz Inicial");


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j || j == (matriz[i].length - (1 + i))) {
                    matriz[i][j] = "X";
                } else {
                    matriz[i][j] = "_";
                }
            }
        }
        imprimirMatriz(matriz, "Matriz X");

    }

    public static void imprimirMatriz(String[][] matriz, String titulo) {
        System.out.println(titulo);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
