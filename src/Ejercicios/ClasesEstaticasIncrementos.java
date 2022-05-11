package Ejercicios;

public class ClasesEstaticasIncrementos {
    public static void main(String[] args) {
        Carro carroTesla = new Carro("Tesla");
        System.out.println("carroTesla => " + carroTesla);
        Carro carroBMW = new Carro("BMW");
        System.out.println("carroBMW => " + carroBMW);
    }
}

class Carro {
    private String marca;
    private int id;
    static int ultimoId;

    public Carro(String marca) {
        // Incrementando el ultimo id en cada instancia
        ++Carro.ultimoId;

        this.marca = marca;
        this.id = Carro.ultimoId;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", id=" + id +
                '}';
    }
}
