package patrones_diseno.comportamiento.observer;

public class Corporacion extends Observable {
    private String nombre;
    private int precio;

    public Corporacion(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void modificaPrecio(int precio){
        this.precio = precio;
        // Notificar a los observadores, que se ha modificado el precio
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Corporacion{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
