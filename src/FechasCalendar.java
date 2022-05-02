import java.util.Calendar;

public class FechasCalendar {
    public static void main(String[] args) {
        // por debajo getInstance retorna el new
        // Dependiendo de la ubicacion crea un Calendario gregoriano
        Calendar calendario = Calendar.getInstance();
        System.out.println("calendario = " + calendario);
        System.out.println("calendario.getTime() = " + calendario.getTime());

        // Permite generar una fecha año mes (empieza en 0) dia
        calendario.set(2022, 0, 31);
        System.out.println("calendario.getTime() = " + calendario.getTime());

        calendario.set(2022, Calendar.APRIL, 20);
        System.out.println("calendario.getTime() = " + calendario.getTime());

        // Asignando una fecha por separados
        calendario.set(Calendar.YEAR, 2022);
        calendario.set(Calendar.MONTH, Calendar.DECEMBER);
        calendario.set(Calendar.DAY_OF_MONTH, 5);
        System.out.println("calendario.getTime() = " + calendario.getTime());

    }
}
