/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.Usuario;

import Clases.Artista;
import Clases.Usuarios;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import logica.Fabrica;
import logica.interfaz.IControladorUsuario;

/**
 *
 * @author laptopwin
 */
public class ConsultaUsuario extends javax.swing.JFrame {

    private IControladorUsuario ICUC;
    public ConsultaUsuario() {
        ICUC = Fabrica.getInstance().getIControladorUsuario();
        initComponents();
        DatosUsuarios();
      
       // DatosEspectador();
    }
    //Tabla de los datos del usuario
    public void DatosUsuarios(){
        DefaultTableModel tabla = new DefaultTableModel();//creo una tabla
        String [] datos = new String [2]; 
        tabla.addColumn("Nickname");
        tabla.addColumn("Mail");
        ArrayList<Usuarios> Lista;
        Lista = this.ICUC.tablaUsuarios();
        for(int i =0; i< Lista.size();i++){
            datos[0] = Lista.get(i).getNickname().toString();
            datos[1] = Lista.get(i).getMail().toString();

            tabla.addRow(datos);
            
        }
        tablaConsulta2.setModel(tabla);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaConsulta = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaConsulta2 = new javax.swing.JTable();

        tablaConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "null", "null", "null", "Title 8", "Title 9", "Title 10", "Title 11"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Short.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaConsulta.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                tablaConsultaInputMethodTextChanged(evt);
            }
        });
        jScrollPane1.setViewportView(tablaConsulta);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(204, 0, 0));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Usuarios");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        tablaConsulta2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Email", "Nickname"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaConsulta2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaConsulta2MouseClicked(evt);
            }
        });
        tablaConsulta2.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                tablaConsulta2CaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                tablaConsulta2InputMethodTextChanged(evt);
            }
        });
        jScrollPane3.setViewportView(tablaConsulta2);
        if (tablaConsulta2.getColumnModel().getColumnCount() > 0) {
            tablaConsulta2.getColumnModel().getColumn(0).setResizable(false);
            tablaConsulta2.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaConsultaInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tablaConsultaInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaConsultaInputMethodTextChanged

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void tablaConsulta2InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tablaConsulta2InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaConsulta2InputMethodTextChanged

    private void tablaConsulta2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaConsulta2MouseClicked
      int fila = tablaConsulta2.getSelectedRow();
      String nickname = (String) tablaConsulta2.getValueAt(fila,0);//selecciono de la fila seleccionada la primera columna
      if(ICUC.Artista_o_Espectador(nickname) == 1){
          TablaArtistas datosArtista = new TablaArtistas();
          
          datosArtista.DatosArtista(nickname);
          datosArtista.DatosDeArtista(nickname);
          datosArtista.show(true);
        
      }else if(ICUC.Artista_o_Espectador(nickname) == 2){
          TablaEspectador datosEspectador = new TablaEspectador();
          datosEspectador.DatosDeEspectador(nickname);
          datosEspectador.DatosFunciones(nickname);
          datosEspectador.show(true);
          
      }else{
          System.out.println("A ocurrido un error");
      }
      
    }//GEN-LAST:event_tablaConsulta2MouseClicked

    private void tablaConsulta2CaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tablaConsulta2CaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaConsulta2CaretPositionChanged

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
            java.util.logging.Logger.getLogger(ConsultaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tablaConsulta;
    private javax.swing.JTable tablaConsulta2;
    // End of variables declaration//GEN-END:variables
}
