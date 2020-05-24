
package Controlador;

import Modelo.CrudEmpleado;
import Modelo.CrudPaciente;
import Modelo.EntidadEmpleado;
import Modelo.EntidadPaciente;
import Modelo.Persona;

/**
 *
 * @author Alvaro Andres
 */
public class Controller 
{
    CrudEmpleado enviar= new CrudEmpleado();
    CrudPaciente capturar= new CrudPaciente();
    
    public  boolean validarCampoVacios(String dato)
    {
        return !dato.equalsIgnoreCase("");
    }
   
    public boolean  validarDatosSesion(String usu,String pass)
    {
        return enviar.validarSesion(usu,pass);
    }
    

    public boolean  insertarDatosPersona(Persona persona)
    {
        return capturar.insertarPaciente((EntidadPaciente) persona);
    }
    public boolean validarPersonaExistente(String tabla,String columna,String  cedula )
    {
        boolean respuesta=enviar.validarPersona(tabla,columna,cedula);
        return respuesta;

    }
    
    public  Persona consultarEmpleado(String cedula)
    {
        EntidadEmpleado empleado = enviar.consultarEmpleado(cedula);
        return empleado;
    }
   
//    public boolean  insertarDatosPersona(Persona persona)
//    {
//        return enviar.insertarEmpleado(persona);
//    }
    
    public boolean eliminarPersona(String cedula)
    {
        return enviar.eliminarEmpleado(cedula);
    }
}
