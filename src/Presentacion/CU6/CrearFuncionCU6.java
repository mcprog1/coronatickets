/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.CU6;

import Clases.Artista;
import Clases.Funciones;
import Interface.IControladorFuncion;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import logica.Fabrica;

public class CrearFuncionCU6 extends javax.swing.JFrame {

    private IControladorFuncion ICF;

    public CrearFuncionCU6() {
        initComponents();
        ICF = Fabrica.getInstance().getIControladorFuncion();
        CargarDatosArtistas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new javax.swing.JTextField();
        txtDia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstArtistas = new javax.swing.JList<>();
        btnCrear = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMes = new javax.swing.JTextField();
        txtAnio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMinuto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });

        txtDia.setText("DD");

        lstArtistas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstArtistas);

        btnCrear.setText("Crear");
        btnCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearMouseClicked(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre*");

        jLabel2.setText("Fecha*");

        jLabel3.setText("Hora de inicio*");

        txtMes.setText("MM");

        txtAnio.setText("YYYY");

        jLabel4.setText("/");

        jLabel5.setText("/");

        txtMinuto.setText("MM");

        jLabel6.setText(":");

        txtHora.setText("HH");

        jLabel7.setText("Artistas*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCrear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelar, btnCrear});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        txtDia.setText("DD");
        txtMes.setText("MM");
        txtAnio.setText("YYYY");
        txtHora.setText("HH");
        txtMinuto.setText("MM");
        lstArtistas.clearSelection();
        try {
            CargarDatosFuncion(txtNombre.getText(), SeleccionarEspectaculoCU6.lstEspetaculo.getSelectedValue());
        } catch (SQLException ex) {
            Logger.getLogger(CrearFuncionCU6.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtNombreKeyReleased

    private void btnCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearMouseClicked
        if (txtNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un nombre para la función");
        } else {
            if (txtDia.getText().isEmpty() || txtMes.getText().isEmpty() || txtAnio.getText().isEmpty() || txtDia.getText().equals("DD") || txtMes.getText().equals("MM") || txtAnio.getText().equals("YYYY")) {
                JOptionPane.showMessageDialog(null, "Ingrese la fecha de la funcion");
            } else {
                if (txtHora.getText().isEmpty() || txtMinuto.getText().isEmpty() || txtHora.getText().equals("HH") || txtMinuto.getText().equals("MM")) {
                    JOptionPane.showMessageDialog(null, "Ingrese la hora para la funcion");
                } else {
                    if (lstArtistas.getSelectedIndex() == -1) {
                        JOptionPane.showMessageDialog(null, "Seleccione artistas para la funcion");
                    } else {
                        List artistas = lstArtistas.getSelectedValuesList();

                        int controlar = ICF.AltaFuncion(SeleccionarEspectaculoCU6.lstEspetaculo.getSelectedValue(), txtNombre.getText(), txtDia.getText(), txtMes.getText(), txtAnio.getText(), txtHora.getText(), txtMinuto.getText(), artistas);

                        if (controlar == 1) {
                            JOptionPane.showMessageDialog(null, "Ingrese un año valido");
                        } else {
                            if (controlar == 2) {
                                JOptionPane.showMessageDialog(null, "Ingrese un mes valido");
                            } else {
                                if (controlar == 3) {
                                    JOptionPane.showMessageDialog(null, "Ingrese un día valido");
                                } else {
                                    if (controlar == 4) {
                                        JOptionPane.showMessageDialog(null, "Ingrese una fecha valida");
                                    } else {
                                        if (controlar == 5) {
                                            JOptionPane.showMessageDialog(null, "Ingrese una hora valida");
                                        } else {
                                            if (controlar == 6) {
                                                JOptionPane.showMessageDialog(null, "Ingrese unos minutos valida");
                                            } else {
                                                if (controlar == 7) {
                                                    JOptionPane.showMessageDialog(null, "La fecha debe ser posterior a la fecha actual");
                                                } else {
                                                    if (controlar == 8) {
                                                        JOptionPane.showMessageDialog(null, "Funcion actualizada con exito");
                                                        this.dispose();
                                                    } else {
                                                        if (controlar == 9) {
                                                            JOptionPane.showMessageDialog(null, "Funcion creada con exito");
                                                            this.dispose();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnCrearMouseClicked

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
            java.util.logging.Logger.getLogger(CrearFuncionCU6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearFuncionCU6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearFuncionCU6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearFuncionCU6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearFuncionCU6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstArtistas;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtMinuto;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void CargarDatosArtistas() {

        ArrayList<Artista> lista = new ArrayList();

        lista = ICF.ListarArtistas();

        DefaultListModel listModel = new DefaultListModel();

        for (int i = 0; i < lista.size(); i++) {
            listModel.add(i, lista.get(i).getNickname());
        }
        lstArtistas.setModel(listModel);
    }
//------------------------------------------------------------------------------

    private void CargarDatosFuncion(String nombreFuncion, String nombreEspectaculo) throws SQLException {

        ArrayList<Artista> listaArtistas = new ArrayList();
        ArrayList<String> listaArtistasFuncion = new ArrayList();

        Funciones funcion = ICF.ConsultaFuncion(nombreFuncion, nombreEspectaculo);
        listaArtistas = ICF.ListarArtistas();

        if (funcion != null) {

            listaArtistasFuncion = ICF.ListarNombreArtistasFuncion(nombreFuncion);

            ArrayList<Integer> listaAux = new ArrayList();

            for (int i = 0; i < listaArtistas.size(); i++) {

                if (listaArtistasFuncion.contains(listaArtistas.get(i).getNickname())) {
                    listaAux.add(i);
                }
            }
            int[] indices = new int[listaAux.size()];
            int x = 0;

            while (x < listaAux.size()) {
                indices[x] = listaAux.get(x);
                x++;
            }

            lstArtistas.setSelectedIndices(indices);
            Timestamp timestamp = funcion.getFecha();
            Timestamp timestamp2 = funcion.getHoraDeInicio();
            SimpleDateFormat sdf = new SimpleDateFormat("dd");
            SimpleDateFormat sdf2 = new SimpleDateFormat("MM");
            SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy");
            SimpleDateFormat sdf4 = new SimpleDateFormat("hh");
            SimpleDateFormat sdf5 = new SimpleDateFormat("mm");

            txtDia.setText(sdf.format(timestamp));
            txtMes.setText(sdf2.format(timestamp));
            txtAnio.setText(sdf3.format(timestamp));
            txtHora.setText(sdf4.format(timestamp2));
            txtMinuto.setText(sdf5.format(timestamp2));

        }
    }
}
