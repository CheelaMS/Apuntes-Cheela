package cl.duoc.salmondelsur.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// ACTIVIDAD 1: completar la conexión JDBC hacia la base salmon_del_sur.
public class Conexion {

    private static final String URL = "jdbc:mysql://localhost:3306/salmon_del_sur?useSSL=false";
    private static final String USUARIO = "root";
    private static final String CLAVE = "";

    public static Connection abrir() throws SQLException {
        return DriverManager.getConnection(URL,USUARIO,CLAVE);


    }
}
