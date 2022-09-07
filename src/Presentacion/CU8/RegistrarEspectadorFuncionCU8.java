/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.CU8;

import Clases.Espectador;
import Interface.IControladorFuncion;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Fabrica;

public class RegistrarEspectadorFuncionCU8 extends javax.swing.JFrame {

    private IControladorFuncion ICF;

    public RegistrarEspectadorFuncionCU8() {

        initComponents();
        ICF = Fabrica.getInstance().getIControladorFuncion();
        try {
            CargarDatosEspectadores();
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarEspectadorFuncionCU8.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrarEspectadorFuncionCU8.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RegistrarEspectadorFuncionCU8.class.getName()).log(Level.SEVERE, null, ex);
        }

        DefaultListModel listModel = new DefaultListModel();
        lstRegistrosEspectador.setModel(listModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstRegistrosEspectador = new javax.swing.JList<>();
        btnRegistrar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstEspectadores = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Espectadores");

        lstRegistrosEspectador.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstRegistrosEspectador);

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        lstEspectadores.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstEspectadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstEspectadoresMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(lstEspectadores);

        jLabel2.setText("Registros del espectador sin canjear");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstEspectadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstEspectadoresMouseClicked
        try {
            CargarDatosRegistros();
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarEspectadorFuncionCU8.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrarEspectadorFuncionCU8.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RegistrarEspectadorFuncionCU8.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lstEspectadoresMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        if (lstEspectadores.getSelectedIndex() == -1) {//Verifica que haya un espectador seleccionado

            JOptionPane.showMessageDialog(null, "Seleccione un espectador");
        } else {

            List Registros = lstRegistrosEspectador.getSelectedValuesList();

            if (Registros.size() > 0 && Registros.size() < 3 || Registros.size() > 3) {//Verifica que haya 3 o 0 registros seleccionados

                JOptionPane.showMessageDialog(null, "Para canjear el registro debe seleccionar 3 registros anteriores");
            } else {

                DefaultTableModel tm = (DefaultTableModel) SeleccionarFuncionCU8.tblFunciones.getModel();
                int funcionllena = ICF.EspectaculoLleno(SeleccionarEspectaculoCU8.lstEspetaculo.getSelectedValue(), String.valueOf(tm.getValueAt(SeleccionarFuncionCU8.tblFunciones.getSelectedRow(), 0)));

                if (funcionllena == 1) {//Si la función esta llena

                    String[] botones = {" Elegir otra funcion", " Cancelar"};
                    Object[] botones2 = {" Elegir otra funcion", " Cancelar"};

                    int opcion = JOptionPane.showOptionDialog(null, " Funcion llena", "Error", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null/*icono*/, botones, botones2[0]);

                    if (opcion == 0) {

                        SeleccionarFuncionCU8 newframe = new SeleccionarFuncionCU8();
                        newframe.setVisible(true);
                        this.dispose();
                    } else {
                        this.dispose();
                    }
                } else {//Si la función no esta llena

                    int opcion = ICF.EspectadorEnFuncion(lstEspectadores.getSelectedValue(), String.valueOf(tm.getValueAt(SeleccionarFuncionCU8.tblFunciones.getSelectedRow(), 0)));

                    if (opcion == 1) {//Verifica que el espectador no este registrado a la función

                        JOptionPane.showMessageDialog(null, "Este espectador ya esta registrado a esta función, elija otro");
                    } else {

                        if (Registros.isEmpty()) {//Ingresar espectador 

                            ICF.RegistrarEspectadorFuncion(lstEspectadores.getSelectedValue(), SeleccionarEspectaculoCU8.lstEspetaculo.getSelectedValue(), String.valueOf(tm.getValueAt(SeleccionarFuncionCU8.tblFunciones.getSelectedRow(), 0)));
                            JOptionPane.showMessageDialog(null, "Espectador registrado con exito");
                            this.dispose();
                        } else {//Canjear espectador

                            ICF.CanjearRegistroEspectadorFuncion(lstEspectadores.getSelectedValue(), SeleccionarEspectaculoCU8.lstEspetaculo.getSelectedValue(), String.valueOf(tm.getValueAt(SeleccionarFuncionCU8.tblFunciones.getSelectedRow(), 0)), Registros);
                            JOptionPane.showMessageDialog(null, "Espectador registrado con exito");
                            this.dispose();
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarEspectadorFuncionCU8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarEspectadorFuncionCU8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarEspectadorFuncionCU8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarEspectadorFuncionCU8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarEspectadorFuncionCU8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JList<String> lstEspectadores;
    public static javax.swing.JList<String> lstRegistrosEspectador;
    // End of variables declaration//GEN-END:variables

    private void CargarDatosEspectadores() throws SQLException, ClassNotFoundException, IOException {

        ArrayList<Espectador> lista = new ArrayList();

        lista = ICF.ListarEspectadores();

        DefaultListModel listModel = new DefaultListModel();

        for (int i = 0; i < lista.size(); i++) {

            listModel.add(i, lista.get(i).getNickname());
        }
        lstEspectadores.setModel(listModel);
    }

    private void CargarDatosRegistros() throws SQLException, ClassNotFoundException, IOException {

        ArrayList<String> lista = new ArrayList();//Crear clase Registro??

        lista = ICF.ListarRegistrosUsuarioEspectaculo(lstEspectadores.getSelectedValue(), SeleccionarEspectaculoCU8.lstEspetaculo.getSelectedValue());

        DefaultListModel listModel = new DefaultListModel();

        for (int i = 0; i < lista.size(); i++) {

            listModel.add(i, lista.get(i));
        }
        lstRegistrosEspectador.setModel(listModel);
    }
}
