package Ejercicios;

import java.util.*;
import java.util.function.Consumer;

public class LambdaCuenteRepetidos {
    public static void main(String[] args) {
        Consumer<String> cuentaRepetidos = (cadena) -> {
            String[] palabras = cadena.split(" ");
            Map<String, Integer> palabrasUnicas = new TreeMap<>();


            for (String palabra : palabras) {
                String palabraMinuscula = palabra.toLowerCase();
                if (palabrasUnicas.containsKey(palabraMinuscula)) {
                    palabrasUnicas.replace(palabraMinuscula, palabrasUnicas.get(palabraMinuscula) + 1);
                } else {
                    palabrasUnicas.put(palabraMinuscula, 1);
                }
            }

            System.out.println("palabrasUnicas = " + palabrasUnicas);

            List<Integer> valoresPalabrasUnicas = new ArrayList<>(palabrasUnicas.values());
            valoresPalabrasUnicas.sort(Collections.reverseOrder());

            for (String key : palabrasUnicas.keySet()) {
                if (palabrasUnicas.get(key).equals(valoresPalabrasUnicas.get(0))) {
                    System.out.println("La palabra más repetida es: '" + key + "' y se repite " + palabrasUnicas.get(key) + " veces");
                    break;
                }
            }

        };
        cuentaRepetidos.accept("Hola mundo, hola mundo, hola mundo, que que, z, z, z, hola");
    }
}
