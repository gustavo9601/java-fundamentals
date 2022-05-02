/*
 *
 * runtime.exec()  // permite ejecutar funciones del sistema como si fuera la consola nativa
 * */
public class EjecutarNotapadDesdeJava {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        Process process;

        // Abrir el editor de notas en funcion del tipo de SO
        try {

            String so = System.getProperty("os.name");

            if (so.toLowerCase().startsWith("windows")) {
                System.out.println("Es windows y abrira el notepad");
                process = runtime.exec("notepad");
            } else {
                // Se asume que es linux
                System.out.println("Es linux y abrira el textedit");
                process = runtime.exec("textedit");
            }

            // Se queda a la espera hasta que se cierre el proceso
            process.waitFor();

        } catch (Exception exception) {
            System.err.println("Ocurrio un error iniespedao: " + exception.getMessage());
        }
    }
}
