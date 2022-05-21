package genericos_interfaces.repositorios.app.app.repositorios;

import genericos_interfaces.repositorios.app.app.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio<T> {
    List<T> listar(int desde, int hasta);
}
