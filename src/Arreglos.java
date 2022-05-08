import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Arreglos {
    public static void main(String[] args) {
        // new int[n] reserva de posiciones en memoria N
        // porde fault cada posicion se crea n 0
        int[] numeros = new int[3];
        numeros[0] = 100;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numeros [" + i + "] = " + numeros[i]);
        }

        // Define el arreglo en tipo tuple, de posicion dada por los valores iniciales
        String[] nombres = {"Gustavo", "Alejandro", "Meliza", "Cinthya"};
        // Ordenando el arreglo de forma ascendente
        Arrays.sort(nombres);
        for (String nombre : nombres) {
            System.out.println("Nombre  = " + nombre);
        }

        // Recorriendo a la inversa
        for (int i = nombres.length - 1; i >= 0; i--) {
            System.out.println("Nombre inverso = " + nombres[i]);
        }

        // Reverse positiones arreglo finales al ininio y viceversa
        // Usamos el meotdo de apui collection que requerieq una lista
        // Array.asList parseamos de array a Lista
        Collections.reverse(Arrays.asList(nombres));
        for (String nombre : nombres) {
            System.out.println("Nombre reverse  = " + nombre);
        }


        // Copia de un arreglo a otro
        String[] nombresCortados = new String[nombres.length - 1];
        // arrayCopy(array_oroginal, posicion_inicial_Array_original, array_a_copiar, posicion_inicial_array_a_copiar, posicion_final_array_a_copiar)
        System.arraycopy(nombres, 0, nombresCortados, 0, nombresCortados.length);

        for (int i = 0; i < nombresCortados.length; i++) {
            System.out.println("nombresCortados[" + i + "] = " + nombresCortados[i]);
        }

        // Arreglos combinados
        int[] a, b, c;
        a = new int[10];
        b = new int[10];
        c = new int[a.length + b.length];

        // Llenando
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = (i + 1) * 5;
        }
        // Uniendo una posicion de a y otra de b
        int aux = 0;
        for (int i = 0; i < a.length; i++) {
            c[aux++] = a[i];
            c[aux++] = b[i];
        }
        // Recorriendo
        for (int i = 0; i < c.length; i++) {
            System.out.println("c[" + i + "] = " + c[i]);
        }


    }
}
