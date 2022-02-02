
package Clases;

import java.util.ArrayList;
import java.util.List;


public class Campo {
private long tamanio;
private Long idCampo;
private String nombre;
List <Lotes> lotes;
private EstadoCampo estado;


    public Campo(long tamanio, Long idCampo, String nombre, List<Lotes> lotes, EstadoCampo estado) {
        this.tamanio = tamanio;
        this.idCampo = idCampo;
        this.nombre = nombre;
        this.lotes = lotes;
        this.estado = estado;
    }

    public Campo() {
    }

    public long getTamanio() {
        return tamanio;
    }

    public void setTamanio(long tamanio) {
        this.tamanio = tamanio;
    }

    public Long getIdCampo() {
        return idCampo;
    }

    public void setIdCampo(Long idCampo) {
        this.idCampo = idCampo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Lotes> getLotes() {
        return lotes;
    }

    public void setLotes(List<Lotes> lotes) {
        this.lotes = lotes;
    }

    public EstadoCampo getEstado() {
        return estado;
    }

    public void setEstado(EstadoCampo estado) {
        this.estado = estado;
    }

   
 

 
     public void agregarL(Lotes e){
       lotes= new ArrayList<Lotes>();
        this.lotes.add(e);
 }

    @Override
    public String toString() {
        return "Campo{" + "tamanio=" + tamanio + ", idCampo=" + idCampo + ", nombre=" + nombre + ", lotes=" + lotes + ", estado=" + estado + '}';
    }

    
    
}
 

