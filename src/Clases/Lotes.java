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
public class Lotes {
    private int idLote;
    private long tamanio;
    TipoSuelo tiposuelo;
    private EstadoProyecto estado;
    private Long fk_Campo;
    private String laboreoact;
    private Long fk_proyecto;

    public Lotes() {
    }

    public Lotes(int idLote, long tamanio, TipoSuelo tiposuelo, EstadoProyecto estado, Long fk_Campo, String laboreoact, Long fk_proyecto) {
        this.idLote = idLote;
        this.tamanio = tamanio;
        this.tiposuelo = tiposuelo;
        this.estado = estado;
        this.fk_Campo = fk_Campo;
        this.laboreoact = laboreoact;
        this.fk_proyecto = fk_proyecto;
    }

    public int getIdLote() {
        return idLote;
    }

    public void setIdLote(int idLote) {
        this.idLote = idLote;
    }

    public long getTamanio() {
        return tamanio;
    }

    public void setTamanio(long tamanio) {
        this.tamanio = tamanio;
    }

    public TipoSuelo getTiposuelo() {
        return tiposuelo;
    }

    public void setTiposuelo(TipoSuelo tiposuelo) {
        this.tiposuelo = tiposuelo;
    }

    public EstadoProyecto getEstado() {
        return estado;
    }

    public void setEstado(EstadoProyecto estado) {
        this.estado = estado;
    }

    public Long getFk_Campo() {
        return fk_Campo;
    }

    public void setFk_Campo(Long fk_Campo) {
        this.fk_Campo = fk_Campo;
    }

    public String getLaboreoact() {
        return laboreoact;
    }

    public void setLaboreoact(String laboreoact) {
        this.laboreoact = laboreoact;
    }

    public Long getFk_proyecto() {
        return fk_proyecto;
    }

    public void setFk_proyecto(Long fk_proyecto) {
        this.fk_proyecto = fk_proyecto;
    }
    


 
  

    
   
    
    
   
    
}
