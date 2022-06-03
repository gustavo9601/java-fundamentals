package patrones_diseno.abstract_factory.producto;

import patrones_diseno.abstract_factory.PizzaProducto;

public class PizzaHawaiana extends PizzaProducto {
    public PizzaHawaiana() {
        super();
        this.nombre = "Pizza Hawaiana";
        this.masa = "Delgada";
        this.salsa = "Tomate";
        this.ingredientes.add("Queso");
        this.ingredientes.add("Jamón");
        this.ingredientes.add("Peperoni");
        this.ingredientes.add("Piña");
        this.ingredientes.add("Cebolla");
        this.ingredientes.add("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando pizza " + this.nombre);
        System.out.println("Cocinando por 5H hasta derretir");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando pizza " + this.nombre);
        System.out.println("Cortando en triangulos");
    }
}
