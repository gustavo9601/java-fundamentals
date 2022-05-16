package zoo.ejercicio.mamiferos;

import zoo.ejercicio.mamiferos.caninos.Lobo;
import zoo.ejercicio.mamiferos.caninos.Perro;
import zoo.ejercicio.mamiferos.felinos.Guepardo;
import zoo.ejercicio.mamiferos.felinos.Leon;

import java.util.Arrays;
import java.util.List;

public class EjemploMamifero {
    public static void main(String[] args) {
        List<Mamifero> mamiferos = Arrays.asList(
                new Leon("Selva", 100F, 200F, 20F, "Leonidas", 3.0F, 500, 100, 900.2F),
                new Guepardo("Selva", 1200F, 300F, 20F, "Guepardiño", 3.0F, 100),
                new Perro("Casa", 10F, 300F, 20F, "Perriño", "cafe", 90F, 300),
                new Lobo("Bosque", 5F, 30F, 120F, "Lobiño", "blanco", 190F, 80, "Carnivoro")
        );

        mamiferos.forEach(mamifero -> {
            System.out.println("mamifero.getNombreCientifico() =\t" + mamifero.getNombreCientifico());
            System.out.println("mamifero.comer() =\t" + mamifero.comer() + "\n");
        });

    }
}
