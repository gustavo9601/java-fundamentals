package Estructura_de_datos.api_collection;

import java.util.*;

public class EstructuraArrayList {
    /*
     * Los set al igual que en python son colleciones agrupadas no ordenadas y unicas de valores (no permite repetidos)
     * */

    public static void main(String[] args) {

        // Ambos retornan true si se pudo agregar en caso contrario false
        // add()
        // addAll()

        List<String> listNombres = new ArrayList<>();

        // Contienen los mismo metodos del contrato que las listas
        listNombres.add("Gustavo");
        listNombres.add("Adolfo");
        listNombres.add("Meliza");
        System.out.println("List: ");
        System.out.println(listNombres);

        // Collections.sort => usara la logica del compareTo
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Gustavo", 100));
        estudiantes.add(new Estudiante("Meliza", 150));
        estudiantes.add(new Estudiante("Martha", 200));
        // pasando el indice donde se requiere, despleza todas las posiciones
        estudiantes.add(1, new Estudiante("Laura", 99));


        // Ordenando la lista, pasandole una lambda con la logica y el campo
        estudiantes.sort((a, b) -> b.getNombre().compareTo(a.getNombre()));
        System.out.println("estudiantes=\t" + estudiantes);

        // Otra alternativa para comparar, pasandole el tipo y el valor el atributo o valor a tener en cuenta
        estudiantes.sort(Comparator.comparing((Estudiante estudiante) -> estudiante.getNota()));
        System.out.println("estudiantes=\t" + estudiantes);

        // Ordenando de forma por referencia mas corta a la anterior, y con .reversed() queda a la inversa
        estudiantes.sort(Comparator.comparing(Estudiante::getNota).reversed());
        System.out.println("estudiantes=\t" + estudiantes);

        /*
         * Building functions utiles
         * */

        // .size() // tamaño de la lista
        System.out.println("estudiantes.size()=\t" + estudiantes.size());

        // .set(index, object)  // Actualiza en esa posicion por los nuevos valores
        estudiantes.set(2, new Estudiante("Segio", 40));
        System.out.println("estudiantes=\t" + estudiantes);

        // .remove(object)  // Elimina de la lista exactamente el mismo objecto para que lo remueva usando el "equals"
        estudiantes.remove(new Estudiante("Segio", 40));
        System.out.println("estudiantes=\t" + estudiantes);

        // .remove(index)  // Elimina por el indice
        estudiantes.remove(1);
        System.out.println("estudiantes=\t" + estudiantes);

        // .contains(object)  / /retorna booleano de encontrar lo pasado por paraemtro
        System.out.println("estudiantes.contains= \t" + estudiantes.contains(new Estudiante("Gustavo", 10)));

        // Parsear de lista a array
        Object[] estudiantesArray = estudiantes.toArray();

    }
}


class Estudiante implements Comparable<Estudiante> {
    private String nombre;
    private Integer nota;

    public Estudiante(String nombre, int nota) {
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
    public int compareTo(Estudiante estudiante) {
        // Adicional para identificar si esta duplicado usa el mismo comparTo de ser igual
        return this.getNota().compareTo(estudiante.nota);
    }

    @Override
    public String toString() {
        return "Estudiante{" +
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
        Estudiante estudiante = (Estudiante) o;
        return Objects.equals(this.getNombre(), estudiante.getNombre()) && Objects.equals(this.getNota(), estudiante.getNota());
    }

    // Crea un hask a partir de los parametros pasados, para vericicar que sea unico
    @Override
    public int hashCode() {
        return Objects.hash(this.getNombre(), this.getNota());
    }
}
