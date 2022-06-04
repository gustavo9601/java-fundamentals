package patrones_diseno.estructurales.decorator2.decorators;

import patrones_diseno.estructurales.decorator2.Configurable;

public class ConChocolateDecorador extends CafeDecorador {

    public ConChocolateDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return this.cafe.getPrecioBase() + 0.5f;
    }

    @Override
    public String getIngredientes() {
        return this.cafe.getIngredientes() + ", con chocolate";
    }
}
