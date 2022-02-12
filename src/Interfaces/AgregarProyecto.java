/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import Clases.Campo;
import Clases.EstadoCampo;
import Clases.EstadoProyecto;
import Clases.Laboreo;
import Clases.Lotes;
import Clases.Proyecto;
import Clases.TipoSuelo;
import Controladora.Controlador;
import Interfaces.Excepciones.Exito;
import Interfaces.Excepciones.Warning;
import Interfaces.Excepciones.Warning2;
import Interfaces.Excepciones.Warning3;
import Interfaces.Inicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.ProcessBuilder.Redirect.to;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import static javafx.scene.input.KeyCode.T;
import javax.swing.table.DefaultTableModel;
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
 */
public class AgregarProyecto extends javax.swing.JFrame {
    DefaultTableModel dtm = new  DefaultTableModel();
    DefaultTableModel dtm2 = new  DefaultTableModel();
    DefaultTableModel dtmmostrar = new  DefaultTableModel();
    DefaultTableModel dtmPro = new  DefaultTableModel();
    Warning2 er = new Warning2();
    Warning3 er1 = new Warning3();
    Exito ex = new Exito();
    Controlador control;
    Campo campo = null;
    List <Campo> listaCmod= new ArrayList();
    List <EstadoCampo> listaestadosC= new ArrayList();
    List <Campo> listaCompararC= new ArrayList();
    List <Campo> listaC= null;
    List <Lotes> listaL=new ArrayList();
    List <Proyecto> listaP=null;
    List <TipoSuelo> listaTpS=new ArrayList();
    List <Lotes> listaLSelect=new ArrayList();
    Campo ultimoC = new Campo();

    
    /**
     * Creates new form AgregarProyecto
     * @param control2
     */
   
