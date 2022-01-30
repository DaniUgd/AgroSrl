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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel
 */
public class Cultivos extends javax.swing.JFrame {
Controlador control;
DefaultTableModel dtmLD = new DefaultTableModel();
DefaultTableModel dtmLA = new DefaultTableModel();
DefaultTableModel dtmSD = new DefaultTableModel();
DefaultTableModel dtmSA = new DefaultTableModel();
List <TipoSuelo> tiposuelos = null;
List <Laboreo> laboreos = null;
List <Laboreo> lselect = new ArrayList() ;
List <TipoSuelo> tsselect = new ArrayList() ;

Proyecto proyecto = new Proyecto();

    public Cultivos(Controlador control2) {
        initComponents();
        control=control2;
        String [] tituloL = new String []  {"ID Laboreo" , "Descripcion"};
        String [] tituloS = new String []  {"ID Tipo Suelo" , "Descripcion"};

        dtmLD.setColumnIdentifiers(tituloL);
        dtmLA.setColumnIdentifiers(tituloL);
        dtmSD.setColumnIdentifiers(tituloS);
        dtmSA.setColumnIdentifiers(tituloS);
        ListaLaboreos.setModel(dtmLD);
        ListaLaAgr.setModel(dtmLA);
        ListaSuelos.setModel(dtmSD);
        ListaSAgr.setModel(dtmSA);
        laboreos=control.obtenerLaboreos();
        tiposuelos=control.obtenerSuelos();
                tiposuelos.stream().map((obj) -> new String []{Long.toString(obj.getIdSuelo()),obj.getDescripcion()}).forEachOrdered((tipoS) -> {
        dtmSD.addRow(tipoS);
        });   
                laboreos.stream().map((obj) -> new String []{Long.toString(obj.getIdLaboreo()),obj.getDescripcion()}).forEachOrdered((tipoL) -> {
        dtmLD.addRow(tipoL);
        });
                
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nomCultivo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaLaAgr = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaLaboreos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botQuitarS = new javax.swing.JToggleButton();
        botAgregarL = new javax.swing.JToggleButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIPOS DE SUELOS AGREGADOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 230, 20));

        nomCultivo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nomCultivo.setText("Ejemplo: Soja");
        nomCultivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomCultivoActionPerformed(evt);
            }
        });
        jPanel1.add(nomCultivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 210, -1));

        ListaLaAgr.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(ListaLaAgr);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 100));

        ListaLaboreos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(ListaLaboreos);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, -1, 100));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Laboreos Disponibles");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 310, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Laboreos Agregados");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 310, -1));

        botQuitarS.setText("Quitar");
        botQuitarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botQuitarSActionPerformed(evt);
            }
        });
        jPanel1.add(botQuitarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 550, 120, 30));

        botAgregarL.setText("Agregar Labores");
        botAgregarL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botAgregarLActionPerformed(evt);
            }
        });
        jPanel1.add(botAgregarL, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 330, 120, 30));

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

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, 100));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("INGRESE EL NOMBRE DEL CULTIVO:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 230, 20));

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

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, -1, 100));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SELECCIONE EL/LOS TIPOS DE SUELO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 410, 250, 20));

        botAgrS.setText("Agregar Tipo de suelo");
        botAgrS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botAgrSActionPerformed(evt);
            }
        });
        jPanel1.add(botAgrS, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 550, 150, 30));

        botQuitarL.setText("Quitar");
        botQuitarL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botQuitarLActionPerformed(evt);
            }
        });
        jPanel1.add(botQuitarL, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 120, 30));

        jToggleButton6.setText("Volver");
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, 100, 30));

        CrearProyecto.setText("Crear Proyecto");
        CrearProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearProyectoActionPerformed(evt);
            }
        });
        jPanel1.add(CrearProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 670, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1039, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomCultivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomCultivoActionPerformed
      
    }//GEN-LAST:event_nomCultivoActionPerformed

    private void botQuitarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botQuitarSActionPerformed
               int indice;
               indice=ListaSAgr.getSelectedRow();
               tsselect.remove(indice);
               dtmSA.removeRow(indice);
    }//GEN-LAST:event_botQuitarSActionPerformed

    private void botAgregarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botAgregarLActionPerformed
        int indice;
        Laboreo lab = new Laboreo();
        indice=ListaLaboreos.getSelectedRow();
        lab.setIdLaboreo(Long.parseLong((String) ListaLaboreos.getValueAt(indice, 0)));
        lab.setDescripcion((String) ListaLaboreos.getValueAt(indice, 1));
        String [] filalabor = new String [] {(String)lab.getIdLaboreo().toString(),lab.getDescripcion()};
        dtmLA.addRow(filalabor);
        lselect.add(lab);
                

        
        
    }//GEN-LAST:event_botAgregarLActionPerformed

    private void botQuitarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botQuitarLActionPerformed
               int indice;
               indice=ListaLaAgr.getSelectedRow();
               lselect.remove(indice);
               dtmLA.removeRow(indice);

    }//GEN-LAST:event_botQuitarLActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        Inicio ini = new Inicio(control);
        this.setVisible(false);
        ini.setVisible(true);
        ini.setLocationRelativeTo(null);


    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void CrearProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearProyectoActionPerformed
            proyecto.setDescripcion(nomCultivo.getText());
            proyecto.setLaboreos(lselect);
            proyecto.setTpsuelo(tsselect);
            
    }//GEN-LAST:event_CrearProyectoActionPerformed

    private void botAgrSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botAgrSActionPerformed
      int indice;
        TipoSuelo suelo = new TipoSuelo();
        indice=ListaSuelos.getSelectedRow();
        suelo.setIdSuelo(Long.parseLong((String) ListaSuelos.getValueAt(indice, 0)));
        suelo.setDescripcion((String) ListaSuelos.getValueAt(indice, 1));
        String [] filasuelo = new String [] {(String)suelo.getIdSuelo().toString(),suelo.getDescripcion()};
        dtmSA.addRow(filasuelo);
        tsselect.add(suelo);

        
        
        
    }//GEN-LAST:event_botAgrSActionPerformed

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
    private javax.swing.JTable ListaLaAgr;
    private javax.swing.JTable ListaLaboreos;
    private javax.swing.JTable ListaSAgr;
    private javax.swing.JTable ListaSuelos;
    private javax.swing.JToggleButton botAgrS;
    private javax.swing.JToggleButton botAgregarL;
    private javax.swing.JToggleButton botQuitarL;
    private javax.swing.JToggleButton botQuitarS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JTextField nomCultivo;
    // End of variables declaration//GEN-END:variables
}
