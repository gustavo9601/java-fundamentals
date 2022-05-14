package com.paquete.app;

// Usando el wilcard para cargar todas las clases de ese paquete
import com.paquete.app.hogar.*;
import com.paquete.app.jardin.Animal;

// Haciendo el import de funcion estatica especifica
import static com.paquete.app.hogar.Persona.saludar;
import static com.paquete.app.hogar.Persona.GENERO;

/*
*
* Por lo general la convension para los paquetes es: dominio.nombre_empresa.funcionalidad
* Ej: com.elementoretail.auth   // Creara los directorios separados por comas
*
* */


public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona persona = new Persona("Gustavo");
        Animal animal = new Animal();


        System.out.println("saludar(\"Gustavo\")" + saludar("Gustavo"));
        System.out.println("GENERO = " + GENERO);



    }
}
