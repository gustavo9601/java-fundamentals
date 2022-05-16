package clase_abstracta.ejemplo.validador;

public class EmailValidador extends Validador {
    protected String mensaje = "el formato del email es invalido";
    private final static String EMAIL_PATTERN = "^(.+)@(.+)$";

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
        // matches retornara el booleano de cumplir o no el pattern
        return valor.matches(EMAIL_PATTERN);
    }
}
