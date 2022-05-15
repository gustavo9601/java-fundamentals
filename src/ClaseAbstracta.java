
public class ClaseAbstracta {
    /*
     *
     * Es una clase que representa un cepcepto generico conceptual.
     * Cada hija que herede va a implementar de diferente forma
     * No se puede instanciar, solo heredar definiendo la estructura o diseño de sus hijos, forzando a usar todos sus metodos como contrato
     *
     * - Nota: Una clase abstracta puede extender de otra abstracata y no tiene porque implementar los metodos de su padre
     * */

    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setAlto(100);
        cuadrado.setAlto(500);
        cuadrado.setForma("Cuadrado");
        cuadrado.dibujar();
    }
}

abstract class Figura {
    protected String nombre;

    abstract public String nombrePruebas();
}

abstract class FiguraGeometrica extends Figura {
    private int alto;
    private int ancho;
    private int cantidadLados;
    private int perimetro;
    private String forma;

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getCantidadLados() {
        return cantidadLados;
    }

    public void setCantidadLados(int cantidadLados) {
        this.cantidadLados = cantidadLados;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    abstract public int area();

    abstract public int perimetro();

    abstract public void dibujar();
}

class Cuadrado extends FiguraGeometrica {
    @Override
    public int area() {
        return this.getAlto() * this.getAncho();
    }

    @Override
    public int perimetro() {
        return this.getAlto() + this.getAncho();
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando la forma " + this.getForma());
    }

    @Override
    public String nombrePruebas() {
        return (this.nombre != null) ? this.nombre.toUpperCase() : "Holaaaa esto es una prueba";
    }
}




