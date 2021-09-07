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

    public Campo(long tamanio, int idCampo, ArrayList<Lotes> lotes) {
        this.tamanio = tamanio;
        this.idCampo = idCampo;
        this.lotes = lotes;
    }

    public Campo(long tamanio, int idCampo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<Lotes> getLotes() {
        return lotes;
    }

    public void setLotes(ArrayList<Lotes> lotes) {
        this.lotes = lotes;
    }

   
            
    
    public void Campo (long tamanio,int idCampo){
    this.tamanio=tamanio;
    this.idCampo=idCampo;

}

    public long getTamanio() {
        return tamanio;
    }

    public int getIdCampo() {
        return idCampo;
    }

    public void setTamanio(long tamanio) {
        this.tamanio = tamanio;
    }

    public void setIdCampo(int idCampo) {
        this.idCampo = idCampo;
    }
    
    public void mostrar(){
    
        System.out.println(this.idCampo);
    
    }

    @Override
    public String toString() {
        return "Campo{" + "tamanio=" + tamanio + ", idCampo=" + idCampo + ", lotes=" + lotes + '}';
    }
    
    
}
 

