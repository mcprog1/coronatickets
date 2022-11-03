/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.Usuario;

<<<<<<< HEAD
import Presentacion.CU8.SeleccionarPlataformaCU8;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
=======
import java.io.File;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JFileChooser;
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
import javax.swing.JOptionPane;
import logica.interfaz.IControladorUsuario;
import logica.Fabrica;

/**
 *
 * @author laptopwin
 */
public class RegistrarEspectador extends javax.swing.JFrame {

    private final IControladorUsuario ICUE;
<<<<<<< HEAD
=======

>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
    public RegistrarEspectador() {
        initComponents();
        this.ICUE = Fabrica.getInstance().getIControladorUsuario();
    }

<<<<<<< HEAD
    public void Limpiar(){
=======
    public void Limpiar() {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
        txtNickname.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtClave.setText("");
<<<<<<< HEAD
        txtMail.setText("");
        txtFecha.setText("");
        //txtIdentificador.setText("");
        
    }
=======
        txtRepetirClave.setText("");
        txtMail.setText("");
        txtFecha.setText("");
        //txtIdentificador.setText("");

    }

>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
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
<<<<<<< HEAD
        ConsultarEspectador = new javax.swing.JButton();
        ModificarEspectador = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
=======
        txtRepetirClave = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnImagen = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
<<<<<<< HEAD
        setTitle("Registar Espectador");

        btnAceptarAltaEspectador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/acepatar.png"))); // NOI18N
=======
        setPreferredSize(new java.awt.Dimension(433, 275));

>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
        btnAceptarAltaEspectador.setText("Aceptar");
        btnAceptarAltaEspectador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarAltaEspectadorActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

<<<<<<< HEAD
        btnCancelarAltaEspectador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
=======
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
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

<<<<<<< HEAD
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
=======
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
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
<<<<<<< HEAD
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
=======
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
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
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
<<<<<<< HEAD
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
        
=======
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
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
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

<<<<<<< HEAD
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
=======
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
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7

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
<<<<<<< HEAD
    private javax.swing.JButton ConsultarEspectador;
    private javax.swing.JButton ModificarEspectador;
    private javax.swing.JButton btnAceptarAltaEspectador;
    private javax.swing.JButton btnCancelarAltaEspectador;
    private javax.swing.JButton jButton1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
=======
    private javax.swing.JButton btnAceptarAltaEspectador;
    private javax.swing.JButton btnCancelarAltaEspectador;
    private javax.swing.JButton btnImagen;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
<<<<<<< HEAD
=======
    private javax.swing.JLabel lblImagen;
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNickname;
    private javax.swing.JTextField txtNombre;
<<<<<<< HEAD
=======
    private javax.swing.JTextField txtRepetirClave;
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
    // End of variables declaration//GEN-END:variables
}
