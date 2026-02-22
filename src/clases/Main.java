package clases;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author caill
 */
import frames.Principal;

public class Main {

    public static void main(String[] args) {

        System.out.println("Iniciando aplicación...");

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });

    }
}
