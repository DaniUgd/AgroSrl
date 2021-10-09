/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Controladora.Controlador;
import Interfaces.Campo.AgregarCampo;
import Interfaces.Campo.ModificarCampo;
import Interfaces.Proyecto.AgregarProyecto;



public class Inicio extends javax.swing.JFrame {
    private Controlador control;
    
    
    


    public Inicio(Controlador control2) {
       control=control2;
       initComponents();
       this.setLocationRelativeTo(null);
        
     
 }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblimagen = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        AgregarC = new javax.swing.JMenuItem();
        ModiC = new javax.swing.JMenuItem();
        BorrarC = new javax.swing.JMenuItem();
        BuscarC = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        AgregarP = new javax.swing.JMenuItem();
        ModiP = new javax.swing.JMenuItem();
        BorrarP = new javax.swing.JMenuItem();
        BuscarP = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        AgregarL = new javax.swing.JMenuItem();
        ModiL = new javax.swing.JMenuItem();
        BorrarL = new javax.swing.JMenuItem();
        BuscarL = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        AgregarLA = new javax.swing.JMenuItem();
        ModiLA = new javax.swing.JMenuItem();
        BorrarLA = new javax.swing.JMenuItem();
        BuscarLA = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu2.setText("Campo");

        AgregarC.setText("Agregar");
        AgregarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarCActionPerformed(evt);
            }
        });
        jMenu2.add(AgregarC);

        ModiC.setText("Modifica");
        ModiC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModiCActionPerformed(evt);
            }
        });
        jMenu2.add(ModiC);

        BorrarC.setText("Borrar");
        BorrarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarCActionPerformed(evt);
            }
        });
        jMenu2.add(BorrarC);

        BuscarC.setText("Buscar");
        jMenu2.add(BuscarC);

        jMenuBar2.add(jMenu2);

        jMenu3.setText("Proyecto");

        AgregarP.setText("Agregar");
        AgregarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarPActionPerformed(evt);
            }
        });
        jMenu3.add(AgregarP);

        ModiP.setText("Modifica");
        jMenu3.add(ModiP);

        BorrarP.setText("Borrar");
        jMenu3.add(BorrarP);

        BuscarP.setText("Buscar");
        jMenu3.add(BuscarP);

        jMenuBar2.add(jMenu3);

        jMenu7.setText("Lote");

        AgregarL.setText("Agregar");
        jMenu7.add(AgregarL);

        ModiL.setText("Modifica");
        jMenu7.add(ModiL);

        BorrarL.setText("Borrar");
        jMenu7.add(BorrarL);

        BuscarL.setText("Buscar");
        jMenu7.add(BuscarL);

        jMenuBar2.add(jMenu7);

        jMenu8.setText("Laboreo");

        AgregarLA.setText("Agregar");
        jMenu8.add(AgregarLA);

        ModiLA.setText("Modifica");
        jMenu8.add(ModiLA);

        BorrarLA.setText("Borrar");
        jMenu8.add(BorrarLA);

        BuscarLA.setText("Buscar");
        jMenu8.add(BuscarLA);

        jMenuBar2.add(jMenu8);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblimagen, javax.swing.GroupLayout.DEFAULT_SIZE, 975, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblimagen, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarCActionPerformed
        
        this.show(false);
        AgregarCampo agregarCampo = new AgregarCampo(control);
        agregarCampo.setLocationRelativeTo(null);
        agregarCampo.show(true);
         
    }//GEN-LAST:event_AgregarCActionPerformed

    private void BorrarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarCActionPerformed
       
    }//GEN-LAST:event_BorrarCActionPerformed

    private void ModiCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModiCActionPerformed
         this.show(false);
       ModificarCampo modiCampo = new ModificarCampo(control);
        modiCampo.setLocationRelativeTo(null);
       modiCampo.show(true);
        
    }//GEN-LAST:event_ModiCActionPerformed

    private void AgregarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarPActionPerformed
       this.show(false);

       AgregarProyecto AgregarP = new AgregarProyecto(control);
       AgregarP.setLocationRelativeTo(null);
       AgregarP.show(true);
        
    }//GEN-LAST:event_AgregarPActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }

           
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AgregarC;
    private javax.swing.JMenuItem AgregarL;
    private javax.swing.JMenuItem AgregarLA;
    private javax.swing.JMenuItem AgregarP;
    private javax.swing.JMenuItem BorrarC;
    private javax.swing.JMenuItem BorrarL;
    private javax.swing.JMenuItem BorrarLA;
    private javax.swing.JMenuItem BorrarP;
    private javax.swing.JMenuItem BuscarC;
    private javax.swing.JMenuItem BuscarL;
    private javax.swing.JMenuItem BuscarLA;
    private javax.swing.JMenuItem BuscarP;
    private javax.swing.JMenuItem ModiC;
    private javax.swing.JMenuItem ModiL;
    private javax.swing.JMenuItem ModiLA;
    private javax.swing.JMenuItem ModiP;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JLabel lblimagen;
    // End of variables declaration//GEN-END:variables
}
