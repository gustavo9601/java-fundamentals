import java.lang.reflect.Method;
import java.math.BigDecimal;

public class VariablesClaseWraper {

    /*
     * Al usar al condicion == en un Objeto, compara que sea el mismo objeto o instancia
     * Para comparar por valor debe ser a.equals(b);
     * */

    public static void main(String[] args) {
        // Clase wrapper de un int a Integer
        Integer aInteger = Integer.valueOf(10);
        Integer aInteger2 = 5;

        int aInt = aInteger.intValue();
        int aInt2 = aInteger;

        String valorString = "99245";
        Integer bInteger = Integer.valueOf(valorString);

        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE);
        
        // BigDecimal => Es usado para precisiones exactas cuando util en sistemas financieros con calculos exactos
        BigDecimal numeroBigDecimal = new BigDecimal(10);
        System.out.println("numeroBigDecimal = " + numeroBigDecimal);

        Long cLong = aInteger.longValue();
        System.out.println("cLong: " + cLong);

        Integer[] enteros = {1, 2, 3, 4, 5, 2};
        for (Integer numero : enteros) {
            // Unboxing automatico, de Integer a int
            if (numero % 2 == 0) {
                System.out.println("Par: " + numero);
            }
        }

        boolean boleano1 = true;
        Boolean objBoolean = Boolean.valueOf(boleano1);
        System.out.println("objBoolean.getClass() = " + objBoolean.getClass());
        // Unboxing automatico
        Boolean objBoolean2 = boleano1;
        Boolean objBoolean3 = Boolean.valueOf("false");


        String text1 = "Hola Gus";
        System.out.println("text1.getClass(): " + text1.getClass());
        System.out.println("text1.getName(): " + text1.getClass().getName());
        System.out.println("text1.getSimpleName(): " + text1.getClass().getSimpleName());
        System.out.println("text1.getPackageName(): " + text1.getClass().getPackageName());

        System.out.println("==================================");
        System.out.println("==================================");
        System.out.println("Metodos String");
        for (Method metodo : text1.getClass().getMethods()) {
            System.out.println("metodo.getName(): " + metodo.getName());
        }

        // Se puede crear una variable de tipo Class
        Class strClass = text1.getClass();
        System.out.println("strClass: " + strClass);
        System.out.println("strClass.getSuperclass(): " + strClass.getSuperclass());
    }
}
