package Estructura_de_datos.api_collection;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class EjemploVuelosList {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm");

        List<Vuelo> llegadas = new ArrayList<>();

        try {
            llegadas.add(new Vuelo("AAL 933", "New York", "Santiago", df.parse("2021-08-29 05:39"), 62));
            llegadas.add(new Vuelo("LAT 755", "Sao Paulo", "Santiago", df.parse("2021-08-31 04:45"), 47));
            llegadas.add(new Vuelo("SKU 621", "Rio De Janeiro", "Santiago", df.parse("2021-08-30 16:00"), 52));
            llegadas.add(new Vuelo("DAL 147", "Atlanta", "Santiago", df.parse("2021-08-29 13:22"), 59));
            llegadas.add(new Vuelo("AVA 241", "Bogota", "Santiago", df.parse("2021-08-31 14:05"), 25));
            llegadas.add(new Vuelo("AMX 10", "Mexico City", "Santiago", df.parse("2021-08-31 05:20"), 29));
            llegadas.add(new Vuelo("IBE 6833", "Londres", "Santiago", df.parse("2021-08-30 08:45"), 55));
            llegadas.add(new Vuelo("LAT 2479", "Frankfurt", "Santiago", df.parse("2021-08-29 07:41"), 51));
            llegadas.add(new Vuelo("SKU 803", "Lima", "Santiago", df.parse("2021-08-30 10:35"), 48));
            llegadas.add(new Vuelo("LAT 533", "Los Ángeles", "Santiago", df.parse("2021-08-29 09:14"), 59));
            llegadas.add(new Vuelo("LAT 1447", "Guayaquil", "Santiago", df.parse("2021-08-31 08:33"), 31));
            llegadas.add(new Vuelo("CMP 111", "Panama City", "Santiago", df.parse("2021-08-31 15:15"), 29));
            llegadas.add(new Vuelo("LAT 705", "Madrid", "Santiago", df.parse("2021-08-30 08:14"), 47));
            llegadas.add(new Vuelo("AAL 957", "Miami", "Santiago", df.parse("2021-08-29 22:53"), 60));
            llegadas.add(new Vuelo("ARG 5091", "Buenos Aires", "Santiago", df.parse("2021-08-31 09:57"), 32));
            llegadas.add(new Vuelo("LAT 1283", "Cancún", "Santiago", df.parse("2021-08-31 04:00"), 35));
            llegadas.add(new Vuelo("LAT 579", "Barcelona", "Santiago", df.parse("2021-08-29 07:45"), 61));
            llegadas.add(new Vuelo("AAL 945", "Dallas-Fort Worth", "Santiago", df.parse("2021-08-30 07:12"), 58));
            llegadas.add(new Vuelo("LAT 501", "París", "Santiago", df.parse("2021-08-29 18:29"), 49));
            llegadas.add(new Vuelo("LAT 405", "Montevideo", "Santiago", df.parse("2021-08-30 15:45"), 39));

            // Llegadas inicialmente
            System.out.println("llegadas inicio=\t" + llegadas);

            // Orden por fecha de llegada de forma ascendente
            llegadas.sort(Comparator.comparing((Vuelo vuelo) -> vuelo.getFechayHoraLlegada()));
            System.out.println("llegadas ordenadas asc=\t" + llegadas);
            // Ultimo vuelo en llegar
            System.out.println("Ultimo vuelo en llegar=\t" + llegadas.get(llegadas.size() - 1));

            // Vuelo con el menor numero de pasajeros
            llegadas.sort(Comparator.comparing(Vuelo::getCantidadPasajeros));
            System.out.println("Vuelo con menor numero pasajeros =\t" + llegadas.get(0));

        } catch (ParseException parseException) {
            System.out.println("Error al parsear, error=\t" + parseException.getMessage());
        }
    }
}


class Vuelo implements Comparable<Vuelo> {
    private String nombre;
    private String origen;
    private String destino;
    private Date fechayHoraLlegada;
    private int cantidadPasajeros;

    public Vuelo(String nombre, String origen, String destino, Date fechayHoraLlegada, int cantidadPasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fechayHoraLlegada = fechayHoraLlegada;
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public Date getFechayHoraLlegada() {
        return fechayHoraLlegada;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "nombre='" + this.nombre + '\'' +
                ", origen='" + this.origen + '\'' +
                ", destino='" + this.destino + '\'' +
                ", fecha=" + this.fechayHoraLlegada +
                ", cantidadPasajeros=" + this.cantidadPasajeros +
                '}';
    }

    @Override
    public int compareTo(Vuelo vuelo) {
        return this.getFechayHoraLlegada().compareTo(vuelo.getFechayHoraLlegada());
    }
}