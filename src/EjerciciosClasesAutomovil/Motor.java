package EjerciciosClasesAutomovil;

public class Motor {
    public double cilindraje;
    private TipoMotor tipoMotor;

    public Motor() {
    }

    public Motor(double cilindraje, TipoMotor tipoMotor) {
        this.cilindraje = cilindraje;
        this.tipoMotor = tipoMotor;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(TipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
}
