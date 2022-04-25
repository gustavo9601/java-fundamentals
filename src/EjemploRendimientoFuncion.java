public class EjemploRendimientoFuncion {

    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = "c";
        StringBuilder sb = new StringBuilder(c);

        // Devuelve en milisegundos
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            sb.append(a)
                    .append(b)
                    .append(c);
        }

        long end = System.currentTimeMillis();

        System.out.println("Tiempo: " + (end - start));

    }
}
