package patrones_diseno.creacionales.abstract_factory;

import patrones_diseno.creacionales.abstract_factory.producto.PizzaHawaiana;
import patrones_diseno.creacionales.abstract_factory.producto.PizzaVegetariana;

public class PizzeriaBogotaFactory extends PizzeriaZonaAbstractFactory {
    @Override
    PizzaProducto crearPizza(TipoPizza tipo) {
        PizzaProducto pizza = switch (tipo) {
            case HAWAIANA -> new PizzaHawaiana();
            case VEGETARIANA -> new PizzaVegetariana();
            default -> throw new NullPointerException("Tipo de pizza no soportada");
        };

        return pizza;
    }
}
