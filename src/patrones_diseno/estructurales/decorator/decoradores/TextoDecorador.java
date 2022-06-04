package patrones_diseno.estructurales.decorator.decoradores;

import patrones_diseno.estructurales.decorator.Formateable;

public abstract class TextoDecorador implements Formateable {
    private Formateable texto;

    public TextoDecorador(Formateable formateable) {
        this.texto = formateable;
    }

    public Formateable getTexto() {
        return this.texto;
    }
}
