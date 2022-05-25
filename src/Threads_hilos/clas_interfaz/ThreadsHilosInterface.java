package Threads_hilos.clas_interfaz;

public class ThreadsHilosInterface {
    //
    public static void main(String[] args) {

        // creando aletaroriamente Threads
        // .start() // Inicializa
        new Thread(new ViajeTarea("Tarea #1")).start();
        new Thread(new ViajeTarea("Tarea #2")).start();

    }
}

// Preferiblemente se usa por interfaz
class ViajeTarea implements Runnable {
    private String nombreTarea;

    public ViajeTarea(String nombreTarea) {
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