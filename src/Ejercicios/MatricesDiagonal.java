package Ejercicios;

public class MatricesDiagonal {


    public static void main(String[] args) {
        int[][] matriz = new int[4][4]; // Por default crea una matriz en 0 de 4*4
        imprimirMatriz(matriz, "Matriz inicial");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // Cuando coincid en las mismas posiciones arma la diagonal
                if(i == j){
                    matriz[i][j] = 1;
                }
            }
        }

        imprimirMatriz(matriz, "Matriz diagonal");
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
