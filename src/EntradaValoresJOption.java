import javax.swing.*;

public class EntradaValoresJOption {
    public static void main(String[] args) {

        String numberString = JOptionPane.showInputDialog(null, "Ingrese su edad");
        int age = 0;

        try {
            // parseo de string a entero
            age = Integer.parseInt(numberString);
        } catch (NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(null, "Error, solo se permiten numeros entero cabezon.");
            // Llamada de forma recursiva
            main(args);
            // Cerramos la ejecucion del catch para que no se repita infitas veces
            System.exit(0);
        }

        System.out.println(String.format("age = %s | age * 2 = %s", age, age * 2));
        JOptionPane.showMessageDialog(null, "Eddad ingresada es de: " + age);
        System.out.println("""
                Multi 
                linea 
                string
                """);
    }
}
