/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.sql.Date;


public class Historial implements Serializable {
    private  Long idhistorial;
    private  Long idProyecto;
    private  Long idLote;
    private  String EstadoProyecto;
    private  String NombreCampo;
    private  String DescripcionP;
    private  String laboreoefect;
    private  Date fecha;

    public Historial() {
    }

    public Historial(Long idhistorial, Long idProyecto, Long idLote, String EstadoProyecto, String NombreCampo, String DescripcionP, String laboreoefect, Date fecha) {
        this.idhistorial = idhistorial;
        this.idProyecto = idProyecto;
        this.idLote = idLote;
        this.EstadoProyecto = EstadoProyecto;
        this.NombreCampo = NombreCampo;
        this.DescripcionP = DescripcionP;
        this.laboreoefect = laboreoefect;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Historial{" + "idhistorial=" + idhistorial + ", idProyecto=" + idProyecto + ", idLote=" + idLote + ", EstadoProyecto=" + EstadoProyecto + ", NombreCampo=" + NombreCampo + ", DescripcionP=" + DescripcionP + ", laboreoefect=" + laboreoefect + ", fecha=" + fecha + '}';
    }

    public Long getIdhistorial() {
        return idhistorial;
    }

    public void setIdhistorial(Long idhistorial) {
        this.idhistorial = idhistorial;
    }

    public Long getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Long idProyecto) {
        this.idProyecto = idProyecto;
    }

    public Long getIdLote() {
        return idLote;
    }

    public void setIdLote(Long idLote) {
        this.idLote = idLote;
    }

    public String getEstadoProyecto() {
        return EstadoProyecto;
    }

    public void setEstadoProyecto(String EstadoProyecto) {
        this.EstadoProyecto = EstadoProyecto;
    }

    public String getNombreCampo() {
        return NombreCampo;
    }

    public void setNombreCampo(String NombreCampo) {
        this.NombreCampo = NombreCampo;
    }

    public String getDescripcionP() {
        return DescripcionP;
    }

    public void setDescripcionP(String DescripcionP) {
        this.DescripcionP = DescripcionP;
    }

    public String getLaboreoefect() {
        return laboreoefect;
    }

    public void setLaboreoefect(String laboreoefect) {
        this.laboreoefect = laboreoefect;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

   
    
    
}
