package Ejercicios;

import java.util.Arrays;
import java.util.List;

public class EjemploStreamCantidadTotalCarrito {
    /*
    * El siguiente requerimiento es para una lista de productos List<Producto> , de 3 a 5 elementos,
    * se pide calcular el importe (precio por cantidad) y sumarlos.

    La clase Producto debe tener el atributo precio del tipo double y cantidad int,
    * entonces utilizando stream convertir la lista de productos en el gran total del tipo double.
    * */

    public static void main(String[] args) {
        List<Producto> carrito = Arrays.asList(
                new Producto("Leche", 10, 900),
                new Producto("Pan", 90, 10),
                new Producto("Trigo", 190, 210)
        );
        
        double totalCarrito = carrito.stream()
                .peek(System.out::println)
                .mapToDouble(p -> p.getPrecioTotal())
                .sum();
        System.out.println("totalCarrito = " + totalCarrito);
    }
}

class Producto{
    String nombre;
    int cantidad;
    double precio;
    
    public Producto(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }
    public int getCantidad() {
        return cantidad;
    }
    public double getPrecio() {
        return precio;
    }
    public double getPrecioTotal() {
        return cantidad * precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + this.getNombre() + '\'' +
                ", cantidad=" + this.getCantidad() +
                ", precio=" + this.getPrecio() +
                ", precioTotal=" + this.getPrecioTotal() +
                '}';
    }
}
