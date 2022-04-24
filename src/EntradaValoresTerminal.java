import java.util.Scanner;

public class EntradaValoresTerminal {
    public static void main(String[] args) {

        // Scanner => scaner por consola
        // System.in => indica que recibira argumentos del sistema
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        // Espera que se escriba algo por consola y lo retorna
        String name = scanner.nextLine();

        System.out.println("Tu nombre es: " + name);

        System.out.println("Ingrese su edad");
        int age = scanner.nextInt(); // hace el parseo automaticamente de strin a entero
        System.out.println(String.format("Nombre: %s | Edad: %s", name, age));


    }
}
