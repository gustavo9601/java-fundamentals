package patrones_diseno.estructurales.decorator2.decorators;

import patrones_diseno.estructurales.decorator2.Configurable;

public abstract class CafeDecorador implements Configurable {
    protected Configurable cafe;

    public CafeDecorador(Configurable cafe) {
        this.cafe = cafe;
    }
}
