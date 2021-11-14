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
        jMenu3 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        AgregarTiposuelo = new javax.swing.JMenuItem();
        ModiLA = new javax.swing.JMenuItem();
        BorrarLA = new javax.swing.JMenuItem();
        BuscarLA = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu2.setText("Campo");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Proyecto");
        jMenuBar2.add(jMenu3);

        jMenu8.setText("TipoSuelo");

        AgregarTiposuelo.setText("Agregar");
        AgregarTiposuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarTiposueloActionPerformed(evt);
            }
        });
        jMenu8.add(AgregarTiposuelo);

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

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        this.show(false);
        AgregarCampo agregarCampo = new AgregarCampo(control);
        agregarCampo.setLocationRelativeTo(null);
        agregarCampo.show(true);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void AgregarTiposueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarTiposueloActionPerformed
        
        AgregarTipoSuelo agregarT = new AgregarTipoSuelo(control);
        this.setVisible(false);
        agregarT.setVisible(true);
        agregarT.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_AgregarTiposueloActionPerformed

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
    private javax.swing.JMenuItem AgregarTiposuelo;
    private javax.swing.JMenuItem BorrarLA;
    private javax.swing.JMenuItem BuscarLA;
    private javax.swing.JMenuItem ModiLA;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JLabel lblimagen;
    // End of variables declaration//GEN-END:variables
}
