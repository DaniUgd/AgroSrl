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
public class laboreo {
    int idLaboreo;
    String descripcion;

    public laboreo(int idLaboreo, String descripcion) {
        this.idLaboreo = idLaboreo;
        this.descripcion = descripcion;
    }

    public int getIdLaboreo() {
        return idLaboreo;
    }

    public void setIdLaboreo(int idLaboreo) {
        this.idLaboreo = idLaboreo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
