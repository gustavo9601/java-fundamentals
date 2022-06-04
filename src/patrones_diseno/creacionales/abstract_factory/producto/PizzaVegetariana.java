package patrones_diseno.creacionales.abstract_factory.producto;

import patrones_diseno.creacionales.abstract_factory.PizzaProducto;

public class PizzaVegetariana extends PizzaProducto {
    public PizzaVegetariana() {
        super();
        this.nombre = "Pizza Vegetariana";
        this.masa = "Masa integral vegana";
        this.salsa = "Salsa vegana tomate";
        this.ingredientes.add("Queso vegano");
        this.ingredientes.add("Aceitunas");
        this.ingredientes.add("Esparragos");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando " + this.nombre);
        System.out.println("Cocinando por 25 minutos");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando " + this.nombre);
        System.out.println("Cortando en cuadrados de 1 cm");
    }
}
