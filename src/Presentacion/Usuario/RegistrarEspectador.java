/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.Usuario;

import Presentacion.CU8.SeleccionarPlataformaCU8;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import logica.interfaz.IControladorUsuario;
import logica.Fabrica;

/**
 *
 * @author laptopwin
 */
public class RegistrarEspectador extends javax.swing.JFrame {

    private final IControladorUsuario ICUE;
    public RegistrarEspectador() {
        initComponents();
        this.ICUE = Fabrica.getInstance().getIControladorUsuario();
    }

    public void Limpiar(){
        txtNickname.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtClave.setText("");
        txtMail.setText("");
        txtFecha.setText("");
        //txtIdentificador.setText("");
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        btnAceptarAltaEspectador = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnCancelarAltaEspectador = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        txtNickname = new javax.swing.JTextField();
        ConsultarEspectador = new javax.swing.JButton();
        ModificarEspectador = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnAceptarAltaEspectador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/acepatar.png"))); // NOI18N
        btnAceptarAltaEspectador.setText("Aceptar");
        btnAceptarAltaEspectador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarAltaEspectadorActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        btnCancelarAltaEspectador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        btnCancelarAltaEspectador.setText("Cancelar");
        btnCancelarAltaEspectador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAltaEspectadorActionPerformed(evt);
            }
        });

        jLabel3.setText("Apellido");

        jLabel4.setText("Mail");

        jLabel5.setText("Fecha");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailActionPerformed(evt);
            }
        });

        jLabel8.setText("Clave");

        jLabel1.setText("Nickname");

        txtClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaveActionPerformed(evt);
            }
        });

        txtNickname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNicknameActionPerformed(evt);
            }
        });

        ConsultarEspectador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consultar usuario.png"))); // NOI18N
        ConsultarEspectador.setText("Consultar");
        ConsultarEspectador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ConsultarEspectador.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ConsultarEspectador.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        ConsultarEspectador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarEspectadorActionPerformed(evt);
            }
        });

        ModificarEspectador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificarusuario.png"))); // NOI18N
        ModificarEspectador.setText("Modificar");
        ModificarEspectador.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        ModificarEspectador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ModificarEspectador.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        ModificarEspectador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarEspectadorActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Inscribir usuario.png"))); // NOI18N
        jButton1.setText("Inscribir");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNickname))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(22, 22, 22)
                        .addComponent(txtClave))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtFecha))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(29, 29, 29)
                        .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAceptarAltaEspectador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelarAltaEspectador)
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ConsultarEspectador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ModificarEspectador)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAceptarAltaEspectador)
                            .addComponent(btnCancelarAltaEspectador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ConsultarEspectador, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ModificarEspectador))))
                .addContainerGap())
        );

        ModificarEspectador.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public Clases.DtFecha dateToDTFecha(Date fecha){
        if(fecha != null){
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String fechaDB = dateFormat.format(fecha);
            String[] partes = fechaDB.split("-");
            return new Clases.DtFecha(partes[2],partes[1],partes[0]);
        }
        else{
            return new Clases.DtFecha("0","0","0");
        }
    }
    private void btnAceptarAltaEspectadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarAltaEspectadorActionPerformed
        String nick = txtNickname.getText();
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String clave = txtClave.getText();
        String mail = txtMail.getText();
        Date fecha = Date.valueOf(txtFecha.getText());
       // String id = txtIdentificador.getText();
        
        
        String Validar;
        Validar = ICUE.addEspectador(nick, nombre, apellido, clave, mail, dateToDTFecha(fecha), "1");
        if(Validar == "I"){
            JOptionPane.showMessageDialog(this, "Espectador ya existente , intente otro Nickname o Mail ");
        }else if (Validar  == "V"){
            JOptionPane.showMessageDialog(this,"Espectador Registrado!!");
            Limpiar();
            dispose();
        }else {
            JOptionPane.showMessageDialog(this,"Error desconocido , vuelva a intentarlo");
        }
        
    }//GEN-LAST:event_btnAceptarAltaEspectadorActionPerformed

    private void btnCancelarAltaEspectadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAltaEspectadorActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarAltaEspectadorActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMailActionPerformed

    private void txtClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaveActionPerformed

    private void txtNicknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNicknameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNicknameActionPerformed

    private void ConsultarEspectadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarEspectadorActionPerformed
       //Consultar usuario
        ConsultaUsuario consultar = new ConsultaUsuario();
        consultar.show(true);
        consultar.DatosUsuarios();
       
    }//GEN-LAST:event_ConsultarEspectadorActionPerformed

    private void ModificarEspectadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarEspectadorActionPerformed
       //Modificar
        EditarUsuario editar = new EditarUsuario();
        editar.setLocationRelativeTo(null);
        editar.show(true);
       
    }//GEN-LAST:event_ModificarEspectadorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Inscripciones
        SeleccionarPlataformaCU8 newframe = new SeleccionarPlataformaCU8();
        newframe.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarEspectador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarEspectador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarEspectador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarEspectador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarEspectador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConsultarEspectador;
    private javax.swing.JButton ModificarEspectador;
    private javax.swing.JButton btnAceptarAltaEspectador;
    private javax.swing.JButton btnCancelarAltaEspectador;
    private javax.swing.JButton jButton1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNickname;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
