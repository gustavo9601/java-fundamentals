public class ClasesEnums {
    /*
     * Los Enums permiten tener valores constantes, para multiples opciones
     * */
    public static void main(String[] args) {
        System.out.println("ColorSimple.AMARILLO => " + ColorSimple.AMARILLO);
        System.out.println("ColorSimple.ROJO => " + ColorSimple.ROJO);
        System.out.println("ColorSimple.GRIS => " + ColorSimple.GRIS);

        System.out.println("ColorComplejo.AMARILLO => " + ColorComplejo.AMARILLO);
        System.out.println("ColorComplejo.GRIS => " + ColorComplejo.GRIS);

        System.out.println("TipoAutomovil.DEPORTIVO => " + TipoAutomovil.DEPORTIVO);
        System.out.println("TipoAutomovil.DEPORTIVO.getTipoAutomovil() => " + TipoAutomovil.DEPORTIVO.getTipoAutomovil());
        System.out.println("TipoAutomovil.DEPORTIVO.getPuertas() => " + TipoAutomovil.DEPORTIVO.getPuertas());


        // Usando switch case con un encum
        TipoAutomovil tipoAutomovil = TipoAutomovil.DEPORTIVO;
        switch (tipoAutomovil) {
            case DEPORTIVO:
                System.out.println("Es un deportivo");
                break;
            case LIMOSINA:
                System.out.println("Es una limosina");
            case SEDAN:
                System.out.println("Fue un sedan");
            default:
                System.out.println("No se encontro el vehiculo");
        }
    }
}

// Cada nombre de variable, sera el valor del COLOR.AMARILLO => AMARILLO
enum ColorSimple {
    AMARILLO,
    ROJO,
    GRIS;
}

// Si queremos cambiar el valor por default de cada item,
// se debe crear una variable final con constructor para poder sobrescribirlo
// Y Se puede sobrescribir el toString para que pueda ser retornado directamente
enum ColorComplejo {
    AMARILLO("Amarillo"),
    ROJO("Rojo"),
    GRIS("Gris");

    private final String color;

    public String getColor() {
        return color;
    }

    ColorComplejo(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.getColor();
    }
}


// Enums con multiples parametros
enum TipoAutomovil {
    SEDAN("Sedan", 4),
    DEPORTIVO("Deportivo", 2),
    LIMOSINA("Limosina", 6);



    public final String tipoAutomovil;
    public final int puertas;

    public String getTipoAutomovil() {
        return tipoAutomovil;
    }
    public int getPuertas() {
        return puertas;
    }

    TipoAutomovil(String tipoAutomovil, int puertas) {
        this.tipoAutomovil = tipoAutomovil;
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return this.tipoAutomovil + " | " + this.puertas;
    }
}
