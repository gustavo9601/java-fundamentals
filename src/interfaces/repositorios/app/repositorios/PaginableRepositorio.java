package interfaces.repositorios.app.repositorios;

import interfaces.repositorios.app.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
