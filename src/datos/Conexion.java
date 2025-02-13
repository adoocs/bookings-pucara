package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    public final String url = "jdbc:mysql://localhost:3306/bdhotel";
    public final String user = "root";
    public final String pass = "2002";
    private static Conexion INSTANCE;
    
    public static synchronized Conexion getInstance() {
        if (INSTANCE == null) 
            INSTANCE = new Conexion();
        return INSTANCE;
    }
    
    private Conexion() {}
    
    public Connection getConnection() {
        Connection conect = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conect = DriverManager.getConnection(url,user,pass);;
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e);
        }
        return conect;
    }
}
