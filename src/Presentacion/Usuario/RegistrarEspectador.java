/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.Usuario;

import java.io.File;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JFileChooser;
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

    public void Limpiar() {
        txtNickname.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtClave.setText("");
        txtRepetirClave.setText("");
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
        txtRepetirClave = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnImagen = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(433, 275));

        btnAceptarAltaEspectador.setText("Aceptar");
        btnAceptarAltaEspectador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarAltaEspectadorActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

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

        txtRepetirClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRepetirClaveActionPerformed(evt);
            }
        });

        jLabel10.setText("Repetir clave");

        btnImagen.setText("Agregar imagen");
        btnImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnImagenMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnImagen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNickname, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                    .addComponent(txtNombre)
                                    .addComponent(txtApellido)
                                    .addComponent(txtClave))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel10))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                    .addComponent(txtRepetirClave)
                                    .addComponent(txtMail)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAceptarAltaEspectador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelarAltaEspectador)))
                        .addGap(0, 9, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
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
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRepetirClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnImagen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelarAltaEspectador)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAceptarAltaEspectador)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public Clases.DtFecha dateToDTFecha(Date fecha) {
        if (fecha != null) {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String fechaDB = dateFormat.format(fecha);
            String[] partes = fechaDB.split("-");
            return new Clases.DtFecha(partes[2], partes[1], partes[0]);
        } else {
            return new Clases.DtFecha("0", "0", "0");
        }
    }
    private void btnAceptarAltaEspectadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarAltaEspectadorActionPerformed

        if (txtNickname.getText().length() != 0 && txtNombre.getText().length() != 0 && txtApellido.getText().length() != 0 && txtClave.getText().length() != 0 && txtRepetirClave.getText().length() != 0 && txtMail.getText().length() != 0 && txtFecha.getText().length() != 0) {

            String nick = txtNickname.getText();
            String nombre = txtNombre.getText();
            String apellido = txtApellido.getText();
            String clave = txtClave.getText();
            String confirmarClave = txtRepetirClave.getText();
            String mail = txtMail.getText();
            Date fecha = Date.valueOf(txtFecha.getText());
            // String id = txtIdentificador.getText();

            if (clave.equals(confirmarClave)) {

                String Validar;
               File imagen = new File(this.lblImagen.getText());

                Validar = ICUE.addEspectador(nick, nombre, apellido, clave, mail, dateToDTFecha(fecha), imagen);
                if (Validar == "I") {
                    JOptionPane.showMessageDialog(this, "Espectador ya existente , intente otro Nickname o Mail ");
                } else if (Validar == "V") {
                    JOptionPane.showMessageDialog(this, "Espectador Registrado!!");
                    Limpiar();
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Error desconocido , vuelva a intentarlo");
                }

            } else {
                JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios");
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

    private void txtRepetirClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRepetirClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepetirClaveActionPerformed

    private void btnImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImagenMouseClicked
        JFileChooser imagen = new JFileChooser();
        imagen.showOpenDialog(this);

        File archivo = imagen.getSelectedFile();

        if (archivo != null) {
            String origen = archivo.getPath();

            this.lblImagen.setText(origen);
        }
    }//GEN-LAST:event_btnImagenMouseClicked

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
    private javax.swing.JButton btnAceptarAltaEspectador;
    private javax.swing.JButton btnCancelarAltaEspectador;
    private javax.swing.JButton btnImagen;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNickname;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRepetirClave;
    // End of variables declaration//GEN-END:variables
}
