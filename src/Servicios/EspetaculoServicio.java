/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import Clases.*;
import Persistencia.ConexionDB;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author Nico
 */
public class EspetaculoServicio {
    
    private Connection conexion = new ConexionDB().getConexion();
    
    public boolean checkEspectaculo(String nombre) {
        try {
            PreparedStatement status = conexion.prepareStatement("SELECT * FROM espetaculos WHERE esp_nombre=?");
            status.setString(1, nombre);
            ResultSet rs = status.executeQuery();
            if (rs.next()){
                return true;
            }// existe la plataforma
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false; // No existe la plataforma
        }   
        return false;
    }
    
    public boolean crearActualizarEspetaculo(String nombre, String plataforma, String artista, String descripcion, int duracion, int espMax, int espMin, String url, float costo){
        boolean existe = this.checkEspectaculo(nombre);
        try {
            if(!existe)
            {
                PreparedStatement status = conexion.prepareStatement("INSERT INTO espetaculos "
                                                                        + "(esp_nombre, "
                                                                         + "esp_plat_nombre, "
                                                                         + "esp_art_organizador, "
                                                                         + "esp_descripcion, "
                                                                         + "esp_duracion, "
                                                                         + "esp_espectadores_max, "
                                                                         + "esp_espectadores_min, "
                                                                         + "esp_url_asociada, "
                                                                         + "esp_costo) "
                                                                        + "VALUES (?,?,?,?,?,?,?,?,?)");
                status.setString(1, nombre);
                status.setString(2, plataforma);
                status.setString(3, artista);
                status.setString(4, descripcion);
                status.setInt(5, duracion);
                status.setInt(6, espMax);
                status.setInt(7, espMin);
                status.setString(8, url);
                status.setFloat(9, costo);
                status.execute();
            }else{
                PreparedStatement status = conexion.prepareStatement("UPDATE espetaculos "
                                                                   + "SET esp_plat_nombre = ?, esp_art_organizador = ?,esp_descripcion = ?, esp_duracion = ?,esp_espectadores_max = ?, esp_espectadores_min = ?, esp_url_asociada = ?,esp_costo = ?"
                                                                   + "WHERE esp_nombre = ?");
                
                status.setString(1, plataforma);
                status.setString(2, artista);
                status.setString(3, descripcion);
                status.setInt(4, duracion);
                status.setInt(5, espMax);
                status.setInt(6, espMin);
                status.setString(7, url);
                status.setFloat(8, costo);
                status.setString(9, nombre);
                status.execute();
            }
            
                return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false; // No existe la plataforma
        }
        
    }
    
    
    public ArrayList<Espetaculo> datosLista(){
        Espetaculo model;
        ArrayList<Espetaculo> datos = new ArrayList<>();
        ResultSet rs;
        PreparedStatement ps;
        try{
            ps = conexion.prepareStatement("SELECT * FROM espetaculos");
            rs = ps.executeQuery();
            while(rs.next())
            {
                model = new Espetaculo();
                model.setNombre(rs.getString("esp_nombre"));
                model.setPLataforma(rs.getString("esp_plat_nombre"));
                model.setArtistaOrganizador(rs.getString("esp_art_organizador"));
                model.setDescripcion(rs.getString("esp_descripcion"));
                model.setDuracion(rs.getInt("esp_duracion"));
                model.setCapacidadMaxima(rs.getInt("esp_espectadores_max"));
                model.setCapacidadMinima(rs.getInt("esp_espectadores_min"));
                model.setURL(rs.getString("esp_url_asociada"));
                model.setCosto(rs.getFloat("esp_costo"));
                model.setFechaCreado(rs.getTimestamp("esp_fecha_creado"));
                
                datos.add(model);
            }
            rs.close();
            ps.close();
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return datos;
    }
    
    public ArrayList<Espetaculo> datosListaPlataforma(String plataforma){
        Espetaculo model;
        ArrayList<Espetaculo> datos = new ArrayList<>();
        ResultSet rs;
        PreparedStatement ps;
        try{
            ps = conexion.prepareStatement("SELECT * FROM espetaculos WHERE esp_plat_nombre = ?");
            ps.setString(1, plataforma);
            rs = ps.executeQuery();
            while(rs.next())
            {
                model = new Espetaculo();
                model.setNombre(rs.getString("esp_nombre"));
                model.setPLataforma(rs.getString("esp_plat_nombre"));
                model.setArtistaOrganizador(rs.getString("esp_art_organizador"));
                model.setDescripcion(rs.getString("esp_descripcion"));
                model.setDuracion(rs.getInt("esp_duracion"));
                model.setCapacidadMaxima(rs.getInt("esp_espectadores_max"));
                model.setCapacidadMinima(rs.getInt("esp_espectadores_min"));
                model.setURL(rs.getString("esp_url_asociada"));
                model.setCosto(rs.getFloat("esp_costo"));
                model.setFechaCreado(rs.getTimestamp("esp_fecha_creado"));
                
                datos.add(model);
            }
            rs.close();
            ps.close();
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return datos;
    }
    
    public Espetaculo obtenerDato(String nombre)
    {
        Espetaculo esp = new Espetaculo();
        ResultSet rs;
        PreparedStatement ps;
        try{
            ps = conexion.prepareStatement("SELECT * FROM espetaculos WHERE esp_nombre = ?");
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            while(rs.next())
            {
                esp.setNombre(rs.getString("esp_nombre"));
                esp.setPLataforma(rs.getString("esp_plat_nombre"));
                esp.setArtistaOrganizador(rs.getString("esp_art_organizador"));
                esp.setDescripcion(rs.getString("esp_descripcion"));
                esp.setDuracion(rs.getInt("esp_duracion"));
                esp.setCapacidadMaxima(rs.getInt("esp_espectadores_max"));
                esp.setCapacidadMinima(rs.getInt("esp_espectadores_min"));
                esp.setURL(rs.getString("esp_url_asociada"));
                esp.setCosto(rs.getFloat("esp_costo"));
                esp.setFechaCreado(rs.getTimestamp("esp_fecha_creado"));
                
            }
            rs.close();
            ps.close();
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return esp;
    }
    
    
    public ArrayList<Espetaculo> espectaculosLibresPaquete(String paquete,String plataforma){
        Espetaculo model;
        ArrayList<Espetaculo> datos = new ArrayList<>();
        ResultSet rs;
        PreparedStatement ps;
        try{
            ps = conexion.prepareStatement("SELECT * FROM espetaculos WHERE esp_plat_nombre = ? AND NOT EXISTS(SELECT 1 FROM  paquete_espetaculo WHERE paqesp_paq_nombre = ? AND  paqesp_esp_nombre = esp_nombre)");
            ps.setString(1, plataforma);
            ps.setString(2, paquete);
            rs = ps.executeQuery();
            while(rs.next())
            {
                model = new Espetaculo();
                model.setNombre(rs.getString("esp_nombre"));
                model.setPLataforma(rs.getString("esp_plat_nombre"));
                model.setArtistaOrganizador(rs.getString("esp_art_organizador"));
                model.setDescripcion(rs.getString("esp_descripcion"));
                model.setDuracion(rs.getInt("esp_duracion"));
                model.setCapacidadMaxima(rs.getInt("esp_espectadores_max"));
                model.setCapacidadMinima(rs.getInt("esp_espectadores_min"));
                model.setURL(rs.getString("esp_url_asociada"));
                model.setCosto(rs.getFloat("esp_costo"));
                model.setFechaCreado(rs.getTimestamp("esp_fecha_creado"));
                
                datos.add(model);
            }
            rs.close();
            ps.close();
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return datos;
    }
    
}
