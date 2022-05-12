package EjerciciosProyectoOrdenCompra;

public class Cliente {
    String nombre;
    String apellido;

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFullNombre() {
        return this.getNombre() + " " + this.getApellido();
    }
}
