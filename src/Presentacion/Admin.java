/**
 *
 * @author Cristian
 */
package Presentacion;

import Presentacion.Usuario.ConsultaUsuario;
import logica.interfaz.IControladorUsuario;
import Presentacion.Usuario.RegistrarArtista;
import Presentacion.Usuario.RegistrarEspectador;
//import javax.swing.JFrame;
import logica.Fabrica;



public class Admin extends javax.swing.JFrame {

  
    private final IControladorUsuario ICU;
    public Admin() {
        initComponents();
        this.ICU = Fabrica.getInstance().getIControladorUsuario();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("CoronaTickets");
        setLocationRelativeTo(null);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FrameConsultaU = new javax.swing.JFrame();
        FrameEditarU = new javax.swing.JFrame();
        jMenuBar2 = new javax.swing.JMenuBar();
        Registros = new javax.swing.JMenu();
        RegistroEspectador = new javax.swing.JMenuItem();
        RegistroArtista = new javax.swing.JMenuItem();
        Modificar = new javax.swing.JMenu();
        EditarEspectador = new javax.swing.JMenuItem();
        EditarArtista = new javax.swing.JMenuItem();
        Consular = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();

        FrameConsultaU.setMinimumSize(new java.awt.Dimension(500, 500));

        javax.swing.GroupLayout FrameConsultaULayout = new javax.swing.GroupLayout(FrameConsultaU.getContentPane());
        FrameConsultaU.getContentPane().setLayout(FrameConsultaULayout);
        FrameConsultaULayout.setHorizontalGroup(
            FrameConsultaULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        FrameConsultaULayout.setVerticalGroup(
            FrameConsultaULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        FrameEditarU.setMinimumSize(new java.awt.Dimension(500, 500));

        javax.swing.GroupLayout FrameEditarULayout = new javax.swing.GroupLayout(FrameEditarU.getContentPane());
        FrameEditarU.getContentPane().setLayout(FrameEditarULayout);
        FrameEditarULayout.setHorizontalGroup(
            FrameEditarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        FrameEditarULayout.setVerticalGroup(
            FrameEditarULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));

        Registros.setText("Registros");

        RegistroEspectador.setText("Registrar Espectador");
        RegistroEspectador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroEspectadorActionPerformed(evt);
            }
        });
        Registros.add(RegistroEspectador);

        RegistroArtista.setText("Registrar Artista");
        RegistroArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroArtistaActionPerformed(evt);
            }
        });
        Registros.add(RegistroArtista);

        jMenuBar2.add(Registros);

        Modificar.setText("Modificar");

        EditarEspectador.setText("Editar Espectador");
        EditarEspectador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarEspectadorActionPerformed(evt);
            }
        });
        Modificar.add(EditarEspectador);

        EditarArtista.setText("Editar Artista");
        EditarArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarArtistaActionPerformed(evt);
            }
        });
        Modificar.add(EditarArtista);

        jMenuBar2.add(Modificar);

        Consular.setText("Consultar");

        jMenuItem11.setText("consular Usuario");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        Consular.add(jMenuItem11);

        jMenuBar2.add(Consular);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 319, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistroEspectadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroEspectadorActionPerformed
       /* FrameAltaEspectador.setVisible(true);
        FrameAltaEspectador.setLocationRelativeTo(this);
        FrameAltaEspectador.setTitle("Registrar Espectador");*/
       RegistrarEspectador registrar = new RegistrarEspectador();
       registrar.show(true);
    }//GEN-LAST:event_RegistroEspectadorActionPerformed

    private void RegistroArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroArtistaActionPerformed
       /* FrameAltaArtista.setVisible(true);
        FrameAltaArtista.setLocationRelativeTo(this);
        FrameAltaArtista.setTitle("Registrar Artista");*/
       RegistrarArtista registoartista = new RegistrarArtista();
       registoartista.show(true);
        
        
    }//GEN-LAST:event_RegistroArtistaActionPerformed

    private void EditarEspectadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarEspectadorActionPerformed
        
    }//GEN-LAST:event_EditarEspectadorActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        ConsultaUsuario consultar = new ConsultaUsuario();
        consultar.show(true);
        consultar.DatosUsuarios();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void EditarArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarArtistaActionPerformed
        RegistrarArtista registrarA = new RegistrarArtista();
        registrarA.show(true);
        
    }//GEN-LAST:event_EditarArtistaActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Consular;
    private javax.swing.JMenuItem EditarArtista;
    private javax.swing.JMenuItem EditarEspectador;
    private javax.swing.JFrame FrameConsultaU;
    private javax.swing.JFrame FrameEditarU;
    private javax.swing.JMenu Modificar;
    private javax.swing.JMenuItem RegistroArtista;
    private javax.swing.JMenuItem RegistroEspectador;
    private javax.swing.JMenu Registros;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem11;
    // End of variables declaration//GEN-END:variables
}
