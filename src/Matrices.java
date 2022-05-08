import java.util.Arrays;

public class Matrices {
    public static void main(String[] args) {
        // [filas][columnas]
        int[][] matrizNumeros = new int[2][3];
        matrizNumeros[0][0] = 10;
        matrizNumeros[0][1] = 11;
        matrizNumeros[0][2] = 12;
        matrizNumeros[1][0] = 1;

        System.out.println("Numero de filas matrizNumeros = " + matrizNumeros.length);
        System.out.println("Numero de columnas matrizNumeros = " + matrizNumeros[0].length);

        // Declaracion con los valores definidos
        // {{fila 1}, {fila 2}, {fila n...}}
        int[][] numerosValores = {{1, 2, 3}, {4, 5, 6}};

        String[][] objetosMatriz = new String[2][4];
        objetosMatriz[0][0] = "casa";
        objetosMatriz[0][1] = "abrigo";
        objetosMatriz[1][1] = "plancha";
        objetosMatriz[1][2] = "avion";
        objetosMatriz[1][3] = "lancha";

        System.out.println("Recorriendo con for");
        for (int i = 0; i < objetosMatriz.length; i++) {
            for (int j = 0; j < objetosMatriz[i].length; j++) {
                System.out.println("objetosMatriz[" + i + "][" + j + "] = " + objetosMatriz[i][j]);
            }
        }

        System.out.println("Recorriendo con foreach");
        for (String[] fila : objetosMatriz) {
            for (String objeto : fila) {
                System.out.println(" objeto: " + objeto);
            }
        }

        // Matriz de columnas variables
        int[][] matrizVariable = new int[3][];
        matrizVariable[0] = new int[1];
        matrizVariable[1] = new int[2];
        matrizVariable[2] = new int[3];

        for (int i = 0; i < matrizVariable.length; i++) {
            for (int j = 0; j < matrizVariable[i].length; j++) {
                System.out.println("matrizVariable[" + i + "][" + j + "] = " + matrizVariable[i][j]);
            }
        }
        for (int i = 0; i < matrizVariable.length; i++) {
            for (int j = 0; j < matrizVariable[i].length; j++) {
                System.out.print(matrizVariable[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
