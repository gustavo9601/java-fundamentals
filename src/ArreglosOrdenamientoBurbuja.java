public class ArreglosOrdenamientoBurbuja {

    public static void main(String[] args) {
        String[] nombres = {"Gustavo", "Alejandro", "Meliza", "Cinthya"};

        // Ordenando numeros
        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres.length; j++) {
                // compareTo // compara con unicode el orden de los string
                // a < b = a esta por debajo de b
                // a = b = a esta igual que b sera 0
                // a > b = a esta por encima de b

                System.out.println("nombres[" + nombres[i] + "].compareTo(" + nombres[j] + ") = " + nombres[i].compareTo(nombres[j]));
                if (nombres[i].compareTo(nombres[j]) < 0) {
                    String nombreAuxiliar = nombres[i];
                    nombres[i] = nombres[j];
                    nombres[j] = nombreAuxiliar;
                }
            }
        }

        // Imprimiendolo despues de ordenarlo
        for (String nombre : nombres) {
            System.out.println("Nombre  = " + nombre);
        }
    }
}
