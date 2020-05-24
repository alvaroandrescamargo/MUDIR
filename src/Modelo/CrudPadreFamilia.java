package Modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Alvaro Andres
 */
public class CrudPadreFamilia {
    
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private Connection conexion = null;
    
    public CrudPadreFamilia() 
    {
        Conexion llamar = new Conexion();
        conexion = llamar.getConexion();
    }
    
    public EntidadPadreFamilia consultarPadreFamilia(String cedula)
    {
        EntidadPadreFamilia padre = new EntidadPadreFamilia();
        try 
        {
            String sql = "select * from padrefamilia where"
                        + " Documento='" + cedula+ "'";
            ps = conexion.prepareStatement(sql);    
            rs = ps.executeQuery();
            while (rs.next()) 
            {
                padre.setTelefonoPadre(rs.getString("TelefonoPadre"));
                padre.setEmailPadre(rs.getString("EmailPadre"));
                padre.setCiudadRecidencia(rs.getString("CiudadRecidencia"));
                padre.setDireccionRecidencia(rs.getString("DireccionRecidencia"));
                padre.setNombrePadre(rs.getString("NombrePadre"));
                padre.setApellidoPadre(rs.getString("ApellidosPadre"));
                padre.setTipoDocumentoPadre(rs.getString("TipoDocumentoPadre"));
                padre.setDocumentoPadre(rs.getString("Documento"));
                              
                
                return padre;
            }
        } catch (SQLException e) 
        {
            System.out.println("Error en el metodo validarUsuario()" +e.getMessage());   
        }finally 
        {
            try 
            {
                ps.close();
                rs.close();
            } catch (SQLException e) 
            {
                 System.out.println("Error en el metodo validarUsuario()" +e.getMessage());
            }
        }
        return padre;
    }
    
    /**
     * 
     * @param paciente
     * @return 
     */
    public boolean insertarPadreFamilia(EntidadPadreFamilia padre) 
    {
        String query = "INSERT INTO padrefamilia (TelefonoPadre, EmailPadre, CiudadRecidencia, 	DireccionRecidencia,"
                + "NombrePadre, ApellidosPadre, TipoDocumentoPadre, Documento) "
                     + "values (?,?,?,?,?,?,?,?)";
        try 
        {
            if (padre!=null) 
            {
                ps = conexion.prepareStatement(query);
                ps.setString(1, padre.getTelefonoPadre());
                ps.setString(2, padre.getEmailPadre());
                ps.setString(3, padre.getCiudadRecidencia());
                ps.setString(4, padre.getDireccionRecidencia());
                ps.setString(5, padre.getNombrePadre());
                ps.setString(6, padre.getApellidoPadre());
                ps.setString(7, padre.getTipoDocumentoPadre());
                ps.setString(8, padre.getDocumentoPadre());
                
                ps.executeUpdate();
                return true;
            }
        } catch (SQLException e) 
        {
            System.out.println("Error en el metodo : insertar Padre "+ e.getMessage());
        }finally{

        }
        return false;
       }
    
    public boolean eliminarPadreFamilia(String cedula) 
    {
        String query = "DELETE FROM padrefamilia WHERE Documento = ?"; 
        try 
        {
            
            
                ps = conexion.prepareStatement(query);
                
                ps.setString(1, cedula);
                
                ps.executeUpdate();
                return true;
            
        } catch (SQLException e) 
        {
            System.out.println("Error en el metodo : insertarPaciente "+ e.getMessage());
        }finally{

        }
        return false;
       }
    
    public boolean actualizarPadreFamilia(EntidadPadreFamilia padre) 
    {
        String query = "UPDATE padrefamilia SET TelefonoPadre = ?, EmailPadre = ?, CiudadRecidencia = ?, DireccionRecidencia = ?,"
                + "NombrePadre = ?, ApellidosPadre = ?, TipoDocumentoPadre = ? WHERE Documento = ?";
        try 
        {
            if (padre!=null) 
            {
                ps = conexion.prepareStatement(query);
                ps.setString(1, padre.getTelefonoPadre());
                ps.setString(2, padre.getEmailPadre());
                ps.setString(3, padre.getCiudadRecidencia());
                ps.setString(4, padre.getDireccionRecidencia());
                ps.setString(5, padre.getNombrePadre());
                ps.setString(6, padre.getApellidoPadre());
                ps.setString(7, padre.getTipoDocumentoPadre());
                ps.setString(8, padre.getDocumentoPadre());
                
                ps.executeUpdate();
                return true;
            }
        } catch (SQLException e) 
        {
            System.out.println("Error en el metodo : insertar Padre "+ e.getMessage());
        }finally{

        }
        return false;
       }
    
}
