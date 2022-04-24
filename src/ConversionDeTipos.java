public class ConversionDeTipos {
    public static void main(String[] args) {
        String numberString = "50";
        int number = Integer.parseInt(numberString);
        System.out.println("number = " + number);
        double numberDouble = Double.parseDouble(numberString);
        System.out.println("numberDouble = " + numberDouble);
        String booleanString = "false";
        boolean flag = Boolean.parseBoolean(booleanString);
        System.out.println("flag = " + flag);
        int otherNumber = 100;
        // valueOf recibe cualquier valor primitivo, usa sobrecarga de metodos y en funcion del tipo de dato realiza la conversion

        String otherNumberString = String.valueOf(otherNumber);
        System.out.println("otherNumberString = " + otherNumberString);

        // forzando el casteo, aunque halla perdida de datos
        int i = 900020;
        short s = (short) i;
        System.out.println("s = " + s);
    }
}
