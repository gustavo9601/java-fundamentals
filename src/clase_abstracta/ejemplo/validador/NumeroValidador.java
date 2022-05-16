package clase_abstracta.ejemplo.validador;

public class NumeroValidador extends Validador {
    protected String mensaje = "el campo debe ser un un numero";

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        try {
            Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException numberFormatException) {
            System.err.println("error valor: "+ valor +" => " + numberFormatException.getMessage());
            return false;
        }
    }
}