    public AgregarProyecto(Controlador control2) {
        control = control2;
        initComponents();
        String [] titulo = new String []  {"Nro del Campo","Hectareas","Nombre del Campo","Estado del Campo"};
        dtm.setColumnIdentifiers(titulo);
        tablaCampos.setModel(dtm);
        listaestadosC=control.obtenerEstados();
        listaC=control.obtenerCampos();
        listaC.stream().map((obj) -> new String []{Long.toString(obj.getIdCampo()),Long.toString(obj.getTamanio()),obj.getNombre(),obj.getEstado().getDescripcion()}).forEachOrdered((campos) -> {
        dtm.addRow(campos);
        });
        
        String [] titulo1 = new String []  {"ID Lote","Hectareas","Tipo Suelo"};
        dtm2.setColumnIdentifiers(titulo1);
        tablaLotes.setModel(dtm2);
        
       
        dtmmostrar.setColumnIdentifiers(titulo1);
        tablaLotesAgr.setModel(dtmmostrar);
        
        
        String [] tituloP = new String []  {"Id Proyecto","Cultivo","Tipo de suelo necesario","Laboreos"};
        dtmPro.setColumnIdentifiers(tituloP);
        tablaProyecto.setModel(dtmPro);
        listaP=control.obtenerProyectos();
        listaP.stream().map((obj) -> new String []{Long.toString(obj.getIdProyecto()),obj.getDescripcion(), obj.getTpsuelo().toString(),obj.getLaboreosPre().toString() }).forEachOrdered((proyecto) -> {
        dtmPro.addRow(proyecto);
        });
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCampos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaLotes = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        BotonAgregarP = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaProyecto = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JToggleButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaLotesAgr = new javax.swing.JTable();
        quitarL = new javax.swing.JButton();
        agregarL = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaCampos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Campo", "Nombre Campo", "Tamaño (Hec)", "Estado del Campo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCampos.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                tablaCamposAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tablaCampos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCamposMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaCampos);
        if (tablaCampos.getColumnModel().getColumnCount() > 0) {
            tablaCampos.getColumnModel().getColumn(0).setResizable(false);
            tablaCampos.getColumnModel().getColumn(1).setResizable(false);
            tablaCampos.getColumnModel().getColumn(2).setResizable(false);
            tablaCampos.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 380, 90));

        tablaLotes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Tamaño", "Tipo del Suelo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaLotes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaLotesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaLotes);
        if (tablaLotes.getColumnModel().getColumnCount() > 0) {
            tablaLotes.getColumnModel().getColumn(0).setResizable(false);
            tablaLotes.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 380, 90));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        BotonAgregarP.setText("Iniciar Proyecto");
        BotonAgregarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarPActionPerformed(evt);
            }
        });
        jPanel1.add(BotonAgregarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 470, 170, 40));

        tablaProyecto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tablaProyecto);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 870, 120));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cultivos disponibles");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 320, -1));

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 100, 40));

        tablaLotesAgr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Tamaño", "Tipo del Suelo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaLotesAgr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaLotesAgrMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablaLotesAgr);
        if (tablaLotesAgr.getColumnModel().getColumnCount() > 0) {
            tablaLotesAgr.getColumnModel().getColumn(0).setResizable(false);
            tablaLotesAgr.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 380, 90));

        quitarL.setText("Quitar");
        quitarL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitarLActionPerformed(evt);
            }
        });
        jPanel1.add(quitarL, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 70, -1));

        agregarL.setText("Agregar");
        agregarL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarLActionPerformed(evt);
            }
        });
        jPanel1.add(agregarL, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAgregarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarPActionPerformed
                    Proyecto p =new Proyecto();
                    List <TipoSuelo> tipoS = new ArrayList();
                    int cont=0;
                     List <Lotes> lot = new ArrayList();

                    int indice;
                    indice=tablaProyecto.getSelectedRow();
                    p=listaP.get(indice);
                   
                    tipoS=p.getTpsuelo();
                    System.out.println(tipoS.toString());
                    for(Lotes l :listaLSelect){
                        
                       
                        if(tipoS.toString().contains(l.getTiposuelo().getDescripcion().toString())){
                            
                            
                            lot.add(l); 
                            
                        }else{
                            cont++;
                            System.out.println("noentra");
                          
                            break;
                            
                        }
                    
                    
                    }
                    
                    
                    
                  if(cont>0){
                      er.setVisible(true);
                      er.setLocationRelativeTo(null);
                     
                  } else{
                      for(Lotes l : lot){
                          l.setEstado(control.obtenerEstado((long)1));
                          control.modificarLote(l);
                      }
                      
                      
                      for(Lotes l: listaLSelect){
                        p.getLotes().add(l);
                      }
                        control.modificarProyecto(p);
                        ex.setVisible(true);
                        ex.setLocationRelativeTo(null);
                        control.ModificarEstadoCampo();
                    }
                  System.out.println(p.toString());
            cont=0;
           
            System.out.println(listaCompararC);
            
            
            
            dtm2.setRowCount(0);
            dtmmostrar.setRowCount(0);
            listaLSelect.clear();
            
                    
        
    }//GEN-LAST:event_BotonAgregarPActionPerformed

    
    





    
    
    
    
    private void tablaCamposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCamposMouseClicked
        
        
        
        dtm2.setRowCount(0);
        int indice;
        indice=tablaCampos.getSelectedRow();
        int aux= Integer.parseInt ((String) dtm.getValueAt(indice,0));
        
        
        
        for(Campo c : listaC){
            if(c.getIdCampo()== aux ){
                if(!listaCmod.contains(c)){
                listaCmod.add(c);
              }
                
                for(Lotes l : c.getLotes()){
                    if(l.getEstado()==null){
                    
                        listaL.add(l);
                    
                    }
                
                
                }
                
                campo=c;
            }
        
        }
        
        
        
        System.out.println("esta es la lista" + listaCmod.toString());
        if(listaL!=null){
            listaL.stream().map((obj) -> new String []{Long.toString(obj.getIdLote()),Long.toString(obj.getTamanio()),obj.getTiposuelo().getDescripcion()}).forEachOrdered((Lotes) -> {
            dtm2.addRow(Lotes);
        
        
        });
        
        }else{
            er1.setVisible(true);
            er1.setLocationRelativeTo(null);
        }
        listaL.clear();
    }//GEN-LAST:event_tablaCamposMouseClicked

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
       Inicio ini = new Inicio(control);
       this.setVisible(false);
       ini.setVisible(true);
       ini.setLocationRelativeTo(null);
        
        
    }//GEN-LAST:event_btnVolverActionPerformed

    private void tablaLotesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaLotesMouseClicked

       
        
        
        
        
        
    }//GEN-LAST:event_tablaLotesMouseClicked

    private void tablaCamposAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tablaCamposAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaCamposAncestorMoved

    private void tablaLotesAgrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaLotesAgrMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaLotesAgrMouseClicked

    private void agregarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarLActionPerformed
        int indLotes;
        long id;
        indLotes=tablaLotes.getSelectedRow();
        String [] lote = new String [] {(String)tablaLotes.getValueAt(indLotes, 0),(String)tablaLotes.getValueAt(indLotes, 1),(String)tablaLotes.getValueAt(indLotes, 2)};
        
        
        id= Long.parseLong((String) tablaLotes.getValueAt(indLotes,0));
        
        for (Lotes l : campo.getLotes()){
             
            if((l.getIdLote()==id && !listaLSelect.contains(l)) ||  listaLSelect == null ) {  
                 
                 dtmmostrar.addRow(lote);
                 listaLSelect.add(l);
                 
             
             }
            
         
        }
        System.out.println(listaLSelect);
        tablaLotes.getValueAt(indLotes, 0);
    }//GEN-LAST:event_agregarLActionPerformed

    private void quitarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitarLActionPerformed
               int indice;
               indice=tablaLotesAgr.getSelectedRow();
               listaLSelect.remove(indice);
               dtmmostrar.removeRow(indice);
    }//GEN-LAST:event_quitarLActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AgregarProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregarP;
    private javax.swing.JButton agregarL;
    private javax.swing.JToggleButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton quitarL;
    private javax.swing.JTable tablaCampos;
    private javax.swing.JTable tablaLotes;
    private javax.swing.JTable tablaLotesAgr;
    private javax.swing.JTable tablaProyecto;
    // End of variables declaration//GEN-END:variables
}
