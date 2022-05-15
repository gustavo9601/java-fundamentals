package clase_abstracta.ejemplo.elementos;

import clase_abstracta.ejemplo.select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm {

    private List<Opcion> opciones;

    public SelectForm(String nombre) {
        super(nombre);
        this.opciones = new ArrayList<Opcion>();
    }

    public SelectForm(String nombre, List<Opcion> opciones) {
        super(nombre);
        this.opciones = opciones;
    }

    public SelectForm addOpcion(Opcion opcion) {
        // Pushea la lista
        this.opciones.add(opcion);
        return this; // Para que pueda ser por interfaces fluida
    }

    @Override
    public String dibujarHtml() {
        StringBuilder sb = new StringBuilder("<select ");
        sb.append("name='")
                .append(this.nombre)
                .append("'>");

        for (Opcion opcion : this.opciones) {
            sb.append("\n<option value='")
                    .append(opcion.getValor())
                    .append("'");

            if (opcion.isSelected()) {
                sb.append(" selected>");
                // Si esta seleccionada entonces ese debe ser el valor
                this.valor = opcion.getValor();
            }

            sb.append(opcion.getNombre())
                    .append("</option>");
        }
        sb.append("\n</select>");

        return sb.toString();
    }
}
