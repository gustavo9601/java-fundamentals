import java.util.Arrays;
import java.util.function.*;

public class Lambdas {
    /*
        Lambda:
    *   Permite implementar un metodo de forma anonima al vuelo
    * */
    public static void main(String[] args) {

        /*
         * Consumer // permite crear una funcion de cualquier generico, que permita recibir un parametro y no retornar nada
         * */
        // consumidor es una funcion lamda que recibe un estrin y lo imprime
        Consumer<String> consumidor = (s) -> System.out.println("Imprime consumidor=\t" + s);
        consumidor.accept("Gustavo"); // ejecutando la funcion consumida
        /*
         * BiConsumer // permite crear una funcion de cualquier generico, que permita recibir dos parametros y no retornar nada
         * */
        BiConsumer<String, Integer> biConsumer = (nombre, edad) -> System.out.println("Imprime biConsumer=\t" + nombre + " " + edad);
        biConsumer.accept("Gustavo", 26); // ejecutando la funcion consumida


        Consumer<String> lambdaResumida = System.out::println; // resume (param) -> {System.out.println(param)}
        lambdaResumida.accept("Super resumida la lamda :)");
        // Al vuelo define una lista de strings, se itera y se imprime
        Arrays.asList("Gustavo", "Juan", "Pedro").forEach(System.out::println); // resume (param) -> {System.out.println(param)}

        // Supplier // Retorna un valor pero no recibe parametros
        Supplier<Integer> supplier = () -> Math.toIntExact(Math.round(Math.random() * 10)); //  () -> 10
        System.out.println("supplier.get()=>\t" + supplier.get());


        // Function // Retorna un valor y recibe un parametro
        Function<Integer, String> function = (numero) -> "El numero es: " + numero;
        System.out.println("function=\t" + function.apply(10)); // ejecutando la funcion
        // BiFunction // Retorna un valor y recibe dos parametros
        BiFunction<Integer, Integer, Integer> biFunction = Integer::sum; // (param1, param2) -> param1 + param2
        System.out.println("biFunction = " + biFunction.apply(10, 20));

        // Predicate // Retorna un valor booleano y recibe un parametro
        Predicate<String> predicate = (s) -> s.length() > 5;
        Predicate<String> predicate2 = (s) -> s.equals("Gustavo");
        System.out.println("predicate.test() = " + predicate.test("Gustavo"));
        System.out.println("predicate2.test() = " + predicate2.test("Pedro"));
        // BiPredicate // Retorna un valor booleano y recibe dos parametros
        BiPredicate<String, String> biPredicate = String::equals; // (param1, param2) -> param1.equals(param2)
        System.out.println("biPredicate.test() = " + biPredicate.test("Gustavo", "Gustavos"));


        /*
         * Propia implementacion de lambda
         * En ultimas son metodos anonimos con implementacion de interfaces
         * */
        Arimetrica suma = (a, b) -> a + b;
        Arimetrica resta = (a, b) -> a - b;
        Arimetrica multiplicacion = (a, b) -> a * b;

        CalculadoraLambda calculadora = new CalculadoraLambda();
        System.out.println("suma=\t" + calculadora.computar(10,20, suma));
        System.out.println("resta=\t" + calculadora.computar(10,20, resta));
        System.out.println("multiplicacion=\t" + calculadora.computar(10,20, multiplicacion));
        // pasamos la lambda como parametro sin variable definida anteriormente
        System.out.println("division=\t" + calculadora.computar(10,20, (a, b) -> a / b));

    }

}

// Anotacion para que el IDE la trate como tal
@FunctionalInterface
interface Arimetrica {
    double operacion(double a, double b);
}


class CalculadoraLambda {
    public double computar(double a, double b, Arimetrica arimetrica) {
        return arimetrica.operacion(a, b);
    }
}