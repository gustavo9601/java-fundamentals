package patrones_diseno.estructurales.decorator.decoradores;

import patrones_diseno.estructurales.decorator.Formateable;

public class RemoverEspaciosDecorador extends TextoDecorador{

    public RemoverEspaciosDecorador(Formateable formateable) {
        super(formateable);
    }

    @Override
    public String darFormato() {
        return this.getTexto().darFormato().replaceAll(" ", "");
    }
}
