/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coronatickets.espetaculos;

import Clases.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import logica.Fabrica;
import logica.interfaz.*;
import Interface.IControladorFuncion;
import coronatickets.funciones.consultaFuncion;
import coronatickets.paquetes.datosPaquetes;
<<<<<<< HEAD
=======

>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
/**
 *
 * @author Nico
 */
public class consultaEspetaculo extends javax.swing.JFrame {

    private IControladorEspetaculo ICE;
    private IControladorPaquetes ICP;
    private IControladorFuncion ICF;
<<<<<<< HEAD
=======

>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
    /**
     * Creates new form consultaEspetaculo
     */
    public consultaEspetaculo() {
        this.ICE = Fabrica.getInstance().getIControladorEspectaculo();
        this.ICP = Fabrica.getInstance().getIControladorPaquete();
        this.ICF = Fabrica.getInstance().getIControladorFuncion();
        initComponents();
        cargarComboBox();
    }
<<<<<<< HEAD
    public void cargarComboBox(){
        ArrayList<Plataformas> datos;
        sctPlat.addItem("Seleccione una opcion"); 
        datos = ICE.tblPlataforma();
        for(int i = 0; i<datos.size(); i++)
        {
            sctPlat.addItem(datos.get(i).getNombre());
        }
    }
    public void cargarTabla(String plataforma)
    {
=======

    public void cargarComboBox() {
        ArrayList<Plataformas> datos;
        sctPlat.addItem("Seleccione una opcion");
        datos = ICE.tblPlataforma();
        for (int i = 0; i < datos.size(); i++) {
            sctPlat.addItem(datos.get(i).getNombre());
        }
    }

    public void cargarTabla(String plataforma) {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
        DefaultTableModel table = new DefaultTableModel();
        ArrayList<Espectaculo> datos;
        String[] filas = new String[5];
        table.addColumn("Nombre");
        table.addColumn("Artista");
        table.addColumn("Plataforma");
        table.addColumn("URL");
        table.addColumn("Costo");
        datos = ICE.tblEspectaculoPlataforma(plataforma);
<<<<<<< HEAD
        for(int i = 0; i<datos.size(); i++)
        {
=======
        for (int i = 0; i < datos.size(); i++) {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
            filas[0] = datos.get(i).getNombre().toString();
            filas[1] = datos.get(i).getDescripcion().toString();
            filas[2] = datos.get(i).getPLataforma();
            filas[3] = datos.get(i).getURL().toString();
            filas[4] = String.valueOf(datos.get(i).getCosto());
            table.addRow(filas);
        }
        tablaEspetaculos.setModel(table);
<<<<<<< HEAD
        
       
        
        
    }
    
    public void datosEspectaculo(String nombre)
    {
=======
    }

    public void datosEspectaculo(String nombre) {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
        Espectaculo esp = ICE.obtenerDato(nombre);
        this.nombre.setText(esp.getNombre());
        this.artista.setText(esp.getArtistaOrganizador());
        this.descripcion.setText(esp.getDescripcion());
        this.max.setText(String.valueOf(esp.getCapacidadMaxima()));
        this.min.setText(String.valueOf(esp.getCapacidadMinima()));
        this.duracion.setText(String.valueOf(esp.getDuracion()));
        this.url.setText(esp.getURL());
        this.costo.setText(String.valueOf(esp.getCosto()));
<<<<<<< HEAD
        
        //this.fecha.setText(esp.getFechaCreado().toString());
        
         /** Cargo los paquetes */
=======

        //this.fecha.setText(esp.getFechaCreado().toString());
        /* Cargo los paquetes */
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
        DefaultTableModel tableP = new DefaultTableModel();
        ArrayList<Paquetes> datosP;
        String[] filasP = new String[1];
        tableP.addColumn("Nombre");
<<<<<<< HEAD
        datosP = ICP.obtenerPaquetesEspectaculos(nombre);
        for(int i = 0; i<datosP.size(); i++)
        {
=======

        datosP = ICP.obtenerPaquetesEspectaculos(nombre);
        for (int i = 0; i < datosP.size(); i++) {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
            filasP[0] = datosP.get(i).getNombre().toString();
            tableP.addRow(filasP);
        }
        paquetes.setModel(tableP);
<<<<<<< HEAD
        
=======

>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
        /* Cargo las funciones */
        DefaultTableModel tableF = new DefaultTableModel();
        ArrayList<Funciones> datosF;
        String[] filasF = new String[1];
        tableF.addColumn("Nombre");
<<<<<<< HEAD
        
        datosF = ICF.ListarFuncionesEspectaculo(esp.getNombre());
        for(int i = 0; i<datosF.size(); i++)
        {
=======

        datosF = ICF.ListarFuncionesEspectaculo(esp.getNombre());
        for (int i = 0; i < datosF.size(); i++) {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
            filasF[0] = datosF.get(i).getNombre().toString();
            tableF.addRow(filasF);
        }
        funciones.setModel(tableF);
<<<<<<< HEAD
    }
=======

        /* Cargo las categorias */
        DefaultTableModel tableC = new DefaultTableModel();
        String datosC;
        String[] filasC = new String[1];
        tableC.addColumn("Nombre");
        datosC = ICE.categoriasEspectaculo(nombre);

        String[] data = datosC.split("-");

        for (String data1 : data) {
            if (!data1.equals("")) {
                filasC[0] = data1;
                tableC.addRow(filasC);
            }
        }
        categorias.setModel(tableC);
    }

>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
<<<<<<< HEAD
=======
        jLabel1 = new javax.swing.JLabel();
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
        jLabel2 = new javax.swing.JLabel();
        sctPlat = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEspetaculos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        artista = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        max = new javax.swing.JTextField();
        min = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        duracion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        costo = new javax.swing.JTextField();
        url = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        funciones = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
<<<<<<< HEAD
        paquetes = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
=======
        categorias = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        paquetes = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
<<<<<<< HEAD
        setTitle("Consulta de espectaculo");
=======

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Consulta espectaculo");
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7

        jLabel2.setText("Plataforma:");

        sctPlat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sctPlatItemStateChanged(evt);
            }
        });
        sctPlat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sctPlatActionPerformed(evt);
            }
        });
        sctPlat.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                sctPlatPropertyChange(evt);
            }
        });

        tablaEspetaculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaEspetaculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEspetaculosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEspetaculos);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Informaci??n espectaculo:");

