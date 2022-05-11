public class ClasesAtributosFinal {
    /*
     * Final => Significa que sera constantes y publicas y estaticos
     * Suele ser usado con mayusculas snak_case
     * Se debe asginar un valor al declararla ya que es constante
     * */

    public static final String NOMBRE = "Gustavo Marquez";
    public static final int EDAD = 26;
    public static final int VELOCIDAD_MAXIMA = 500;

    public static void main(String[] args) {
        System.out.println("ClasesAtributosFinal.NOMBRE = " + ClasesAtributosFinal.NOMBRE);
        System.out.println("ClasesAtributosFinal.EDAD = " + ClasesAtributosFinal.EDAD);
        System.out.println("ClasesAtributosFinal.VELOCIDAD_MAXIMA = " + ClasesAtributosFinal.VELOCIDAD_MAXIMA);
    }

}
