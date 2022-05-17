package catalogo_productos.ejercicio.app;

import catalogo_productos.ejercicio.app.dominio.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class EjemploCatalogo {
    public static void main(String[] args) {
        List<IProducto> productos = Arrays.asList(
                new TCLcd(500, "LG", 27),
                new Libro(90, new Date(), "Gus", "POOJava", "Gus col"),
                new IPhone(900, "Apple", "V13", "Gold")
        );

        EjemploCatalogo.imprimir(productos);
    }

    public static void imprimir(List<IProducto> productos) {
        productos.forEach(producto -> {
            if (producto instanceof IElectronico) {
                System.out.println("Fabricante = " + ((Electronico) producto).getFabricante());
            }

            if (producto instanceof ILibro) {
                System.out.println("Titulo = " + ((Libro) producto).getTitulo());
            }

            System.out.println("producto.getPrecioVenta() = " + producto.getPrecioVenta());

        });
    }
}
