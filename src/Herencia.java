import java.util.Properties;

public class Herencia {
    /*
     * La coherencia de la relacion geraquica debe existir, no solo por reutilizar codigo
     *
     * Tipos:
     *
     * Generalizacion => Cunado metodos en comun, se crea una clase en general
     * Especializacion => Clases especificas
     *
     *
     * Permite sobrescribir metodos heredados con @Override
     *
     * Para evitar que una clase no pueda ser heredada se le agrega final al comuenco
     * final public lass Persona{}  // No se podria heredar
     *
     * Para evitar que hijos no puedan modificar o sobrescribir metodos se dejan en final
     *
     *  UML ejemplo :
     * https://i.imgur.com/0a1qOSM.png
     * */
    public static void main(String[] args) {

        Alumno alumno = new Alumno();
        alumno.setNombre("Gus");
        alumno.setApellido("Mar");

        System.out.println("alumno.todoNombreEstudiante() = " + alumno.todoNombreEstudiante());
        // Accede directo al protected del parent
        System.out.println("alumno.alumno.estaVivo = " + alumno.estaVivo);

        Profesor profesor = new Profesor();
        profesor.setNombre("Gustavo");
        profesor.setApellido("Marquez");
        profesor.setAsignatura("Probabilidad");
        System.out.println("profesor => " + profesor.getNombre() + " " + profesor.getApellido() + " | Materia:" + profesor.getAsignatura());
        System.out.println("profesor.saludar() = " + profesor.saludar());

        // Inicializando el constructor
        AlumnoInternacional alumnoInternacional = new AlumnoInternacional("Medellin", 50.2F, 60, 100, "Colombia", 50);
        alumnoInternacional.setNombre("Adolfo");
        alumnoInternacional.setApellido("Prieto");
        alumnoInternacional.setIntitucion("Los Andes");
        alumnoInternacional.setPais("USA");
        alumnoInternacional.setIdiomas(100.0F);
        System.out.println("alumnoInternacional = " + alumnoInternacional);
        System.out.println("alumnoInternacional.saludar() = " + alumnoInternacional.saludar());

        // Recorriendo todas las clases padres de alumnoInternacional
        Class clase = alumnoInternacional.getClass();
        while (clase.getSuperclass() != null) {
            System.out.println("Clase hija actual: " + clase.getName() + " su padre es: " + clase.getSuperclass().getName());
            // Setea a la superclase, para que en la siguiente iteracion sea el padre
            clase = clase.getSuperclass();
        }

    }
}


class SerViviente {
    // Permite el acceso directo en clases hijas o clases que esten en el mismo package
    protected boolean estaVivo;

    public SerViviente() {
        this.estaVivo = true;
    }

    public String saludar() {
        return "Soy un serviviente";
    }
}

class Humano extends SerViviente {
    // private solo accesible desde esta clase
    // protected es visible en la misma clase y en todas sus herencias o jerarquias, y desde el mismo package
    private String nombre;
    private String apellido;
    private int edad;
    private String email;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String saludar() {
        return "Soy un humano";
    }
}

class Alumno extends Humano {
    private String intitucion;
    private double notaMatematica;
    private double notaCastellano;
    private double notaHistoria;

    public Alumno() {
        super();
    }

    public Alumno(String intitucion, double notaMatematica, double notaCastellano, double notaHistoria) {
        super(); // Para llamar al padre se ejecuta siempre al comienzo del constructir
        this.intitucion = intitucion;
        this.notaMatematica = notaMatematica;
        this.notaCastellano = notaCastellano;
        this.notaHistoria = notaHistoria;
    }

    public String getIntitucion() {
        return intitucion;
    }

    public void setIntitucion(String intitucion) {
        this.intitucion = intitucion;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaCastellano() {
        return notaCastellano;
    }

    public void setNotaCastellano(double notaCastellano) {
        this.notaCastellano = notaCastellano;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    public String todoNombreEstudiante() {
        return "Estudiante: " + this.getNombre() + " " + this.getApellido();
    }

    @Override
    public String saludar() {
        return "Soy un Alumno";
    }

    public double calcularPromedio() {
        return (this.getNotaCastellano() + this.getNotaHistoria() + this.getNotaMatematica()) / 3;
    }
}

class AlumnoInternacional extends Alumno {
    private String pais;
    private double idiomas;

    public AlumnoInternacional(String intitucion, double notaMatematica, double notaCastellano, double notaHistoria, String pais, double idiomas) {
        super(intitucion, notaMatematica, notaCastellano, notaHistoria); // inicializando al padre
        this.pais = pais;
        this.idiomas = idiomas;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(double idiomas) {
        this.idiomas = idiomas;
    }

    @Override
    public String toString() {
        return "AlumnoInternacional{" +
                "this.getNombre()='" + this.getNombre() + '\'' +
                ", this.getApellido()='" + this.getApellido() + '\'' +
                ", pais='" + pais + '\'' +
                ", idiomas=" + idiomas +
                ", estaVivo=" + estaVivo +
                '}';
    }

    @Override
    public String saludar() {
        return "Soy un Alumno Internacional";
    }

    @Override
    public double calcularPromedio() {
        return (this.getNotaCastellano() + this.getNotaHistoria() + this.getNotaMatematica() + this.getIdiomas()) / 4;
    }
}

class Profesor extends Humano {
    private String asignatura;
    private boolean sigueActivo;

    public Profesor() {
    }

    public Profesor(String asignatura) {
        this.asignatura = asignatura;
    }

    public Profesor(String asignatura, boolean sigueActivo) {
        this(asignatura); // invoca al constructor que se adapte en funcionde los parametros
        this.sigueActivo = sigueActivo;
    }


    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String saludar() {
        // Accedemos a la caracteristica del padre reutilizandolo y extendemos su funcionalidad
        return super.saludar() + " y soy un profesor";
    }
}


/*
 * Final
 *
 * En una clase no permite heredar
 * En un metodo no permite ser sobrescrictio (overwrite) desde hijos
 * */
final class ClaseNoHeredar {
    public void nada() {
        System.out.println("No se puede Heredar");
    }
}
