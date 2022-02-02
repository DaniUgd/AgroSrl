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

    public Lotes() {
    }

    public Lotes(int idLote, long tamanio, TipoSuelo tiposuelo, EstadoProyecto estado, Long fk_Campo) {
        this.idLote = idLote;
        this.tamanio = tamanio;
        this.tiposuelo = tiposuelo;
        this.estado = estado;
        this.fk_Campo = fk_Campo;
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

    @Override
    public String toString() {
        return "Lotes{" + "idLote=" + idLote + ", tamanio=" + tamanio + ", tiposuelo=" + tiposuelo + ", estado=" + estado + ", fk_Campo=" + fk_Campo + '}';
    }
  

    
   
    
    
   
    
}
