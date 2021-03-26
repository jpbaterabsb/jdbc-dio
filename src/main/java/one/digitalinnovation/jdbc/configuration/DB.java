package one.digitalinnovation.jdbc.configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    private static Connection connection;
    public static Connection getConnection() throws SQLException {
        if (connection != null) {
            return connection;
        }
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/db_cadastro_cliente", "root", "root");
    }
}
