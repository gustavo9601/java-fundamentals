package genericos_interfaces.repositorios.app.app.repositorios;

import genericos_interfaces.repositorios.app.app.modelo.Cliente;

import java.util.List;
// Ahora el repositorio permitira ser de cualquier tipo de clase y no solo una especifica
public interface CrudRepositorio<T> {
    List<T> listar();

    Cliente porId(Integer id);

    void crear(T cliente);

    void editar(T cliente, Integer id);

    void eliminar(Integer id);

}
