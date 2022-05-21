import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TiposGenericosClases {
    /*
     *  Generics || Genericos
     *  - Permiten que las clases, metodos sean reutilizables sin acoplar a implementaciones concretas
     * permitiendo la extencion
     * - Permite tener interfaces o abstracciones de tipos concretos solo cuando se necesite
     * */

    public static void main(String[] args) {
        // Utilizando sin genericos
        Camion camionMaquinaria = new Camion(2);
        camionMaquinaria.add(new Maquinaria("Pesada"));
        camionMaquinaria.add(new Maquinaria("Liviana"));
        camionMaquinaria.add(new Maquinaria("Para los cielos"));

        TiposGenericosClases.imprimir(camionMaquinaria);


        // Usando los genericos
        // Al usar genericos no se tendria por que usar casteo de tipos
        Camion<Alimento> camionAlimentos = new Camion<>(10);
        camionAlimentos.add(new Alimento("Verduras"))
                .add(new Alimento("Frutas"))
                .add(new Alimento("Lacteos"));

        TiposGenericosClases.imprimir(camionAlimentos);
    }

    public static <T> void imprimir(Camion<T> lista) {
        System.out.println("Imprimiendo");
        lista.forEach(data -> {
            if (data instanceof Alimento) {
                System.out.println("Categoria Alimentos= " + ((Alimento) data).getCategoria());
            }
            if (data instanceof Maquinaria) {
                System.out.println("Tipo Maquinaria= " + ((Maquinaria) data).getTipo());
            }
        });
    }


}


/*
 *
 * Genericos de tipo clase
 * */
// Iterable -> hace que la clase en si tenga el comportamiento de iterable
class Camion<T> implements Iterable<T> {
    private List<T> objetos;
    private int max;

    public Camion(int max) {
        this.max = max;
        this.objetos = new ArrayList();
    }

    public Camion<T> add(T obj) {
        if (this.objetos.size() <= this.max) {
            this.objetos.add(obj);
        } else {
            throw new RuntimeException("No hay mas espacio.");
        }
        return this;
    }

    @Override
    public Iterator<T> iterator() {
        // le definimos el iterador cuando se llame la clase en si
        return this.objetos.iterator();
    }
}

class CarroPequeno {
    private String marca;

    public CarroPequeno(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }
}

class Maquinaria {
    private String tipo;

    public Maquinaria(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}

class Alimento {
    private String categoria;

    public Alimento(String tipo) {
        this.categoria = tipo;
    }

    public String getCategoria() {
        return categoria;
    }
}