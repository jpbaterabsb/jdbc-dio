package one.digitalinnovation.jdbc;

import one.digitalinnovation.jdbc.configuration.DB;
import one.digitalinnovation.jdbc.dao.ClienteDAO;
import one.digitalinnovation.jdbc.entity.Cliente;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class BucarTodosClientesExecute {
    public static void main(String[] args) throws SQLException {
        try(Connection connection = DB.getConnection()) {
            ClienteDAO clienteDAO = new ClienteDAO(connection);
            List<Cliente> clientes = clienteDAO.buscarTodosOsClientes();
            System.out.println(clientes);
        }
    }
}
