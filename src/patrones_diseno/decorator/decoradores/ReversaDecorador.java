package patrones_diseno.decorator.decoradores;

import patrones_diseno.decorator.Formateable;

public class ReversaDecorador extends TextoDecorador {
    public ReversaDecorador(Formateable formateable) {
        super(formateable);
    }

    @Override
    public String darFormato() {
        StringBuilder sb = new StringBuilder(this.getTexto().darFormato());
        return sb.reverse().toString(); // lo invierte y lo retorna como string
    }
}
