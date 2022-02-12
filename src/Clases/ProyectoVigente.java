/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Daniel
 */
public class ProyectoVigente {
    private Long idProyecto;
    private Long idLote;

    public ProyectoVigente(Long idProyecto, Long idLote) {
        this.idProyecto = idProyecto;
        this.idLote = idLote;
    }

    public ProyectoVigente() {
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

    @Override
    public String toString() {
        return "ProyectoVigente{" + "idProyecto=" + idProyecto + ", idLote=" + idLote + '}';
    }
    
    
    
}
