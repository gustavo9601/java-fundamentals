package clase_abstracta.ejemplo.validador;

public class LargoValidador extends Validador {
    protected String mensaje = "el campo debe tener minimo %d caracteres y maximo %d caracteres";
    private int min = 0;
    private int max = Integer.MAX_VALUE; // Constante que devuelve el maximo de un entero

    public LargoValidador() {
    }

    public LargoValidador(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

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
        // formateara en los espacios con %d por los valores pasados por parametro
        this.mensaje = String.format(this.mensaje, this.min, this.max);
        // Para este caso no se valida si es null, ya que otro validador "NoNuloValidador" lo realizara
        if (valor == null) {
            return true;
        }

        int largoString = valor.length();
        return largoString >= this.getMin() && largoString <= this.getMax();
    }
}
