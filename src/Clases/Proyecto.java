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
   private List <Laboreo> laboreosPre;
   private List <Laboreo> laboreosPost;

    public Proyecto(Long idProyecto, String descripcion, List<Lotes> lotes, List<TipoSuelo> tpsuelo, List<Laboreo> laboreosPre, List<Laboreo> laboreosPost) {
        this.idProyecto = idProyecto;
        this.descripcion = descripcion;
        this.lotes = lotes;
        this.tpsuelo = tpsuelo;
        this.laboreosPre = laboreosPre;
        this.laboreosPost = laboreosPost;
    }

    public Proyecto() {
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

    public List<Laboreo> getLaboreosPre() {
        return laboreosPre;
    }

    public void setLaboreosPre(List<Laboreo> laboreosPre) {
        this.laboreosPre = laboreosPre;
    }

    public List<Laboreo> getLaboreosPost() {
        return laboreosPost;
    }

    public void setLaboreosPost(List<Laboreo> laboreosPost) {
        this.laboreosPost = laboreosPost;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "idProyecto=" + idProyecto + ", descripcion=" + descripcion + ", lotes=" + lotes + ", tpsuelo=" + tpsuelo + ", laboreosPre=" + laboreosPre + ", laboreosPost=" + laboreosPost + '}';
    }

    

 

   
   
   

   
   

    

    

   
    
}
