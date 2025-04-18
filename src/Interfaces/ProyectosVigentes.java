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
import Clases.Historial;
import Controladora.Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import static net.bytebuddy.matcher.ElementMatchers.is;
import static net.bytebuddy.matcher.ElementMatchers.none;

/**
 *
 * @author ezest
 */
public class ProyectosVigentes extends javax.swing.JFrame {
Controlador control = new Controlador();
DefaultTableModel dtmPro = new DefaultTableModel();
DefaultTableModel dtmLpro = new DefaultTableModel();
DefaultTableModel dtmPRE = new DefaultTableModel();
DefaultTableModel dtmPOST = new DefaultTableModel();


Historial hist = new Historial();
List <Lotes> lotesSelec = new ArrayList();
List <Integer> indices = new ArrayList();
Lotes lote = new Lotes();
List <Proyecto> proyectos = new ArrayList();
private List <Lotes> lotesP=  new ArrayList();
List <Campo> CampoP =  new ArrayList();
List <Laboreo> laboreopre =  new ArrayList();
List <Laboreo> laboreopost =  new ArrayList();  
List <Proyecto> prov = new ArrayList();
List <Historial> listahist = new ArrayList();
List <Campo> listaCampo = new ArrayList();
List <Proyecto> listaP = new ArrayList();
Laboreo l = new Laboreo();
Proyecto p = new Proyecto();
EstadoProyecto estado = new EstadoProyecto();
int indiceG;



    public ProyectosVigentes(Controlador control2) {

        initComponents();
        control = control2;
        String [] titulo = new String [] {"Id Proyecto","Descripcion"};
        String [] titulo2 = new String [] {"Id Campo","Nombre","Id Lote ","Proyecto","Estado del Proyecto","Laboreo Actual"};
        String [] titulopre = new String [] {"Preparacion"};
        String [] titulopost = new String [] {"Post Siembra"};
        dtmPro.setColumnIdentifiers(titulo);
        dtmLpro.setColumnIdentifiers(titulo2);
        dtmPRE.setColumnIdentifiers(titulopre);
        dtmPOST.setColumnIdentifiers(titulopost);



        
        tablaProyectos.setModel(dtmPro);
        tablaLotesP.setModel(dtmLpro);
        tablaPRE.setModel(dtmPRE);
        tablaPOST.setModel(dtmPOST);
          
        prov= control.obtenerProyectos();
        System.out.println("este es prov pero buscado por id"+prov.toString());
        proyectos=control.obtenerProyectos();
        
                proyectos.stream().map((obj) -> new String []{Long.toString(obj.getIdProyecto()),obj.getDescripcion()}).forEachOrdered((proy) -> {
        dtmPro.addRow(proy);
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
        tablaPOST = new javax.swing.JTable();
        Finalizar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Reiniciar = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProyectos = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaLotesP = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaPRE = new javax.swing.JTable();
        EstablecerL = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaPOST.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaPOST.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPOSTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaPOST);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 160, 100));

