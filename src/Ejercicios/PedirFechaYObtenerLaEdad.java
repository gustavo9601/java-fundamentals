package Ejercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class PedirFechaYObtenerLaEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la fecha en el formato dd/MM/yyyy");
        String fechaString = scanner.nextLine();

        Date hoy = new Date();
        TimeUnit tiempoDias = TimeUnit.DAYS;

        SimpleDateFormat formatoString = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date fechaIngresada = formatoString.parse(fechaString);
            long diferenciaTime = hoy.getTime() - fechaIngresada.getTime();
            long diferenciaDias = tiempoDias.convert(diferenciaTime, TimeUnit.MILLISECONDS);

            System.out.println("Dias de diferencia: " + diferenciaDias);
            System.out.println("Años: " + (diferenciaDias / 365));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
