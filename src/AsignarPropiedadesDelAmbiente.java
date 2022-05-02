import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class AsignarPropiedadesDelAmbiente {
    public static void main(String[] args) {
        try {
            FileInputStream archivoPropiedades = new FileInputStream("./src/config.properties");
            // Creando un objeto de propiedades y cargamos las default
            Properties properties = new Properties(System.getProperties());
            // Le cargamos las del archivo config.properties
            properties.load(archivoPropiedades);
            // Creando manualmente una propiedad
            properties.setProperty("mi.propiedad.personalidad", "Esta es una propiedad fake");

            // Actualizando las propiedades del sistema con nuestras nuevas variables del sistema
            System.setProperties(properties);

            // Accediendo a la variables cargadas en el system
            System.out.println("puerto.servidor = " + System.getProperty("config.puerto.servidor"));
            System.out.println("otra = " + System.getProperty("otra"));

        } catch (FileNotFoundException e) {
            System.err.println("El archivo de configuraciones no se pudo encontrar");
        } catch (IOException e) {
            System.err.println("El al cargar las propiedades");
        }
    }
}
