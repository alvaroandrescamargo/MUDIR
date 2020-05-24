
package Modelo;

import java.util.Date;

/**
 *
 * @author Alvaro Andres
 */

public class EntidadPaciente extends Persona
{
    private int id;
    private String TipoDocumentoPaciente;
    private String DocumentoPaciente;
    private String NombrePaciente;
    private String ApellidoPaciente;
    private String FechaNacimientoPaciente;
    private String GeneroPaciente;
    private String UltimoGradoCursado;
    private String EpsPaciente;
    private String Repitente;
    private int idPadreFamilia;
    private String Observacioines;

    public String getObservacioines() {
        return Observacioines;
    }

    public void setObservacioines(String Observacioines) {
        this.Observacioines = Observacioines;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoDocumentoPaciente() {
        return TipoDocumentoPaciente;
    }

    public void setTipoDocumentoPaciente(String TipoDocumentoPaciente) {
        this.TipoDocumentoPaciente = TipoDocumentoPaciente;
    }

    public String getDocumentoPaciente() {
        return DocumentoPaciente;
    }

    public void setDocumentoPaciente(String DocumentoPaciente) {
        this.DocumentoPaciente = DocumentoPaciente;
    }

    public String getNombrePaciente() {
        return NombrePaciente;
    }

    public void setNombrePaciente(String NombrePaciente) {
        this.NombrePaciente = NombrePaciente;
    }

    public String getApellidoPaciente() {
        return ApellidoPaciente;
    }

    public void setApellidoPaciente(String ApellidoPaciente) {
        this.ApellidoPaciente = ApellidoPaciente;
    }

    public String getFechaNacimientoPaciente() {
        return FechaNacimientoPaciente;
    }

    public void setFechaNacimientoPaciente(String FechaNacimientoPaciente) {
        this.FechaNacimientoPaciente = FechaNacimientoPaciente;
    }

    public String getGeneroPaciente() {
        return GeneroPaciente;
    }

    public void setGeneroPaciente(String GeneroPaciente) {
        this.GeneroPaciente = GeneroPaciente;
    }

    public String getUltimoGradoCursado() {
        return UltimoGradoCursado;
    }

    public void setUltimoGradoCursado(String UltimoGradoCursado) {
        this.UltimoGradoCursado = UltimoGradoCursado;
    }

    public String getEpsPaciente() {
        return EpsPaciente;
    }

    public void setEpsPaciente(String EpsPaciente) {
        this.EpsPaciente = EpsPaciente;
    }

    public String getRepitente() {
        return Repitente;
    }

    public void setRepitente(String Repitente) {
        this.Repitente = Repitente;
    }

    public int getIdPadreFamilia() {
        return idPadreFamilia;
    }

    public void setIdPadreFamilia(int idPadreFamilia) {
        this.idPadreFamilia = idPadreFamilia;
    }

    
}
