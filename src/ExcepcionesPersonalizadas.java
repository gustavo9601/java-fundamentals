public class ExcepcionesPersonalizadas {
    public static void main(String[] args) {
        try {

            CalculadoraExcepcion calculadoraExcepcion = new CalculadoraExcepcion();

            System.out.println(calculadoraExcepcion.dividir(10, 2));
            System.out.println(calculadoraExcepcion.dividir("10", "."));

        } catch (DivisionX0Excepcion excepcion) {
            System.out.println("Entro a la excepcion DivisionX0Excepcion, con mensaje= " + excepcion.getMessage());
        } catch (ParseoExcepcion excepcion) {
            System.out.println("Entro a la excepcion ParseoExcepcion, con mensaje= " + excepcion.getMessage());
            excepcion.printStackTrace();
        }
    }








}

class DivisionX0Excepcion extends Exception {
    public DivisionX0Excepcion(String mensaje) {
        super(mensaje);
    }
}

class ParseoExcepcion extends Exception {
    public ParseoExcepcion(String message) {
        super(message);
    }
}

interface ICalculadora {
    public double dividir(double numerador, double divisor) throws DivisionX0Excepcion;

    public double dividir(String numerador, String divisor) throws DivisionX0Excepcion, ParseoExcepcion;
}

class CalculadoraExcepcion implements ICalculadora{

    // Se le especifica que si va a lanzar alguna exepcion cual seria el tipo
    // Por lo general se usa el tipo de exepcion mas generico por si se lanzan  diferentes
    // Con throw propaga la exepcion a la clase que la llame, ya que esta no la maneja

    @Override
    public double dividir(double numerador, double divisor) throws DivisionX0Excepcion {
        if (divisor == 0) {
            throw new DivisionX0Excepcion("No se puede dividir por 0");
        }
        return numerador / divisor;
    }


    // Realizamos sobre carga de una funcion, y esta ves se le especifica los posibles exepciones que lanzara
    @Override
    public double dividir(String numerador, String divisor) throws DivisionX0Excepcion, ParseoExcepcion {
        try {
            double numeradorDouble = Double.parseDouble(numerador);
            double divisorDouble = Double.parseDouble(divisor);
            return this.dividir(numeradorDouble, divisorDouble);
        } catch (NumberFormatException exception) {
            throw new ParseoExcepcion("Fallo el parseo, mensaje= " + exception.getMessage());
        }
    }
}