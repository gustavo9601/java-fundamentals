public class FlujosDeControl {
    public static void main(String[] args) {
        // Condicional
        String name = "Gus";
        if (name.equals("g")) {
            System.out.println("Es g");
        } else if (name.equals("us")) {
            System.out.println("Es us");
        } else {
            System.out.println("Es gus");
        }


        // Switch Case
        String lastname = "Marquez";
        switch (lastname) {
            case "Marquez":
                System.out.println("Es Marquez");
                break;
            case "Prieto":
                System.out.println("Es Prieto");
                break;
            default:
                System.out.println("No es ni marquez ni prieto");
        }


        // While
        boolean flag = true;
        int count = 0;
        while (flag) {
            if (count <= 5) {
                System.out.println("Iteración while: " + count);
                count++;
                flag = false;
            }
        }

        // Do while
        int countTop = 0;
        boolean flagTop = true;
        do {
            if (countTop >= 3) {
                flagTop = false;
            }
            System.out.println("isTop do while: " + countTop);
            countTop++;

        } while (flagTop);

        // For
        for (int i = 0; i < 3; i++) {
            System.out.println("Posicion for" + i);
            if (i % 2 == 0) {
                // Siguiente itereacon
                continue;
            }
            if (i > 2) {
                // Detiene la ejecucion
                break;
            }
        }

        // Foreach
        String[] names = {"Gus", "Mar", "Meli"}; // Permite agregar un arreglo dinamico
        for (String n : names) {
            System.out.println("Name: " + n);
        }


        
        
        // Identificador o tags o etiqueta en for
        bucle1:
        // Le añade una etiqueta como decorador al bucle
        for (int i = 0; i < 5; i++) {
            bucle2:
            for (int j = 0; j < 2; j++) {
                if (i == 0) {
                    // Es posible indicarle a que bucle va a realizar el continue o break
                    continue bucle1;
                }
            }
        }
    }


}
