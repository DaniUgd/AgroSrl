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
public class EstadoCampo {
    private int idEstado;
    private String descripcion;
    
    public EstadoCampo() {
       

}

    public EstadoCampo(int idEstado, String descripcion, ArrayList<Campo> campo) {
        this.idEstado = idEstado;
        this.descripcion = descripcion;
    }

    public EstadoCampo(int idEstado, String descripcion) {
        this.idEstado = idEstado;
        this.descripcion = descripcion;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }



}