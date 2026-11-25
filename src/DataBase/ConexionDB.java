package DataBase;

import Excepciones.DBConexionExcepcion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    private static String url = System.getenv("DB_URL");
    private static String usuario = System.getenv("DB_USER");
    private static String password = System.getenv("DB_PASS");
    private static Connection conexion;


    public static Connection getConexion() throws DBConexionExcepcion {
        try {
            conexion = DriverManager.getConnection(url, usuario, password);
        }catch (SQLException e){
            throw new DBConexionExcepcion("Error al conectar a la base de datos");
        }
        return conexion;
    }

    public static void closeConexion() throws DBConexionExcepcion {
        try {
            conexion.close();
        }catch (SQLException e){
            throw new  DBConexionExcepcion("Error al cerrar conexion");
        }
    }

}
