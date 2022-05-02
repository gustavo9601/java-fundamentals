import java.util.Properties;

public class ClaseSystemPropiedadesAmbiente {
    public static void main(String[] args) {


        Properties properties = System.getProperties();
        // Imprimiendo todas las variables del sistema
        System.out.println("*******************************");
        properties.list(System.out);


        System.out.println("user.name = " + System.getProperty("user.name"));
        System.out.println("user.home = " + System.getProperty("user.name"));
        System.out.println("user.home = " + System.getProperty("user.dir")); // path del proyecto
        System.out.println("java.version = " + System.getProperty("java.version"));
        System.out.println("os.name = " + System.getProperty("os.name"));

    }


}
