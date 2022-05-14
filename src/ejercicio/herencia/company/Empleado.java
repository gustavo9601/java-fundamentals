package ejercicio.herencia.company;

public class Empleado extends Persona {
    private double renumeracion;
    private int empleadoId;

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double renumeracion, int empleadoId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.renumeracion = renumeracion;
        this.empleadoId = empleadoId;
    }

    public double getRenumeracion() {
        return renumeracion;
    }

    public void setRenumeracion(double renumeracion) {
        this.renumeracion = renumeracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }
}
