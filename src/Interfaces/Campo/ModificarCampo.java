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
import Interfaces.Inicio;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ModificarCampo extends javax.swing.JFrame {
Controlador control;
Campo campo = new Campo();
List <EstadoCampo> estados= new ArrayList();
List <Lotes> listalotes= new ArrayList();
List <TipoSuelo> suelos=new ArrayList();

DefaultTableModel dtm = new DefaultTableModel();
    public ModificarCampo() {
        initComponents();
    }

    public ModificarCampo(Controlador control2, Campo c) {
        initComponents();
        control=control2;
        campo=c;
        listalotes=c.getLotes();
        suelos=control.obtenerSuelos();
        estados = control.obtenerEstados();
        String [] columnas = new String [] {"Nro Lote","Hectareas","Tipo de Suelo"};
        dtm.setColumnIdentifiers(columnas);
        jTable1.setModel(dtm);
        
        for(Lotes l: listalotes){
            
            if(l.getIdLote()!=0){
                 String [] datos = new String [] {String.valueOf(l.getIdLote()),String.valueOf(l.getTamanio()),l.getTiposuelo().getDescripcion()};
                 dtm.addRow(datos);
            
            }
        
        
        }
        

        
       
        
       
       this.setLocationRelativeTo(null);
       this.setVisible(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        nuevonom = new javax.swing.JTextField();
        volver = new javax.swing.JButton();
        label2 = new java.awt.Label();
        jLabel5 = new javax.swing.JLabel();
        modicampo = new javax.swing.JButton();
        nuevahec = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AgregarL = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 390, 120));

        nuevonom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevonomActionPerformed(evt);
            }
        });
        jPanel1.add(nuevonom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 110, -1));

        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        jPanel1.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 70, 30));

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setBackground(new java.awt.Color(153, 255, 204));
        label2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label2.setPreferredSize(new java.awt.Dimension(300, 20));
        label2.setText("Modificar Campo");
        jPanel1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 40));

        jLabel5.setText("Lotes Existentes");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        modicampo.setText("Modificar");
        modicampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modicampoActionPerformed(evt);
            }
        });
        jPanel1.add(modicampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 30));

        nuevahec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevahecActionPerformed(evt);
            }
        });
        jPanel1.add(nuevahec, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 110, -1));

        jLabel6.setText("Cambiar Tamaño");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 90, -1));

        jLabel3.setText("Cambiar Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        AgregarL.setText("Agregar Lote");
        AgregarL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarLActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevonomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevonomActionPerformed
        
    }//GEN-LAST:event_nuevonomActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        this.setVisible(false);
        AgregarCampo volveratras = new AgregarCampo(control);
        volveratras.setVisible(true);
        volveratras.setLocationRelativeTo(null);
    }//GEN-LAST:event_volverActionPerformed

    private void modicampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modicampoActionPerformed
       String nombreC;
       String hectC;
       long hectarea;
       Lotes lot = new Lotes();
       
      if(!nuevonom.getText().equals("") && !nuevahec.getText().equals("")){
      
          nombreC=nuevonom.getText();
          hectC=nuevahec.getText();
          if(!"".equals(nombreC)){
              campo.setNombre(nombreC);
              hectarea=campo.getTamanio();
              campo.setTamanio(hectarea);
          }else{
              nombreC=campo.getNombre();
              campo.setNombre(nombreC);
          }
          
          if(!"".equals(nuevahec.getText())){
              hectarea=Long.parseLong(hectC);
              campo.setTamanio(hectarea);
              
          }else{
              hectarea=campo.getTamanio();
              campo.setTamanio(hectarea);
              
          }
          
          
          
          
          control.modificarCampo(campo);
          } else {
          JOptionPane.showMessageDialog(null, "No puede dejar los espacios en blanco, y  el tamaño del campo no debe contener letras ");
      }
       
        
    }//GEN-LAST:event_modicampoActionPerformed

    private void nuevahecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevahecActionPerformed
        
    }//GEN-LAST:event_nuevahecActionPerformed

    private void AgregarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarLActionPerformed
      AgregarLote agregarL = new AgregarLote(control,campo);
      this.setVisible(false);
      agregarL.setVisible(true);
      agregarL.setLocationRelativeTo(null);
        
        
        
    }//GEN-LAST:event_AgregarLActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarCampo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarCampo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarCampo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarCampo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarCampo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarL;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Label label2;
    private javax.swing.JButton modicampo;
    private javax.swing.JTextField nuevahec;
    private javax.swing.JTextField nuevonom;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
