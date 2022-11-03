/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.Usuario;

import Clases.Artista;
import Clases.Usuarios;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Fabrica;
import logica.interfaz.IControladorUsuario;

/**
 *
 * @author laptopwin
 */
public class EditarUsuario extends javax.swing.JFrame {

    private IControladorUsuario ICUEditar;
   
    public EditarUsuario() {
        ICUEditar = Fabrica.getInstance().getIControladorUsuario();
        initComponents();
        DatosUsuarios();
        modificarArtista.setVisible(false);
        btnModificarE.setVisible(true);
        
        //esconder mail y nickname
        nickname.setVisible(false);
        mail.setVisible(false);
       
    }
    
    private void limpiar(){
        nickname.setText(null);
        nombre.setText(null);
        apellido.setText(null);
        mail.setText(null);
        clave.setText(null);
        fecha.setText(null);
        url.setText(null);
        descripcion.setText(null);
        biografia.setText(null);
 
    }

    public void DatosUsuarios() {
        DefaultTableModel tabla = new DefaultTableModel();//creo una tabla
        String[] datos = new String[2];
        tabla.addColumn("Nickname");
        tabla.addColumn("Mail");
        ArrayList<Usuarios> Lista;
        Lista = this.ICUEditar.tablaUsuarios();
        for (int i = 0; i < Lista.size(); i++) {
            datos[0] = Lista.get(i).getNickname().toString();
            datos[1] = Lista.get(i).getMail().toString();

            tabla.addRow(datos);

        }
        tablaUsuario.setModel(tabla);

    }

