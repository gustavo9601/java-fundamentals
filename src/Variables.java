public class Variables {

    /*
     * Primitivos

     * */

    static float varFlotante;

    public static void main(String[] args) {
        int age = 26;
        String name = "gustavo";
        double salary = 1000.5;
        double porcentaje = 80.2f;
        double notacionCientifica = 98765.43e-3; // 98.76843
        boolean isActive = true;
        // Se especifica al final del numero L, para que sepa que es un literal long integer
        long integerLong = 999999999999999L;
        byte numberByte = 8;
        // Se especifica al final F, para que sepa que sera float number, si es muy grande se mostrar con exponente
        float numberFloat = 5555555555555555F;
        // Unicode charts
        char character = 'A';
        // binario => debe empezar 0b
        int binaryNumber = 0b11010;
        // hexadecimal => debe empezar 0x
        int hexadecimalNumber = 0x1f4;

        int i = 5, j = 4;


        // var => el tipo de dato asignado se asginara dinamicamente en funcion del valor
        var numberString = "tres";

        System.out.println("Saludar a " + name
                + " | edad: " + Integer.toString(age)
                + " | activo: " + Boolean.toString(isActive));
        System.out.println("edad: " + age);
        System.out.println("edad en binario: " + Integer.toBinaryString(age));
        System.out.println("salario: " + salary);
        System.out.println("integerLong: " + integerLong);
        System.out.println("numberFloat: " + numberFloat);
        System.out.println("character = " + character);


        String motherName;
        motherName = "Martha";
        System.out.println("Mom: " + motherName.toLowerCase());

        varFlotante = 5.0F;
        System.out.println("varFlotante = " + varFlotante);



        /*Caracteres especiales*/
        // espacio
        System.out.println("espacio \u0020.");
        // retroceso
        System.out.println("retroceso \b.");
        // tabulador
        System.out.println("tabulador \t.");
        // salto de linea
        System.out.println("salto de \nlinea.");

    }
}
