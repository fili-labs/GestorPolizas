package gestorpolizas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GestorPolizas {

    public static void main(String[] args) {
        try {
            Connection cnx = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/gestor_polizas",
                "root",
                ""
            );

            System.out.println("Conexion exitosa");
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}