package Estructura_de_datos.api_collection;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class EjemploComparableConTreeSet {
    public static void main(String[] args) {
        // Si se quiere ordenar de forma descendente Comparator.reverseOrder();
        Set<Alumno> alumnos = new TreeSet<>();
        alumnos.add(new Alumno("Gustavo", 10));
        alumnos.add(new Alumno("Meliza", 9));
        alumnos.add(new Alumno("Martha", 8));

        System.out.println("Alumnos ordenados automaticamente:\t" + alumnos);

    }
}


class Alumno implements Comparable<Alumno>{
    private String nombre;
    private Integer nota;

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getNota() {
        return nota;
    }

    @Override
    public int compareTo(Alumno alumno) {
        // Adicional para identificar si esta duplicado usa el mismo comparTo de ser igual
        return this.getNota().compareTo(alumno.nota);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", nota=" + nota +
                '}';
    }

    /*
    * Metodos que verifican si es unico o no
    * Equals => Se debe añadir si no se requiere que compare por la referencia del objeto sino por alguna logica en los atributos
    * para este caso seria giual si el nombre y nota son la misma.
    * */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(this.getNombre(), alumno.getNombre()) && Objects.equals(this.getNota(), alumno.getNota());
    }

    // Crea un hask a partir de los parametros pasados, para vericicar que sea unico
    @Override
    public int hashCode() {
        return Objects.hash(this.getNombre(), this.getNota());
    }
}
