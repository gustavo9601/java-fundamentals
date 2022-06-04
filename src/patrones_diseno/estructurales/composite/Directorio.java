package patrones_diseno.estructurales.composite;

import java.util.ArrayList;
import java.util.List;

public class Directorio extends Componente {
    private List<Componente> hijos;

    public Directorio(String nombre) {
        super(nombre);
        this.hijos = new ArrayList<>();
    }

    public Directorio addComponente(Componente componente) {
        this.hijos.add(componente);
        return this;
    }

    public void removeComponente(Componente componente) {
        this.hijos.remove(componente);
    }

    @Override
    public String mostrar() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.nombre)
                .append("/")
                .append("\n");

        for (Componente componente : this.hijos) {
            sb.append(componente.mostrar());
            if (componente instanceof Archivo) {
                sb.append("\n");
            }
        }

        return sb.toString();
    }
}
