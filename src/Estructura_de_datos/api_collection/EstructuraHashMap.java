package Estructura_de_datos.api_collection;

import java.util.HashMap;
import java.util.Map;

public class EstructuraHashMap {
    /*
     * Diccionarios por llave valor
     * - llaves unicas
     * */
    public static void main(String[] args) {
        Map<String, String> atributosPersona = new HashMap<>();

        /*
         * Añadiendo
         * */
        // pusheando las llaves al diccionario
        atributosPersona.put("nombre", "Gustavo");
        atributosPersona.put("edad", "26");
        atributosPersona.put("cargo", "Manager Engineering");
        // reemplazando
        // .replaceAll(collection)
        atributosPersona.replace("cargo", "Director Engineering");
        // .replace(llave, valor anterior, valor nuevo)
        atributosPersona.replace("cargo", "Director Engineering","Manager Engineering");

        /*
         * Consultando
         * */
        System.out.println("atributosPersona=\t" + atributosPersona);
        // .get(llave) // accede la llave y retorna el valor
        System.out.println("nombre get=\t" + atributosPersona.get("nombre"));
        // .containsKey(llave) // devuelve booleano si existe la llave
        System.out.println("nombre containsKey=\t" + atributosPersona.containsKey("nombre"));
        // .containsValue(valor) // devuelve booleano si encuentra el valor en alguna llave
        System.out.println("nombre containsValue=\t" + atributosPersona.containsValue("nombre"));
        // .isEmpty() // retorna si esta vacio el diccionario
        System.out.println("isEmpty()=\t" + atributosPersona.isEmpty());
        // devuelve una lista con los valores
        System.out.println("values()=\t" + atributosPersona.values());
        // devuelve una lista con las llaves
        System.out.println("keyset()=\t" + atributosPersona.keySet());
        // Devuelve la cantidad de elementos empezando en 0
        System.out.println("size()=\t"+ atributosPersona.size());

        /*
        * Eliminando
        * */
        // elimina por llave y retorna el valor
        atributosPersona.remove("nombre");
        // elimina por llave y valor y retorna booleano
        atributosPersona.remove("apellido", "Gus");


        // Creando un diccionario con llaves como String y valor objetos de Animal
        Map<String, Animal> animales = new HashMap<>();
        animales.put("perro", new Animal("Perro", "canino"));
        animales.put("gato", new Animal("Gato", "felino"));
        animales.put("loro", new Animal("Loro", "volador"));

        System.out.println("animales=\t" + animales);

        /*
         * Recorriendo
         * */
        // Para obtener la llave y el valor dentro
        System.out.println("=========== entrySet ================");
        for (Map.Entry<String, Animal> animal: animales.entrySet()) {
            System.out.println("key:\t" + animal.getKey() + " => Value:\t" + animal.getValue());
        }
        System.out.println("============ forEach ===============");
        // Recorriendolo con lambdas, que al ser un HashMap devuelve la llave y valor en cada iteracion
        animales.forEach((String llave, Animal animal) -> {
            System.out.println("key:\t" + llave + " => Value:\t" + animal);
        });

    }
}

class Animal {
    private String nombre;
    private String tipo;

    public Animal(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}