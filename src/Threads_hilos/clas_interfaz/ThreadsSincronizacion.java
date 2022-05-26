package Threads_hilos.clas_interfaz;

public class ThreadsSincronizacion {
    public static void main(String[] args) {
        new Thread(new ImprimirFrases("Hola", "Mundo")).start();
        new Thread(new ImprimirFrases("Todo", "Bien y vos?")).start();
        new Thread(new ImprimirFrases("Excelente", "Papa")).start();

    }


    /*
    * // Con synchronized
    * Bloqueara el hilo principal, y no podra ejecutar el resto de hilos hasta que el hilo principal termine de
    * usar la funcion imprimir()
    * */
    public synchronized static void imprimir(String texto, String texto2) {
        System.out.print("Texto=\t" + texto + "\t");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Se termino la ejecucion del imprimir");
            throw new RuntimeException(e);
        }
        System.out.println("Texto2=\t" + texto2);
    }




}


class ImprimirFrases implements Runnable {
    private String texto1, texto2;

    public ImprimirFrases(String texto1, String texto2) {
        this.texto1 = texto1;
        this.texto2 = texto2;
    }

    @Override
    public void run() {
        ThreadsSincronizacion.imprimir(this.texto1, this.texto2);
    }
}