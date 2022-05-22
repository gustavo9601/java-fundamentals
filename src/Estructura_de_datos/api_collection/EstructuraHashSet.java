package Estructura_de_datos.api_collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EstructuraHashSet {
    /*
    * Los set al igual que en python son colleciones agrupadas no ordenadas y unicas de valores (no permite repetidos)
    * */

    public static void main(String[] args) {

        // Ambos retornan true si se pudo agregar en caso contrario false
        // add()
        // addAll()

        Set<String> setNombres = new HashSet<>();
        Set<String> setNombresCompletos = new HashSet<>();
        // Contienen los mismo metodos del contrato que las listas
        setNombres.add("Gustavo");
        setNombres.add("Adolfo");
        setNombresCompletos.add("Laura Meliza");
        // addAll  => recibe una collection del tipo y la pushea
        setNombresCompletos.addAll(setNombres);
        System.out.println("HashSet: ");
        System.out.println(setNombresCompletos);

        // De set a lista
        List<String> listaNombres = new ArrayList<>(setNombresCompletos);
        System.out.println("List: ");
        System.out.println(listaNombres);


    }
}
