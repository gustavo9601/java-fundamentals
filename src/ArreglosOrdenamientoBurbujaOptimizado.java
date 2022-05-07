public class ArreglosOrdenamientoBurbujaOptimizado {

    /*
     * Matriz explicacion
     *
     * https://i.imgur.com/x6LEuqI.png
     * https://i.imgur.com/8efYcE6.png
     * */

    public static void main(String[] args) {
        String[] nombres = {"Gustavo", "Alejandro", "Meliza", "Cinthya"};
        Integer[] numeros = {10, 200, 300, 1, 2, 3};
        int contador = 0;

        // Ordenando nombres
        ArreglosOrdenamientoBurbujaOptimizado.ordenamientoBurbujaOptimizado(nombres);

        // Ordenando numeros
        ArreglosOrdenamientoBurbujaOptimizado.ordenamientoBurbujaOptimizado(numeros);


        // Imprimiendolo despues de ordenarlo
        for (String nombre : nombres) {
            System.out.println("Nombre  = " + nombre);
        }
        for (Integer numero : numeros) {
            System.out.println("Numero  = " + numero);
        }


    }


    // Recibimos un tipo Object que es el mas generico
    public static void ordenamientoBurbujaOptimizado(Object[] arreglo) {
        // Ordenando diferentes tipos de dato
        int contador = 0;
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                // compareTo // compara con unicode el orden de los string
                // a < b = a esta por debajo de b
                // a = b = a esta igual que b sera 0
                // a > b = a esta por encima de b

                System.out.println("arreglo[" + arreglo[i] + "].compareTo(" + arreglo[j] + ") = " + ((Comparable) arreglo[i]).compareTo(arreglo[j]));
                // Casteamos el valor primivo a Comparable que es la interface base de las variables wrapper Integer, String, Boolean etc
                if (((Comparable) arreglo[j + 1]).compareTo(arreglo[j]) < 0) {
                    Object nombreAuxiliar = arreglo[i];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = nombreAuxiliar;
                }
                contador++;
            }
        }
        System.out.println("Cantidad iteraciones: " + contador);
    }
}
