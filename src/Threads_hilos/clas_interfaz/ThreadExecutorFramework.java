package Threads_hilos.clas_interfaz;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadExecutorFramework {
    public static void main(String[] args) {


        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable task = () -> {
            System.out.println("Inicio de la tarea...");
            System.out.println("Nombre del hilo: " + Thread.currentThread().getName());
            try {
                // Una forma mas elegante del Thread.sleep(), especificando las unidades
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Fin de la tarea...");
        };

        // Enviando la tarea en la ejecucion del hilo
        executor.submit(task);
        // Deteniendo la ejecucion una ves todas las tareas asincronas hallan concluido
        executor.shutdown();

    }
}
