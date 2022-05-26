package Threads_hilos.clas_interfaz;

public class ThreadsHilosInterfaceLambdasJoin {
    //
    public static void main(String[] args) throws InterruptedException {

        // Creando un thread a partir de una clase anonima
        Runnable viajeLambda = () -> {
            System.out.println("Runing viaje lambda...Current Thread..." + Thread.currentThread());
            for (int i = 0; i < 5; i++) {
                System.out.println("Ejecutando tarea... " + i + " .. " + Thread.currentThread());
                try {
                    // Durmiendo el thread actual de forma dinamica
                    Thread.sleep((long) (Math.random() * 100));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread thread1 = new Thread(viajeLambda, "Bogota");
        Thread thread2 = new Thread(viajeLambda, "Medellin");
        Thread thread3 = new Thread(viajeLambda, "Bucaramanga");

        // Inicializando los join
        thread1.start();
        thread2.start();
        thread3.start();


        /*
         *
         * .join()
         * Permite que se ejecuten todos los demas Threads y luego si se ejecutaria la parte siguiente
         * */

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("Texto que se mostrara al finalizar la ejecucion de los demas threads");

    }
}
