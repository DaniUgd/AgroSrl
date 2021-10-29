/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;


/**
 *
 * @author Daniel
 */
public class Campo {
private long tamanio;
private int idCampo;
ArrayList <Lotes> lotes;
private EstadoCampo estado;

    @Override
    public String toString() {
        return "Campo{" + "tamanio=" + tamanio + ", idCampo=" + idCampo + ", lotes=" + lotes + ", estado=" + estado + '}';
    }
 
    public Campo(long tamanio, int idCampo, ArrayList<Lotes> lotes, EstadoCampo estado) {
        this.tamanio = tamanio;
        this.idCampo = idCampo;
        this.lotes = lotes;
        this.estado = estado;
        
        
}
    public Campo(long tamanio, int idCampo, ArrayList<Lotes> lotes) {
        this.tamanio = tamanio;
        this.idCampo = idCampo;
        this.lotes = lotes;
    }

    public Campo(long tamanio, int idCampo, EstadoCampo estado) {
        this.tamanio = tamanio;
        this.idCampo = idCampo;
        this.estado = estado;
    }

    public Campo() {
    }

    public long getTamanio() {
        return tamanio;
    }

    public void setTamanio(long tamanio) {
        this.tamanio = tamanio;
    }

    public int getIdCampo() {
        return idCampo;
    }

    public void setIdCampo(int idCampo) {
        this.idCampo = idCampo;
    }

    public ArrayList<Lotes> getLotes() {
        return lotes;
    }

    public void setLotes(ArrayList<Lotes> lotes) {
        this.lotes = lotes;
    }

    public EstadoCampo getEstado() {
        return estado;
    }

    public void setEstado(EstadoCampo estado) {
        this.estado = estado;
    }

 
    
    
}
 

