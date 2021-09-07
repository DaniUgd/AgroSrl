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
public class Campo {
private long tamanio;
private int idCampo;

    public Campo(long tamanio, int idCampo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
}
 

