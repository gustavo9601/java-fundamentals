package catalogo_productos.ejercicio.app.dominio;

public class TCLcd extends Electronico{
    private int pulgada;

    public TCLcd(int precio, String fabricante, int pulgada) {
        super(precio, fabricante);
        this.pulgada = pulgada;
    }

    public int getPulgada() {
        return pulgada;
    }

    public void setPulgada(int pulgada) {
        this.pulgada = pulgada;
    }

    @Override
    public double getPrecioVenta() {
        return this.getPrecio();
    }
}
