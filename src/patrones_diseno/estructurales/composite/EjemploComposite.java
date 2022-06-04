package patrones_diseno.estructurales.composite;


public class EjemploComposite {
    /*
    * Patron de diseño: Composite
    * Patron estructural
    * Permite construir objetos complejos a traves de clases mas simples con interfaces o clases abstractas en comun
    * Composite es un patrón de diseño estructural que te permite componer objetos en estructuras de árbol y trabajar
    * con esas estructuras como si fueran objetos individuales
    *
    * */
    public static void main(String[] args) {
        Directorio directorio = new Directorio("Documentos");
        Directorio java = new Directorio("Java");

        java.addComponente(new Archivo("EjemploComposite.java"))
                .addComponente(new Archivo("EjemploComposite.class"))
                .addComponente(new Archivo("EjemploComposite.docx"));

        directorio.addComponente(java);
        System.out.println(directorio.mostrar());
    }
}
