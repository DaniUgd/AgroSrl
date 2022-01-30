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
    public Lotes() {
    }

    @Override
    public String toString() {
        return "Lotes{" + "idLote=" + idLote + ", tamanio=" + tamanio + ", tiposuelo=" + tiposuelo + ", estado=" + estado + '}';
    }

    public Lotes(int idLote, long tamanio, TipoSuelo tiposuelo, EstadoProyecto estado) {
        this.idLote = idLote;
        this.tamanio = tamanio;
        this.tiposuelo = tiposuelo;
        this.estado = estado;
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

    
   
    
}
