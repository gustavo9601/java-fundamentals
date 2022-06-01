package Ejercicios;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class EjercicioFechasConocerEdad {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento (dd/mm/aaaa): ");
        String fechaNacimiento = scanner.nextLine();
        try {
            LocalDate fecha = LocalDate.parse(fechaNacimiento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            Period periodo = Period.between(fecha, LocalDate.now());
            System.out.println("Su edad es: " + periodo.getYears() + " años con " + periodo.getMonths() + " meses y " + periodo.getDays() + " dias");

        } catch (DateTimeParseException exception) {
            System.out.println("La fecha ingresada no es válida.");
            main(args);
            System.exit(0);
        }

    }
}
