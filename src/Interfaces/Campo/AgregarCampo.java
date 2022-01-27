/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.Campo;


import Clases.Campo;
import Clases.EstadoCampo;
import Clases.Lotes;
import Clases.TipoSuelo;
import Controladora.Controlador;
import Interfaces.Excepciones.Warning;
import Interfaces.Inicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.ProcessBuilder.Redirect.to;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import static javassist.CtMethod.ConstParameter.integer;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import static jdk.nashorn.internal.objects.NativeJava.to;
/**
 *
 * @author Daniel
 * 
 *
 */

public class AgregarCampo extends javax.swing.JFrame {
    DefaultTableModel dtm = new  DefaultTableModel(); 
    Controlador control;
    Campo campo = null;
    List <Campo> lista = null;
    JFrame pregunta = new JFrame();
    JPanel panel = new  JPanel();
    JLabel label = new JLabel("¿Desea agregar lotes a este campo?");
    JButton botsi = new JButton();
    JButton botno = new JButton();
    ActionListener actionsi;    
    ActionListener actionno = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        try {
            Campo g =new Campo();
        
        EstadoCampo est = new EstadoCampo();
        List <Lotes> listalo = new ArrayList(); 
        g.setLotes(listalo);
        g.setNombre(NomCampo.getText());
        long tam=parseLong(cantHec.getText());
        g.setTamanio(tam);
        int estado=1;
        est.setIdEstado(estado);
        g.setEstado(est);
        
        TipoSuelo tipos = new TipoSuelo();
        tipos.setIdSuelo(1);
        
        Lotes lot=new Lotes();
        control.agregarCampo(g);
        pregunta.setVisible(false);
        }catch (NumberFormatException z){
        Warning er = new Warning();
         er.setVisible(true);
           er.setLocationRelativeTo(null);
           pregunta.setVisible(false);
        
        
        
        }}
    };
   
    

    
    public AgregarCampo(Controlador control2) {
        this.actionsi = new ActionListener() {
        AgregarLote agregarL;
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Campo g =new Campo();
                    
                    EstadoCampo est = new EstadoCampo();
                    List <Lotes> listalo = new ArrayList();
                    g.setLotes(listalo);
                    g.setNombre(NomCampo.getText());
                    long tam=parseLong(cantHec.getText());
                    g.setTamanio(tam);
                    int estado=1;
                    est.setIdEstado(estado);
                    g.setEstado(est);
                    
                    TipoSuelo tipos = new TipoSuelo();
                    tipos.setIdSuelo(1);
                    
                    control.agregarCampo(g);
                    agregarL = new AgregarLote(control,g);
                    
                }catch(NumberFormatException z){
                    Warning er = new Warning();
                    er.setVisible(true);
                    er.setLocationRelativeTo(null);
                    pregunta.setVisible(false);
                }}
        };
        control=control2;
        botsi.setText("Si");
        botno.setText("No");
        botsi.setBounds(100, 200, 75, 40);
        botno.setBounds(300, 200, 75, 40);
        label.setBounds(145, 50, 500, 75);
        panel.setSize(500, 300); 
        panel.setLayout(null);
        panel.add(label);
        panel.add(botsi);
        panel.add(botno); 
        pregunta.add(panel);
        pregunta.setSize(500, 300);
        botsi.addActionListener(actionsi);
        botno.addActionListener(actionno);
        initComponents();
        String [] titulo = new String []  {"Nro del Campo","Hectareas","Nombre del Campo","Estado del Campo"};
        dtm.setColumnIdentifiers(titulo);
        jTable1.setModel(dtm);
        lista=control.obtenerCampos();
        lista.stream().map((obj) -> new String []{Long.toString(obj.getIdCampo()),Long.toString(obj.getTamanio()),obj.getNombre(),obj.getEstado().getDescripcion()}).forEachOrdered((campos) -> {
        dtm.addRow(campos);
        
        });
      }

    public AgregarCampo() {
        this.actionsi = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Campo g =new Campo();
                    
                    EstadoCampo est = new EstadoCampo();
                    List <Lotes> listalo = new ArrayList();
                    g.setLotes(listalo);
                    g.setNombre(NomCampo.getText());
                    long tam=parseLong(cantHec.getText());
                    g.setTamanio(tam);
                    int estado=1;
                    est.setIdEstado(estado);
                    g.setEstado(est);
                    
                    TipoSuelo tipos = new TipoSuelo();
                    tipos.setIdSuelo(1);
                    
                    control.agregarCampo(g);
                    AgregarLote agregarL = new AgregarLote(control,g);
                    
                }catch(NumberFormatException z){
                    Error er = new Error();
                    
                }}
        };
       
       initComponents();
       this.setLocationRelativeTo(null);
       this.setVisible(true);
       
       
    }
   
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jSeparator1 = new javax.swing.JSeparator();
        label2 = new java.awt.Label();
        elim = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        cantHec = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        NomCampo = new javax.swing.JTextPane();
        modificar = new javax.swing.JButton();
        update = new javax.swing.JButton();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        crearcampo = new javax.swing.JButton();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label1.setText("Seleccione algun campo de la tabla para modificarlo.");
        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));
        label1.getAccessibleContext().setAccessibleName("codCampo");

        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 50, 751, 19));

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setBackground(new java.awt.Color(153, 255, 204));
        label2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label2.setPreferredSize(new java.awt.Dimension(300, 20));
        label2.setText("Administrar Campos");
        jPanel1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 50));

        elim.setText("Eliminar");
        elim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                elimMouseClicked(evt);
            }
        });
        elim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elimActionPerformed(evt);
            }
        });
        jPanel1.add(elim, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 114, 36));

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, 114, 36));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDCampo", "Tamaño", "Nombre del Campo", "Estado del Campo"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 206, 550, 149));

        cantHec.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 0), null));
        jScrollPane2.setViewportView(cantHec);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 111, -1));

        NomCampo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 0), null));
        jScrollPane5.setViewportView(NomCampo);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 111, -1));

        modificar.setText("Modificar");
        modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarMouseClicked(evt);
            }
        });
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        jPanel1.add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 114, 36));

        update.setText("Actualizar Tabla");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 180, 36));

        label5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label5.setText("Ingrese la cantidad de Hectareas");
        jPanel1.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        label6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label6.setText("Ingrese Nombre del campo");
        jPanel1.add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        crearcampo.setText("Crear");
        crearcampo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearcampoMouseClicked(evt);
            }
        });
        crearcampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearcampoActionPerformed(evt);
            }
        });
        jPanel1.add(crearcampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 114, 36));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void elimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elimMouseClicked

    }//GEN-LAST:event_elimMouseClicked

    private void elimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elimActionPerformed
        String id;
        long ide;
        
        
        id=(String)dtm.getValueAt(jTable1.getSelectedRow(),0);
        ide=Long.parseLong(id);
        control.eliminarCampo(ide, lista);
        
        
        
        
        
        
        

        
    }//GEN-LAST:event_elimActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Inicio inicio = new Inicio(control);
        inicio.show(true);
        this.show(false);
        inicio.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarMouseClicked
   
    }//GEN-LAST:event_modificarMouseClicked

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        long ide;
        String id;
        
        List <Lotes> lotes = new ArrayList <>();
        id=String.valueOf(dtm.getValueAt(jTable1.getSelectedRow(),0));
        ide=Long.parseLong(id);
        for(Campo c : lista){
            if(c.getIdCampo().equals(ide)){
            
                lotes=c.getLotes();
                campo=c;
            
            }
        }
        this.setVisible(false);
        ModificarCampo modiC = new ModificarCampo(control,campo);
        modiC.setVisible(true);
        modiC.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_modificarActionPerformed

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked

    }//GEN-LAST:event_updateMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        
        dtm.setRowCount(0);
        
        lista=control.obtenerCampos();
        lista.stream().map((obj) -> new String []{Long.toString(obj.getIdCampo()),Long.toString(obj.getTamanio()),obj.getNombre(),obj.getEstado().getDescripcion()}).forEachOrdered((campos) -> {
        dtm.addRow(campos);
        
        });
        
         
    }//GEN-LAST:event_updateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
      
     
      
        
        

     
      
            
       
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void crearcampoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearcampoMouseClicked
        
    }//GEN-LAST:event_crearcampoMouseClicked

 


    
    private void crearcampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearcampoActionPerformed
    try{
       pregunta.setLocationRelativeTo(null);
       pregunta.setVisible(true);
       }catch(Exception e){
           System.out.println(e.getMessage());
 }
    }//GEN-LAST:event_crearcampoActionPerformed

   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane NomCampo;
    private javax.swing.JTextPane cantHec;
    private javax.swing.JButton crearcampo;
    private javax.swing.JButton elim;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    private javax.swing.JButton modificar;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
