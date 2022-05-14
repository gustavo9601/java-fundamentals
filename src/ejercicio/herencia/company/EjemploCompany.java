package ejercicio.herencia.company;

public class EjemploCompany {


    public static void main(String[] args) {
        Gerente gerente = new Gerente("Gustavo", "Marquez", "123", "Calle 100", 1000, 1);
        gerente.setPresupuesto(90000);

        System.out.println("Gerente => " + gerente);
    }

}
