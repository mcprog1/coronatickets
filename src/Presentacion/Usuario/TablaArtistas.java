/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.Usuario;

import Clases.Artista;
import Clases.Espectaculo;
import Persistencia.ConexionDB;
import coronatickets.espetaculos.informacionEspectaculo;
import coronatickets.funciones.consultaFuncion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import logica.Fabrica;
import logica.interfaz.IControladorEspetaculo;
import logica.interfaz.IControladorUsuario;

/**
 *
 * @author laptopwin
 */
public class TablaArtistas extends javax.swing.JFrame {

    private IControladorUsuario ICUC;
   private IControladorEspetaculo ICUE;

    public TablaArtistas() {
        ICUC = Fabrica.getInstance().getIControladorUsuario();
        ICUE = Fabrica.getInstance().getIControladorEspectaculo();
        initComponents();
       
    }

    public void DatosArtista(String nick) {
        DefaultTableModel tablaEspectaculo = new DefaultTableModel();
        String[] datosEspectaculo = new String[3];
        //tablaEspectaculo.addColumn("Organizador");
        tablaEspectaculo.addColumn("Espetaculo");
        tablaEspectaculo.addColumn("Descripcion");
        tablaEspectaculo.addColumn("URL");
         int i;
        ArrayList<Espectaculo> ListaE;
        ListaE = this.ICUE.tablaespetaculo(nick);
        for (i = 0; i < ListaE.size(); i++) {
            //datosEspectaculo[0] = ListaE.get(i).getArtistaOrganizador().toString();
            datosEspectaculo[0] = ListaE.get(i).getNombre().toString();
            datosEspectaculo[1] = ListaE.get(i).getDescripcion().toString();
            datosEspectaculo[2] = ListaE.get(i).getURL().toString();
            
            tablaEspectaculo.addRow(datosEspectaculo);
        }
        TablaArtista.setModel(tablaEspectaculo);
    }
    
    public void DatosDeArtista(String nick) {
        //Creo la tabla para el artista
        DefaultTableModel tablaArtista = new DefaultTableModel();
        String[] datosArtista = new String[7];
        tablaArtista.addColumn("Nickname");
        tablaArtista.addColumn("Nombre");
        tablaArtista.addColumn("Apellido");
        tablaArtista.addColumn("Mail");
        tablaArtista.addColumn("Biografia");
        tablaArtista.addColumn("URL");
        tablaArtista.addColumn("Descripcion");
        Artista Art = null;
        Art = this.ICUC.Consultar_un_artista_particular(nick);
        
        datosArtista[0] = Art.getNickname().toString();
        datosArtista[1] = Art.getNombre().toString();
        datosArtista[2] = Art.getApellido().toString();
        datosArtista[3] = Art.getMail().toString(); // Me genera problemas el Mail
        datosArtista[4] = Art.getBiografia().toString();
        datosArtista[5] = Art.getURL().toString();
        datosArtista[6] = Art.getDescripcion().toString();
        
        tablaArtista.addRow(datosArtista);
        tablaArtista2.setModel(tablaArtista);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaArtista = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaArtista2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
<<<<<<< HEAD
        setTitle("Datos artista");
=======
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7

        TablaArtista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        TablaArtista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaArtistaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaArtista);

        tablaArtista2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane2.setViewportView(tablaArtista2);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(100, 50, 0));
        jLabel1.setText("Artista");
        jLabel1.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel1.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(100, 50, 0));
        jLabel2.setText("Espetaculos");
        jLabel2.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel2.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 376, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TablaArtistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaArtistaMouseClicked
        int fila = TablaArtista.getSelectedRow();
        String nombre = (String) TablaArtista.getValueAt(fila,0);//selecciono de la fila seleccionada la primera

        informacionEspectaculo newFrame = new informacionEspectaculo(nombre);
        newFrame.setVisible(true);
    }//GEN-LAST:event_TablaArtistaMouseClicked

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
            java.util.logging.Logger.getLogger(TablaArtistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaArtistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaArtistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaArtistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TablaArtistas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaArtista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaArtista2;
    // End of variables declaration//GEN-END:variables
}
