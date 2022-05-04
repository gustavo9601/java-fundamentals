import java.util.Random;

public class ClaseMath {

    /*
     * Math
     * Es final, no tiene herencia ni instanciar utiliza sus metodos de forma estatica
     * */

    public static void main(String[] args) {
        // Valor absoluto
        int absoluto = Math.abs(-10);
        System.out.println("abosluto = " + absoluto);

        // Maximo entre dos numeros
        double max = Math.max(3.5, 5.1);
        System.out.println("max = " + max);

        // Minimo de dos numeros
        int min = Math.min(50, 100);
        System.out.println("min = " + min);

        // PI
        System.out.println("Math.PI = " + Math.PI);

        /*
         * Redondeos
         * */
        // Arriba
        System.out.println("Math.ceil(3.5) = " + Math.ceil(3.5));
        // Abajo
        System.out.println("Math.floor(1.3) = " + Math.floor(1.3));
        // Redondeo dinamico
        System.out.println("Math.round(3.9) = " + Math.round(3.9));


        // Potencia (10 elevado a la 30)
        System.out.println("Math.pow(10,30) = " + Math.pow(10, 30));
        // Raiz cuadrada
        System.out.println("Math.sqrt(14) = " + Math.sqrt(14));
        // Radianes a grados
        System.out.println("Math.toDegrees(100) = " + Math.toDegrees(100));
        // Grados a radianes
        System.out.println("Math.toRadians(50.3) = " + Math.toRadians(50.3));


        /*
         * Trigonometria
         * */
        // Seno
        System.out.println("Math.sin(10.25) = " + Math.sin(10.25));
        // Coseno
        System.out.println("Math.cos(10.25) = " + Math.cos(10.25));
        // Tangente
        System.out.println("Math.tan(10.25) = " + Math.tan(10.25));


        /*
         * Random // Valores aleatorios entre 0 y 1
         * */
        System.out.println("Math.round(10) = " + Math.random());
        System.out.println("Math.round(10) * 10 = " + Math.random() * 10);
        System.out.println("Math.round(Math.random() * 10) = " + Math.round(Math.random() * 10));

        String[] colores = {"amarillo", "azul", "rojo"};
        double randomColores = Math.random() * colores.length;

        System.out.println("color aleatorio = " + colores[(int) Math.floor(randomColores)]);


        /*
         * Clase random
         * Tiene mas funcionalidades que propiamente desde Math
         * */
        Random randomObj = new Random();
        int randomInt = randomObj.nextInt();
        System.out.println("randomInt = " + randomInt);
        double randomDouble = randomObj.nextDouble();
        System.out.println("randomDouble = " + randomDouble);

        // Aleatorios con rangos
        // 1 a 99
        System.out.println("randomObj.nextInt(10) = " + randomObj.nextInt(10));
        // 1 a 99
        System.out.println("randomObj.nextInt(1,100) = " + randomObj.nextInt(1, 100));


    }
}
