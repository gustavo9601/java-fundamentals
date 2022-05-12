package EjerciciosClasesAutomovil;

import java.util.Arrays;

public class AutomovilMainArreglo {
    public static void main(String[] args) {
        // Creacion con set
        Automovil subaru = new Automovil();
        subaru.setId(100);
        subaru.setFabricante("Subaru china");
        subaru.setModelo("del futuro");
        subaru.setMotor(new Motor(150F, TipoMotor.DIESEL));
        subaru.setEstanque(new Estanque(500));
        subaru.setConductor(new Persona("Gustavo", "Marquez"));

        // Pusheando mediante un metodo que retorna la misma instancia para realizar interfaces fluidas
        subaru.addRueda(new Rueda("China", 10, 20))
                .addRueda(new Rueda("China", 100, 200))
                .addRueda(new Rueda("China", 100, 2850))
                .addRueda(new Rueda("China", 100, 230))
                .addRueda(new Rueda("China", 100, 220));

        System.out.println("subaru = " + subaru);

        Rueda[] ruedas = {new Rueda("De China", 1, 50), new Rueda("De Japon", 10, 500)};
        Automovil nissan = new Automovil(5001, "Nissan", "Carro de Gus",
                new Motor(100F, TipoMotor.BENCINA),
                new Estanque(),
                new Persona("Laura", "Marquez"), ruedas);

        System.out.println("nissan = " + nissan);


        Automovil[] automoviles = new Automovil[2];
        automoviles[0] = subaru;
        automoviles[1] = nissan;

        System.out.println("=== Automoviles ===");
        for (int i = 0; i < automoviles.length; i++) {
            System.out.println("automoviles[i] = " + automoviles[i]);
        }

        // Ordenando por el fabricante
        System.out.println("=== Automoviles Ordenados, comparados por fabricante ===");
        Arrays.sort(automoviles);
        for (int i = 0; i < automoviles.length; i++) {
            System.out.println("automoviles[i] = " + automoviles[i]);
        }

    }
}
