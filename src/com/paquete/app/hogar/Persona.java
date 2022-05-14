package com.paquete.app.hogar;

public class Persona {
    private String nombre;
    public static final String GENERO = "Masculino";

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public static String saludar(String nombre) {
        return "Hola " + nombre;
    }
}
