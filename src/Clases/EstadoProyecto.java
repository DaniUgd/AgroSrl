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
public class EstadoProyecto {
   private Long idEstado;
   private String descripcion;

    public EstadoProyecto() {
    }

    @Override
    public String toString() {
        return "EstadoProyecto{" + "idEstado=" + idEstado + ", descripcion=" + descripcion + '}';
    }

    public EstadoProyecto(Long idEstado, String descripcion) {
        this.idEstado = idEstado;
        this.descripcion = descripcion;
    }

    public Long getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Long idEstado) {
        this.idEstado = idEstado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

  
   
   
   

    
}
