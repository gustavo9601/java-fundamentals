package bolsa_supermercado.app.modelos;

public class Fruta extends Producto{
    protected String color;
    protected double peso;

    public Fruta(String nombre, double precio, String color, double peso) {
        super(nombre, precio);
        this.color = color;
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
