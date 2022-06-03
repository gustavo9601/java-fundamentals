import java.util.ArrayList;
import java.util.List;

public class Recursividad {
    public static void main(String[] args) {


        Componente placaMadre = new Componente("Main Board AMD");
        Componente fuentePoder = new Componente("Fuente de poder 580W");
        Componente ram = new Componente("RAM 8GB");
        Componente discoDuro = new Componente("Disco Duro 1TB");
        Componente tarjetaGrafica = new Componente("Tarjeta de video");
        Componente tarjetaRed = new Componente("Tarjeta de red");
        Componente tarjetaSonido = new Componente("Tarjeta de sonido");
        placaMadre.addHijo(fuentePoder)
                .addHijo(ram)
                .addHijo(discoDuro)
                .addHijo(tarjetaGrafica)
                .addHijo(tarjetaRed)
                .addHijo(tarjetaSonido);

        Componente cpu = new Componente("Procesador Intel Core i7");
        Componente gpu = new Componente("Tarjeta de video");
        Componente disipador = new Componente("Disipador de energia");
        cpu.addHijo(gpu)
                .addHijo(disipador);


        Componente pc = new Componente("Gabinete PC");
        Componente monitor = new Componente("Monitor LG");
        Componente teclado = new Componente("Teclado");
        Componente mouse = new Componente("Mouse");
        pc.addHijo(monitor)
                .addHijo(teclado)
                .addHijo(mouse)
                .addHijo(placaMadre)
                .addHijo(cpu);


        metodoRecursivo(pc, 0);
    }

    public static void metodoRecursivo(Componente componente, int nivel) {
        // .repeat(Integer) -> Repite el string N cantidad de veces
        System.out.println("\t".repeat(nivel) + "Componente :\t" + componente.getNombre());
        if (componente.tieneHijos()) {
            for (Componente hijo : componente.getHijos()) {
                metodoRecursivo(hijo, nivel + 1);
            }
        }
    }

}

/*
 * Models
 * */
class Componente {
    private String nombre;
    private List<Componente> hijos;

    public Componente(String nombre) {
        this.nombre = nombre;
        this.hijos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Componente> getHijos() {
        return hijos;
    }

    public Componente addHijo(Componente hijo) {
        this.hijos.add(hijo);
        return this;
    }

    public boolean tieneHijos() {
        return !hijos.isEmpty(); // si es distinto de vacio es por que tiene hijos
    }
}
