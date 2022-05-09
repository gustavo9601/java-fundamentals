package Ejercicios;

public class MatricesMarco {


    public static void main(String[] args) {
        int[][] matriz = new int[4][4]; // Por default crea una matriz en 0 de 4*4
        imprimirMatriz(matriz, "Matriz inicial");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // En las posiciones 0 o esten en los extremos
                if (i == 0 || i == matriz.length - 1 ||
                        j == 0 || j == matriz[i].length - 1
                ) {
                    matriz[i][j] = 1;
                }
            }
        }

        imprimirMatriz(matriz, "Matriz marco");
    }


    public static void imprimirMatriz(int[][] matriz, String titulo) {
        System.out.println(titulo);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
