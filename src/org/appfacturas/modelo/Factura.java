package org.appfacturas.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
    private int folio;
    private String decripcion;
    private Date fecha;


    // Relaciones
    private Cliente cliente;
    private ItemFactura[] itemsFacturas;
    private int indiceItems;
    private static int ultimoFolio;
    public static final int MAX_ITEMS = 10;


    public Factura(String decripcion, Cliente cliente) {
        this.decripcion = decripcion;
        this.cliente = cliente;
        this.itemsFacturas = new ItemFactura[MAX_ITEMS];
        this.folio = ++ultimoFolio;
        this.fecha = new Date();
    }

    public ItemFactura[] getItemsFacturas() {
        return itemsFacturas;
    }

    public void addItemFactura(ItemFactura itemFactura) {
        // Evitando que se desborde el arreglo
        if (indiceItems < MAX_ITEMS) {
            this.itemsFacturas[this.indiceItems++] = itemFactura;
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getFolio() {
        return folio;
    }

    public String getDecripcion() {
        return decripcion;
    }

    public void setDecripcion(String decripcion) {
        this.decripcion = decripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float calcularTotal() {
        float total = 0F;
        for (ItemFactura itemFactura : this.getItemsFacturas()) {
            // Verificamos que el item exista y de ser null spieamos la iteracion
            if (itemFactura == null) {
                continue;
            }
            total += itemFactura.calcularImporte();
        }
        return total;
    }

    public String generarDetalle() {
        StringBuilder sb = new StringBuilder("Factura N: ");
        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");

        sb.append(this.getFolio())
                .append("\nCliente: ")
                .append(this.getCliente().getNombre())
                .append("\t NIF: ")
                .append(this.getCliente().getNif())
                .append("\nDescripcion: ")
                .append(this.getDecripcion())
                .append("\n")
                .append("\n#\tNombre\tCant\tTotal\n");


        for (ItemFactura itemFactura : this.getItemsFacturas()) {
            // Evitando un null pointer exeption si es nullo el objeto
            if (itemFactura == null) {
                continue;
            }

            sb.append("\t")
                    .append(itemFactura.getProducto().getNombre())
                    .append("\t")
                    .append(itemFactura.getProducto().getPrecio())
                    .append("\t")
                    .append(itemFactura.getCantidad())
                    .append("\t")
                    .append(itemFactura.calcularImporte())
                    .append("\n");
        }

        sb.append("Fecha emision: ")
                .append(df.format(this.getFecha()))
                .append("\n")
                .append("Total:\t")
                .append(this.calcularTotal());

        return sb.toString();
    }
}
