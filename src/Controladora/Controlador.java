
package Controladora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

import Clases.*;
import ClasesDao.*;
import interDao.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;


public class Controlador {
    
 private final campoImpl campodao = new campoImpl();
 private final EstadoCampoimpl estadocampodao = new EstadoCampoimpl();
 private final TipoSueloimpl tiposuelodao = new TipoSueloimpl();
 private final Lotesimpl lotesdao= new Lotesimpl();
 private final Laboreoimpl laboreodao = new Laboreoimpl();
 private final EstadoProyectoimpl estadopdao = new EstadoProyectoimpl();
 private final Proyectoimpl proyectodao = new Proyectoimpl();
 private final Historialimpl historialdao = new Historialimpl();
 
 
 public void agregarCampo(Campo g){
    campodao.insertar(g);
}
 public void agregarHistorial(Historial g){
    historialdao.insertar(g);
}
 
public List <Campo> obtenerCampos(){
   List <Campo> mostrar=null;
   mostrar=campodao.obtenerTodos();
return mostrar;
}

public List <EstadoCampo> obtenerEstados(){
List <EstadoCampo> estados = null;
estados=estadocampodao.obtenerTodos();


return  estados;
}

    public Campo buscarCampo(long ide) {
       Campo busco = null; 
        busco=campodao.obtener(ide);
       return busco;
        
    }

    public void eliminarCampo(long ide,List<Campo> campos){
        System.out.println(campos);
        for(Campo c : campos){
            if(c.getIdCampo()==ide){
                campodao.eliminar(c);
            }
        }
    }
    public void modificarCampo(Campo g){
        
        campodao.modificar(g);

    }
    
    public void agregarEstadoC(EstadoCampo g){
        estadocampodao.insertar(g);
    }
    public List <TipoSuelo> obtenerSuelos() {
     List <TipoSuelo> tipos = null;
        tipos=tiposuelodao.obtenerTodos();
        
        return tipos;
        
    }
    public void agregarLotes(Lotes l){
       lotesdao.insertar(l);
        
    
    }
    public void agregarTipoSuelo(TipoSuelo tipo) {
        tiposuelodao.insertar(tipo);
    }
    
    public void agregarLaboreo(Laboreo labor) {
        laboreodao.insertar(labor);
    }
    
     public List <Laboreo> obtenerLaboreos() {
         List <Laboreo> labores = null;
        labores=laboreodao.obtenerTodos();
        
        return labores;
    
    }
    public void agregarEstadoP(EstadoProyecto estadop) {
        estadopdao.insertar(estadop);
    }
    
    public List <EstadoProyecto> obtenerEstadosP() {
         List <EstadoProyecto> estadosP= null;
        estadosP=estadopdao.obtenerTodos();
        
        return estadosP;
    
    }
    
    public void agregarP(Proyecto proy) {
        proyectodao.insertar(proy);
   
    }
     
     public List <Proyecto> obtenerProyectos() {
         List <Proyecto> proy= null;
        proy=proyectodao.obtenerTodos();
        
        return proy;
    
    }
     public EstadoProyecto obtenerEstado(Long id) {
       EstadoProyecto estado = new EstadoProyecto();
       estado=estadopdao.obtener(id);
        return estado;
    }
     public void modificarProyecto(Proyecto g){
        
        proyectodao.modificar(g);

}
     
     
    public List <Lotes> obtenerTodosLotes() {
         List <Lotes> lot= null;
        lot=lotesdao.obtenerTodos();
        
        return lot;
     

}
    
     public void modificarLote(Lotes g){
        
        lotesdao.modificar(g);

    }
    
    public EstadoCampo obtenerEstadoC(Long id) {
       EstadoCampo estado = new EstadoCampo();
       estado=estadocampodao.obtener(id);
        return estado;
    }
    
    
     public void ModificarEstadoCampo(){
        
       List <Lotes> TodoLotes = new ArrayList();
       List <Campo> TodoCampo = new ArrayList();
        TodoCampo=obtenerCampos();
        TodoLotes=obtenerTodosLotes();
        for(Campo c : TodoCampo){
            int cont=0;
            for(Lotes l : TodoLotes){
                if(c.getIdCampo()==l.getFk_Campo()){
                    if(l.getEstado()!=null){
                        cont++;
                    }
                }
            }
            if(cont!=c.getLotes().size()){
                c.setEstado(obtenerEstadoC((long) 2));
                
            
            }
            else if(cont==c.getLotes().size()){
                c.setEstado(obtenerEstadoC((long) 3));
                
            }
            if(cont==0){
                c.setEstado(obtenerEstadoC((long) 1));
                
            }
            
            modificarCampo(c);
            
        }     
                    
            
        }
    
    
     public void modificarProyectoV(Historial g){
        
        historialdao.modificar(g);

    }
     
     
      public List <Historial> obtenerTodosProyectov() {
         List <Historial> prov= null;
        prov=historialdao.obtenerTodos();
        return prov;
      
      }
      
       public Historial obtenerProyectoV(Long id) {
       Historial prov = new Historial();
       prov=historialdao.obtener(id);
        return prov;
    }
    
        public void eliminarProyectoV(Historial g){
        
                historialdao.eliminarPV(g);
            
        }
        
      public Historial BuscarIdPV(Long id,Long idLote) {
            Historial prov = new Historial();
            prov=historialdao.BuscarIdPV(id,idLote);
            return prov;
        }
      
      public boolean verificarLotes(long id){
          boolean f=false;
            Campo campo = new Campo();
            campo=campodao.obtener(id);
          if (campo.getEstado().getIdEstado()!=1){
                JOptionPane.showMessageDialog(null, "Debe Finalizar/Cancelar todos los proyectso vigentes");
          }else{
              f=true;
          
          }
          
          return f;
      
      }
      public boolean verificarTam(long id, List <Lotes> lotes ){
       boolean f=false;
            long tamanio=0;
            Campo campo = new Campo();
            campo=campodao.obtener(id);
            for(Lotes l: lotes){
                tamanio=tamanio+l.getTamanio();
                    
            }
             if(campo.getTamanio()>=tamanio){
                f=true;
            
            }
            
            
       return f;
       
      }
      
      
}

