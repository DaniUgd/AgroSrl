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
public class TipoSuelo {
    private int idSuelo;
    private String descripcion;

    public TipoSuelo() {
    }

    public TipoSuelo(int idSuelo, String descripcion) {
        this.idSuelo = idSuelo;
        this.descripcion = descripcion;
    }

    public int getIdSuelo() {
        return idSuelo;
    }

    public void setIdSuelo(int idSuelo) {
        this.idSuelo = idSuelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "TipoSuelo{" + "idSuelo=" + idSuelo + ", descripcion=" + descripcion + '}';
    }
    

  
   
    
   

   
}
