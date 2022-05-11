/*
 *
 * Una clase por archivo
 * - Si la clase es public debe ser si o si el mismo nombre del archivo
 *
 * - ALT + INSERT // Seleccionar getters and setters para generarlos de la clase automaticamente
 * */

public class Clases {
    /*
     * Atributos caracteristicas
     * */


    public static void main(String[] args) {
        // Instancia de la clase
        Automovil mazda = new Automovil();
        // Accediendo al objeto y atributo color
        mazda.color = "golden";
        mazda.fabricante = "tesla";
        System.out.println("automovil.fabricante = " + mazda.fabricante);
        System.out.println("automovil.color = " + mazda.color);
        // Llamando al metodo
        mazda.imprimirDetalle();

        Automovil chevrolet = new Automovil();
        chevrolet.fabricante = "Chevrolet";
        System.out.println("chevrolet.fabricante = " + chevrolet.fabricante);
        System.out.println("Calculo consumo double = " + chevrolet.calcularConsumo(100, 0.2f));
        System.out.println("Calculo consumo int = " + chevrolet.calcularConsumo(100, 60));
        chevrolet.setPeso(500);
        System.out.println("chevrolet.getPeso() = " + chevrolet.getPeso());

        /*================================*/
        Cohete coheteElonk = new Cohete();
        coheteElonk.setFabricante("Elonk");
        coheteElonk.setModelo("2022 Full");
        coheteElonk.imprimirDetalle();

        Cohete coheteJeffBesos = new Cohete("Jeff", "2021");
        coheteJeffBesos.imprimirDetalle();

        System.out.println("coheteElonk == coheteJeffBesos => " + (coheteElonk == coheteJeffBesos));
        // equals en este caso realizaria lo mismo que ==
        System.out.println("coheteElonk.equals(coheteJeffBesos) => " + coheteElonk.equals(coheteJeffBesos));


        CoheteSobreCargado coheteVirgin1 = new CoheteSobreCargado("Virgin 2010", "virgin mobile");
        coheteVirgin1.imprimirDetalle();
        CoheteSobreCargado coheteVirgin2 = new CoheteSobreCargado("Virgin 2010", "virgin mobile");
        coheteVirgin2.imprimirDetalle();
        // Para este caso el equals se sobrescribio en la clase, para que se comparara por atributos de las clases y no por referencia
        System.out.println("coheteVirgin1.equals(coheteVirgin2) => " + coheteVirgin1.equals(coheteVirgin2));
        // Se sobrescribio toString, para que tenga otro comportamiento al imprimir el objeto
        System.out.println("coheteVirgin2 = " + coheteVirgin2);
    }
}

class Automovil {
    String fabricante;
    String modelo;
    String color;
    private int peso = 100;
    private int velocidad = 500;
    private double cilindraje;
    int capacidadEstanque = 40;


    public void imprimirDetalle() {
        int peso = 500;
        System.out.println("*** Imprimiendo detalle ***");
        System.out.println("fabricante = " + this.fabricante);
        System.out.println("modelo = " + this.modelo);
        System.out.println("color = " + this.color);
        System.out.println("this.peso = " + this.peso);
        System.out.println("peso = " + peso);
    }

    public StringBuilder retornarConcatenado() {
        StringBuilder texto = new StringBuilder();
        return texto.append("Retornando")
                .append("this.cilindraje = ")
                .append(this.cilindraje);
    }

    public void setPeso(int peso) {
        this.peso = peso * 500;
    }

    public int getPeso() {
        return this.peso;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public double acelerar(int rpm) {
        return (this.velocidad > 0) ? (this.peso / this.velocidad) * rpm : 0.0;
    }

    /*
     * Sobrecarga de metodos, usando el mismo nombre de metodo con diferente y tipo argumentos
     * */
    public float calcularConsumo(int km, float porcentajeBencinaConsumida) {
        return km / (this.capacidadEstanque * porcentajeBencinaConsumida);
    }

    public float calcularConsumo(int km, int porcentajeBencinaConsumida) {
        return km / (this.capacidadEstanque * (porcentajeBencinaConsumida / 100f));
    }

}


class Cohete {
    private String modelo;
    private String fabricante;

    // Constructor -> Debe ser el mismo nombre de la clase
    // Tambien aplica la sobrecarga de metodo, de forma que se puede tener constructores con diferentes argumentos o sin argumenteso

    public Cohete() {
        System.out.println("Cohete sin argumentos");
    }

    public Cohete(String modelo, String fabricante) {
        System.out.println("Cohete con argumentos");
        this.modelo = modelo;
        this.fabricante = fabricante;
    }

    public Cohete(String modelo) {
        // this()  => invoca al contructor de la clase, que case con los argumentos pasados
        this(modelo, "Gustavo");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void imprimirDetalle() {
        System.out.println(" ===== Cohete =======");
        System.out.println("modelo = " + this.modelo);
        System.out.println("fabricante = " + this.fabricante);
    }


}

class CoheteSobreCargado extends Cohete {
    public CoheteSobreCargado(String modelo, String fabricante) {
        super(modelo, fabricante);
    }

    // Sobrescribiendo metodos propios de clases padre


    // Decorador que notifica que se sobrescribira un metodo padre
    @Override
    public boolean equals(Object obj) {

        // Verificamos que la instancia del objeto pasado sea la requerida
        if(!(obj instanceof CoheteSobreCargado)){
            System.out.println("No es instancia de CoheteSobreCargado");
            return false;
        }
        // Casteamos el objeto recibido en el equals a objeto de esta clase
        CoheteSobreCargado cohete = (CoheteSobreCargado) obj;
        // Retornamos la comparacion a nivel de valor de atributos
        return this.getFabricante() != null && this.getModelo() != null &&
                this.getFabricante().equals(cohete.getFabricante()) &&
                this.getModelo().equals(cohete.getModelo());
    }

    
    // Metodo que al imprimir el objeto lo sobrescribimos
    @Override
    public String toString() {
        return "Cohete{" +
                "modelo='" + this.getModelo() + '\'' +
                ", fabricante='" + this.getFabricante() + '\'' +
                '}';
    }

}