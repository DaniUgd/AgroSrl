/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.List;

/**
 *
 * @author Daniel
 */
public class TipoProyecto {
    private int idTipoProyecto;
    private String descripcion;
    private List <Laboreo> laboreos;

    public TipoProyecto(int idTipoProyecto, String descripcion, List<Laboreo> laboreos) {
        this.idTipoProyecto = idTipoProyecto;
        this.descripcion = descripcion;
        this.laboreos = laboreos;
    }

    @Override
    public String toString() {
        return "TipoProyecto{" + "idTipoProyecto=" + idTipoProyecto + ", descripcion=" + descripcion + ", laboreos=" + laboreos + '}';
    }

    public TipoProyecto() {
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

    public List<Laboreo> getLaboreos() {
        return laboreos;
    }

    public void setLaboreos(List<Laboreo> laboreos) {
        this.laboreos = laboreos;
    }
    
    
}
