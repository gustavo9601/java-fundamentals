package patrones_diseno.decorator2;

import patrones_diseno.decorator2.decorators.ConChocolateDecorador;
import patrones_diseno.decorator2.decorators.ConCremaDecorador;

public class EjemploDecorador {
    public static void main(String[] args) {
        /*
        * Se van decorando los objetos recibiendo una instancia de la clase con interface en comun
        * */

        Configurable cafeConfigurable = new Cafe(900f, "Capuchino");
        ConChocolateDecorador conChocolateDecorador = new ConChocolateDecorador(cafeConfigurable);
        ConCremaDecorador conCremaDecorador = new ConCremaDecorador(conChocolateDecorador);

        System.out.println("conCremaDecorador.getIngredientes()=\t" + conCremaDecorador.getIngredientes());
    }
}
