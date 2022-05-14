package ejercicio.herencia.company;

public class Gerente extends Empleado {
    private double presupuesto;

    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion, double renumeracion, int empleadoId) {
        super(nombre, apellido, numeroFiscal, direccion, renumeracion, empleadoId);
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return "{" +
                "Nombre=" + this.getNombre() +
                "Apellido=" + this.getApellido() +
                "NumeroFiscal=" + this.getNumeroFiscal() +
                "Direccion=" + this.getDireccion() +
                "Renumeracion=" + this.getRenumeracion() +
                "EmpleadoId=" + this.getEmpleadoId() +
                "Presupuesto=" + presupuesto +
                '}';
    }
}
