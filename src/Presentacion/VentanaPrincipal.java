/**
 *
 * @author Cristian
 */
package Presentacion;

import logica.interfaz.IControladorUsuario;
import Presentacion.CU6.SeleccionarPlataformaCU6;
import Presentacion.CU7.SeleccionarPlataformaCU7;
import Presentacion.CU8.SeleccionarPlataformaCU8;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import logica.Fabrica;

public class VentanaPrincipal extends javax.swing.JFrame {

    private final IControladorUsuario ICU;

    public VentanaPrincipal() {
        initComponents();
        this.ICU = Fabrica.getInstance().getIControladorUsuario();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("CoronaTickets");
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FrameAltaEspectador = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        txtNickname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        btnAceptarAltaEspectador = new javax.swing.JButton();
        btnCancelarAltaEspectador = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtIdentificador = new javax.swing.JTextField();
        FrameConsultaU = new javax.swing.JFrame();
        FrameEditarU = new javax.swing.JFrame();
        FrameAltaArtista = new javax.swing.JFrame();
        txtMail1 = new javax.swing.JTextField();
        txtFecha1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtClave1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtNickname1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        txtApellido1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jMenuBar2 = new javax.swing.JMenuBar();
        Inicio = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        Registros = new javax.swing.JMenu();
        RegistroEspectador = new javax.swing.JMenuItem();
        RegistroArtista = new javax.swing.JMenuItem();
        RegistroPlataforma = new javax.swing.JMenuItem();
        RegistroEspetaculo = new javax.swing.JMenuItem();
        RegistrosPaquetes = new javax.swing.JMenuItem();
        RegistroFuncion = new javax.swing.JMenuItem();
        Modificar = new javax.swing.JMenu();
        EditarEspectador = new javax.swing.JMenuItem();
        EditarArtista = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        Consular = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        FrameAltaEspectador.setMinimumSize(new java.awt.Dimension(500, 500));

        jLabel1.setText("Nickname");

        txtNickname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNicknameActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

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

        txtClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaveActionPerformed(evt);
            }
        });

        btnAceptarAltaEspectador.setText("Aceptar");
        btnAceptarAltaEspectador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarAltaEspectadorActionPerformed(evt);
            }
        });

        btnCancelarAltaEspectador.setText("Cancelar");

        jLabel16.setText("identificador");

        javax.swing.GroupLayout FrameAltaEspectadorLayout = new javax.swing.GroupLayout(FrameAltaEspectador.getContentPane());
        FrameAltaEspectador.getContentPane().setLayout(FrameAltaEspectadorLayout);
        FrameAltaEspectadorLayout.setHorizontalGroup(
            FrameAltaEspectadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameAltaEspectadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FrameAltaEspectadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameAltaEspectadorLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(FrameAltaEspectadorLayout.createSequentialGroup()
                        .addGroup(FrameAltaEspectadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FrameAltaEspectadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(FrameAltaEspectadorLayout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(22, 22, 22)
                                    .addComponent(txtClave))
                                .addGroup(FrameAltaEspectadorLayout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtNickname))
                                .addGroup(FrameAltaEspectadorLayout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(FrameAltaEspectadorLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(FrameAltaEspectadorLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtFecha))
                                .addGroup(FrameAltaEspectadorLayout.createSequentialGroup()
                                    .addComponent(btnAceptarAltaEspectador)
                                    .addGap(30, 30, 30)
                                    .addComponent(btnCancelarAltaEspectador)))
                            .addGroup(FrameAltaEspectadorLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(29, 29, 29)
                                .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        FrameAltaEspectadorLayout.setVerticalGroup(
            FrameAltaEspectadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameAltaEspectadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FrameAltaEspectadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameAltaEspectadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FrameAltaEspectadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FrameAltaEspectadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameAltaEspectadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameAltaEspectadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FrameAltaEspectadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(FrameAltaEspectadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarAltaEspectador)
                    .addComponent(btnCancelarAltaEspectador))
                .addContainerGap())
        );

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

        FrameAltaArtista.setMinimumSize(new java.awt.Dimension(500, 500));

        jLabel9.setText("Clave");

        txtClave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClave1ActionPerformed(evt);
            }
        });

        jButton3.setText("Aceptar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Cancelar");

        jLabel6.setText("Nickname");

        txtNickname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNickname1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Nombre");

        jLabel10.setText("Apellido");

        jLabel11.setText("Mail");

        jLabel12.setText("Fecha");

        txtNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre1ActionPerformed(evt);
            }
        });

        jLabel13.setText("Descripcion");

        jLabel14.setText("Biografia");

        jLabel15.setText("URL");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FrameAltaArtistaLayout = new javax.swing.GroupLayout(FrameAltaArtista.getContentPane());
        FrameAltaArtista.getContentPane().setLayout(FrameAltaArtistaLayout);
        FrameAltaArtistaLayout.setHorizontalGroup(
            FrameAltaArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameAltaArtistaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FrameAltaArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(FrameAltaArtistaLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNickname1))
                    .addGroup(FrameAltaArtistaLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombre1))
                    .addGroup(FrameAltaArtistaLayout.createSequentialGroup()
                        .addGroup(FrameAltaArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(FrameAltaArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtApellido1, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(txtClave1)))
                    .addGroup(FrameAltaArtistaLayout.createSequentialGroup()
                        .addGroup(FrameAltaArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(26, 26, 26)
                        .addGroup(FrameAltaArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMail1)
                            .addComponent(txtFecha1)))
                    .addGroup(FrameAltaArtistaLayout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(30, 30, 30)
                        .addComponent(jButton4))
                    .addGroup(FrameAltaArtistaLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1))
                    .addGroup(FrameAltaArtistaLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FrameAltaArtistaLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(27, 27, 27)
                        .addComponent(jTextField3)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        FrameAltaArtistaLayout.setVerticalGroup(
            FrameAltaArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameAltaArtistaLayout.createSequentialGroup()
                .addGroup(FrameAltaArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameAltaArtistaLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(txtNickname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameAltaArtistaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addGroup(FrameAltaArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FrameAltaArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(FrameAltaArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtClave1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FrameAltaArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtMail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FrameAltaArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FrameAltaArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FrameAltaArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameAltaArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(FrameAltaArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));

        Inicio.setText("Inscripciones");

        jMenuItem8.setText("Paquetes");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        Inicio.add(jMenuItem8);

        jMenuItem9.setText("Espetaculos");
        Inicio.add(jMenuItem9);

        jMenuItem10.setText("Funciones");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        Inicio.add(jMenuItem10);

        jMenuBar2.add(Inicio);

        Registros.setText("Registros");

        RegistroEspectador.setText("Registrar Espectador");
        RegistroEspectador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroEspectadorActionPerformed(evt);
            }
        });
        Registros.add(RegistroEspectador);

        RegistroArtista.setText("Registrar Artista");
        RegistroArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroArtistaActionPerformed(evt);
            }
        });
        Registros.add(RegistroArtista);

        RegistroPlataforma.setText("Registrar Plataforma");
        Registros.add(RegistroPlataforma);

        RegistroEspetaculo.setText("Registrar Espetaculo");
        Registros.add(RegistroEspetaculo);

        RegistrosPaquetes.setText("Registrar Paquetes");
        Registros.add(RegistrosPaquetes);

        RegistroFuncion.setText("Registrar Función");
        RegistroFuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroFuncionActionPerformed(evt);
            }
        });
        Registros.add(RegistroFuncion);

        jMenuBar2.add(Registros);

        Modificar.setText("Modificar");

        EditarEspectador.setText("Editar Espectador");
        EditarEspectador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarEspectadorActionPerformed(evt);
            }
        });
        Modificar.add(EditarEspectador);

        EditarArtista.setText("Editar Artista");
        Modificar.add(EditarArtista);

        jMenuItem2.setText("Editar Plataforma");
        Modificar.add(jMenuItem2);

        jMenuItem3.setText("Editar Espetaculo");
        Modificar.add(jMenuItem3);

        jMenuItem4.setText("Editar Paquetes");
        Modificar.add(jMenuItem4);

        jMenuBar2.add(Modificar);

        Consular.setText("Consultar");

        jMenuItem1.setText("Espetaculos disponibles");
        Consular.add(jMenuItem1);

        jMenuItem5.setText("Plataformas");
        Consular.add(jMenuItem5);

        jMenuItem6.setText("Funciones disponibles");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        Consular.add(jMenuItem6);

        jMenuItem7.setText("Paquetes disponibles");
        Consular.add(jMenuItem7);

        jMenuBar2.add(Consular);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 319, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaveActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNicknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNicknameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNicknameActionPerformed

    private void btnAceptarAltaEspectadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarAltaEspectadorActionPerformed

    }//GEN-LAST:event_btnAceptarAltaEspectadorActionPerformed

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
    
    private void RegistroEspectadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroEspectadorActionPerformed
        FrameAltaEspectador.setVisible(true);
        FrameAltaEspectador.setLocationRelativeTo(this);
        FrameAltaEspectador.setTitle("Registrar Espectador");


    }//GEN-LAST:event_RegistroEspectadorActionPerformed

    private void EditarEspectadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarEspectadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditarEspectadorActionPerformed

    private void RegistroArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroArtistaActionPerformed
        FrameAltaArtista.setVisible(true);
        FrameAltaArtista.setLocationRelativeTo(this);
        FrameAltaArtista.setTitle("Registrar Artista");

    }//GEN-LAST:event_RegistroArtistaActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        SeleccionarPlataformaCU8 newframe = new SeleccionarPlataformaCU8();
        newframe.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void txtClave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClave1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClave1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtNickname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNickname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNickname1ActionPerformed

    private void txtNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void txtMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMailActionPerformed

    private void RegistroFuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroFuncionActionPerformed
        SeleccionarPlataformaCU6 newframe = new SeleccionarPlataformaCU6();
        newframe.setVisible(true);
    }//GEN-LAST:event_RegistroFuncionActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        SeleccionarPlataformaCU7 newframe = new SeleccionarPlataformaCU7();
        newframe.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Consular;
    private javax.swing.JMenuItem EditarArtista;
    private javax.swing.JMenuItem EditarEspectador;
    private javax.swing.JFrame FrameAltaArtista;
    private javax.swing.JFrame FrameAltaEspectador;
    private javax.swing.JFrame FrameConsultaU;
    private javax.swing.JFrame FrameEditarU;
    private javax.swing.JMenu Inicio;
    private javax.swing.JMenu Modificar;
    private javax.swing.JMenuItem RegistroArtista;
    private javax.swing.JMenuItem RegistroEspectador;
    private javax.swing.JMenuItem RegistroEspetaculo;
    private javax.swing.JMenuItem RegistroFuncion;
    private javax.swing.JMenuItem RegistroPlataforma;
    private javax.swing.JMenu Registros;
    private javax.swing.JMenuItem RegistrosPaquetes;
    private javax.swing.JButton btnAceptarAltaEspectador;
    private javax.swing.JButton btnCancelarAltaEspectador;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtClave1;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtFecha1;
    private javax.swing.JTextField txtIdentificador;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtMail1;
    private javax.swing.JTextField txtNickname;
    private javax.swing.JTextField txtNickname1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre1;
    // End of variables declaration//GEN-END:variables
}
