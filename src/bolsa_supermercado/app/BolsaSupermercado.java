package bolsa_supermercado.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BolsaSupermercado<T> implements Iterable<T>{
    protected List<T> productos = new ArrayList<>();

    public BolsaSupermercado addProducto(T productoGenerico) {
        this.productos.add(productoGenerico);
        return this;
    }

    public List<T> getProductos() {
        return this.productos;
    }

    @Override
    public Iterator<T> iterator() {
        return this.productos.iterator();
    }
}
