package Ejercicios;

import java.util.Scanner;

public class PedirNumerosYOrdenarlosMayorAMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numero 1");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Numero 2");
        int number2 = Integer.parseInt(scanner.nextLine());

        String answer = (number1 > number2) ? number1 + " " + number2 : number2 + " " + number1;
        System.out.println("answer " + answer);

    }
}
