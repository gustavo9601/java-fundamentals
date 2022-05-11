
public class ClasesMetodosVariablesEstaticos {
    public static void main(String[] args) {
        PersonaNatural.altura = 100;
        PersonaNatural persona = new PersonaNatural("1024");
        PersonaNatural.setNombre("Gustavo");
        System.out.println("persona => " + persona);
        System.out.println("PersonaNatural.getNombre() => " + PersonaNatural.getNombre());
    }
}

class PersonaNatural {
    /*
     * Se podra acceder directamente a la variable o metodos sin acceder por instancia
     *
     * this no se puede usar con atributos o metodos estaticos, ya que no puede acceder al contexto
     * */
    private String id;
    static String color;
    static int altura;

    // Aunque sea Estatico se puede hacer privado y debe ser accedido y modificado por metodos estaticos
    private static String nombre;

    public static String getNombre() {
        return PersonaNatural.nombre;
    }

    public static void setNombre(String nombre) {
        PersonaNatural.nombre = nombre;
    }

    public PersonaNatural(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ClasesMetodosVariablesEstaticos{" +
                "id='" + id + '\'' +
                "color='" + PersonaNatural.color + '\'' +
                "altura='" + PersonaNatural.altura + '\'' +
                '}';
    }
}
