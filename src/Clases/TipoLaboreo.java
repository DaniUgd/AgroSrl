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
public class TipoLaboreo {
    int idTipoLaboreo;
    String descripcion;

    public TipoLaboreo(int idTipoLaboreo, String descripcion) {
        this.idTipoLaboreo = idTipoLaboreo;
        this.descripcion = descripcion;
    }

    public int getIdTipoLaboreo() {
        return idTipoLaboreo;
    }

    public void setIdTipoLaboreo(int idTipoLaboreo) {
        this.idTipoLaboreo = idTipoLaboreo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
