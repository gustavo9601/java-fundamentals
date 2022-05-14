package org.appfacturas.modelo;

public class Producto {
    private int codigo;
    public static int ultimoCodigo;
    private String nombre;
    private float precio;

    public Producto() {
        ++ultimoCodigo;
        this.codigo = ultimoCodigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
