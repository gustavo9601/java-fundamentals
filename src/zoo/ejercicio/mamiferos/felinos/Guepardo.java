package zoo.ejercicio.mamiferos.felinos;

public class Guepardo extends Felino{

    public Guepardo(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El Guepardo come carne e hierbas";
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
