import java.time.LocalDate;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class FechasDateTime {
    public static void main(String[] args) {


        /*
         * Maximo de hora
         * */
        LocalTime minHora = LocalTime.MIN;
        LocalTime maxHora = LocalTime.MAX;
        System.out.println("minHora = " + minHora);
        System.out.println("maxHora = " + maxHora);

        // LocalDate.now() devuelve la fecha actual
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);

        // LocalDate.of(int year, int month, int day)  // devuelve fecha a partir de parameters
        LocalDate localDateDesdeFecha = LocalDate.of(2020, 1, 1);
        System.out.println("localDateDesdeFecha = " + localDateDesdeFecha);

        // LocalDate.parse("yyyy-MM-dd")  // devuelve fecha a partir de un String
        LocalDate localDateDesdeString = LocalDate.parse("2020-01-01");
        System.out.println("localDateDesdeString = " + localDateDesdeString);

        /*
         * Sumando o restando dias
         * */
        LocalDate hoy = LocalDate.now();
        System.out.println("hoy = " + hoy);
        // .plusDays(N dias)  // sumara N dias
        hoy = hoy.plusDays(10);
        System.out.println("hoy + 10 days= " + hoy);

        // .minusDays(N dias)  // restara N dias
        hoy = hoy.minusDays(5);
        System.out.println("hoy - 5 days= " + hoy);

        // .plusMonths(N dias) // suma N meses
        hoy = hoy.plusMonths(5);
        System.out.println("hoy + 5 months= " + hoy);

        // .plus(cantidad, Unidad de ChronoUnit)
        // .minus(cantidad, Unidad de ChronoUnit)
        hoy = hoy.plus(5, ChronoUnit.YEARS);
        System.out.println("hoy + 5 years= " + hoy);

        /*
         * Obteniendo partes de la fecha
         * */
        System.out.println("getYear()=\t" + hoy.getYear()); // devuelve el año
        System.out.println("getDayOfMonth()=\t" + hoy.getDayOfMonth()); // dia del mes
        System.out.println("getMonth()=\t" + hoy.getMonth()); // mes
        System.out.println("getMonth().getValue()=\t" + hoy.getMonth().getValue()); // mes
        System.out.println("getMonth().getDisplayName(formate_texto, locale)=\t" + hoy.getMonth().getDisplayName(TextStyle.FULL, new Locale("es"))); // mes español
        System.out.println("getMonthValue()=\t" + hoy.getMonthValue()); // devuelve el mes en numero
        System.out.println("getDayOfWeek()=\t" + hoy.getDayOfWeek()); // devuelve el dia de la semana
        System.out.println("getDayOfYear()=\t" + hoy.getDayOfYear()); // dia del año
        System.out.println("isLeapYear()=\t" + hoy.isLeapYear()); // boolean si es bisiesto


        /*
         * Comparacion entre fechas
         * */
        LocalDate fecha1 = LocalDate.of(2020, 1, 1);
        LocalDate fecha2 = LocalDate.of(2022, 1, 1);
        // isAfter
        // isBefore
        // isEqual
        System.out.println("fecha1.isAfter(fecha2)=\t" + fecha1.isAfter(fecha2));


        /*
        * Periodo de tiempos
        * */
        LocalDateTime fechaN1 = LocalDateTime.now();
        LocalDateTime fechaN2 = LocalDateTime.now().plusDays(10).plusHours(10);
        // Duration para comparacion en Fecha y Hora
        // .between(fecha1, fecha2) // devuelve el periodo de tiempo
        Duration lapsusFechaN1yFechaN2 = Duration.between(fechaN1, fechaN2);
        System.out.println("lapsusFechaN1yFechaN2 = " + lapsusFechaN1yFechaN2);
        System.out.println("lapsusFechaN1yFechaN2.getSeconds() = " + lapsusFechaN1yFechaN2.getSeconds()); // obtenemos los segundos
        System.out.println("lapsusFechaN1yFechaN2.toMinutes() = " + lapsusFechaN1yFechaN2.toMinutes()); // obtenemos los minutoes
        System.out.println("lapsusFechaN1yFechaN2.toHours() = " + lapsusFechaN1yFechaN2.toHours()); // obtenemos las horas

        // Perido para comparacion de dias, meses años
        Period lapsusFechaN1yFechaN2Period = Period.between(LocalDate.now(), LocalDate.now().minusDays(10).minus(5, ChronoUnit.MONTHS));
        System.out.println("lapsusFechaN1yFechaN2Period.getDays() = " + lapsusFechaN1yFechaN2Period.getDays()); // obtenemos los dias
        System.out.println("lapsusFechaN1yFechaN2Period.getMonths() = " + lapsusFechaN1yFechaN2Period.getMonths()); // obtenemos los meses

        /*
         * Tiempo
         * */

        LocalTime hora = LocalTime.now();
        LocalTime hora2 = LocalTime.of(12, 0);
        LocalTime hora3 = LocalTime.parse("12:00");

        System.out.println("hora = " + hora);
        // .getHour() // devuelve la hora
        // .getMinute() // devuelve la minutos
        // .getSecond() // devuelve los segundos
        System.out.println("hora = " + hora.getHour());

        // Añadiendo y restando horas
        System.out.println("hora + 1 hour = " + hora.plusHours(1));
        System.out.println("hora - 1 hour = " + hora.minusHours(1));
        System.out.println("hora + 10 hour = " + hora.plus(10, ChronoUnit.HOURS));
        System.out.println("hora - 50 hour = " + hora.minus(50, ChronoUnit.HOURS));

        // Comparando horas
        System.out.println("hora.isAfter(hora2)=\t" + hora.isAfter(hora2));

        /*
         * LocalDateTime
         * */

        LocalDateTime fechaHora = LocalDateTime.now();
        System.out.println("fechaHora = " + fechaHora);

        // Sumando o restando dates o times
        LocalDateTime fechaHora2 = fechaHora.plusDays(1)
                .plusHours(20)
                .minus(2, ChronoUnit.MINUTES)
                .plusMinutes(30);
        System.out.println("fechaHora2 = " + fechaHora2);

        /*
        * Modificando fechas
        * */
        LocalDate fecha3 = LocalDate.now();
        System.out.println("fechaa3 = " + fecha3);
        fecha3 = fecha3.withMonth(10);
        fecha3 = fecha3.withYear(2050);
        System.out.println("fecha3 modificada = " + fecha3);



        /*
         * Formateo de horas y fechas
         * */
        // Definimos el formato de la fecha
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        // Pasamos el formato a la fecha con .format(formato)
        String fechaFormateada = fechaHora.format(formatoFecha);
        System.out.println("fechaHoraFormateada = " + fechaFormateada);
        System.out.println("Otra forma fechaHoraFormateada = " + formatoFecha.format(fechaHora));

        // Creando un LocalDate desde un string con otro formato
        LocalDate fechaParseada = LocalDate.parse("2022/02/01", DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println("fechaParseada = " + fechaParseada);

        // Creando un LocalDateTime desde un string con otro formato
        LocalDateTime fechaHoraParseada = LocalDateTime.parse("2022/02/01 01:03:45", DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
        System.out.println("fechaHoraParseada = " + fechaHoraParseada);


        /*
            ZonedDateTime - Fecha y hora con zona
         * Modificando la zona horaria
         * */
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime = " + zonedDateTime);

        // Creamos una hora especificando la zona horaria

        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(fechaHora, ZoneId.of("Europe/Madrid"));
        System.out.println("zonedDateTime2 Madrid = " + zonedDateTime2);


        // Ejemplo
        LocalDateTime fechaHoraLocal = LocalDateTime.now();
        // Obtenemos las zonas id
        ZoneId newYorkZoneId = ZoneId.of("America/New_York");
        ZoneId madridZoneId = ZoneId.of("Europe/Madrid");
        // Obtenemos las zonas
        // * Creando la zona usando el utc
        // ZonedDateTime zonaNewYork = ZonedDateTime.of(fechaHoraLocal, ZoneOffset.of("-04:00"));
        // * Creando la zona especificando el id de la zona
        // ZonedDateTime zonaNewYork = fechaHoraLocal.atZone(newYorkZoneId);
        ZonedDateTime zonaNewYork = ZonedDateTime.of(fechaHoraLocal, newYorkZoneId);


        // Creamos la zona a partir de la zona anteriormente creada
        ZonedDateTime zonaMadrid = zonaNewYork.withZoneSameInstant(madridZoneId).plusHours(8);
        System.out.println("Hora salida Newyork=\t" + zonaNewYork);
        System.out.println("Hora llegada Madrid=\t" + zonaMadrid);





    }
}
