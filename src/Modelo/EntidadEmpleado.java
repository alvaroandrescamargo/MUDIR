package Modelo;

/**
 *
 * @author Alvaro Andres
 */
public class EntidadEmpleado  extends Persona
{
    private int id;
    private String nombreEmpleado;
    private String TipoDocumento;
    private String apellidosEmpleado;
    private String documentoEmpleado;
    private String telefonosEmpleado;
    private String direcionEmpleado;
    private String correoElectronico;
    private String cargoEmpleado;
    private String epsEmpleado;
    private String rol;
    private String passwordEmpleado;

    public int getId() {
        return id;
    }

    public String getTipoDocumento() {
        return TipoDocumento;
    }

    public void setTipoDocumento(String TipoDocumento) {
        this.TipoDocumento = TipoDocumento;
    }

    
    
    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getApellidosEmpleado() {
        return apellidosEmpleado;
    }

    public void setApellidosEmpleado(String apellidosEmpleado) {
        this.apellidosEmpleado = apellidosEmpleado;
    }

    public String getDocumentoEmpleado() {
        return documentoEmpleado;
    }

    public void setDocumentoEmpleado(String documentoEmpleado) {
        this.documentoEmpleado = documentoEmpleado;
    }

    public String getTelefonosEmpleado() {
        return telefonosEmpleado;
    }

    public void setTelefonosEmpleado(String telefonosEmpleado) {
        this.telefonosEmpleado = telefonosEmpleado;
    }

    public String getDirecionEmpleado() {
        return direcionEmpleado;
    }

    public void setDirecionEmpleado(String direcionEmpleado) {
        this.direcionEmpleado = direcionEmpleado;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getCargoEmpleado() {
        return cargoEmpleado;
    }

    public void setCargoEmpleado(String cargoEmpleado) {
        this.cargoEmpleado = cargoEmpleado;
    }

    public String getEpsEmpleado() {
        return epsEmpleado;
    }

    public void setEpsEmpleado(String epsEmpleado) {
        this.epsEmpleado = epsEmpleado;
    }

    public String getPasswordEmpleado() {
        return passwordEmpleado;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setPasswordEmpleado(String passwordEmpleado) {
        this.passwordEmpleado = passwordEmpleado;
    }
    
    
}
