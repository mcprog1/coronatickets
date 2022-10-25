/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Clases.*;
import Clases.DtFecha;
import Persistencia.ConexionDB;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Nico
 */
public class PaquetesServicio {

    private Connection conexion = new ConexionDB().getConexion();

    public DtFecha dateToDTFecha(Date fecha) {
        if (fecha != null) {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String fechaDB = dateFormat.format(fecha);
            String[] partes = fechaDB.split("-");
            return new DtFecha(partes[2], partes[1], partes[0]);
        } else {
            return new DtFecha("0", "0", "0");
        }
    }

    public ArrayList<Paquetes> obtenerPaquetesEspectaculo(String nombre) {
        Paquetes model;
        ArrayList<Paquetes> datos = new ArrayList<>();
        ResultSet rs;
        PreparedStatement ps;
        try {
            ps = conexion.prepareStatement("SELECT * FROM  paquete_espetaculo WHERE paqesp_esp_nombre = ?");
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            while (rs.next()) {
                model = new Paquetes();
                model.setNombre(rs.getString("paqesp_paq_nombre"));
                datos.add(model);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return datos;
    }

    public ArrayList<Paquetes> obtenerPaquetes() {
        Paquetes model;
        ArrayList<Paquetes> datos = new ArrayList<>();
        ResultSet rs;
        PreparedStatement ps;
        try {
            ps = conexion.prepareStatement("SELECT * FROM  paquetes");
            rs = ps.executeQuery();
            while (rs.next()) {
                model = new Paquetes();
                model.setNombre(rs.getString("paq_nombre"));
                model.setDescripcion(rs.getString("paq_descripcion"));
                model.setDescuento(rs.getFloat("paq_descuento"));
                model.setFechaInicio(dateToDTFecha(rs.getDate("paq_fecha_inicio")));
                model.setFechafinalizado(dateToDTFecha(rs.getDate("paq_fecha_fin")));
                datos.add(model);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return datos;
    }

    public Paquetes obtenerDatos(String nombre) {
        Paquetes model = new Paquetes();
        ResultSet rs;
        PreparedStatement ps;
        try {
            ps = conexion.prepareStatement("SELECT * FROM  paquetes WHERE paq_nombre = ?");
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            while (rs.next()) {
                model.setNombre(rs.getString("paq_nombre"));
                model.setDescripcion(rs.getString("paq_descripcion"));
                model.setDescuento(rs.getFloat("paq_descuento"));
                model.setFechaInicio(dateToDTFecha(rs.getDate("paq_fecha_inicio")));
                model.setFechafinalizado(dateToDTFecha(rs.getDate("paq_fecha_fin")));
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return model;
    }

    public ArrayList<Espectaculo> obtenerEspectaculoPaquetes(String nombre) {
        Espectaculo model;
        ArrayList<Espectaculo> datos = new ArrayList<>();
        ResultSet rs;
        PreparedStatement ps;
        try {
            ps = conexion.prepareStatement("SELECT * FROM  paquete_espetaculo WHERE paqesp_paq_nombre = ?");
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            while (rs.next()) {
                model = new Espectaculo();
                model.setNombre(rs.getString("paqesp_esp_nombre"));
                datos.add(model);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return datos;
    }

    public void agregarPaqueteEspectaculo(String espectaculo, String paquete) {
        try { // Creo la plataforma - Probando el GitIgnore jeje 
            PreparedStatement status = conexion.prepareStatement("INSERT INTO paquete_espetaculo (paqesp_esp_nombre, paqesp_paq_nombre) VALUES (?,?)");
            status.setString(1, espectaculo);
            status.setString(2, paquete);
            status.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public String obtenerPaquete(String nombre) {

        String infoPaquete = "";

        try {
            PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM paquetes WHERE paq_nombre ='" + nombre + "'");
            ResultSet resultadoConsulta = consulta.executeQuery();

            while (resultadoConsulta.next()) {

                infoPaquete = resultadoConsulta.getString("paq_nombre") + "..";
                infoPaquete = infoPaquete + resultadoConsulta.getString("paq_descripcion") + "..";
                infoPaquete = infoPaquete + resultadoConsulta.getDate("paq_fecha_inicio").toString() + "..";
                infoPaquete = infoPaquete + resultadoConsulta.getDate("paq_fecha_fin").toString() + "..";
                infoPaquete = infoPaquete + resultadoConsulta.getString("paq_descuento") + "..";
                infoPaquete = infoPaquete + resultadoConsulta.getString("paq_imagen");

            }

        } catch (SQLException e) {
        }

        return infoPaquete;
    }

    public void altaPaquete(String nombre, String Descripcion, String FechaInicio, String Fechafinalizado, String Descuento, String imagen) {
        try {
            PreparedStatement status = conexion.prepareStatement("INSERT INTO paquetes (paq_nombre, paq_descripcion, paq_fecha_inicio, paq_fecha_fin, paq_descuento, paq_imagen) VALUES (?,?,?,?,?,?)");
            status.setString(1, nombre);
            status.setString(2, Descripcion);
            status.setString(3, FechaInicio);
            status.setString(4, Fechafinalizado);
            status.setString(5, Descuento);
            status.setString(6, imagen);

            status.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void actualizarPaquete(String nombre, String Descripcion, String FechaInicio, String Fechafinalizado, String Descuento, String imagen) {
        try {
            PreparedStatement status = conexion.prepareStatement("UPDATE paquetes SET paq_nombre = ?, paq_descripcion = ?, paq_fecha_inicio = ?, paq_fecha_fin = ?, paq_descuento = ?, paq_imagen = ? WHERE paq_nombre = ?");
            status.setString(1, nombre);
            status.setString(2, Descripcion);
            status.setString(3, FechaInicio);
            status.setString(4, Fechafinalizado);
            status.setString(5, Descuento);
            status.setString(6, imagen);
            status.setString(7, nombre);

            status.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public String categoriasPaquete(String nombre) {

        String categoriasPaquete = "";

        try {
            PreparedStatement consulta = conexion.prepareStatement("SELECT DISTINCT cat_nombre FROM categorias as C, categorias_espectaculo as CE, paquete_espetaculo as PE where C.cat_id = CE.cat_id and CE.esp_nombre = ANY (SELECT PE.paqesp_esp_nombre WHERE paqesp_paq_nombre ='" + nombre + "')");
            ResultSet resultadoConsulta = consulta.executeQuery();

            while (resultadoConsulta.next()) {

                categoriasPaquete = categoriasPaquete + resultadoConsulta.getString("cat_nombre") + "-";
            }

        } catch (SQLException e) {
        }

        return categoriasPaquete;
        
    }

}
