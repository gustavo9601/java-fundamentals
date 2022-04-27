package Ejercicios;

import java.util.Scanner;

/*
*
*
* La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:

Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos.

Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona. Por ejemplo para Andres debe quedar como N.es

Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).

Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:

N.es_A.ia_E.pe

Preguntas de esta t
*
*
* */

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de nombres:");
        int cantidadNombres = Integer.parseInt(scanner.nextLine());

        StringBuilder nombres = new StringBuilder();
        for (int i = 0; i < cantidadNombres; i ++) {
            System.out.println("Ingrese nombre #" + (i + 1) + " : ");
            String nombre = scanner.nextLine();
            nombres.append(nombre.substring(1, 2).toUpperCase())
                    .append(".")
                    .append(nombre.substring(nombre.length() - 2))
                    .append("_");
        }
        System.out.println("Resultado: " + nombres.substring(0, nombres.length() - 1));
    }
}
