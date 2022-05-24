package Estructura_de_datos.api_collection;

import java.util.LinkedList;
import java.util.Objects;

public class EstructuraLinkedList {
    /*
     * Para añadir al prinicipio y al final y obtener por posiciones es mucho mas eficiente LinkedList
     * */

    public static void main(String[] args) {
        LinkedList<Profesor> profesores = new LinkedList<>();
        profesores.add(new Profesor("Gus", 10));
        profesores.add(new Profesor("Meli", 10));
        profesores.add(new Profesor("Marth", 9));
        profesores.add(new Profesor("Adolfo", 9));
        profesores.add(new Profesor("Sergio", 9));
        profesores.add(new Profesor("Cinthya", 9));

        /*
         * Añadir
         * */
        // Añade al principio
        profesores.addFirst(new Profesor("Profe primero", 900));
        // Añade al final
        profesores.addLast(new Profesor("Profe ultimo", 50));
        System.out.println("profesores=\t" + profesores);

        /*
         * Obtener
         * */
        // Si estan vacias las listas retornan una eception
        System.out.println("Primero=\t" + profesores.getFirst()); //
        System.out.println("Ultimo=\t" + profesores.getLast());
        System.out.println("Por posicion=\t" + profesores.get(2));

        // Si esta vacia la lista retorna un null
        System.out.println("Primero peekFirst()=\t" + profesores.peekFirst());
        System.out.println("Primero peekLast()=\t" + profesores.peekLast());
        // .indexOf() // devuelve el indice de encontrar el objeto, -1 si no lo encuentra
        System.out.println("indexOf Cinthya=\t" + profesores.indexOf(new Profesor("Cinthya", 9)));
        // .contains() // devuelve booleano si encuentra el objeto en la coleccion
        System.out.println("contains Cinthya=\t" + profesores.contains(new Profesor("Cinthya", 9)));

        /*
         * Eliminar
         * */
        // Eliminar y de no encontrar retorna exepcion
        profesores.removeFirst(); // elimina el primero y lo retorna
        profesores.pop(); // elimina el primero y lo retorna
        profesores.removeLast(); // elimina el ultimo y lo retorna
        // .remove(objeto) // por sobrescritura tambien se puede pasar un objeto con los mismo valores y se eliminaria
        profesores.remove(2); // remueve por indice

        // Eliminar y de no encontrar devuelve null
        profesores.pollFirst(); // elimina el primero
        profesores.pollLast(); // elimina el ultimo



        System.out.println("Profesor despues de eliminar=\t" + profesores);


    }
}


class Profesor implements Comparable<Profesor> {
    private String nombre;
    private Integer nota;

    public Profesor(String nombre, int nota) {
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
    public int compareTo(Profesor Profesor) {
        // Adicional para identificar si esta duplicado usa el mismo comparTo de ser igual
        return this.getNota().compareTo(Profesor.nota);
    }

    @Override
    public String toString() {
        return "Profesor{" +
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
        if (this == o) return true; // comparacion por referencia en la memoria
        if (o == null || getClass() != o.getClass()) return false;
        Profesor Profesor = (Profesor) o;
        return Objects.equals(this.getNombre(), Profesor.getNombre()) && Objects.equals(this.getNota(), Profesor.getNota());
    }

    // Crea un hask a partir de los parametros pasados, para vericicar que sea unico
    @Override
    public int hashCode() {
        return Objects.hash(this.getNombre(), this.getNota());
    }
}
