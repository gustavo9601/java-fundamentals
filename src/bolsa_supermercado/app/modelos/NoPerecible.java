package bolsa_supermercado.app.modelos;

public class NoPerecible {
    protected int contenido;
    protected int calorias;

    public NoPerecible(int contenido, int calorias) {
        this.contenido = contenido;
        this.calorias = calorias;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
}
