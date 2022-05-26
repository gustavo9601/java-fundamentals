package Threads_hilos.clas_interfaz;

public class ThreadsHilosInterfaceLambdas {
    //
    public static void main(String[] args) {

        // Creando un thread a partir de una clase anonima
        Runnable viaje = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runing viaje clase anonima...Current Thread..." + Thread.currentThread());
            }
        };

        new Thread(viaje, "Bogota").start();
        new Thread(viaje, "Medellin").start();
        new Thread(viaje, "Bucaramanga").start();

        // Creando un thread a partir de una lambda
        Runnable viajeLambda = () -> {
            System.out.println("Runing viaje lambda...Current Thread..." + Thread.currentThread());
        };
        new Thread(viajeLambda, "Cartagena").start();



    }
}

// Preferiblemente se usa por interfaz
class Viaje implements Runnable {
    private String nombreTarea;

    public Viaje(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    public String getNombreTarea() {
        return nombreTarea;
    }

    @Override
    public void run() {
        System.out.println("Runing tarea con nombre=\t" + this.getNombreTarea());
        for (int i = 0; i < 5; i++) {
            System.out.println("Ejecutando tarea... " + i + " .. " + this.getNombreTarea());
            try {
                // Durmiendo el thread actual de forma dinamica
                Thread.sleep((long) (Math.random() * 100));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}