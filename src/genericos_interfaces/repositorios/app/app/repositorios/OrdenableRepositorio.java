package genericos_interfaces.repositorios.app.app.repositorios;

import genericos_interfaces.repositorios.app.app.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio<T> {
    List<T> listar(String campo, Direccion dir);

}
