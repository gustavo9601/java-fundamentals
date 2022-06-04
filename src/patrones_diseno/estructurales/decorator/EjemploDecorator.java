package patrones_diseno.estructurales.decorator;

import patrones_diseno.estructurales.decorator.decoradores.MayusculaDecorador;
import patrones_diseno.estructurales.decorator.decoradores.RemoverEspaciosDecorador;
import patrones_diseno.estructurales.decorator.decoradores.ReversaDecorador;

public class EjemploDecorator {
    /*
     * Patron de diseño: Decorator
     * Patron de estructura
     * - Añade funcionalidades a metodos o atributos, sin necesidad de usar la herencia
     * Decorator es un patrón de diseño estructural que te permite añadir funcionalidades a objetos colocando estos
     * objetos dentro de objetos encapsuladores especiales que contienen estas funcionalidades.
     *
     * */
    public static void main(String[] args) {
        Formateable texto = new Texto("Hola Gus como va todo?");

        MayusculaDecorador mayusculaDecorador = new MayusculaDecorador(texto);
        ReversaDecorador reversaDecorador = new ReversaDecorador(mayusculaDecorador);
        RemoverEspaciosDecorador removerEspaciosDecorador = new RemoverEspaciosDecorador(reversaDecorador);

        System.out.println("Texto inicial=\t" + ((Texto) texto).getTexto());
        System.out.println("removerEspaciosDecorador.darFormato()=\t" + removerEspaciosDecorador.darFormato());

    }
}
