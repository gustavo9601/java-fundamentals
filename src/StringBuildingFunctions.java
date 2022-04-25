public class StringBuildingFunctions {
    /*
     * String => inmutables
     * Los strings son objetos no son valores primitivos, por ello empieza String
     * */

    public static void main(String[] args) {

        String text = "Programacion en java";
        String text2 = new String("Programacion en Java");
        String text3 = "Progracion Python";
        String text4 = " Programacion PHP ";
        String text5 = null;
        int number1 = 100;

        // Compara que sean el mismo valor y la referencia del objeto
        System.out.println("text == text2: " + (text == text2));
        // Compara que tengan el mismo valor
        System.out.println("text.equals(text2): " + text.equals(text2));
        // Compara el valor ignorando si son min or mayus
        System.out.println("text.equalsIgnoreCase(text2): " + text.equalsIgnoreCase(text2));
        // Concatenando valores
        System.out.println("text.concat(text2).concat(text3): " + text.concat(text2).concat(text3));
        // Concatenando usando expresion lambda
        String textLambda = text.transform(t -> {
            return t + " y aprende tambien " + text3;
        });
        System.out.println("textLambda: " + textLambda);

        // Reemplazando valores
        System.out.println("text4.replace(\"PHP\", \"Java\"): " + text4.replace("PHP", "Java"));

        // Verificando si es null
        System.out.println("text5 == null: " + (text5 == null));
        text5 = "";
        // blanck verifica que sea diferente  diferente de vacio ""
        System.out.println("text5.isBlank(): " + text5.isBlank());
        // longitud del string
        System.out.println("text5.length(): " + text5.length());
        // Check si es ""
        System.out.println("text5.isEmpty(): " + text5.isEmpty());
        // Elimiando al inicio y al fin los vacios
        System.out.println("text4.trim(): " + text4.trim());
        // Convertir a mayuscula, minuscula
        System.out.println("text.toLowerCase(): " + text.toLowerCase());
        System.out.println("text.toUpperCase(): " + text.toUpperCase());
        // Capturar un caracter por posicion
        System.out.println("text.charAt(0): " + text.charAt(0));
        // Cortar el string
        System.out.println("text.substring(2,3): " + text.substring(text.length() - 4));
        System.out.println("text.substring(2,3): " + text.substring(text.length() - 4, text.length() - 1));

        // Retorna el indice de la primer incidencia si encuentra dentro del string (si no se encuentra devolvera -1)
        System.out.println("text.indexOf(\"va\"): " + text.indexOf("va"));
        // Retorna el indice de la ultima incidencia si encuentra dentro del string (si no se encuentra devolvera -1)
        System.out.println("text.lastIndexOf(\"a\"): " + text.lastIndexOf("a"));
        // Retorna booleano si contiene una cadena un string
        System.out.println("text.contains(\"java\"): " + text.contains("java"));

        // Retorna booleano si comienza por un string
        System.out.println("text.startsWith(\"java\"): " + text.startsWith("java"));
        // Retorna booleano si finaliza por un string
        System.out.println("text.endsWith(\"java\"): " + text.endsWith("java"));

        // String a arreglo por cada letra
        System.out.println("text.toCharArray(): " + text.toCharArray());
        for (char word: text.toCharArray()) {
            System.out.println(word);
        }
        // String a arreglo por separador
        System.out.println("text.split(\" \"):" + text.split(" "));
        for (String word: text.split(" ")) {
            System.out.println(word);
        }



    }
}
