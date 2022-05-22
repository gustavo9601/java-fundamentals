import javax.swing.*;

public class Excepciones {
    /*
     * Error o evento que ocurre durante la ejecucion del programa
     * */

    public static void main(String[] args) {
        try {

            String valor = JOptionPane.showInputDialog("Ingrese un entero:");
            int divisor = Integer.parseInt(valor);

            int division = 100 / divisor;
            System.out.println("division = " + division);


        } catch (NumberFormatException exception) {
            System.out.println("No se pudo parsear a entero, mensaje= " + exception.getMessage());
        } catch (ArithmeticException exception) {
            System.out.println("Error se esta diviendo por 0, mensaje= " + exception.getMessage());
            // Exception // clase mas generica para el manejo de errores
        } catch (Exception exception) {
            System.out.println("Captura del error en tiempo de ejecucion, mensaje= " + exception.getMessage());
            // finally siempre se ejecuta con o sin excepcion
        } finally {
            System.out.println("Ejecutando siempre finally");
        }
    }
}
