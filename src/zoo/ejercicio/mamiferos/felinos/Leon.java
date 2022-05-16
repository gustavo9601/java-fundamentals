package zoo.ejercicio.mamiferos.felinos;

public class Leon extends Felino{
    private int numManada;
    private double potenciaRugidoDecibel;

    public Leon(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, int velocidad, int numManada, double potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public int getNumManada() {
        return numManada;
    }

    public void setNumManada(int numManada) {
        this.numManada = numManada;
    }

    public double getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    public void setPotenciaRugidoDecibel(double potenciaRugidoDecibel) {
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "El leon come carne";
    }

    @Override
    public String dormir() {
        return null;
    }

    @Override
    public String correr() {
        return null;
    }

    @Override
    public String comunicarse() {
        return null;
    }
}
