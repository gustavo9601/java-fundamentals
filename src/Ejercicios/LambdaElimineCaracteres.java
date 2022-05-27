package Ejercicios;

import java.util.function.Function;

public class LambdaElimineCaracteres {
    public static void main(String[] args) {
        Function<String, String> eliminaCaracteres = (cadena) -> {
            return cadena.replace(" ", "")
                    .replace(",", "")
                    .replace(".", "")
                    .toUpperCase();
        };

        String textBase = "Hola, como esta?";
        System.out.println(textBase + "\t | " + eliminaCaracteres.apply("Hola, como esta?."));
    }
}
