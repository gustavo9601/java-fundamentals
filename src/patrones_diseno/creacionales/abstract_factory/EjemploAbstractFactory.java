package patrones_diseno.creacionales.abstract_factory;

public class EjemploAbstractFactory {
    /*
    * Patron de diseño: Abstract Factory
    * Patron creacional
    * Propiedades:
    *   - Crea objetos de una interfaz sin especificar su implementación.
    *   - Se utiliza para crear una variedad de objetos sin especificar su tipo.
    *
    * Abstract Factory es un patrón de diseño creacional que nos permite producir familias de objetos relacionados
    * sin especificar sus clases concretas.
    *
    * */
    public static void main(String[] args) {
        // Creamos una instancia de la clase abstracta Factory
        PizzeriaZonaAbstractFactory pizzeriaBogotaFactory = new PizzeriaBogotaFactory();
        PizzeriaZonaAbstractFactory pizzeriaNewYorkFactory = new PizzeriaNewYorkFactory();

        pizzeriaBogotaFactory.comprandoPizza(TipoPizza.HAWAIANA);
        pizzeriaBogotaFactory.comprandoPizza(TipoPizza.VEGETARIANA);

        // pizzeriaNewYorkFactory.comprandoPizza(TipoPizza.HAWAIANA); // Lanza exepcion de pizza no soportada
        pizzeriaNewYorkFactory.comprandoPizza(TipoPizza.VEGETARIANA);


    }
}
