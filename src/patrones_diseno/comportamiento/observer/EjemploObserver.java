package patrones_diseno.comportamiento.observer;

public class EjemploObserver {
    /*
     * Patron de diseño Observer
     * Patron de comportamiento
     * Observer es un patrón de diseño de comportamiento que te permite definir un mecanismo de suscripción
     * para notificar a varios objetos sobre cualquier evento que le suceda al objeto que están observando.
     * */
    public static void main(String[] args) {
        Corporacion corporacionGoogle = new Corporacion("Google", 90000);

        // La lamda observable -> al solo haber un meotdo que es update, lo llama al hacer {}
        corporacionGoogle.addObserver(observable -> {
            System.out.println("Compra accion Gus en google: " + observable);
        });

        corporacionGoogle.addObserver(observable -> {
            System.out.println("Compra accion Meliza en google: " + observable);
        });

        corporacionGoogle.addObserver(observable -> {
            System.out.println("Compra accion Martha en google: " + observable);
        });

        corporacionGoogle.modificaPrecio(5000);
    }
}
