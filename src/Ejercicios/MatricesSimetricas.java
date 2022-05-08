package Ejercicios;

public class MatricesSimetricas {
    /*
     * Para identificar si una matriz es simetrica se compara los valores del mismo numero de fila con los valores de la misma columna,
     * y deben tener los mismo valores en en arreglo
     *
     * https://i.imgur.com/hWrBwi5.png
     * */


    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3, 4},
                {2, 1, 0, 3},
                {3, 0, 1, 6},
                {4, 5, 6, 7},
        };
        boolean esSimetrica = true;
        int i = 0, j;

        cicloPadre:
        while (i < matriz.length) {
            j = 0;
            // j < i => se recorrera solo la mitad de la matriz, ya que con eso se puede verificar si es simetrica
            while (j < i) {
                if (matriz[i][j] != matriz[j][i]) {
                    esSimetrica = false;
                    break cicloPadre;
                }
                j++;
            }
            i++;
        }

        System.out.println((esSimetrica) ? "Es simetrica" : "No es simetrica");

    }


}
