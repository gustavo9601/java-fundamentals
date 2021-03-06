package patrones_diseno.creacionales.abstract_factory;

import patrones_diseno.creacionales.abstract_factory.producto.PizzaVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory {
    @Override
    PizzaProducto crearPizza(TipoPizza tipo) {
        return switch (tipo) {
            case VEGETARIANA -> new PizzaVegetariana();
            default -> throw new NullPointerException("Tipo de pizza no soportada");
        };
    }
}
