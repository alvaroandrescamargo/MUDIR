package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/mudirdb";
    private String usuario = "root";
    private String contrasena = "";
    public Connection conectar;
    
    public Conexion()
    {
        try
        {
            Class.forName(driver);
            conectar = DriverManager.getConnection(url, usuario, contrasena);
//            JOptionPane.showMessageDialog(null, "Conexion Exitosa!!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Sin Conexion a BD " + e.getMessage());
        } 
    }
    
    public Connection getConexion()
    {
        return conectar;
    }
    
}
