/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class Proyecto {
   private Long idProyecto;
   private String descripcion;
   private List <Lotes> lotes;
   private List <TipoSuelo> tpsuelo;
   private List <Laboreo> laboreos;

    public Proyecto() {
    }

    public Proyecto(Long idProyecto, String descripcion, List<Lotes> lotes, List<TipoSuelo> tpsuelo, List<Laboreo> laboreos) {
        this.idProyecto = idProyecto;
        this.descripcion = descripcion;
        this.lotes = lotes;
        this.tpsuelo = tpsuelo;
        this.laboreos = laboreos;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "idProyecto=" + idProyecto + ", descripcion=" + descripcion + ", lotes=" + lotes + ", tpsuelo=" + tpsuelo + ", laboreos=" + laboreos + '}';
    }

    public Long getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Long idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Lotes> getLotes() {
        return lotes;
    }

    public void setLotes(List<Lotes> lotes) {
        this.lotes = lotes;
    }

    public List<TipoSuelo> getTpsuelo() {
        return tpsuelo;
    }

    public void setTpsuelo(List<TipoSuelo> tpsuelo) {
        this.tpsuelo = tpsuelo;
    }

    public List<Laboreo> getLaboreos() {
        return laboreos;
    }

    public void setLaboreos(List<Laboreo> laboreos) {
        this.laboreos = laboreos;
    }

 

   
   
   

   
   

    

    

   
    
}
