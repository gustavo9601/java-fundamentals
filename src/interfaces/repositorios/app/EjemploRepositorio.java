package interfaces.repositorios.app;

import interfaces.repositorios.app.modelo.Cliente;
import interfaces.repositorios.app.repositorios.ClienteListRepositorio;
import interfaces.repositorios.app.repositorios.Direccion;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {
        ClienteListRepositorio repositorio = new ClienteListRepositorio();
        repositorio.crear(new Cliente("Gustavo", "Marquez"));
        repositorio.crear(new Cliente("Meliza", "Marquez"));
        repositorio.crear(new Cliente("Martha", "Prieto"));
        repositorio.crear(new Cliente("Sergio", "Prieto"));

        System.out.println("Cantidad clientes = " + repositorio.cantidad());

        List<Cliente> clientes = repositorio.listar();
        System.out.println("Clientes");
        // Imrpimira en el println cada cliente que pasa ocultamente a la funcion
        clientes.forEach(System.out::println);

        System.out.println("Paginados");
        List<Cliente> clientesPaginados = repositorio.listar(2, 3);
        clientesPaginados.forEach(System.out::println);


        System.out.println("Ordenados");
        List<Cliente> clientesOrdenados = repositorio.listar("nombre", Direccion.DESC);
        clientesOrdenados.forEach(System.out::println);
        System.out.println("Modificando Cliente");
        repositorio.porId(1)
                .setNombre("AAAAAAAAAAAAAAAAAA");
        clientesOrdenados.forEach(System.out::println);

        System.out.println("Eliminar cliente");
        repositorio.eliminar(1);
        clientes.forEach(System.out::println);
    }
}
