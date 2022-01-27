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
   private int idProyecto;
   private  String descripcion;
   private List <Lotes> lotes;
   private EstadoProyecto estado;
   private TipoProyecto tproyecto;

    public Proyecto() {
    }

    public Proyecto(int idProyecto, String descripcion, List<Lotes> lotes, EstadoProyecto estado, TipoProyecto tproyecto) {
        this.idProyecto = idProyecto;
        this.descripcion = descripcion;
        this.lotes = lotes;
        this.estado = estado;
        this.tproyecto = tproyecto;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "idProyecto=" + idProyecto + ", descripcion=" + descripcion + ", lotes=" + lotes + ", estado=" + estado + ", tproyecto=" + tproyecto + '}';
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
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

    public EstadoProyecto getEstado() {
        return estado;
    }

    public void setEstado(EstadoProyecto estado) {
        this.estado = estado;
    }

    public TipoProyecto getTproyecto() {
        return tproyecto;
    }

    public void setTproyecto(TipoProyecto tproyecto) {
        this.tproyecto = tproyecto;
    }
 

   
    
}
