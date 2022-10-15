/**
 *
 * @author Cristian
 */
package Presentacion;

import Presentacion.CU6.SeleccionarPlataformaCU6;
import Presentacion.CU7.SeleccionarPlataformaCU7;
import Presentacion.CU8.SeleccionarPlataformaCU8;
import Presentacion.Usuario.ConsultaUsuario;
import Presentacion.Usuario.EditarUsuario;
import Presentacion.Usuario.*;
import logica.interfaz.IControladorUsuario;
import Presentacion.Usuario.RegistrarArtista;
import Presentacion.Usuario.RegistrarEspectador;
import coronatickets.*;
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
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        Modificar = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        Consular = new javax.swing.JMenu();
        menuCE = new javax.swing.JMenuItem();
        menuCee = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        RegistroEspectador = new javax.swing.JMenuItem();
        RegistroArtista = new javax.swing.JMenuItem();
        EditarUsuario = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

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

        jMenu1.setText("Inscripciones");

        jMenuItem3.setText("Inscribir usuario a función");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar2.add(jMenu1);

        Modificar.setText("Función");

        jMenuItem2.setText("Consultar función");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Modificar.add(jMenuItem2);

        jMenuItem1.setText("Registrar Función");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Modificar.add(jMenuItem1);

        jMenuBar2.add(Modificar);

        Consular.setText("Espectaculos");

        menuCE.setText("Crear espectaculo");
        menuCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCEActionPerformed(evt);
            }
        });
        Consular.add(menuCE);

        menuCee.setText("Consultar espectaculo");
        menuCee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCeeActionPerformed(evt);
            }
        });
        Consular.add(menuCee);

        jMenuBar2.add(Consular);

        jMenu2.setText("Usuarios");

        jMenuItem11.setText("Consultar usuario");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem11);

        RegistroEspectador.setText("Registrar Espectador");
        RegistroEspectador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroEspectadorActionPerformed(evt);
            }
        });
        jMenu2.add(RegistroEspectador);

        RegistroArtista.setText("Registrar Artista");
        RegistroArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroArtistaActionPerformed(evt);
            }
        });
        jMenu2.add(RegistroArtista);

        EditarUsuario.setText("Modifcar Usuario");
        EditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarUsuarioActionPerformed(evt);
            }
        });
        jMenu2.add(EditarUsuario);

        jMenuBar2.add(jMenu2);

        jMenu3.setText("Paquetes");

        jMenuItem7.setText("Crear paquete");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem6.setText("Consultar paquete");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Plataformas");

        jMenuItem8.setText("Consultar plataformas");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuBar2.add(jMenu4);

        jMenu5.setText("Categorias");

        jMenuItem4.setText("Administrar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        jMenuBar2.add(jMenu5);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 174, Short.MAX_VALUE)
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

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        ConsultaUsuario consultar = new ConsultaUsuario();
        consultar.show(true);
        consultar.DatosUsuarios();
        
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void EditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarUsuarioActionPerformed
        EditarUsuario editar = new EditarUsuario();
        editar.setLocationRelativeTo(null);
        editar.show(true);
        
    }//GEN-LAST:event_EditarUsuarioActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        SeleccionarPlataformaCU6 newframe = new SeleccionarPlataformaCU6();
        newframe.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        SeleccionarPlataformaCU7 newframe = new SeleccionarPlataformaCU7();
        newframe.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        SeleccionarPlataformaCU8 newframe = new SeleccionarPlataformaCU8();
        newframe.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void menuCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCEActionPerformed
        coronatickets.espetaculos.create newFrame = new coronatickets.espetaculos.create();
        newFrame.setVisible(true);
    }//GEN-LAST:event_menuCEActionPerformed

    private void menuCeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCeeActionPerformed
        coronatickets.espetaculos.consultaEspetaculo newFrame = new coronatickets.espetaculos.consultaEspetaculo();
        newFrame.setVisible(true);
    }//GEN-LAST:event_menuCeeActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        Presentacion.Usuario.CrearPaquete newFrame = new Presentacion.Usuario.CrearPaquete();
        newFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        coronatickets.paquetes.admin newFrame = new coronatickets.paquetes.admin();
        newFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        coronatickets.plataformas.admin newFrame = new coronatickets.plataformas.admin();
        newFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        coronatickets.categorias.admin newFrame = new coronatickets.categorias.admin();
        newFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
    private javax.swing.JMenuItem EditarUsuario;
    private javax.swing.JFrame FrameConsultaU;
    private javax.swing.JFrame FrameEditarU;
    private javax.swing.JMenu Modificar;
    private javax.swing.JMenuItem RegistroArtista;
    private javax.swing.JMenuItem RegistroEspectador;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem menuCE;
    private javax.swing.JMenuItem menuCee;
    // End of variables declaration//GEN-END:variables
}
