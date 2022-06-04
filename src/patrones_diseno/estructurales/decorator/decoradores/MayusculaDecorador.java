package patrones_diseno.estructurales.decorator.decoradores;

import patrones_diseno.estructurales.decorator.Formateable;

public  class MayusculaDecorador extends TextoDecorador {
    public MayusculaDecorador(Formateable formateable) {
        super(formateable);
    }

    @Override
    public String darFormato() {
        return this.getTexto().darFormato().toUpperCase();
    }
}
