package patrones_diseno.abstract_factory;

public abstract class PizzeriaZonaAbstractFactory {
    public PizzaProducto comprandoPizza(TipoPizza tipo) {
        PizzaProducto pizza = this.crearPizza(tipo);
        System.out.println("=".repeat(20));
        System.out.println("Se ha comprado una pizza de tipo " + tipo);
        pizza.preparar();
        pizza.cocinar();
        pizza.cortar();
        pizza.empaquetar();
        return pizza;
    }

    abstract PizzaProducto crearPizza(TipoPizza tipo);
}
