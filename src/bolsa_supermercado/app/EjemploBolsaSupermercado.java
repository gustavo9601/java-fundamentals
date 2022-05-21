package bolsa_supermercado.app;

import bolsa_supermercado.app.modelos.Fruta;
import bolsa_supermercado.app.modelos.IProducto;
import bolsa_supermercado.app.modelos.Lacteo;

import java.util.ArrayList;
import java.util.List;

public class EjemploBolsaSupermercado {
    public static void main(String[] args) {
        BolsaSupermercado<Fruta> frutaBolsaSupermercado = new BolsaSupermercado<>();
        frutaBolsaSupermercado.addProducto(new Fruta("Banano", 1000F, "Amarillo", 900F))
                .addProducto(new Fruta("Pera", 200F, "Verde", 500F))
                .addProducto(new Fruta("Manzana", 25F, "Rojo", 50000F));

        EjemploBolsaSupermercado.imprimir(frutaBolsaSupermercado.getProductos());

        BolsaSupermercado<Lacteo> lacteoaBolsaSupermercado = new BolsaSupermercado<>();
        lacteoaBolsaSupermercado.addProducto(new Lacteo("Descremanada", 1000, 900, 900))
                .addProducto(new Lacteo("Muy dulce", 5000, 1900, 9020));

        EjemploBolsaSupermercado.imprimir(lacteoaBolsaSupermercado.getProductos());


    }

    public static <T extends IProducto> void imprimir(List<T> data) {
        System.out.println("== Imprimiendo bolsa ==");
        data.forEach(t -> {
            System.out.println("Nombre: " + t.getNombre());
            System.out.println("Precio: " + t.getPrecio());
        });
    }

}
