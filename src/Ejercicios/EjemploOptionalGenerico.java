package Ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class EjemploOptionalGenerico {
    public static void main(String[] args) {
        Repositorio<Computador> computadorRepositorio = new ComputadorRepositorio();

        computadorRepositorio.add(new Computador("hp", "ProBook"));
        computadorRepositorio.add(new Computador("lenovo", "ThinkPad"));
        computadorRepositorio.add(new Computador("dell", "Inspiron"));

        Optional<Computador> computadorHp = computadorRepositorio.filtrar("hp");

        // Si existe el objeto se muestra el mensaje por consola
        // computadorHo.isPresent() -> true
        computadorHp.ifPresent(computador -> {
            System.out.println("computadorHp.get().getMarca()=\t" + computador.getMarca());
        });

        // .ifPresentOrElse(lambda true, lambda false) if else al mismo tiempo
        computadorRepositorio.filtrar("Asus")
                .ifPresentOrElse(computador -> {
                    System.out.println("Si hay asus " + computador.getMarca());
                }, () -> {
                    System.out.println("No hay asus");
                });

        // .orElseGet(objeto por defecto) -> devuelve un objeto por defecto si no existe
        Computador computadorAlinware = computadorRepositorio.filtrar("alinware")
                .orElseGet(() -> new Computador("Alinware", "ProBook"));
        System.out.println("computadorAlinware.getMarca() = " + computadorAlinware.getMarca());

        // .orElseThrow(excepcion) -> lanza una excepcion si no existe
        computadorRepositorio.filtrar("dell")
                .orElseThrow(() -> new RuntimeException("No hay computador de Dell"));


        // Optional tambien tiene .filter() y .map()
        String nombreArchivo = "arhivo.pdf";
        String extensionArchivo = Optional.ofNullable(nombreArchivo)
                .filter(nombre -> nombre.contains(".")) // con el filter del Optional si existe avanza a los siguientes steps
                .map(nombre -> nombre.substring(nombre.lastIndexOf(".") + 1))
                .orElseThrow(() -> new RuntimeException("No hay extension o archivo invalido"));
        System.out.println("extensionArchivo = " + extensionArchivo);





    }
}


class Computador {
    private String marca;
    private String modelo;

    public Computador(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}

interface Repositorio<T> {
    Optional<T> filtrar(String marca);

    void add(T t);
}

class ComputadorRepositorio implements Repositorio<Computador> {
    private List<Computador> computadores;

    public ComputadorRepositorio() {
        this.computadores = new ArrayList<>();
    }

    @Override
    public void add(Computador computador) {
        this.computadores.add(computador);
    }

    @Override
    public Optional<Computador> filtrar(String marca) {
        return this.computadores.stream()
                .filter(computador -> {
                    return computador.getMarca()
                            .toLowerCase()
                            .equals(marca);
                })
                .findFirst(); // Retorna el primer registro

    }


}