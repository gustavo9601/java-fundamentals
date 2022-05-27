package Threads_hilos.clas_interfaz;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.spi.ToolProvider;

public class EjemploThreadTimer {
    public static void main(String[] args) {

        Timer timer = new Timer();
        // con AtomicInteger se evita el problema de que el valor de la variable no
        // se pueda usar en la clase anonima
        AtomicInteger contador = new AtomicInteger(5);

        Toolkit toolkit = Toolkit.getDefaultToolkit();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                int contadorActual = contador.getAndDecrement();
                if (contadorActual > 0) {
                    System.out.println("Tarea#: " + contadorActual + " | Thread: " + Thread.currentThread().getName());
                    // Hace el sonido de beep
                    toolkit.beep();
                } else {
                    // Cancelamos el tiempo
                    timer.cancel();
                    System.out.println("Tareas finalizada");
                }
            }
            // Empezara en 5 seg
            // Se repetira cada 1 segundo
        }, 5000, 1000);
    }
}
