/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.EstadoCampo;
import Clases.Laboreo;
import Controladora.Controlador;
import Interfaces.Excepciones.Warning;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel
 */
public class Laboreos extends javax.swing.JFrame {
        Controlador control= null;
        DefaultTableModel dtm = new DefaultTableModel();
        List <Laboreo> laboreo = null;
        Warning er = new Warning();
    /**
     * Creates new form Laboreos
     */
    public Laboreos(Controlador control2) {
        initComponents();
        control=control2;
        String [] titulo = new String []  {"ID del Laboreo" , "Descripcion"};
        dtm.setColumnIdentifiers(titulo);
        jTable1.setModel(dtm);
        laboreo=control.obtenerLaboreos();
        laboreo.stream().map((obj) -> new String []{Long.toString(obj.getIdLaboreo()),obj.getDescripcion()}).forEachOrdered((esta) -> {
        dtm.addRow(esta);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        volver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        agregaE1 = new javax.swing.JButton();
        nuevoLaboreo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Ingrese un Laboreo");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 132, -1));

        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        jPanel2.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 80, -1));

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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 330, 90));

        agregaE1.setText("Agregar");
        agregaE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregaE1ActionPerformed(evt);
            }
        });
        jPanel2.add(agregaE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        nuevoLaboreo.setForeground(new java.awt.Color(204, 204, 204));
        nuevoLaboreo.setText("Ejemplo: Rastrillar");
        nuevoLaboreo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nuevoLaboreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoLaboreoActionPerformed(evt);
            }
        });
        jPanel2.add(nuevoLaboreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 150, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoLaboreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoLaboreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevoLaboreoActionPerformed

    private void agregaE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregaE1ActionPerformed
        if("".equals(nuevoLaboreo.getText())){
            er.setVisible(true);
            er.setLocationRelativeTo(null);
        }else{
            Laboreo lab = new Laboreo();
            lab.setDescripcion(nuevoLaboreo.getText());
            control.agregarLaboreo(lab);
        }
    }//GEN-LAST:event_agregaE1ActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
       this.setVisible(false);
       Inicio ini = new Inicio(control);
       ini.setVisible(true);
       ini.setLocationRelativeTo(null);
    }//GEN-LAST:event_volverActionPerformed

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
            java.util.logging.Logger.getLogger(Laboreos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Laboreos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Laboreos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Laboreos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregaE1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nuevoLaboreo;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}