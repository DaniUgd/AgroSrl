/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agro.srl;
import Clases.Campo;

/**
 *
 * @author Daniel
 */
public class AgroSRL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int idCampo=1;
        int b=2;
        
        long tamanio=300;
        long t2=500;
        
       Campo campo = new Campo(tamanio,idCampo);
       
        campo.mostrar();
    }
    
}
