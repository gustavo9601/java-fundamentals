package org.appfacturas.modelo;

public class ItemFactura {

    private int codigo;
    private int cantidad;
    private Producto producto;
    private static int ultimoCodigo;

    public ItemFactura(int cantidad, Producto producto) {
        this.codigo = ++ultimoCodigo;
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float calcularImporte() {
        return this.getCantidad() * this.producto.getPrecio();
    }
}
