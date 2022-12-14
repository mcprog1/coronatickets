/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.Usuario;

import Clases.Artista;
import Clases.Espectaculo;
import Clases.Funciones;
import Clases.Usuarios;
import Persistencia.ConexionDB;
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
public class TablaEspectador extends javax.swing.JFrame {

    private IControladorUsuario ICUE;
    private IControladorEspetaculo ICUF;
    
    
    public TablaEspectador() {
        ICUE = Fabrica.getInstance().getIControladorUsuario();
        ICUF = Fabrica.getInstance().getIControladorEspectaculo();
        initComponents();
       
    }

    
    public void DatosDeEspectador(String nick) {
        //Creo la tabla para el Espectador
        DefaultTableModel tablaEspectador = new DefaultTableModel();
        String[] datosEspectador = new String[5];
        tablaEspectador.addColumn("Nickname");
        tablaEspectador.addColumn("Nombre");
        tablaEspectador.addColumn("Apellido");       
        tablaEspectador.addColumn("Mail");
        tablaEspectador.addColumn("Fecha de nacimiento");
        
       
        Usuarios Espectador = null;
        Espectador = this.ICUE.Consultar_un_Espectador_particular(nick);
        
        datosEspectador[0] = Espectador.getNickname().toString();
        datosEspectador[1] = Espectador.getNombre().toString();
        datosEspectador[2] = Espectador.getApellido().toString();
        datosEspectador[3] = Espectador.getMail().toString(); // Me genera problemas el Mail
        datosEspectador[4] = Espectador.getFechai().toString();
        
        
        tablaEspectador.addRow(datosEspectador);
        TablaEspectador.setModel(tablaEspectador);
    }
    
    public void DatosFunciones(String nick) {
        DefaultTableModel tablaFunciones = new DefaultTableModel();
        String[] datosFuncion = new String[1];
        tablaFunciones.addColumn("Nombre");
       //tablaFunciones.addColumn("fecha");
        //tablaFunciones.addColumn("fecha creada");
        int i;
        ArrayList<Funciones> ListaF;
        ListaF = this.ICUF.ListaFuncionesEspectador(nick);//trae mal la array
        for (i = 0; i < ListaF.size(); i++) {
            //datosEspectaculo[0] = ListaE.get(i).getArtistaOrganizador().toString();
            datosFuncion[0] =ListaF.get(i).getNombre().toString();
            //datosFuncion[1] = ListaF.get(i)
            //datosFuncion[2] = ListaF.get(i)
            
            tablaFunciones.addRow(datosFuncion);
        }
        TablaFuncion.setModel(tablaFunciones);
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
        TablaEspectador = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaFuncion = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
<<<<<<< HEAD
        setTitle("Datos espectador");
=======
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7

        TablaEspectador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablaEspectador);

        TablaFuncion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaFuncion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaFuncionMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaFuncion);

        jLabel1.setText("Funciones");

        jLabel2.setText("Espectador");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel2)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TablaFuncionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaFuncionMouseClicked
        int fila = TablaFuncion.getSelectedRow();
        String nombre = (String) TablaFuncion.getValueAt(fila,0);//selecciono de la fila seleccionada la primera

        consultaFuncion newFrame = new consultaFuncion(nombre);
        newFrame.setVisible(true);
    }//GEN-LAST:event_TablaFuncionMouseClicked

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
            java.util.logging.Logger.getLogger(TablaEspectador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaEspectador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaEspectador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaEspectador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TablaEspectador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaEspectador;
    private javax.swing.JTable TablaFuncion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
