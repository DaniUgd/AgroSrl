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
public class TipoProyecto {
    private int idTipoProyecto;
    private String descripcion;

    public TipoProyecto() {
    }

    public TipoProyecto(int idTipoProyecto, String descripcion) {
        this.idTipoProyecto = idTipoProyecto;
        this.descripcion = descripcion;
    }

    public int getIdTipoProyecto() {
        return idTipoProyecto;
    }

    public void setIdTipoProyecto(int idTipoProyecto) {
        this.idTipoProyecto = idTipoProyecto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    
}
