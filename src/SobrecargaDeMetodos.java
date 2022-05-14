

public class SobrecargaDeMetodos {
    public static void main(String[] args) {
        Calculadora operaciones = new Calculadora();

        System.out.println("operaciones.sumar(\"1\", \"2\") = " + operaciones.sumar("1", "2"));
        System.out.println("operaciones.sumar(50F,100F) = " + operaciones.sumar(50F, 100F));
        System.out.println("operaciones.sumar(50,10) = " + operaciones.sumar(50, 10));
        System.out.println("operaciones.sumar(1,2,3,4,5,6) = " + operaciones.sumar(1, 2, 3, 4, 5, 6));
        System.out.println("operaciones.sumar(1.4F,2,3,4,5,6) = " + operaciones.sumar(1.4F, 2, 3, 4, 5, 6));
        System.out.println("Calculadora.restar(1,2) = " + Calculadora.restar(1,2));
        System.out.println("Calculadora.restar(10.2F,2) = " + Calculadora.restar(10.2F,2));
    }
}

class Calculadora {

    public int sumar(int a, int b) {
        return a + b;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public int sumar(String a, String b) {
        return Integer.parseInt(a) + Integer.parseInt(b);
    }

    // Multiples variables del mismo tipo como parametro
    /*
     * varargs // variable arguments -> argumentos variables
     * */
    public int sumar(int... argumentos) {
        int total = 0;
        for (int i = 0; i < argumentos.length; i++) {
            total += argumentos[i];
        }
        return total;
    }

    public double sumar(float a, int... argumentos) {
        int total = 0;
        for (int i = 0; i < argumentos.length; i++) {
            total += argumentos[i];
        }
        return a + total;
    }


    /*======================================*/
    // Sobrecarga de metodos estaticos
    public static int restar(int a, int b) {
        return a - b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }
}