    public void EditarUsuariosA(String nick) {
        modificarArtista.setVisible(true);
        Artista A;
        A = ICUEditar.Consultar_un_artista_particular(nick);
        nickname.setText(A.getNickname().toString());
        nombre.setText(A.getNombre().toString());
        apellido.setText(A.getApellido().toString());
        mail.setText(A.getMail().toString());
        clave.setText(A.getClave().toString());
        fecha.setText(A.getFechai().toString());
        url.setText(A.getURL().toString());
        descripcion.setText(A.getDescripcion().toString());
        biografia.setText(A.getBiografia().toString());
        url.setVisible(true);
        descripcion.setVisible(true);
        biografia.setVisible(true);
        labelB.setVisible(true);
        labelU.setVisible(true);
        labelD.setVisible(true);
        
    }

    
    public void EditarUsuariosE(String nick) {
        btnModificarE.setVisible(true);
        Usuarios espectador;
        espectador = ICUEditar.Consultar_un_Espectador_particular(nick);
        nickname.setText(espectador.getNickname().toString());
        nombre.setText(espectador.getNombre().toString());
        apellido.setText(espectador.getApellido().toString());
        mail.setText(espectador.getMail().toString());
        clave.setText(espectador.getClave().toString());
        fecha.setText(espectador.getFechai().toString());
        url.setVisible(false);
        descripcion.setVisible(false);
        biografia.setVisible(false);
        labelB.setVisible(false);
        labelU.setVisible(false);
        labelD.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        apellido = new javax.swing.JTextField();
        clave = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        mail = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        fecha = new javax.swing.JTextField();
        labelD = new javax.swing.JLabel();
        btnModificarE = new javax.swing.JButton();
        labelB = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelU = new javax.swing.JLabel();
        nickname = new javax.swing.JTextField();
        descripcion = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        biografia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuario = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        url = new javax.swing.JTextField();
        modificarArtista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar usuario");

        apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoActionPerformed(evt);
            }
        });

        jLabel6.setText("Fecha");

        labelD.setText("Descripcion");

        btnModificarE.setText("Modicar");
        btnModificarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarEActionPerformed(evt);
            }
        });

        labelB.setText("biografia");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        labelU.setText("URL");

        nickname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nicknameActionPerformed(evt);
            }
        });

        descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripcionActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 0, 0));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Usuarios");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Apellido");

        tablaUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        tablaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaUsuario.setDoubleBuffered(true);
        tablaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaUsuario);
        if (tablaUsuario.getColumnModel().getColumnCount() > 0) {
            tablaUsuario.getColumnModel().getColumn(0).setResizable(false);
            tablaUsuario.getColumnModel().getColumn(1).setResizable(false);
            tablaUsuario.getColumnModel().getColumn(2).setResizable(false);
            tablaUsuario.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel3.setText("clave");

        modificarArtista.setText("Modicar");
        modificarArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarArtistaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modificarArtista)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnModificarE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(159, 159, 159)
                                        .addComponent(labelU))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(apellido)
                                            .addComponent(clave, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                                        .addGap(17, 17, 17)
                                        .addComponent(labelB)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(biografia, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(url, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nickname, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelD)
                    .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelB)
                    .addComponent(biografia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelU)
                    .addComponent(url, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarE)
                    .addComponent(modificarArtista)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoActionPerformed

    private void btnModificarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarEActionPerformed
        //Boton de modificar espectador
        String nick = nickname.getText();
        String nom = nombre.getText();
        String apell = apellido.getText();
        String clav = clave.getText();
        /*Timestamp*/String fech = fecha.getText();
        boolean op;
        boolean continuar = true;
        if(nom.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "El nombre es obligatorio.");
            continuar = false;
        }
        
        if(apell.isEmpty() && continuar)
        {
            JOptionPane.showMessageDialog(this, "La Apellido es obligatorio.");
            continuar = false;
        }
            
        if(clav.isEmpty() && continuar)
        {
            JOptionPane.showMessageDialog(this, "La Clave es obligatoria.");
            continuar = false;
        }
        if(fech.isEmpty() && continuar)
        {
            JOptionPane.showMessageDialog(this, "La Fecha es obligatoria.");
            continuar = false;
        } 
                
        Date fechaD = Date.valueOf(fecha.getText());
        
        if(continuar){
            op = ICUEditar.EdiarEspectador(nick, nom, apell, clav, fechaD);
            
            if(op == true){
                JOptionPane.showMessageDialog(this, "Modificacion Exitosa.");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(this, "Error al Modificar usuario.");
                limpiar();
            }
        }
    }//GEN-LAST:event_btnModificarEActionPerformed

    private void nicknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nicknameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nicknameActionPerformed

    private void descripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descripcionActionPerformed

    private void tablaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUsuarioMouseClicked
        int fila = tablaUsuario.getSelectedRow();
        String nickname = (String) tablaUsuario.getValueAt(fila, 0);//selecciono de la fila seleccionada la primera columna
        if (ICUEditar.Artista_o_Espectador(nickname) == 1) {
            btnModificarE.setVisible(false);
            modificarArtista.setVisible(true);
            EditarUsuariosA(nickname);

        } else if (ICUEditar.Artista_o_Espectador(nickname) == 2) {
            modificarArtista.setVisible(false);
            btnModificarE.setVisible(true);
            
            EditarUsuariosE(nickname);

        } else {
            System.out.println("A ocurrido un error");
        }
    }//GEN-LAST:event_tablaUsuarioMouseClicked

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
    
    private void modificarArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarArtistaActionPerformed
       
        String nick = nickname.getText();
        String nom = nombre.getText();
        String apell = apellido.getText();
        String clav = clave.getText();
        String fech = fecha.getText();
        String Url = url.getText();
        String des = descripcion.getText();
        String bio = biografia.getText();
        boolean op;
        boolean continuar = true;
        if(nom.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "El nombre es obligatorio.");
            continuar = false;
        }
        
        if(apell.isEmpty() && continuar)
        {
            JOptionPane.showMessageDialog(this, "La Apellido es obligatorio.");
            continuar = false;
        }
            
        if(clav.isEmpty() && continuar)
        {
            JOptionPane.showMessageDialog(this, "La Clave es obligatoria.");
            continuar = false;
        }
        if(fech.isEmpty() && continuar)
        {
            JOptionPane.showMessageDialog(this, "La Fecha es obligatoria.");
            continuar = false;
        }
         if(Url.isEmpty() && continuar)
        {
            JOptionPane.showMessageDialog(this, "La Url es obligatorio.");
            continuar = false;
        }
            
        if(des.isEmpty() && continuar)
        {
            JOptionPane.showMessageDialog(this, "La Descripcion es obligatoria.");
            continuar = false;
        }
        if(bio.isEmpty() && continuar)
        {
            JOptionPane.showMessageDialog(this, "La Biografia es obligatoria.");
            continuar = false;
        }
        
        Date fechaD = Date.valueOf(fecha.getText());
        
        if(continuar){
            op = ICUEditar.editarArtistas(nick, nom, apell, clav, fechaD, des, Url, bio);
           
            
            if(op == true){
                JOptionPane.showMessageDialog(this, "Modificacion Exitosa.");
                limpiar();
               
            }else{
                JOptionPane.showMessageDialog(this, "Error al Modificar usuario.");
                limpiar();
                
            }
        }
    }//GEN-LAST:event_modificarArtistaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       limpiar();
       dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(EditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido;
    private javax.swing.JTextField biografia;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnModificarE;
    private javax.swing.JTextField clave;
    private javax.swing.JTextField descripcion;
    private javax.swing.JTextField fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelB;
    private javax.swing.JLabel labelD;
    private javax.swing.JLabel labelU;
    private javax.swing.JTextField mail;
    private javax.swing.JButton modificarArtista;
    private javax.swing.JTextField nickname;
    private javax.swing.JTextField nombre;
    private javax.swing.JTable tablaUsuario;
    private javax.swing.JTextField url;
    // End of variables declaration//GEN-END:variables
}
