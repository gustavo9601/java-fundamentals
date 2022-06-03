package patrones_diseno.decorator.decoradores;

import patrones_diseno.decorator.Formateable;

public  class MayusculaDecorador extends TextoDecorador {
    public MayusculaDecorador(Formateable formateable) {
        super(formateable);
    }

    @Override
    public String darFormato() {
        return this.getTexto().darFormato().toUpperCase();
    }
}
