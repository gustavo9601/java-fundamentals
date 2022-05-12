package EjerciciosProyectoOrdenCompra;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

public class EjemploOrdenes {
    public static void main(String[] args) {
        Random randomObj = new Random();
        /*
         * Productos
         * */
        Producto[] productos = new Producto[50];
        for (int i = 0; i < productos.length; i++) {
            productos[i] = new Producto("Colombia", "Producto  " + (i + 1), 1000 * (i + productos.length));
        }

        /*
         * Clientes
         * */
        Cliente[] clientes = new Cliente[3];
        for (int i = 0; i < clientes.length; i++) {
            clientes[i] = new Cliente("Cliente " + (i + 1), "Apellido");
        }

        /*
         * Ordenes
         * */
        OrdenCompra[] ordenesCompra = new OrdenCompra[3];
        for (int i = 0; i < ordenesCompra.length; i++) {
            ordenesCompra[i] = new OrdenCompra("Descripcion compra  " + (i + 1));

            // Actualizando fecha
            Date fechaOrden = Date.from(Instant.now().plusSeconds(i * 500000));
            ordenesCompra[i].setFecha(fechaOrden);

            // Push de los productos
            for (int j = 0; j < productsRandom(productos).length; j++) {
                ordenesCompra[i].addProducto(productsRandom(productos)[j], j);
            }

            // Actualizando el cliente de la orden
            ordenesCompra[i].setCliente(clientes[randomObj.nextInt(clientes.length)]);
        }

        /*
         * Imprimir resumen orden
         * */
        for (OrdenCompra ordenCompra : ordenesCompra) {
            System.out.println("==================");
            System.out.println("Orden de compra #" + ordenCompra.getIdentificador());
            System.out.println("Cliente: " + ordenCompra.getCliente().getFullNombre());
            System.out.println("==================");
            System.out.println("PRODUCTOS:");
            for (int i = 0; i < ordenCompra.productos.length; i++) {
                System.out.println("#" + (i+1) + " : " + ordenCompra.productos[i].getNombre() + " | "  + ordenCompra.productos[i].getPrecio() );
            }
            System.out.println("Total: " + ordenCompra.totalCompra());
        }


    }

    public static int obtenerAleatorio(int hasta) {
        Random randomObj = new Random();
        return randomObj.nextInt(hasta);
    }

    public static Producto[] productsRandom(Producto[] productos) {
        Producto[] productosSeleccionados = new Producto[4];
        for (int i = 0; i < productosSeleccionados.length; i++) {
            productosSeleccionados[i] = productos[obtenerAleatorio(productos.length)];
        }
        return productosSeleccionados;
    }
}