<<<<<<< HEAD
        jLabel4.setText("Nombre:");
=======
        jLabel4.setText("Nombre");
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7

        nombre.setEditable(false);

        jLabel5.setText("Artista");

        artista.setEditable(false);

        jLabel6.setText("Maximo");

        max.setEditable(false);

        min.setEditable(false);

        jLabel7.setText("Minimo");

        duracion.setEditable(false);

        jLabel8.setText("Duracion");

        jLabel9.setText("Descripcion");

        descripcion.setEditable(false);
        descripcion.setColumns(20);
        descripcion.setRows(5);
        jScrollPane2.setViewportView(descripcion);

        jLabel10.setText("Costo");

        costo.setEditable(false);
        costo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costoActionPerformed(evt);
            }
        });

        url.setEditable(false);
        url.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urlActionPerformed(evt);
            }
        });

<<<<<<< HEAD
        jLabel11.setText("Url:");
=======
        jLabel11.setText("Url");
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7

        funciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        funciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                funcionesMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(funciones);

<<<<<<< HEAD
=======
        categorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(categorias);

        jLabel12.setText("Funciones asociadas");

        jLabel13.setText("Categorias asociadas");

>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
        paquetes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        paquetes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paquetesMouseClicked(evt);
            }
        });
<<<<<<< HEAD
        jScrollPane5.setViewportView(paquetes);

        jLabel12.setText("Funciones asociadas:");

        jLabel13.setText("Paquetes asociados");
=======
        jScrollPane6.setViewportView(paquetes);

        jLabel14.setText("Paquetes asociados");
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
<<<<<<< HEAD
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(artista, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(duracion, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(max, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jScrollPane2))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(costo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(30, 30, 30)
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(url, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
=======
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(9, 9, 9)
                                .addComponent(sctPlat, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(32, 32, 32)
                                        .addComponent(url))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(max))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(min)
                                            .addComponent(artista, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(duracion, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                            .addComponent(costo)))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
                                    .addComponent(jLabel13)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sctPlat, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(280, 280, 280)
                        .addComponent(jLabel3)))
                .addContainerGap(21, Short.MAX_VALUE))
