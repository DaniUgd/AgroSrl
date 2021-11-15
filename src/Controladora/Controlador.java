
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


public class Controlador {
    
 private final campoImpl campodao = new campoImpl();
 private final EstadoCampoimpl estadocampodao = new EstadoCampoimpl();
 private final TipoSueloimpl tiposuelodao = new TipoSueloimpl();
 private final Lotesimpl lotesdao= new Lotesimpl();
public void agregarCampo(Campo g){
    campodao.insertar(g);
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
    
    
    
    
}