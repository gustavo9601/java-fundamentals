package patrones_diseno.decorator.decoradores;

import patrones_diseno.decorator.Formateable;

public abstract class TextoDecorador implements Formateable {
    private Formateable texto;

    public TextoDecorador(Formateable formateable) {
        this.texto = formateable;
    }

    public Formateable getTexto() {
        return this.texto;
    }
}
