import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FechasUtilDate {
    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println("fecha = " + fecha);
        /*
            Mas parametros
        * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/text/SimpleDateFormat.html
        * */
        // dia / mes / año
        SimpleDateFormat fechaFormateada = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat fechaFormateada2 = new SimpleDateFormat("d 'de' MMMM, yyyy");
        String formatFecha = fechaFormateada.format(fecha);
        System.out.println("formatFecha = " + formatFecha);
        System.out.println("format dd 'de' MMMM, yyyy = " + fechaFormateada2.format(fecha));

        // Unix timestamp
        // Retorna el tiempo en long
        System.out.println("fecha.getTime() = " + fecha.getTime());

        // Parseando fechas
        SimpleDateFormat formatString = new SimpleDateFormat("yyyy/MM/dd"); // Especificando el formato en el que se va a recibir
        String fechaString = "2022/01/31";
        // En el parseo obliga a usar try cath por si no es capaz de controlar el error
        try {
            System.out.println("formatString.parse(fechaString) = " + formatString.parse(fechaString));
        } catch (ParseException e) {
            System.out.println("Error no controlado al parser la fecha: " + fechaString);
        }


        // Comparando fechas
        try {
            Date fecha1 = new Date();
            Date fecha2 = formatString.parse("2022/01/01");
            // after, before, equals
            if (fecha2.after(fecha1)) {
                System.out.println("La fecha " + fecha1 + " Es Mayor a fecha 2");
            } else {
                System.out.println("La fecha 1: " + fecha1 + " Es Menor a fecha 2");
            }

            // Otra forma de comparar usando la clase Date
            // fecha 2 > fecha 1
            if (fecha1.compareTo(fecha2) > 0) {
                System.out.println("La fecha 1: " + fecha1 + " Es Mayor a fecha 2");
            } else if (fecha1.compareTo(fecha2) < 0) {
                System.out.println("La fecha 1: " + fecha1 + " Es Menor a fecha 2");
            } else {
                System.out.println("Fecha 1 y fecha 2 son iguales");
            }

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
