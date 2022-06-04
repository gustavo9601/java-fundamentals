import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ManipulacionArchivos {
    public static void main(String[] args) {
        String nombreArchivo = "archivo.txt";
        ArchivoServicio archivoServicio = new ArchivoServicio();
        System.out.println("crearArchivoConFile");
        archivoServicio.crearArchivoConFile(nombreArchivo);
        System.out.println("crearArchivoConBuffer");
        archivoServicio.crearArchivoConBuffer("archivo2.txt");
        System.out.println("crearArchivoConPrintWriter");
        archivoServicio.crearArchivoConPrintWriter("archivo3.txt");

        System.out.println("leerArchivoConBufferReader");
        System.out.println(archivoServicio.leerArchivoConBufferReader("archivo3.txt"));

        System.out.println("leerArchivoConScanner");
        System.out.println(archivoServicio.leerArchivoConScanner("archivo3.txt"));
    }
}

class ArchivoServicio {
    public void crearArchivoConFile(String nombreArchivo) {
        // Obteniendo la ruta actual del directorio razi
        Path currentRelativePath = Paths.get("src/files");
        String ruta = currentRelativePath.toAbsolutePath().toString();
        System.out.println("Ruta a crear:\t" + ruta);

        File archivo = new File(nombreArchivo);

        try {
            // FileWriter escritor = new FileWriter(ruta + "/" + archivo); // Crea el archivo o lo sobrescribe
            FileWriter escritor = new FileWriter(ruta + "/" + archivo, true); // con el true si existe append despues de la ultima linea
            // Sobrescribe el archivo
            // Por cada invocacion va al disco a escribir, y no es muy eficiente
            escritor.write("Hola mundo\t");
            escritor.append("Gusta el curso de Java")
                    .append("\n")
                    .append("Super cool");

            // Cierra el archivo y guarda el contenido
            escritor.close();

            System.out.println("Archivo creado");
        } catch (IOException exception) {
            System.out.println("Error al crear el archivo, mensaje=\t" + exception.getMessage());
            exception.printStackTrace();
        }
    }

    public void crearArchivoConBuffer(String nombreArchivo) {
        // Obteniendo la ruta actual del directorio razi
        Path currentRelativePath = Paths.get("src/files");
        String ruta = currentRelativePath.toAbsolutePath().toString();
        System.out.println("Ruta a crear:\t" + ruta);

        File archivo = new File(nombreArchivo);

        try {

            FileWriter escritor = new FileWriter(ruta + "/" + archivo, true); // con el true si existe append despues de la ultima linea
            BufferedWriter buffer = new BufferedWriter(escritor);

            buffer.write("\nHola mundo\t");
            buffer.append("Gusta el curso de Java")
                    .append("\n")
                    .append("*".repeat(100));


            // Cierra el archivo y guarda el contenido
            buffer.close();

            System.out.println("Archivo creado");
        } catch (IOException exception) {
            System.out.println("Error al crear el archivo, mensaje=\t" + exception.getMessage());
            exception.printStackTrace();
        }
    }


    public void crearArchivoConPrintWriter(String nombreArchivo) {
        // Obteniendo la ruta actual del directorio razi
        Path currentRelativePath = Paths.get("src/files");
        String ruta = currentRelativePath.toAbsolutePath().toString();
        System.out.println("Ruta a crear:\t" + ruta);

        File archivo = new File(nombreArchivo);

        try (PrintWriter buffer = new PrintWriter(new FileWriter(ruta + "/" + archivo, true))) {

            buffer.println("Hola mundo\t");
            buffer.println("Gusta el curso de Java");
            buffer.printf("Apellido: %s\n", "Marquez"); // %s para string, %d para int, %f para float
            buffer.println("*".repeat(100));

            // No es necesario cerrarlo, ya que despues de ejecutar el try se cierra automaticamente


            System.out.println("Archivo creado");
        } catch (IOException exception) {
            System.out.println("Error al crear el archivo, mensaje=\t" + exception.getMessage());
            exception.printStackTrace();
        }
    }

    public String leerArchivoConBufferReader(String nombreArchivo) {
        StringBuilder contenido = new StringBuilder();

        // Obteniendo la ruta actual del directorio razi
        Path currentRelativePath = Paths.get("src/files");
        String ruta = currentRelativePath.toAbsolutePath().toString();
        System.out.println("Ruta a leer:\t" + ruta);

        File archivo = new File(nombreArchivo);

        try (BufferedReader reader = new BufferedReader(new FileReader(ruta + "/" + archivo))) {


            while (reader.readLine() != null) {
                contenido.append(reader.readLine())
                        .append("\n");
            }

            // No es necesario cerrarlo, ya que despues de ejecutar el try se cierra automaticamente

            System.out.println("Archivo leido");
        } catch (IOException exception) {
            System.out.println("Error al leer el archivo, mensaje=\t" + exception.getMessage());
            exception.printStackTrace();
        }
        return contenido.toString();
    }



    public String leerArchivoConScanner(String nombreArchivo) {
        StringBuilder contenido = new StringBuilder();

        // Obteniendo la ruta actual del directorio razi
        Path currentRelativePath = Paths.get("src/files");
        String ruta = currentRelativePath.toAbsolutePath().toString();
        System.out.println("Ruta a leer:\t" + ruta);

        File archivo = new File(nombreArchivo);

        try  {
            // Se crea un scanner para leer el archivo
            Scanner scanner = new Scanner(new File(ruta + "/" + archivo));
            scanner.useDelimiter("\n"); // se debe especificar el delimitador para que no lo devuelva como sola linea

            while (scanner.hasNext()) {
                contenido.append(scanner.next())
                        .append("\n");
            }

            // Cerramos el escaner
            scanner.close();

            System.out.println("Archivo leido");
        } catch (IOException exception) {
            System.out.println("Error al leer el archivo, mensaje=\t" + exception.getMessage());
            exception.printStackTrace();
        }
        return contenido.toString();
    }

}