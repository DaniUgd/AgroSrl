/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.Laboreo;
import Clases.Proyecto;
import Clases.TipoSuelo;
import Controladora.Controlador;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel
 */
public class Cultivos extends javax.swing.JFrame {
Controlador control;

DefaultTableModel dtmSD = new DefaultTableModel();
DefaultTableModel dtmSA = new DefaultTableModel();
DefaultTableModel dtmLaboreo = new DefaultTableModel();
DefaultTableModel dtmPreSiembra = new DefaultTableModel();
DefaultTableModel dtmPostSiembra = new DefaultTableModel();

List <TipoSuelo> tiposuelos = null;
List <TipoSuelo> tsselect = new ArrayList() ;
List <Laboreo> laboreos = null;
List <Laboreo> lselectPre = new ArrayList() ;
List <Laboreo> lselectPost = new ArrayList();


Proyecto proyecto = new Proyecto();

    public Cultivos(Controlador control2) {
        initComponents();
        control=control2;
        String [] tituloL = new String []  {"ID Laboreo" , "Descripcion"};
        String [] tituloS = new String []  {"ID Tipo Suelo" , "Descripcion"};

        dtmLaboreo.setColumnIdentifiers(tituloL);
        dtmPreSiembra.setColumnIdentifiers(tituloL);
        dtmPostSiembra.setColumnIdentifiers(tituloL);
        dtmSD.setColumnIdentifiers(tituloS);
        dtmSA.setColumnIdentifiers(tituloS);
        
        TablaLab.setModel(dtmLaboreo);
        TablaPreSiembra.setModel(dtmPreSiembra);
        TablaPostSiembra.setModel(dtmPostSiembra);
        ListaSuelos.setModel(dtmSD);
        ListaSAgr.setModel(dtmSA);
        
        

        laboreos=control.obtenerLaboreos();
        tiposuelos=control.obtenerSuelos();
                tiposuelos.stream().map((obj) -> new String []{Long.toString(obj.getIdSuelo()),obj.getDescripcion()}).forEachOrdered((tipoS) -> {
        dtmSD.addRow(tipoS);
        });   
                laboreos.stream().map((obj) -> new String []{Long.toString(obj.getIdLaboreo()),obj.getDescripcion()}).forEachOrdered((tipoL) -> {
        dtmLaboreo.addRow(tipoL);
        });
                
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nomCultivo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaLab = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        botQuitarS = new javax.swing.JToggleButton();
        botAgregarLPre = new javax.swing.JToggleButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListaSAgr = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ListaSuelos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        botAgrS = new javax.swing.JToggleButton();
        botQuitarL = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        CrearProyecto = new javax.swing.JToggleButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        TablaPostSiembra = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        TablaPreSiembra = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        botQuitarLPost = new javax.swing.JToggleButton();
        botAgregarLPost = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIPOS DE SUELOS AGREGADOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 230, 20));

        nomCultivo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nomCultivo.setText("Ejemplo: Soja");
        nomCultivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomCultivoActionPerformed(evt);
            }
        });
        jPanel1.add(nomCultivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 210, -1));

        TablaLab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id Laboreo", "Nombre del Laboreo"
            }
        ));
        jScrollPane1.setViewportView(TablaLab);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 450, 100));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Laboreos disponibles");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 310, -1));

        botQuitarS.setText("Quitar");
        botQuitarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botQuitarSActionPerformed(evt);
            }
        });
        jPanel1.add(botQuitarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 630, 120, 30));

        botAgregarLPre.setText("Agregar Labores Pre Siembra");
        botAgregarLPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botAgregarLPreActionPerformed(evt);
            }
        });
        jPanel1.add(botAgregarLPre, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 190, 30));

        ListaSAgr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id Tipo Suelo", "Descripcion"
            }
        ));
        jScrollPane3.setViewportView(ListaSAgr);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, -1, 100));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("INGRESE EL NOMBRE DEL CULTIVO:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 230, 20));

        ListaSuelos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id Tipo Suelo", "Descripcion"
            }
        ));
        jScrollPane4.setViewportView(ListaSuelos);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 520, -1, 100));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SELECCIONE EL/LOS TIPOS DE SUELO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 490, 250, 20));

        botAgrS.setText("Agregar Tipo de suelo");
        botAgrS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botAgrSActionPerformed(evt);
            }
        });
        jPanel1.add(botAgrS, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 630, 150, 30));

        botQuitarL.setText("Quitar");
        botQuitarL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botQuitarLActionPerformed(evt);
            }
        });
        jPanel1.add(botQuitarL, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 120, 30));

        jToggleButton6.setText("Volver");
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, 110, 30));

        CrearProyecto.setText("Crear Proyecto");
        CrearProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearProyectoActionPerformed(evt);
            }
        });
        jPanel1.add(CrearProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, -1, 30));

        TablaPostSiembra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id Laboreo", "Nombre del Laboreo"
            }
        ));
        jScrollPane5.setViewportView(TablaPostSiembra);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, 100));

        TablaPreSiembra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id Laboreo", "Nombre del Laboreo"
            }
        ));
        jScrollPane7.setViewportView(TablaPreSiembra);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 100));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Laboreos Agregados Post Siembra");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 310, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Laboreos Agregados Pre Siembra");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 310, 20));

        botQuitarLPost.setText("Quitar");
        botQuitarLPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botQuitarLPostActionPerformed(evt);
            }
        });
        jPanel1.add(botQuitarLPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 120, 30));

        botAgregarLPost.setText("Agregar Labores Post Siembra");
        botAgregarLPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botAgregarLPostActionPerformed(evt);
            }
        });
        jPanel1.add(botAgregarLPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, 210, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 797, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomCultivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomCultivoActionPerformed
      
    }//GEN-LAST:event_nomCultivoActionPerformed

    private void botQuitarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botQuitarSActionPerformed
               int indice;
               try{
               indice=ListaSAgr.getSelectedRow();
               tsselect.remove(indice);
               dtmSA.removeRow(indice);
               }catch(ArrayIndexOutOfBoundsException e){
        
            JOptionPane.showMessageDialog(null, "Debe seleccionar al menos 1 tipo de suelo");
        }
    }//GEN-LAST:event_botQuitarSActionPerformed

    private void botAgregarLPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botAgregarLPreActionPerformed
        int indice;
        try{
        Laboreo lab = new Laboreo();
        indice=TablaLab.getSelectedRow();
        System.out.println(indice);
        lab.setIdLaboreo(Long.parseLong((String) dtmLaboreo.getValueAt(indice, 0)));
        lab.setDescripcion((String) dtmLaboreo.getValueAt(indice, 1));
        String [] filalabor = new String [] {(String)lab.getIdLaboreo().toString(),lab.getDescripcion()};
        dtmPreSiembra.addRow(filalabor);
        lselectPre.add(lab);
        }catch(ArrayIndexOutOfBoundsException e){
        
            JOptionPane.showMessageDialog(null, "Debe seleccionar al menos 1 laboreo");
        }
                

        
        
    }//GEN-LAST:event_botAgregarLPreActionPerformed

    private void botQuitarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botQuitarLActionPerformed
               int indice;
               try{
               indice=TablaLab.getSelectedRow();
               lselectPre.remove(indice);
               dtmPreSiembra.removeRow(indice);
               }catch(ArrayIndexOutOfBoundsException e){
        
            JOptionPane.showMessageDialog(null, "Debe seleccionar al menos 1 laboreo");
        }
    }//GEN-LAST:event_botQuitarLActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        Inicio ini = new Inicio(control);
        this.setVisible(false);
        ini.setVisible(true);
        ini.setLocationRelativeTo(null);


    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void CrearProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearProyectoActionPerformed
          
        if(!nomCultivo.getText().equals("") && lselectPre.size()!=0 && lselectPost.size()!=0&& tsselect.size()!=0){
        proyecto.setDescripcion(nomCultivo.getText());
            proyecto.setLaboreosPre(lselectPre);
            proyecto.setLaboreosPost(lselectPost);
            proyecto.setTpsuelo(tsselect);
            control.agregarP(proyecto);
        }else{
        JOptionPane.showMessageDialog(null, "Debe seleccionar los datos a agregar a las tablas, y no debe dejar el nombre del cultivo en blanco");
        
        }

            
    }//GEN-LAST:event_CrearProyectoActionPerformed

    private void botAgrSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botAgrSActionPerformed
      int indice;
        
     TipoSuelo suelo = new TipoSuelo();
     try{   
     indice=ListaSuelos.getSelectedRow();
        suelo.setIdSuelo(Long.parseLong((String) ListaSuelos.getValueAt(indice, 0)));
        suelo.setDescripcion((String) ListaSuelos.getValueAt(indice, 1));
        String [] filasuelo = new String [] {(String)suelo.getIdSuelo().toString(),suelo.getDescripcion()};
        dtmSA.addRow(filasuelo);
        tsselect.add(suelo);
     }catch(ArrayIndexOutOfBoundsException e){
        
            JOptionPane.showMessageDialog(null, "Debe seleccionar al menos 1 tipo de suelo");
        }
        
        
        
    }//GEN-LAST:event_botAgrSActionPerformed

    private void botQuitarLPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botQuitarLPostActionPerformed
               int indice;
               try{
               indice=TablaPostSiembra.getSelectedRow();
               lselectPost.remove(indice);
               dtmPostSiembra.removeRow(indice);
               }catch(ArrayIndexOutOfBoundsException e){
        
            JOptionPane.showMessageDialog(null, "Debe seleccionar al menos 1 laboreo");
        }
    }//GEN-LAST:event_botQuitarLPostActionPerformed

    private void botAgregarLPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botAgregarLPostActionPerformed
        int indice;
        try{
        
        Laboreo lab = new Laboreo();
        indice=TablaLab.getSelectedRow();
        System.out.println(indice);
        lab.setIdLaboreo(Long.parseLong((String) dtmLaboreo.getValueAt(indice, 0)));
        lab.setDescripcion((String) dtmLaboreo.getValueAt(indice, 1));
        String [] filalabor = new String [] {(String)lab.getIdLaboreo().toString(),lab.getDescripcion()};
        dtmPostSiembra.addRow(filalabor);
        lselectPost.add(lab);
        }catch(ArrayIndexOutOfBoundsException e){
        
            JOptionPane.showMessageDialog(null, "Debe seleccionar al menos 1 laboreo");
        }
        
        
        
    }//GEN-LAST:event_botAgregarLPostActionPerformed

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
            java.util.logging.Logger.getLogger(Cultivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cultivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cultivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cultivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton CrearProyecto;
    private javax.swing.JTable ListaSAgr;
    private javax.swing.JTable ListaSuelos;
    private javax.swing.JTable TablaLab;
    private javax.swing.JTable TablaPostSiembra;
    private javax.swing.JTable TablaPreSiembra;
    private javax.swing.JToggleButton botAgrS;
    private javax.swing.JToggleButton botAgregarLPost;
    private javax.swing.JToggleButton botAgregarLPre;
    private javax.swing.JToggleButton botQuitarL;
    private javax.swing.JToggleButton botQuitarLPost;
    private javax.swing.JToggleButton botQuitarS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JTextField nomCultivo;
    // End of variables declaration//GEN-END:variables
}
