package com.paquete.app.jardin;


// class Animal  // El acceso seria unicamente en el mismo paquete

public class Animal {
    protected String nombre;
    protected String raza;

    // El acceso seria unicamente de instancia en el mismo paquete
    String lanzarPelota() {
        return "Lanza la pelota";
    }
}
