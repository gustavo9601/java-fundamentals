package clase_abstracta.ejemplo.formulario;

import clase_abstracta.ejemplo.elementos.*;
import clase_abstracta.ejemplo.select.Opcion;
import clase_abstracta.ejemplo.validador.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        InputForm inputUserName = new InputForm("username", "text");
        inputUserName.addValidador(new RequeridoValidador());

        InputForm inputPassword = new InputForm("password", "password");
        inputPassword.addValidador(new RequeridoValidador())
                .addValidador(new LargoValidador())
                .addValidador(new NoNuloValidador());

        InputForm inputEmail = new InputForm("email", "email");
        inputEmail.addValidador(new RequeridoValidador())
                .addValidador(new NoNuloValidador())
                .addValidador(new EmailValidador());

        InputForm inputEdad = new InputForm("edad", "number");
        inputEdad.addValidador(new RequeridoValidador())
                .addValidador(new NumeroValidador());

        TextAreaForm textAreaDetalle = new TextAreaForm("detalle", 10, 50);

        SelectForm selectOpciones = new SelectForm("lenguajes");

        // Pusheando a la lista de opciones
        Opcion opcionJava = new Opcion("1", "Java");
        selectOpciones.addOpcion(opcionJava)
                .addOpcion(new Opcion("2", "python"))
                .addOpcion(new Opcion("3", "js"));

        // Seteando los valores
        inputUserName.setValor("Gustavo");
        inputPassword.setValor("123456");
        inputEmail.setValor("Gustavogmail.com");
        inputEdad.setValor("26");
        opcionJava.setSelected(true);

        // Creando una lista de todos los elementos generados
        // De tipo generico de elemento form
        List<ElementoForm> elementosForms = Arrays.asList(
                textAreaDetalle,
                selectOpciones,
                inputUserName,
                inputPassword,
                inputEmail,
                inputEdad
        );

        /*
        Otra forma pusheando los valores con Add
        List<ElementoForm> elementosForms = new ArrayList<>();
        elementosForms.add(textAreaDetalle);
        elementosForms.add(selectOpciones);
        elementosForms.add(inputUserName);
        elementosForms.add(inputPassword);
        elementosForms.add(inputEmail);
        elementosForms.add(inputEdad);*/

        // Imprimiendo con expsiones lambda
        elementosForms.forEach(elementoForm -> {
            System.out.println(elementoForm.dibujarHtml());
        });

        /*
        // Forma convencional de imprimir
        for (ElementoForm elementoForm : elementosForms) {
            System.out.println(elementoForm.dibujarHtml());
        }*/


        // Recorriendo cada elemento y retornando los valores
        System.out.println("Errores en el formulario");
        elementosForms.forEach(elementoForm -> {
            if (!elementoForm.esValido()) {
                elementoForm.getErrores().forEach(error -> System.out.println("Nombre: " + elementoForm.getNombre() + " Error: " + error));
            }
        });

    }
}
