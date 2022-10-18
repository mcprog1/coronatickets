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
    
    public DtFecha dateToDTFecha(Date fecha){
        if(fecha != null){
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String fechaDB = dateFormat.format(fecha);
            String[] partes = fechaDB.split("-");
            return new DtFecha(partes[2],partes[1],partes[0]);
        }
        else{
            return new DtFecha("0","0","0");
        }
    }
    
    public ArrayList<Paquetes> obtenerPaquetesEspectaculo(String nombre){
        Paquetes model;
        ArrayList<Paquetes> datos = new ArrayList<>();
        ResultSet rs;
        PreparedStatement ps;
        try{
            ps = conexion.prepareStatement("SELECT * FROM  paquete_espetaculo WHERE paqesp_esp_nombre = ?");
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            while(rs.next())
            {
                model = new Paquetes();
                model.setNombre(rs.getString("paqesp_paq_nombre"));
                datos.add(model);
            }
            rs.close();
            ps.close();
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return datos;
    }
    
    public ArrayList<Paquetes>obtenerPaquetes()
    {
         Paquetes model;
        ArrayList<Paquetes> datos = new ArrayList<>();
        ResultSet rs;
        PreparedStatement ps;
        try{
            ps = conexion.prepareStatement("SELECT * FROM  paquetes");
            rs = ps.executeQuery();
            while(rs.next())
            {
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
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return datos;
    }
    
    public Paquetes obtenerDatos(String nombre)
    {
        Paquetes model = new Paquetes();
        ResultSet rs;
        PreparedStatement ps;
        try{
            ps = conexion.prepareStatement("SELECT * FROM  paquetes WHERE paq_nombre = ?");
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            while(rs.next())
            {
                model.setNombre(rs.getString("paq_nombre"));
                model.setDescripcion(rs.getString("paq_descripcion"));
                model.setDescuento(rs.getFloat("paq_descuento"));
                model.setFechaInicio(dateToDTFecha(rs.getDate("paq_fecha_inicio")));
                model.setFechafinalizado(dateToDTFecha(rs.getDate("paq_fecha_fin")));
            }
            rs.close();
            ps.close();
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return model;
    }
    
    
    public ArrayList<Espectaculo> obtenerEspectaculoPaquetes(String nombre){
        Espectaculo model;
        ArrayList<Espectaculo> datos = new ArrayList<>();
        ResultSet rs;
        PreparedStatement ps;
        try{
            ps = conexion.prepareStatement("SELECT * FROM  paquete_espetaculo WHERE paqesp_paq_nombre = ?");
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            while(rs.next())
            {
                model = new Espectaculo();
                model.setNombre(rs.getString("paqesp_esp_nombre"));
                datos.add(model);
            }
            rs.close();
            ps.close();
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return datos;
    }
    
    public void agregarPaqueteEspectaculo(String espectaculo, String paquete)
    {
        try { // Creo la plataforma - Probando el GitIgnore jeje 
            PreparedStatement status = conexion.prepareStatement("INSERT INTO paquete_espetaculo (paqesp_esp_nombre, paqesp_paq_nombre) VALUES (?,?)");
            status.setString(1, espectaculo);
            status.setString(2, paquete);
            status.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
