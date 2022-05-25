package Threads_hilos.clas_interfaz;

public class ThreadsHilosClase {
    /*
     * Objetos que dan la capacidad de hacer mas de una tarea al mismo tiempo
     *
     * Paralelismo:
     *   Si es Multicore el hardware, se ejecutaran 100% en paralelo
     *
     * Concurrencia:
     *   Si es un solo core el hardware, se ira alternando la ejecucion
     *
     * */

    public static void main(String[] args) {
        Thread threadPruebas = new NombreThread("threadPruebas");
        // Inicializando el thread
        threadPruebas.start();
        System.out.println("threadPruebas.getState()=\t" + threadPruebas.getState());

        Thread threadPruebas2 = new NombreThread("threadPruebas2");
        threadPruebas2.start();
        System.out.println("threadPruebas2.getState()=\t" + threadPruebas2.getState());

        NombreThread threadPruebas3 = new NombreThread("threadPruebas3");
        threadPruebas3.start();
        System.out.println("threadPruebas3.getState()=\t" + threadPruebas3.getState());




    }
}

class NombreThread extends Thread {
    public NombreThread(String name) {
        super(name);
    }


    @Override
    public void run() {
        System.out.println("Empezando Thread con nombre=\t" + this.getName());
        for (int i = 0; i < 10; i++) {
            System.out.println("Imprimiendo =\t" + i);
        }
        System.out.println("Finalizando Thread con nombre=\t" + this.getName());
    }
}


