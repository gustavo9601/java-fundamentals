package genericos_interfaces.repositorios.app.app.repositorios;

// Extendiendo las funciones y atributos definididos de ordebal repositorio
public interface OrdenableContableRepositorio<T> extends OrdenableRepositorio<T> {
    int cantidad();
}
