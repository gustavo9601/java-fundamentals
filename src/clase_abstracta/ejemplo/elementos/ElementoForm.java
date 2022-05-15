package clase_abstracta.ejemplo.elementos;

abstract public class ElementoForm {

    protected String valor;
    protected String nombre;

    public ElementoForm() {
    }

    public ElementoForm(String nombre) {
        this(); // llama al constructor vacio
        this.nombre = nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    abstract public String dibujarHtml();
}
