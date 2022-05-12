package EjerciciosClasesAutomovil;

public class AutomovilMain {
    public static void main(String[] args) {
        // Creacion con set
        Automovil subaru = new Automovil();
        subaru.setId(100);
        subaru.setFabricante("Subaru china");
        subaru.setModelo("del futuro");
        subaru.setMotor(new Motor(150F, TipoMotor.DIESEL));
        subaru.setEstanque(new Estanque(500));
        subaru.setConductor(new Persona("Gustavo", "Marquez"));
        System.out.println("subaru = " + subaru);

        // Pusheando mediante un metodo que retorna la misma instancia para realizar interfaces fluidas
        subaru.addRueda(new Rueda("China", 10, 20))
                .addRueda(new Rueda("China", 100, 200))
                .addRueda(new Rueda("China", 100, 2850))
                .addRueda(new Rueda("China", 100, 230))
                .addRueda(new Rueda("China", 100, 220));

        /*
        * Pusheando de la forma tradicional
        *  for (int i = 0; i < ruedasSubaru.length; i++) {
            // Pusheando al arreglo usando la funcion de automovil add rueda
            subaru.addRueda(new Rueda("China", i * 10, 5 * 10 - 2));
        }
        * */


        System.out.println("subaru ruedas = " + subaru.getRuedas());

        // Creacion por constructor
        // int id, String fabricante, String modelo, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas
        Rueda[] ruedas = {new Rueda("De China", 1, 50), new Rueda("De Japon", 10, 500)};

        Automovil nissan = new Automovil(5001, "Nissan", "Carro de Gus",
                new Motor(100F, TipoMotor.BENCINA),
                new Estanque(),
                new Persona("Laura", "Marquez"), ruedas);
        System.out.println("nissan = " + nissan);
        for (Rueda rueda : nissan.getRuedas()) {
            System.out.println(" == Ruedas " + nissan.getModelo() + "=== ");
            System.out.println("rueda.getFabricante() = " + rueda.getFabricante());
            System.out.println("rueda.getAncho() = " + rueda.getAncho());
            System.out.println("rueda.getAncho() = " + rueda.getAncho());
        }

    }
}
