public class Operadores {
    public static void main(String[] args) {


        // Operador ternario (formado por 3 argumentos o partes)
        int a = (2 > 1) ? 5 : 4;
        int b = 100;

        // Operadores unarios
        int x = +1;
        int y = -1;

        // Operadores arimeticos
        System.out.println("a + b: " + (a + b));
        System.out.println("a - b: " + (a - b));
        System.out.println("a / b: " + (a / b));
        System.out.println("a * b: " + (a * b));

        // Operadores de asignacion
        int c = a;
        c += 1;
        c -= 1;
        c *= 1;
        c /= 1;
        System.out.println("c: " + c);

        // Operadores de incremento o decremento
        int d = 100;
        // incrementos
        d++;
        ++d;
        // decrementos
        d--;
        --d;
        System.out.println("d: " + d);


        // Operadores de relacion
        String text1 = "a";
        String text2 = "b";
        boolean esTrue = true;
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("!esTrue: " + !esTrue); // negando
        System.out.println("5 > 2: " + (5 > 2));
        System.out.println("5 < 2: " + (5 < 2));

        // Operadores logicos
        System.out.println("a && a" + (true && false));
        System.out.println("a && a" + (true || false));

        // Operador instance of
        String text4 = "aaaaaa";
        Integer num1 = 7;
        Boolean flag = true;
        System.out.println("num1 instanceof Integer: " + (num1 instanceof Integer));
        System.out.println("flag instanceof Boolean: " + (flag instanceof Boolean));

    }
}
