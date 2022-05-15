package clase_abstracta.ejemplo.elementos;

public class InputForm extends ElementoForm {
    private String tipo = "text";

    // Primer forma de crear la instancia solo con el nombre que espera el padre
    public InputForm(String nombre) {
        super(nombre);
    }

    // Espera el nombre para el padre y el tipo
    public InputForm(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String dibujarHtml() {
        return "<input type='" + this.getTipo() + "' name='" + this.nombre + "' value='" + this.valor + "'>";
    }
}
