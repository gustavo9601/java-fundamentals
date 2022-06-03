package patrones_diseno.decorator.decoradores;

import patrones_diseno.decorator.Formateable;

public class RemoverEspaciosDecorador extends TextoDecorador{

    public RemoverEspaciosDecorador(Formateable formateable) {
        super(formateable);
    }

    @Override
    public String darFormato() {
        return this.getTexto().darFormato().replaceAll(" ", "");
    }
}
