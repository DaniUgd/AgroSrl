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
    private Long idSuelo;
    private String descripcion;

    public TipoSuelo(Long idSuelo, String descripcion) {
        this.idSuelo = idSuelo;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return  descripcion;
    }

    public TipoSuelo() {
    }

    public Long getIdSuelo() {
        return idSuelo;
    }

    public void setIdSuelo(Long idSuelo) {
        this.idSuelo = idSuelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

   
  
    
   

   
}
