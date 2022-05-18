package interfaces.repositorios.app.repositorios;

import interfaces.repositorios.app.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio {
    List<Cliente> listar();

    Cliente porId(Integer id);

    void crear(Cliente cliente);

    void editar(Cliente cliente, Integer id);

    void eliminar(Integer id);

}
