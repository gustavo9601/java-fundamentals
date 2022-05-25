package Estructura_de_datos.api_collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EstructuraTreeMap {
    /*
     * Diccionarios por llave valor
     * - llaves unicas y ordenado por la llave
     * */
    public static void main(String[] args) {
        // Comparator.reverseOrder() // ordena al reves
        Map<String, String> atributosPersona = new TreeMap<>(Comparator.reverseOrder());
        // Comparator.comparing(String::length) // ordenando por el largo de la llave estring
        // Map<String, String> atributosPersona = new TreeMap<>(Comparator.comparing(String::length).reversed();
        // Map<String, String> atributosPersona = new TreeMap<>();

        /*
         * Añadiendo
         * */
        // pusheando las llaves al diccionario
        atributosPersona.put("nombre", "Gustavo");
        atributosPersona.put("edad", "26");
        atributosPersona.put("cargo", "Manager Engineering");
        atributosPersona.put("salario", "900000");
        // reemplazando
        // .replaceAll(collection)
        atributosPersona.replace("cargo", "Director Engineering");
        // .replace(llave, valor anterior, valor nuevo)
        atributosPersona.replace("cargo", "Director Engineering", "Manager Engineering");

        System.out.println("atributosPersona=\t" + atributosPersona);

    }
}
