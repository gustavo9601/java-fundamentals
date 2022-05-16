package zoo.ejercicio.mamiferos.caninos;

public class Perro extends Canino{
    private int fuerzaMordida;

    public Perro(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamanoColmillos, int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    public void setFuerzaMordida(int fuerzaMordida) {
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El perro come purina";
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
