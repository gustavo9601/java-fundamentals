package Estructura_de_datos.api_collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EjemploValoresUnicosConHasSet {

    public static void main(String[] args) {
        List<String> frutas = Arrays.asList("banano", "manzana", "pera", "manzana", "curuba", "fresa", "fresa");
        Set<String> frutasUnicas = new HashSet<>();
        Set<String> frutasDuplicadas = new HashSet<>();

        for (String fruta : frutas) {
            if (!frutasUnicas.add(fruta)) {
                frutasDuplicadas.add(fruta);
            }
        }

        System.out.println("frutas:\t" + frutas);
        System.out.println("Unicas:\t" + frutasUnicas);
        System.out.println("Duplicadas:\t" + frutasDuplicadas);


    }

}
