/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class Proyecto {
    private int idProyecto;
   private  String descripcion;
   ArrayList <Laboreo> laboreo;

    public Proyecto() {
    }

    public Proyecto(int idProyecto, String descripcion) {
        this.idProyecto = idProyecto;
        this.descripcion = descripcion;
    }

    public Proyecto(int idProyecto, String descripcion, ArrayList<Laboreo> laboreo) {
        this.idProyecto = idProyecto;
        this.descripcion = descripcion;
        this.laboreo = laboreo;
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

    public ArrayList<Laboreo> getLaboreo() {
        return laboreo;
    }

    public void setLaboreo(ArrayList<Laboreo> laboreo) {
        this.laboreo = laboreo;
    }
   
   
   
}
