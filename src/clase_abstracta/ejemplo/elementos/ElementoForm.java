package clase_abstracta.ejemplo.elementos;

import clase_abstracta.ejemplo.validador.Validador;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementoForm {

    protected String valor;
    protected String nombre;

    private List<Validador> validadores;
    private List<String> errores;

    public ElementoForm() {
        this.validadores = new ArrayList<>();
        this.errores = new ArrayList<>();
    }

    public ElementoForm(String nombre) {
        this(); // llama al constructor vacio
        this.nombre = nombre;
    }

    public ElementoForm addValidador(Validador validador) {
        this.validadores.add(validador);
        return this;
    }

    public List<String> getErrores() {
        return errores;
    }

    public String getNombre() {
        return nombre;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }

    abstract public String dibujarHtml();

    public boolean esValido() {
        for (Validador validador : this.validadores) {
            if (!validador.esValido(this.valor)) {
                this.errores.add(validador.getMensaje());
            }
        }
        // si esta vacia true, en caso contrario es false
        // return this.errores.size() > 0; // verificando por la cantidad de valores de erores
        return this.errores.isEmpty();
    }
}
