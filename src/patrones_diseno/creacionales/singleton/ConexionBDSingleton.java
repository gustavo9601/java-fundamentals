package patrones_diseno.creacionales.singleton;

public class ConexionBDSingleton {

    // Se crea una variable estatica que contendra la instancia
    private static ConexionBDSingleton conexionInstancia;

    // Se deja privado par que no permita la creacion de instancias
    private ConexionBDSingleton() {
        System.out.println("Creando una nueva conexion con Singleton");
    }

    // Estatico para que sea accesible desde cualquier lugar
    public static ConexionBDSingleton getInstancia() {
        // Verifica si ya existe la instancia la devuelve en caso contrario la crea y la asigna
        if (ConexionBDSingleton.conexionInstancia == null) {
            ConexionBDSingleton.conexionInstancia = new ConexionBDSingleton();
        }
        return ConexionBDSingleton.conexionInstancia;
    }

}
