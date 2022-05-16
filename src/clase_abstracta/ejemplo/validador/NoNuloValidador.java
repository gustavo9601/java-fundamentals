package clase_abstracta.ejemplo.validador;

public class NoNuloValidador extends Validador{
    protected String mensaje = "el campo no puede ser nulo";

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
        return valor != null;
    }
}
