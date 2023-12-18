package com.agenda.agenda;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

public class Main {

    private Connection conectar = null;
    private final String usuario = "root";
    private final String contrasena = "123456"; 
    private final String db = "Agenda";
    private final String ip = "localhost";
    private final String puerto = "3306";
    private final String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + db;

    public Connection establecerConexion() {
        try {

            conectar = DriverManager.getConnection(cadena, usuario, contrasena);
            JOptionPane.showMessageDialog(null, "se genero la conexion");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "No se genero la conexion" + e);
        }
        return conectar;
    }

    public static void main(String[] args) {
        Main app = new Main ();
        app.establecerConexion();
    }
}
