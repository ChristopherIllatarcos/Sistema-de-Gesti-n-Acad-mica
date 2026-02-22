
package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author caill
 */
public class Conectar {
    
        public static Connection conexion() {

        String url = "jdbc:sqlite:C:/Users/caill/Documents/NetBeansProjects/Escuela/escuela.db";

        try {
            return DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
    
}
