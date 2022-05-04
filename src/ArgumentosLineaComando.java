public class ArgumentosLineaComando {

    // java ArgumentosLineaComando.java suma 1 2
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Se envio sin argumentos");
            System.exit(0);
        }

        for (int i = 0; i < args.length; i++) {
            System.out.println("Argumento #" + (i + 1) + " = " + args[i]);
        }

        String operacion = args[0];
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        double resultado = 0.0;
        switch (operacion) {
            case "suma":
                resultado = a + b;
                break;
            case "resta":
                resultado = a - b;
                break;
            case "multiplicacion":
                resultado = a * b;
                break;
            case "division":
                resultado = a / b;
                break;
        }

        System.out.println("Operación: " + operacion);
        System.out.println("Resultado: " + resultado);
    }
}
