package Ejercicios;

public class MatricesSumar {
    // Deben ser matrices cuadradas
    public static void main(String[] args) {
        int[][] matrizA = {
                {1, 2, 3},
                {5, 6, 7},
                {9, 10, 11},
        };
        int[][] matrizB = {
                {10, 20, 30},
                {50, 60, 70},
                {90, 100, 110},
        };

        imprimirMatriz(matrizA, "Matriz A");
        imprimirMatriz(matrizB, "Matriz B");

        int[][] matrizSuma = new int[3][3];
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizSuma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        imprimirMatriz(matrizSuma, "Matriz Suma");
    }

    public static void imprimirMatriz(int[][] matriz, String titulo){
        System.out.println(titulo);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
