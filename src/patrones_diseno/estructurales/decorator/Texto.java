package patrones_diseno.estructurales.decorator;

public class Texto implements Formateable{

    private String texto;

    public Texto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return this.texto;
    }

    @Override
    public String darFormato() {
        return this.getTexto();
    }
}
