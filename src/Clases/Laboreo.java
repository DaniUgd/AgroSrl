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
public class Laboreo {
    private Long idLaboreo;
    private String descripcion;

    public Laboreo() {
    }

    public Laboreo(Long idLaboreo, String descripcion) {
        this.idLaboreo = idLaboreo;
        this.descripcion = descripcion;
    }

    public Long getIdLaboreo() {
        return idLaboreo;
    }

    public void setIdLaboreo(Long idLaboreo) {
        this.idLaboreo = idLaboreo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return  descripcion;
    }

    
  
    
    
}
