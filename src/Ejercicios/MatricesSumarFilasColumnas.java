package Ejercicios;

public class MatricesSumarFilasColumnas {
    // Deben ser matrices cuadradas
    public static void main(String[] args) {
        int[][] matrizA = {
                {1, 2, 3},
                {5, 6, 7},
                {9, 10, 11},
        };

        int sumaFila, sumaColumna;

        imprimirMatriz(matrizA, "Matriz A");


        for (int i = 0; i < matrizA.length; i++) {
            sumaFila = 0;
            sumaColumna = 0;
            for (int j = 0; j < matrizA[i].length; j++) {
                sumaFila += matrizA[i][j];
                sumaColumna += matrizA[j][i]; // Se invierte el orden
            }
            System.out.println("sumaFila " + i + " = " + sumaFila);
            System.out.println("sumaColumna " + i + " = " + sumaColumna);
        }


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