        Finalizar.setText("Finalizar");
        Finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalizarActionPerformed(evt);
            }
        });
        jPanel1.add(Finalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 90, -1));

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        jPanel1.add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 90, -1));

        jLabel1.setText("Proyectos Vigentes:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        Reiniciar.setText("Reiniciar");
        Reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReiniciarActionPerformed(evt);
            }
        });
        jPanel1.add(Reiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 90, -1));

        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        jPanel1.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        tablaProyectos.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaProyectos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProyectosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaProyectos);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 580, 100));

        tablaLotesP.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaLotesP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaLotesPMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaLotesP);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 580, 100));

        tablaPRE.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaPRE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPREMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablaPRE);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 160, 100));

        EstablecerL.setText("Establecer Laboreo");
        EstablecerL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstablecerLActionPerformed(evt);
            }
        });
        jPanel1.add(EstablecerL, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 140, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        this.setVisible(false);
        Inicio ini = new Inicio(control);
        ini.setVisible(true);
        ini.setLocationRelativeTo(null);
        
        
    }//GEN-LAST:event_volverActionPerformed

    private void tablaProyectosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProyectosMouseClicked
        int indice;
        dtmLpro.setRowCount(0);
        dtmPRE.setRowCount(0);
        dtmPOST.setRowCount(0);
        Campo c = new Campo();
        indice=tablaProyectos.getSelectedRow();
        
        p=proyectos.get(indice);
        lotesP=p.getLotes();
       
        laboreopre=p.getLaboreosPre();
        laboreopost=p.getLaboreosPost();
        
        for (Laboreo l :laboreopre){
            
            String [] rowLAB = new String[] {String.valueOf(l.getIdLaboreo())+ " - " + l.getDescripcion()};
            dtmPRE.addRow(rowLAB);
        
        }
        
        for (Laboreo l :laboreopost){
            
            String [] rowLAB = new String[] {String.valueOf(l.getIdLaboreo())+ " - " + l.getDescripcion()};
            dtmPOST.addRow(rowLAB);
        
        }
        
        
        
        
        System.out.println("aca esta elñ tamaño de la lista de p"+p.getLotes().size());
       
        
        int cont =0;
        for (Lotes l : p.getLotes()){
            cont++;
            if(Objects.nonNull(l) ){
            c=control.buscarCampo(l.getFk_Campo());
            String [] rowLotes = new String[] {String.valueOf(c.getIdCampo()),c.getNombre(),String.valueOf(l.getIdLote()),p.getDescripcion(),String.valueOf(l.getEstado().getDescripcion()),String.valueOf(l.getLaboreoact())};
            dtmLpro.addRow(rowLotes);
            }
            else{
                 
            
            }
                
            
        }
        System.out.println("EL CONTADOR"+cont);
        
        
        
        
        
        
    }//GEN-LAST:event_tablaProyectosMouseClicked

    private void tablaPREMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPREMouseClicked
       indiceG=tablaPRE.getSelectedRow();
       l=laboreopre.get(indiceG);
         estado=control.obtenerEstado((long)2);
        
        
     
    }//GEN-LAST:event_tablaPREMouseClicked

    
    
    private void tablaPOSTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPOSTMouseClicked
        indiceG=tablaPOST.getSelectedRow();
        l=laboreopost.get(indiceG);
        estado=control.obtenerEstado((long)3);
      
        
        
        
    }//GEN-LAST:event_tablaPOSTMouseClicked

    private void EstablecerLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstablecerLActionPerformed
         int indice,indl;
        
        Historial h = new Historial();
       
       
        String nomcamp = new String();
         Lotes lot = new Lotes();
        
        indl=tablaLotesP.getSelectedRow();
        long miliseconds = System.currentTimeMillis();
        Date date = new Date(miliseconds);
        dtmLpro.setValueAt(l.getDescripcion(), indl, 5);
        dtmLpro.setValueAt(estado.getDescripcion(), indl, 4);
        lot=lotesP.get(indl);
        nomcamp=(String)tablaLotesP.getValueAt(indl, 1);
        h.setNombreCampo(nomcamp);
        h.setDescripcionP("Etapa completada con exito");
        h.setEstadoProyecto(lot.getEstado().getDescripcion());
        h.setFecha(date);
        h.setIdLote((long)lot.getIdLote());
        h.setIdProyecto(lot.getFk_proyecto());
        h.setLaboreoefect(lot.getLaboreoact());
        lot.setEstado(estado);
        lot.setLaboreoact(l.getDescripcion());
        
        control.modificarLote(lot);
        control.agregarHistorial(h);
        
        
    }//GEN-LAST:event_EstablecerLActionPerformed

    private void tablaLotesPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaLotesPMouseClicked
         

        
    }//GEN-LAST:event_tablaLotesPMouseClicked

    private void ReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReiniciarActionPerformed
        int indice=0;
        long miliseconds = System.currentTimeMillis();
        Date date = new Date(miliseconds);
        Lotes lote = new Lotes();
        Historial h = new Historial();
        EstadoProyecto est = new EstadoProyecto();
        String nomCamp = new String();
        indice=tablaLotesP.getSelectedRow();
        lote=lotesP.get(indice); 
        est=control.obtenerEstado((long)1);
        h.setIdLote((long)lote.getIdLote());
        h.setLaboreoefect(lote.getLaboreoact());
        lote.setEstado(est);
        lote.setLaboreoact(null);
         est=control.obtenerEstado((long)4);
         h.setEstadoProyecto(est.getDescripcion());
         h.setIdProyecto(lote.getFk_proyecto());
         nomCamp=(String)tablaLotesP.getValueAt(indice, 1);
         h.setNombreCampo(nomCamp);
         h.setFecha(date);
         String name = JOptionPane.showInputDialog("¿Porque desea Reiniciar el proyecto?");
         h.setDescripcionP(name);
         control.agregarHistorial(h);
         control.modificarLote(lote);
         
    }//GEN-LAST:event_ReiniciarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed

        int indice=0;
        long miliseconds = System.currentTimeMillis();
        Date date = new Date(miliseconds);
        Lotes lote = new Lotes();
        Historial h = new Historial();
        EstadoProyecto est = new EstadoProyecto();
        String nomCamp = new String();
        
        indice=tablaLotesP.getSelectedRow();
        lote=lotesP.get(indice); 
        est=control.obtenerEstado((long)5);
        h.setIdLote((long)lote.getIdLote());
        h.setLaboreoefect(lote.getLaboreoact());
        h.setIdProyecto(lote.getFk_proyecto());
        p.getLotes().remove(lote);
        control.modificarProyecto(p);
        lote.setEstado(null);
        lote.setLaboreoact(null);
        lote.setFk_proyecto(null);
        
         h.setEstadoProyecto(est.getDescripcion());
         
         nomCamp=(String)tablaLotesP.getValueAt(indice, 1);
         h.setNombreCampo(nomCamp);
         h.setFecha(date);
         String name = JOptionPane.showInputDialog("¿Porque desea Cancelar el proyecto?");
         h.setDescripcionP(name);
         control.agregarHistorial(h);
         control.modificarLote(lote);
         dtmLpro.removeRow(indice);
         control.ModificarEstadoCampo();
        
        
    }//GEN-LAST:event_CancelarActionPerformed
    
    private void FinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalizarActionPerformed
       
        int indice=0;
        long miliseconds = System.currentTimeMillis();
        Date date = new Date(miliseconds);
        Lotes lote = new Lotes();
        Historial h = new Historial();
        EstadoProyecto est = new EstadoProyecto();
        String nomCamp = new String();
        
        indice=tablaLotesP.getSelectedRow();
        lote=lotesP.get(indice); 
        est=control.obtenerEstado((long)6);
        h.setIdLote((long)lote.getIdLote());
        h.setLaboreoefect(lote.getLaboreoact());
        h.setIdProyecto(lote.getFk_proyecto());
        p.getLotes().remove(lote);
        control.modificarProyecto(p);
        lote.setEstado(null);
        lote.setLaboreoact(null);
        lote.setFk_proyecto(null);
        
         h.setEstadoProyecto(est.getDescripcion());
         
         nomCamp=(String)tablaLotesP.getValueAt(indice, 1);
         h.setNombreCampo(nomCamp);
         h.setFecha(date);
        
         h.setDescripcionP("Finalizado con exito");
         control.agregarHistorial(h);
         control.modificarLote(lote);
         dtmLpro.removeRow(indice);
          control.ModificarEstadoCampo();
         
           
            
            
    }//GEN-LAST:event_FinalizarActionPerformed

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
            java.util.logging.Logger.getLogger(ProyectosVigentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProyectosVigentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProyectosVigentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProyectosVigentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton EstablecerL;
    private javax.swing.JButton Finalizar;
    private javax.swing.JButton Reiniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tablaLotesP;
    private javax.swing.JTable tablaPOST;
    private javax.swing.JTable tablaPRE;
    private javax.swing.JTable tablaProyectos;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
