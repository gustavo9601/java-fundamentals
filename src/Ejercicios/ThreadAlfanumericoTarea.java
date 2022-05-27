package Ejercicios;


import java.util.concurrent.TimeUnit;

public class ThreadAlfanumericoTarea {
    public static void main(String[] args) {
        System.out.println("Ejecutando Thread Principal");
        new Thread(new AlfanumericoTarea(Tipo.NUMERO)).start();
        new Thread(new AlfanumericoTarea(Tipo.LETRA)).start();
    }
}


enum Tipo {
    NUMERO, LETRA
}

class AlfanumericoTarea implements Runnable {

    private Tipo tipo;

    public AlfanumericoTarea(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public void run() {
        try {
            if (tipo == Tipo.NUMERO) {
                System.out.println("Tipo numero");
                for (int i = 0; i < 10; i++) {
                    System.out.println("Numero=\t" + i);
                    TimeUnit.SECONDS.sleep(1);
                }
            } else {
                System.out.println("Tipo letra");
                for (char c = 'a'; c <= 'z'; c++) {
                    System.out.println("Letra\t" + c);
                    TimeUnit.SECONDS.sleep(1);
                }
            }
        } catch (InterruptedException exception) {
            System.out.println("Error en el hilo, mensae: " + exception.getMessage());
        }

    }


}