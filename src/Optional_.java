import java.util.Optional;

public class Optional_ {

    /*
    *
    * Optional<tipo> // previene el null pointer exepction
    * Permite evaluar hacer un wrapper sobre el valor y con metodos de ayuda permite identificar si es nullo o no y darle manejo
    * */
    public static void main(String[] args) {
        String nombre = "Gustavo";
        // .of() Crea un optional a partir de un valor u objeto, si el valor es null lanza una excepcion
        Optional<String> nombreO = Optional.of(nombre);
        System.out.println("nombreO = " + nombreO);
        // .ofNullable() Crea un optional a partir de un valor u objeto, si el valor es null retorna un optional vacio
        Optional<String> nombreONullo = Optional.ofNullable(null);
        System.out.println("nombreONullo = " + nombreONullo);
        // .isPresent() Devuelve booleano si el optional tiene un valor
        System.out.println("nombreO.isPresent() = " + nombreO.isPresent());
        // .get() Devuelve el valor del optional, si no tiene valor lanza una excepcion
        System.out.println("nombreO.get() = " + nombreO.get());
        // .isEmpty() Devuelve booleano si el optional no tiene valor
        System.out.println("nombreO.isEmpty() = "+ nombreO.isEmpty());

        // Usando consumers lambda
        nombreO.ifPresent(valor -> {
            System.out.println("nombreO.ifPresent() = " + valor);
        });

        // Ejemplos de uso extendido en archivo EjemploOptionalGenerico.java
    }
}
