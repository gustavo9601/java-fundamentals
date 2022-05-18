import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TiposGenericos {
    /*
     * Generics
     * */
    public static void main(String[] args) {
        List<Human> humanos = new ArrayList<>();
        humanos.add(new Programador("Programador", 9000));
        humanos.add(new Arquitecto("Arqutiecto", 50000));

        humanos.forEach(human -> {
            human.comer();
            human.hablar();
        });

        // Usandoel metodo de genericos
        Arquitecto[] arquitectosArray = {new Arquitecto("Aruqitecto AWS", 5000000), new Arquitecto("Aruqitecto Azure", 2000)};
        List<Arquitecto> arquitectosList = TiposGenericos.fromArrayToList(arquitectosArray);
        ProgramadorSenior[] programadorSeniorsArray = {new ProgramadorSenior("Programador Java", 500000), new ProgramadorSenior("Programador Angular", 80000)};
        List<Trabajor> programadoresSeniorsList = TiposGenericos.fromArrayToList(programadorSeniorsArray);

        Integer[] enterosArray = {1, 2, 3, 4};
        System.out.println("enterosList");
        List<Integer> enterosList = TiposGenericos.fromArrayToList(enterosArray);
        System.out.println("genericosList");
        List<Human> genericosList = TiposGenericos.fromArrayToList(arquitectosArray, enterosArray);
        // Pasando arreglos o listas al vuelvo por parametro
        System.out.println("genericosList3");
        List genericosList3 = TiposGenericos.fromArrayToList(new String[]{"Gustavo", "Meliza", "Martha"}, new Integer[]{26, 24, 55});


        // Imprimiendo padres a hijos
        System.out.println("Imprimiendo padres e hijos");
        TiposGenericos.imprimirCualquierTrabajador(arquitectosList);
        TiposGenericos.imprimirCualquierTrabajador(programadoresSeniorsList);

        // Comparando diferentes tipos de datos para obtener el mayor
        System.out.println("Mayor entre 1,2 y 3 = " + TiposGenericos.maximo(1, 2, 3));
        System.out.println("Mayor entre 'gus', 'meli', 'mar' = " + TiposGenericos.maximo("Gus", "Meli", "Mar"));

        // Comaparando objetos que sobrescriben la forma de compararse uno con otro
        System.out.println("Mayor salario entre arquitectosArray[0], arquitectosArray[1], programadorSeniorsArray[0] = " + TiposGenericos.maximo(programadorSeniorsArray[0], arquitectosArray[1], arquitectosArray[0]));
    }

    // Funcion que recibe un array de genericos y retorna una lista de genericos
    // <T> // Generico usado con las listas
    public static <T> List<T> fromArrayToList(T[] arregloGenerico) {
        return Arrays.asList(arregloGenerico);
    }

    // <T extends Number> // Especificamos que el primer parametro tiene que extender de Number (es un generico de Integer)
    public static <T extends Number> List<T> fromArrayToList(T[] arregloGenerico) {
        return Arrays.asList(arregloGenerico);
    }

    // <T extends Human & Comparable<T>>
    // Especificamos que recibira un generico que que extienda de Human y que implemente la interfaz Comparable
    public static <T extends Human & Comparable<T>> List<T> fromArrayToList(T[] arregloGenerico) {
        return Arrays.asList(arregloGenerico);
    }

    //  List<? extends Trabajor>  // especifica que recibira una lista de la clase padre trabajador o cualquiera de su decendencia
    public static void imprimirCualquierTrabajador(List<? extends Trabajor> trabajadores) {
        trabajadores.forEach(System.out::println);
    }

    // <T, G> List<T> // Especificamos que se usaran 2 variables genericas, y en el parametro especificamos que seran
    public static <T, G> List<T> fromArrayToList(T[] arregloGenerico, G[] x) {
        for (G elemento : x) {
            System.out.println("elemento => " + elemento);
        }
        return Arrays.asList(arregloGenerico);
    }


    // Funcion que permite comparar cualquier tipo de objeto y retornar el objeto mayor
    public static <T extends Comparable<T>> T maximo(T a, T b, T c) {

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);

        T maximo = a;

        if (b.compareTo(a) > 0) {
            maximo = b;
        }
        if (c.compareTo(b) > 0) {
            maximo = c;
        }
        return maximo;
    }
}


interface Human {
    void comer();

    void hablar();
}

abstract class Trabajor implements Comparable<Trabajor> {
    private String profesion;
    protected Double salario;

    public Trabajor(String profesion, double salario) {
        this.profesion = profesion;
        this.salario = salario;
    }


    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    @Override
    public String toString() {
        return "Trabajor{" +
                "profesion='" + this.profesion + '\'' +
                "salario='" + this.salario + '\'' +
                '}';
    }

    @Override
    public int compareTo(Trabajor trabajor) {
        // Comparando el salario del objeto actual con el salario del objeto pasado por parametro
        return this.salario.compareTo(trabajor.salario);
    }
}

class Programador extends Trabajor implements Human {
    public Programador(String profesion, double salario) {
        super(profesion, salario);
    }

    @Override
    public void comer() {
        System.out.println("Comiendo: " + this.getProfesion());
    }

    @Override
    public void hablar() {
        System.out.println("Hablando: " + this.getProfesion());
    }

    @Override
    public int compareTo(Trabajor trabajor) {
        // Comparando el salario del objeto actual con el salario del objeto pasado por parametro
        return this.salario.compareTo(trabajor.salario);
    }
}

class ProgramadorSenior extends Programador {
    public ProgramadorSenior(String profesion, double salario) {
        super(profesion, salario);
    }
}

class Arquitecto extends Trabajor implements Human {
    public Arquitecto(String profesion, double salario) {
        super(profesion, salario);
    }

    @Override
    public void comer() {
        System.out.println("Comiendo: " + this.getProfesion());
    }

    @Override
    public void hablar() {
        System.out.println("Hablando: " + this.getProfesion());
    }

    @Override
    public int compareTo(Trabajor trabajor) {
        // Comparando el salario del objeto actual con el salario del objeto pasado por parametro
        return this.salario.compareTo(trabajor.salario);
    }

}



