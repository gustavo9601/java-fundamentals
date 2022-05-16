package zoo.ejercicio.mamiferos.felinos;

import zoo.ejercicio.mamiferos.Mamifero;

abstract public class Felino extends Mamifero {
    protected float tamanoGarras;
    protected int velocidad;

    public Felino(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public float getTamanoGarras() {
        return tamanoGarras;
    }

    public void setTamanoGarras(float tamanoGarras) {
        this.tamanoGarras = tamanoGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}
