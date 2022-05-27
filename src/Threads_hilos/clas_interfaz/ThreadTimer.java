package Threads_hilos.clas_interfaz;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class ThreadTimer {
    public static void main(String[] args) {
        /*
            Timer => permite ejecutar una tarea en un tiempo determinado,
            hora especifica, etc.
         */

        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Ejecutando tarea programada despues de 5 segundos");
                // Cancelamos el timer para que no se ejecute mas
                timer.cancel();
                System.out.println("Tarea finalizada en: " + new Date() + " y el thread es: " + Thread.currentThread().getName());
            }
            // Pasamos el delay, y/o el intervalo (para que se repita N veces)
        }, 5000);

        System.out.println("Ejecutando hilo principal");


    }
}
