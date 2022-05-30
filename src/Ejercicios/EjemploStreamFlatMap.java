package Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploStreamFlatMap {
    public static void main(String[] args) {
        UsuarioFlat usuarioFlat1 = new UsuarioFlat("Gus", "Mar");
        UsuarioFlat usuarioFlat2 = new UsuarioFlat("Meli", "Mar");

        usuarioFlat1.addFactura(new FacturaFlat("Carro", 900));
        usuarioFlat1.addFactura(new FacturaFlat("Televisor", 1900));
        usuarioFlat2.addFactura(new FacturaFlat("Casa", 19020));
        usuarioFlat2.addFactura(new FacturaFlat("Computador", 985422));

        List<UsuarioFlat> usuarios = Arrays.asList(usuarioFlat1, usuarioFlat2);

        System.out.println("Forma funcional con streams");
        usuarios.stream()
                .flatMap(usuario -> usuario.getFacturas().stream())// Devuelve el stream de facturas
                .forEach(System.out::println);


        System.out.println("Forma conventional imperativa");
        for (UsuarioFlat usuario : usuarios) {
            for (FacturaFlat factura : usuario.getFacturas()) {
                System.out.println(factura); // el toString tiene el formateo a string
            }
        }

    }
}

class UsuarioFlat {
    String nombre;
    String apellido;
    List<FacturaFlat> facturas;

    public UsuarioFlat(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.facturas = new ArrayList<>();
    }

    public List<FacturaFlat> getFacturas() {
        return facturas;
    }

    public void addFactura(FacturaFlat factura) {
        this.facturas.add(factura);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}

class FacturaFlat {
    static int contador = 0;
    String descripcion;
    double importe;

    public FacturaFlat(String descripcion, double importe) {
        this.descripcion = descripcion;
        this.importe = importe;
        FacturaFlat.contador++;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public static int getContador() {
        return contador;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "FacturaFlat{" +
                "Contador=" + FacturaFlat.getContador() +
                ", descripcion='" + descripcion + '\'' +
                ", importe=" + importe +
                '}';
    }
}
