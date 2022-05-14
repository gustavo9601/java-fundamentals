package org.appfacturas;

import org.appfacturas.modelo.Cliente;
import org.appfacturas.modelo.Factura;
import org.appfacturas.modelo.ItemFactura;
import org.appfacturas.modelo.Producto;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Descripcion factura:");
        String descripcion = scanner.nextLine();

        Cliente cliente = new Cliente();
        System.out.println("Identification cliente:");
        cliente.setNif(scanner.nextLine());

        System.out.println("Nombre cliente:");
        cliente.setNombre(scanner.nextLine());


        System.out.println("Ingrese la descripcion de la factura");
        Factura factura = new Factura(descripcion, cliente);

        Producto producto;

        for (int i = 0; i < 2; i++) {
            producto = new Producto();
            System.out.print("Ingrese nombre producto n# " + producto.getCodigo());
            producto.setNombre(scanner.nextLine());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(scanner.nextFloat());

            System.out.print("Ingrese la cantidad: ");
            ItemFactura itemFactura = new ItemFactura(scanner.nextInt(), producto);

            factura.addItemFactura(itemFactura);
        }

        System.out.println(factura.generarDetalle());

    }
}
