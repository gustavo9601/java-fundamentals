package patrones_diseno.estructurales.composite;

import java.util.Objects;

public abstract class Componente {
    protected String nombre;

    public Componente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    abstract public String mostrar();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Componente)) return false;
        Componente that = (Componente) o;
        return Objects.equals(getNombre(), that.getNombre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre());
    }
}
