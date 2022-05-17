import java.util.ArrayList;
import java.util.List;


public class Interfaces {
    /*
     *
     * Metodos o atributos abstractos que se deben implementar de quien la implemente
     * - Declara solo el comportamiento pero no el detalle
     * - Puede utilizarse como un tipo de dato
     * - Puede desacoplar de clases concretas
     * - suele terminar con los vocables ible, ablo, able
     * - Se pueden implementar N cantidad de interfaces, para añadir diferentes comportamientos
     * */


    public static void main(String[] args) {
        Informe informe = new Informe("Informe para gus", "Gustavo", "Adolfo");
        System.out.println("Informe:");
        Interfaces.imprimir(informe); // Pasamos una clase que extiende de hoja
        System.out.println();

        Curriculum curriculum = new Curriculum("Curriculum de gus", "Gustavo M", "Software Engineer");
        curriculum.addExperiencias("Backend")
                .addExperiencias("Fronted");
        System.out.println("Curriculum:");
        Interfaces.imprimir(curriculum);
    }

    // Se debe recibir un objeto generico interfaz
    public static void imprimir(Imprimible imprimible) {
        System.out.println("hoja.imprimir() = " + imprimible.imprimir());
    }
}


// public interface Imprimible{};
interface Imprimible {
    public String imprimir();
}


interface Ejecutable{
    // permite usar la interface con constantes
    final static String PATH_EJECUTABLE = "./dir/gus";

    // con default se puede definir el comportamiendo por default y no es necesario que se implemente
    // Es util cuando el comportamiento no se tenga que sobrescribir en cada implementacion
    // Si se usa puede dejar la arquitectura mas debil, lo ideal es que se use una implemnentacion diferente
    default void ejecutar(){
        System.out.println("Ejecutando un metodo por default");
    };

    // Metodo estatico que se usaria como tal en las clases implementadas
    static void abrir(){
        System.out.println("Abriendo un ejecutable");
    };
}


abstract class Hoja{
    protected String contenido;

    public Hoja(String contenido) {
        this.contenido = contenido;
    }

    abstract public String imprimir();
}

class Informe extends Hoja implements Imprimible{

    private String autor;
    private String revisor;

    public Informe(String contenido, String autor, String revisor) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "Informe escrito por: " + this.autor + "\n" +
                "Revisado por: " + this.revisor;
    }
}

class Curriculum extends Hoja implements Imprimible{

    private String persona;
    private String carrera;
    private List<String> experiencias;

    public Curriculum(String contenido, String persona, String carrera) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();
    }

    public Curriculum addExperiencias(String experiencia) {
        this.experiencias.add(experiencia);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre: ");
        sb.append(this.persona)
                .append("\n")
                .append("Resumen: ")
                .append(this.contenido)
                .append(this.carrera)
                .append("\n")
                .append("Experiencias: \n");

        this.experiencias.forEach(experiencia -> {
            sb.append("- ")
                    .append(experiencia)
                    .append("\n");
        });

        return sb.toString();
    }
}