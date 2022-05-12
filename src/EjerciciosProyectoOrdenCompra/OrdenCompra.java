package EjerciciosProyectoOrdenCompra;

import java.util.Date;

public class OrdenCompra {
    static int contador = 0;
    int identificador;
    String descripcion;
    Date fecha;
    Cliente cliente;
    Producto[] productos;

    public OrdenCompra(String descripcion) {
        ++contador; // Incremento de la orden
        this.identificador = contador;
        this.descripcion = descripcion;
        this.productos = new Producto[4];
    }

    /*
     * Getters
     * */

    public int getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    /*
     * Setters
     * */

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public void addProducto(Producto producto, int indice) {
        this.productos[indice] = producto;
    }

    public int totalCompra() {
        if (this.getProductos() == null) {
            return 0;
        }
        int total = 0;
        for (Producto producto : this.getProductos()) {
            total += producto.getPrecio();
        }
        return total;
    }


}
