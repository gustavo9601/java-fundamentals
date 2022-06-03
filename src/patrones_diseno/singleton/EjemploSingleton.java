package patrones_diseno.singleton;

public class EjemploSingleton {
    /*
       Patron de diseño: Singleton
     * Patron creacional
     * Retorna una instancia que es unica para todas las instancias de la clase.
     - Util en conexiones con bases de datos etc.
     * */
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            ConexionBDSingleton conexionBDSingleton = ConexionBDSingleton.getInstancia();
            System.out.println("conexionBDSingleton = " + conexionBDSingleton); // Retorna siempre la misma referencia del objeto
        }
        
    }
}
