
class Persona {
    private String nombre;

    public void actualizarNombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerNombre() {
        return this.nombre;
    }
}

public class ValorVsReferencia {

    public static void main(String[] args) {
        String text1 = "Gustavo";
        // Pasando por referencia
        String text2 = text1;
        System.out.println("inicio text2 = " + text2);
        // Aunque se pase la variable, en Java las clases Wrapper son Inmutables y no cambia el valor inicial
        ValorVsReferencia.testPrint(text2);
        System.out.println("fin text2 = " + text2);

        /*
         *
         * Los arreglos se pasan por referencia, enviando el mismo puntero de memoria
         * */
        int[] edades = {10, 11, 12};
        System.out.println("Antes array");
        for (int i = 0; i < edades.length; i++) {
            System.out.println("edades[i]: " + edades[i]);
        }

        ValorVsReferencia.testPrint(edades);
        System.out.println("Despues Array");
        for (int i = 0; i < edades.length; i++) {
            System.out.println("edades[i]: " + edades[i]);
        }

        /*
         * Modificando por referencia un objeto propio
         * */
        Persona persona = new Persona();
        persona.actualizarNombre("Gustavo");
        System.out.println("persona.obtenerNombre(): " + persona.obtenerNombre());
        testPrint(persona, "Adolfo Marquez");
        System.out.println("persona.obtenerNombre() despues: " + persona.obtenerNombre());


    }

    public static void testPrint(String text) {
        System.out.println("Valor inicio testPrint text: " + text);
        text = "Gustavo Marquez";
        System.out.println("Valor final testPrint text: " + text);
    }


    public static void testPrint(int[] edades) {
        System.out.println("Iniciando el cambio array por referencia");
        for (int i = 0; i < edades.length; i++) {
            edades[i] = edades[i] * 100;
        }
        System.out.println("Finalizando el cambio array por referencia");
    }

    public static void testPrint(Persona persona, String nombre) {
        System.out.println("Modificando persona: persona.obtenerNombre()" + persona.obtenerNombre());
        persona.actualizarNombre(nombre);
    }
}
