package interfaces.repositorios.app.repositorios;

import interfaces.repositorios.app.modelo.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepositorio implements CrudRepositorio,
        OrdenableContableRepositorio, PaginableRepositorio {

    private List<Cliente> dataSource;

    public ClienteListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Cliente> listar() {
        return this.dataSource;
    }

    @Override
    public Cliente porId(Integer id) {
        Cliente cliente = null;
        for (Cliente cli : this.dataSource) {
            if (cli.getId() == id) {
                cliente = cli;
            }
        }
        return cliente;
    }

    @Override
    public void crear(Cliente cliente) {
        this.dataSource.add(cliente);
    }

    @Override
    public void editar(Cliente cliente, Integer id) {
        Cliente cli = this.porId(id);
        cli.setNombre(cli.getNombre());
        cli.setApellido(cli.getApellido());
    }

    @Override
    public void eliminar(Integer id) {
        Cliente cli = this.porId(id);
        this.dataSource.remove(cli); // eliminamos de la lista exactamente el objeto encontrao
    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {

        // Creamos una lista clone para retornar una nueva a partir de la lista datasource
        List<Cliente> listaAOrdenar = new ArrayList<>(this.dataSource);
        // sort, necesita una implementacion de Comparator
        // compara el cliente a con el b hasta ordenarlo
        listaAOrdenar.sort((Cliente a, Cliente b) -> {
            int resultado = 0;
            if (dir == Direccion.ASC) {
                switch (campo) {
                    case "id" -> resultado = a.getId().compareTo(b.getId());
                    case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());
                    case "apellido" -> resultado = a.getApellido().compareTo(b.getApellido());
                }
            } else if (dir == Direccion.DESC) {
                switch (campo) {
                    case "id" -> resultado = b.getId().compareTo(a.getId());
                    case "nombre" -> resultado = b.getNombre().compareTo(a.getNombre());
                    case "apellido" -> resultado = b.getApellido().compareTo(a.getApellido());
                }
            }
            return resultado;
        });

        return listaAOrdenar;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        // partiendo la lista
        return this.dataSource.subList(desde, hasta);
    }

    @Override
    public int cantidad() {
        return this.dataSource.size();
    }
}
