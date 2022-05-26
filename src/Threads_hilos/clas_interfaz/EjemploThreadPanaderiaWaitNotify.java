package Threads_hilos.clas_interfaz;


import java.util.concurrent.ThreadLocalRandom;

public class EjemploThreadPanaderiaWaitNotify {
    public static void main(String[] args) {
        Panaderia panaderia = new Panaderia("Parmesano", false);

        Cocinero cocinero = new Cocinero(panaderia);
        Consumidor consumidor = new Consumidor(panaderia);

        new Thread(cocinero).start();
        new Thread(consumidor).start();

    }
}


class Panaderia {
    private String pan;
    private boolean estaListoPan;


    public Panaderia(String pan, boolean estaListoPan) {
        this.pan = pan;
        this.estaListoPan = estaListoPan;
    }

    public synchronized void concinarPan(String masa) {

        while (this.estaListoPan) {
            try {
                // Si entra esperara hasta ser notificado
                System.out.println("Esperando para cocinar el pan");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Concina el pan con masa " + masa);
        this.estaListoPan = true;
        // Notifica para que se active el wait
        notify();
    }


    public synchronized void consumiendoPan(int idPan) {
        while (!this.estaListoPan) {
            try {
                // Si entra esperara hasta ser notificado
                System.out.println("Esperando que el pan este listo para consumir");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumiendo el pan# " + idPan);
        this.estaListoPan = false;
        // Notifica para que se active el wait
        notify();
    }
}


class Cocinero implements Runnable {
    private Panaderia panaderia;

    public Cocinero(Panaderia panaderia) {
        this.panaderia = panaderia;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {

            this.panaderia.concinarPan("Arina #" + i);

            // Genera un numero aleatorio entre 100 y 500
            // ThreadLocalRandom.current().nextInt(100,500)
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(100, 500));
            } catch (InterruptedException e) {
                System.out.println("Error en el hilo se detuvo forzosamente");
                throw new RuntimeException(e);
            }
        }
    }
}

class Consumidor implements Runnable{
    private Panaderia panaderia;

    public Consumidor(Panaderia panaderia) {
        this.panaderia = panaderia;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {

            this.panaderia.consumiendoPan(i);

        }
    }
}
