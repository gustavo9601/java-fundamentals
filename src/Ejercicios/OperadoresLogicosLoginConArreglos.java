package Ejercicios;

import java.util.Scanner;

public class OperadoresLogicosLoginConArreglos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("********************************");
        System.out.println("********************************");
        System.out.println("Sistema de login GM Arreglos");


        String[] usernames = new String[2];
        usernames[0] = "gus";
        usernames[1] = "lau";

        String[] passwords = new String[2];
        passwords[0] = "123";
        passwords[1] = "1234";


        System.out.println("Ingrese usuario:");
        String user = scanner.nextLine();

        System.out.println("Ingrese contraseña:");
        String pass = scanner.nextLine();


        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equals(user) && passwords[i].equals(pass)) {
                System.out.println("Autenticado en el indice " + i);
            } else {
                System.out.println("Rechazado en el indice " + i);
            }
        }

    }
}
