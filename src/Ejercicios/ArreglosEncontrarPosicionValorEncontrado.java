package Ejercicios;

public class ArreglosEncontrarPosicionValorEncontrado {
    public static void main(String[] args) {

        int[] numeros = {100, 2, 3, 4, 5, 1};
        int numeroABuscar = 1; // 50

        int control = 0;
        while (control < numeros.length && numeros[control] != numeroABuscar) {
            control++;
        }
        // Si llego al numero total del arreglo, significa que lo recorrio todo y no lo encontro
        if (control == numeros.length) {
            System.out.println("El numero " + numeroABuscar + " No se encuentra en el arreglo");
        } else if (numeros[control] == numeroABuscar) {
            System.out.println("El numero " + numeroABuscar + " Esta en la posicion " + control);
        }

    }
}
