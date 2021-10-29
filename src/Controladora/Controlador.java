
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
    
public void agregarCampo(Campo g){
    campodao.insertar(g);
}

public List <Campo> ActualizarCampo(){
   List <Campo> mostrar=null;
   
   mostrar=campodao.obtenerTodos();


return mostrar;
}

public List <EstadoCampo> MostrarEstadoC(){
List <EstadoCampo> estados = null;
estados=estadocampodao.obtenerTodos();


return  estados;
}

}