=======
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(244, 244, 244)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
<<<<<<< HEAD
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(sctPlat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(artista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
=======
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(artista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(duracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(sctPlat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(max, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
<<<<<<< HEAD
                            .addComponent(jLabel8)
                            .addComponent(duracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(url, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
=======
                            .addComponent(jLabel10)
                            .addComponent(costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(url, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
                .addContainerGap())
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void costoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costoActionPerformed

    private void urlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_urlActionPerformed

    private void tablaEspetaculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEspetaculosMouseClicked
        int fila = tablaEspetaculos.getSelectedRow();
<<<<<<< HEAD
        String nombre = (String) tablaEspetaculos.getValueAt(fila,0);//selecciono de la fila seleccionada la primera
=======
        String nombre = (String) tablaEspetaculos.getValueAt(fila, 0);//selecciono de la fila seleccionada la primera
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7

        datosEspectaculo(nombre);
    }//GEN-LAST:event_tablaEspetaculosMouseClicked

    private void sctPlatPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_sctPlatPropertyChange
<<<<<<< HEAD
        
    }//GEN-LAST:event_sctPlatPropertyChange

    private void sctPlatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sctPlatItemStateChanged
        
=======

    }//GEN-LAST:event_sctPlatPropertyChange

    private void sctPlatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sctPlatItemStateChanged

>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
    }//GEN-LAST:event_sctPlatItemStateChanged

    private void sctPlatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sctPlatActionPerformed
        String plataforma = (String) sctPlat.getSelectedItem();
<<<<<<< HEAD
        if(plataforma != "Seleccione una opcion")
        {
=======
        if (plataforma != "Seleccione una opcion") {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
            cargarTabla(plataforma);
        }
        System.err.println(plataforma);
    }//GEN-LAST:event_sctPlatActionPerformed

    private void funcionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_funcionesMouseClicked
        int fila = funciones.getSelectedRow();
<<<<<<< HEAD
        String nombre = (String) funciones.getValueAt(fila,0);//selecciono de la fila seleccionada la primera
=======
        String nombre = (String) funciones.getValueAt(fila, 0);//selecciono de la fila seleccionada la primera
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7

        consultaFuncion newFrame = new consultaFuncion(nombre);
        newFrame.setVisible(true);
    }//GEN-LAST:event_funcionesMouseClicked

    private void paquetesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paquetesMouseClicked
<<<<<<< HEAD
       int fila = paquetes.getSelectedRow();
       String nombre = (String) paquetes.getValueAt(fila,0);//selecciono de la fila seleccionada la primera

       datosPaquetes newFrame = new datosPaquetes(nombre);
       newFrame.setVisible(true);
    }//GEN-LAST:event_paquetesMouseClicked

    
    
=======
        int fila = paquetes.getSelectedRow();
        String nombre = (String) paquetes.getValueAt(fila, 0);//selecciono de la fila seleccionada la primera

        datosPaquetes newFrame = new datosPaquetes(nombre);
        newFrame.setVisible(true);
    }//GEN-LAST:event_paquetesMouseClicked

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
            java.util.logging.Logger.getLogger(consultaEspetaculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consultaEspetaculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consultaEspetaculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consultaEspetaculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new consultaEspetaculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField artista;
<<<<<<< HEAD
=======
    private javax.swing.JTable categorias;
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
    private javax.swing.JTextField costo;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JTextField duracion;
    private javax.swing.JTable funciones;
<<<<<<< HEAD
=======
    private javax.swing.JLabel jLabel1;
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
<<<<<<< HEAD
=======
    private javax.swing.JLabel jLabel14;
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
<<<<<<< HEAD
=======
    private javax.swing.JScrollPane jScrollPane6;
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField max;
    private javax.swing.JTextField min;
    private javax.swing.JTextField nombre;
    private javax.swing.JTable paquetes;
    private javax.swing.JComboBox<String> sctPlat;
    private javax.swing.JTable tablaEspetaculos;
    private javax.swing.JTextField url;
    // End of variables declaration//GEN-END:variables
}
