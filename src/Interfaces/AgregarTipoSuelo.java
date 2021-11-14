
package Interfaces;

import Clases.TipoSuelo;
import Controladora.Controlador;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class AgregarTipoSuelo extends javax.swing.JFrame {
Controlador control= null;
DefaultTableModel dtm = new DefaultTableModel();
List <TipoSuelo> tiposuelos = null;
    public AgregarTipoSuelo() {
        initComponents();
    }

    AgregarTipoSuelo(Controlador control2) {
        control=control2;
        initComponents();
        String [] titulo = new String []  {"ID del Suelo" , "Descripcion"};
        dtm.setColumnIdentifiers(titulo);
        jTable1.setModel(dtm);
        tiposuelos=control.obtenerSuelos();
        tiposuelos.stream().map((obj) -> new String []{Long.toString(obj.getIdSuelo()),obj.getDescripcion()}).forEachOrdered((tipoS) -> {
        dtm.addRow(tipoS);
        });
      }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nomTipos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        volver = new javax.swing.JButton();
        agregarTS = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nomTipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomTiposActionPerformed(evt);
            }
        });
        jPanel1.add(nomTipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 123, -1));

        jLabel1.setText("Ingrese el nuevo Tipo de Suelo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        jPanel1.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        agregarTS.setText("Agregar");
        agregarTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarTSActionPerformed(evt);
            }
        });
        jPanel1.add(agregarTS, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 340, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomTiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomTiposActionPerformed
        
    }//GEN-LAST:event_nomTiposActionPerformed

    private void agregarTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarTSActionPerformed
       TipoSuelo tipo = new TipoSuelo();
       tipo.setDescripcion(nomTipos.getText());
       control.agregarTipoSuelo(tipo);
    }//GEN-LAST:event_agregarTSActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
       Inicio ini = new Inicio(control);
       this.setVisible(false);
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
            java.util.logging.Logger.getLogger(AgregarTipoSuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarTipoSuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarTipoSuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarTipoSuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarTipoSuelo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarTS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nomTipos;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
