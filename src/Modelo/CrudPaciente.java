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
public class CrudPaciente {
    
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private Connection conexion = null;

    public CrudPaciente() 
    {
        Conexion llamar = new Conexion();
        conexion = llamar.getConexion();
    }
    
    public EntidadPaciente consultarPaciente(String cedula)
    {
        EntidadPaciente paciente = new EntidadPaciente();
        try 
        {
            String sql = "select * from pacientes where"
                        + " DocumentoPaciente=" + cedula;
            ps = conexion.prepareStatement(sql);    
            rs = ps.executeQuery();
            while (rs.next()) 
            {
                paciente.setTipoDocumentoPaciente(rs.getString("TipoDocumentoPaciente"));
                paciente.setDocumentoPaciente(rs.getString("DocumentoPaciente"));
                paciente.setNombrePaciente(rs.getString("NombrePaciente"));
                paciente.setApellidoPaciente(rs.getString("ApellidoPaciente"));
                paciente.setFechaNacimientoPaciente(rs.getString("FechaNacimientoPaciente"));
                paciente.setGeneroPaciente(rs.getString("GeneroPaciente"));
                paciente.setUltimoGradoCursado(rs.getString("UltimoGradoCursado"));
                paciente.setEpsPaciente(rs.getString("EpsPaciente"));
                paciente.setRepitente(rs.getString("Repitente"));
                
                return paciente;
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
        return paciente;
    }
    
    /**
     * 
     * @param paciente
     * @return 
     */
    public boolean insertarPaciente(EntidadPaciente paciente) 
    {
        String query = "INSERT INTO pacientes (TipoDocumentoPaciente, DocumentoPaciente, NombrePaciente, ApellidoPaciente, FechaNacimientoPaciente,"
                + "GeneroPaciente, UltimoGradoCursado, EpsPaciente, Repitente, idPadreFamilia) "
                     + "values (?,?,?,?,?,?,?,?,?,?)";
        try 
        {
            if (paciente!=null) 
            {
                ps = conexion.prepareStatement(query);
                
                
                ps.setString(1, paciente.getTipoDocumentoPaciente());
                ps.setString(2, paciente.getDocumentoPaciente());
                ps.setString(3, paciente.getNombrePaciente());
                ps.setString(4, paciente.getApellidoPaciente());
                ps.setString(5, paciente.getFechaNacimientoPaciente());
                ps.setString(6, paciente.getGeneroPaciente());
                ps.setString(7, paciente.getUltimoGradoCursado());
                ps.setString(8, paciente.getEpsPaciente());
                ps.setString(9, paciente.getRepitente());
                ps.setInt(10, paciente.getIdPadreFamilia());
                ps.executeUpdate();
                return true;
            }
        } catch (SQLException e) 
        {
            System.out.println("Error en el metodo : insertarPaciente "+ e.getMessage());
        }finally{

        }
        return false;
       }
    
    public boolean eliminarPaciente(String cedula) 
    {
        String query = "DELETE FROM pacientes WHERE DocumentoPaciente = ?"; 
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
    
    public boolean actualizarPaciente(EntidadPaciente paciente) 
    {
        String query = "UPDATE padrefamilia SET TipoDocumentoPaciente = ?, DocumentoPaciente = ?, NombrePaciente = ?, ApellidoPaciente = ?, FechaNacimientoPaciente = ?,"
                + "GeneroPaciente = ?, UltimoGradoCursado = ?, EpsPaciente = ?, Repitente = ?, idPadreFamilia = ? WHERE Documento = ?";
        try 
        {
            if (paciente!=null) 
            {
                ps = conexion.prepareStatement(query);
                ps.setString(1, paciente.getTipoDocumentoPaciente());
                ps.setString(2, paciente.getDocumentoPaciente());
                ps.setString(3, paciente.getNombrePaciente());
                ps.setString(4, paciente.getApellidoPaciente());
                ps.setString(5, paciente.getFechaNacimientoPaciente());
                ps.setString(6, paciente.getGeneroPaciente());
                ps.setString(7, paciente.getUltimoGradoCursado());
                ps.setString(8, paciente.getEpsPaciente());
                ps.setString(9, paciente.getRepitente());
                ps.setInt(10, paciente.getIdPadreFamilia());
                
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
