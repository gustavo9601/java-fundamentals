package clase_abstracta.ejemplo.formulario;

import clase_abstracta.ejemplo.elementos.ElementoForm;
import clase_abstracta.ejemplo.elementos.InputForm;
import clase_abstracta.ejemplo.elementos.SelectForm;
import clase_abstracta.ejemplo.elementos.TextAreaForm;
import clase_abstracta.ejemplo.select.Opcion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        InputForm inputUserName = new InputForm("username", "text");
        InputForm inputPassword = new InputForm("password", "password");
        InputForm inputEmail = new InputForm("email", "email");
        InputForm inputEdad = new InputForm("edad", "number");

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
        inputEmail.setValor("Gustavo@gmail.com");
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

    }
}
