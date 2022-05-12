package EjerciciosClasesAutomovil;

public class Persona {

    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + this.nombre + '\'' +
                ", apellido='" + this.apellido + '\'' +
                '}';
    }
}
