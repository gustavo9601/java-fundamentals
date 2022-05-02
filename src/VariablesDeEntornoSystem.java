import java.util.Map;

public class VariablesDeEntornoSystem {
    public static void main(String[] args) {
        // diccionario llave valor
        Map<String, String> variablesAmbiente = System.getenv();

        /*
        * Por consola se puede crear variables
        *
        * setx NAME_VARIABLE "VALUE"
        * */

        System.out.println("***************");
        System.out.println("Todas las variables del sistema");
        System.out.println("***************");
        // .keySet // devuelve arreglo de los keys del diccionaio
        for (String key: variablesAmbiente.keySet()) {
            System.out.println(key + " => " + variablesAmbiente.get(key));
        }



        System.out.println("variablesAmbiente = " + variablesAmbiente);


        System.out.println("PROCESSOR_LEVEL = " + System.getenv("PROCESSOR_LEVEL"));
        System.out.println("JAVA_HOME = " + System.getenv("JAVA_HOME"));
        System.out.println("PATH = " + System.getenv("JAVA_HOME"));
        // Accediendo al diccionario
        System.out.println("HOMEDRIVE = " + variablesAmbiente.get("HOMEDRIVE"));

    }
}
