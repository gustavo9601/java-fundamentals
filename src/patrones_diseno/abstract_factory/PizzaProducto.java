package patrones_diseno.abstract_factory;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public abstract class PizzaProducto {
    protected String nombre;
    protected String masa;
    protected String salsa;
    protected List<String> ingredientes;

    public PizzaProducto() {
        this.ingredientes = new ArrayList<>();
    }

    public void preparar() {
        System.out.println("Preparando pizza " + this.nombre);
        System.out.println("Seleccion de la masa " + this.masa);
        System.out.println("Seleccion de la salsa " + this.salsa);
        System.out.println("Adicionando ingredientes");
        this.ingredientes.forEach(System.out::println);
    }

    public abstract void cocinar();

    public abstract void cortar();

    public void empaquetar(){
        System.out.println("Poniendo la pizza en la caja");
    }

    @Override
    public String toString() {
        return "PizzaProducto{" +
                "nombre='" + nombre + '\'' +
                ", masa='" + masa + '\'' +
                ", salsa='" + salsa + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
