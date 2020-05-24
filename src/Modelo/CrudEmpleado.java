package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Alvaro Andres
 */
public class CrudEmpleado {
    
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private Connection conexion = null;

    public CrudEmpleado() 
    {
        Conexion llamar = new Conexion();
        conexion = llamar.getConexion();
    }

    public boolean validarSesion(String usuario, String pass)
    {
        try 
        {
            String sql = "select * from empleado where DocumentoEmpleado='" + usuario + 
                          "' and PasswordEmpleado='" + pass + "'";
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) 
            {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Error en el metodo validarUsuario()" +e.getMessage());   
        }
        return false;
    }
     
    public boolean validarPersona(String tabla,String coluna, String dato)
    {
        try 
        {
            String sql = "select * from "+tabla +" where "+coluna+"=" + dato +"";
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) 
            {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Error en el metodo validarPersona()" +e.getMessage());   
        }
        return false;
    }
    /**
     * 
     * @param cedula
     * @return 
     */
    public EntidadEmpleado consultarEmpleado(String cedula)
    {
        EntidadEmpleado empleado = new EntidadEmpleado();
        try 
        {
            String sql = "select * from empleado where"
                        + " DocumentoEmpleado='" + cedula+ "'";
            ps = conexion.prepareStatement(sql);    
            rs = ps.executeQuery();
            while (rs.next()) 
            {
                empleado.setTipoDocumento(rs.getString(2));
                empleado.setDocumentoEmpleado(rs.getString(3));
                empleado.setNombreEmpleado(rs.getString(4));
                empleado.setApellidosEmpleado(rs.getString(5));
                empleado.setTelefonosEmpleado(rs.getString(6));
                empleado.setDirecionEmpleado(rs.getString(7));
                empleado.setCorreoElectronico(rs.getString(8));
                empleado.setCargoEmpleado(rs.getString(9));
                empleado.setEpsEmpleado(rs.getString(10));
                empleado.setRol(rs.getString(11));
                return empleado;
            }
        } catch (SQLException e) 
        {
            System.out.println("Error en el metodo validarUsuario()" +e.getMessage());   
        }
        return empleado;
    }
    
    /**
     * 
     * @param empleado
     * @return 
     */
    public boolean insertarEmpleado(Persona persona) 
    {
        
        String query = "INSERT INTO empleado (TipoDocumento,DocumentoEmpleado, "
                      + "NombreEmpleado, ApellidosEmpleado, TelefonosEmpleado, "
                      + "DirecionEmpleado, CorreoElectronico, CargoEmpleado,"
                      + "EpsEmpleado,Rol,PasswordEmpleado) values (?,?,?,?,?,?,?,?,?,?,?)";
        try 
        {
            EntidadEmpleado empleado = (EntidadEmpleado)persona;
            
            if (empleado!=null) 
            {
                ps = conexion.prepareStatement(query);
                ps.setString(1, empleado.getTipoDocumento());
                ps.setString(2, empleado.getDocumentoEmpleado());
                ps.setString(3, empleado.getNombreEmpleado());
                ps.setString(4, empleado.getApellidosEmpleado());
                ps.setString(5, empleado.getTelefonosEmpleado());
                ps.setString(6, empleado.getDirecionEmpleado());
                ps.setString(7, empleado.getCorreoElectronico());
                ps.setString(8, empleado.getCargoEmpleado());
                ps.setString(9, empleado.getEpsEmpleado());
                ps.setString(10, empleado.getRol());
                ps.setString(11, empleado.getPasswordEmpleado());
                ps.executeUpdate();
                return true;
            }
        } catch (SQLException e) 
        {
            System.out.println("Error en el metodo : insertarEmpleado "+ e.getMessage());
        }finally{

        }
        return false;
    }
    
    
    public boolean eliminarEmpleado(String cedula) 
    {
       
        String query = "DELETE FROM empleado WHERE DocumentoEmpleado = ?";
        try 
        {
            ps = conexion.prepareStatement(query);
            ps.setString(1, cedula);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error en el metodo : insertarPaciente " + e.getMessage());
        }
        return false;
    }
}
