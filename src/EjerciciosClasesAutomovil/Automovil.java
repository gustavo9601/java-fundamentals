package EjerciciosClasesAutomovil;

import java.util.Arrays;

// implementamos la interfaz comparable, y entre <> se le especifica que tipo de objeto realizara la comparacion
public class Automovil implements Comparable<Automovil> {

    private int id;
    private String fabricante;
    private String modelo;
    private int indiceRuedas = 0;

    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;

    public Automovil() {
        // Inicializando por default ruedas
        this.ruedas = new Rueda[5];
    }

    public Automovil(int id, String fabricante, String modelo, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {
        this.id = id;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.motor = motor;
        this.estanque = estanque;
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    /*
     * Getters and Setters
     * */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        if (this.estanque == null) {
            // Inicializamos para que no ocurra error de Null pointer expection
            this.estanque = new Estanque();
        }
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        if (this.ruedas == null) {
            this.ruedas = new Rueda[]{new Rueda("Asia Generica", 1, 1)};
        }
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    // Funcion que retorna la misma instancia para usar interfaces fluidas
    /*
     * .addRueda().addRueda().addRueda();
     *
     * */
    public Automovil addRueda(Rueda rueda) {
        this.ruedas[indiceRuedas++] = rueda;
        return this;
    }


    /*
     * Sobrecarga de metodos
     * */
    public float calcularConsumo(int km, float porcentajeBencina) {
        return km / (this.estanque.getCapacidad() * porcentajeBencina);
    }

    public float calcularConsumo(int km, int cantidadBencina) {
        return km / (this.estanque.getCapacidad() * (cantidadBencina / 100F));
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "id=" + this.id +
                ", fabricante='" + this.fabricante + '\'' +
                ", modelo='" + this.modelo + '\'' +
                ", motor=" + this.motor +
                ", estanque=" + this.getEstanque() +
                ", estanque.capacidad=" + this.getEstanque().getCapacidad() +
                ", conductor=" + this.conductor +
                ", ruedas=" + Arrays.toString(ruedas) +
                '}';
    }

    // Implementando el metodo de la interfaz, y le decimos como se podria realizar la comparacion de este objeto con otro


    @Override
    public int compareTo(Automovil automovil) {
        // Estamos realizando la comparacion del fabricante de la instancia actual con el pasada por parametro
        return this.fabricante.compareTo(automovil.getFabricante());
    }
}
