package Ejercicios;

import java.util.Scanner;

public class AreaCirculo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el radio del circulo:");
        int radioCirculo = scanner.nextInt();
        double areaCirculo = Math.round(Math.PI * Math.pow(radioCirculo, 2));
        System.out.println("areaCirculo = " + areaCirculo);
    }
}
