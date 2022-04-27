package Ejercicios;

import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("********************************");
        System.out.println("********************************");
        System.out.println("Sistema de login GM");

        String username = "gus";
        String password = "123";


        System.out.println("Ingrese usuario:");
        String user = scanner.nextLine();

        System.out.println("Ingrese contraseña:");
        String pass = scanner.nextLine();

        if (user.equals(username) && pass.equals(password)) {
            System.out.println("Bienvenido");
        } else {
            System.out.println("Rechazado");
        }

    }
}
