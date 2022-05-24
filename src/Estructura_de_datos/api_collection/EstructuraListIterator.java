package Estructura_de_datos.api_collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class EstructuraListIterator {
    public static void main(String[] args) {
        ListIterator<String> listIteratorNombres = new ArrayList<String>().listIterator();
        listIteratorNombres.add("Gustavo");
        listIteratorNombres.add("Adolfo");
        listIteratorNombres.add("Cinthya");

        // Iterando hacia adelante
        while (listIteratorNombres.hasNext()) {
            // .next() // devuelve el objeto siguiente
            System.out.println("next=\t" + listIteratorNombres.next());
        }
        System.out.println("=========== || =============");
        // Iterando hacia Atras
        while (listIteratorNombres.hasPrevious()) {
            // .previous() // devuelve el objeto anterior
            System.out.println("previous=\t" + listIteratorNombres.previous());
        }
    }
}
