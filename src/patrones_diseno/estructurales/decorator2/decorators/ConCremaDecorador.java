package patrones_diseno.estructurales.decorator2.decorators;

import patrones_diseno.estructurales.decorator2.Configurable;

public class ConCremaDecorador extends CafeDecorador {
    public ConCremaDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return this.cafe.getPrecioBase() + 10.2f;
    }

    @Override
    public String getIngredientes() {
        return this.cafe.getIngredientes() + ", con crema";
    }
}
