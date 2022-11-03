/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
<<<<<<< HEAD
=======

>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
import Clases.*;
import Persistencia.ConexionDB;
import java.sql.*;
import java.util.ArrayList;
<<<<<<< HEAD
=======
import java.util.logging.Level;
import java.util.logging.Logger;

>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
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
<<<<<<< HEAD
            if (rs.next()){
=======
            if (rs.next()) {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
                return true;
            }// existe la plataforma
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false; // No existe la plataforma
<<<<<<< HEAD
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
=======
        }        
        return false;
    }
    
    public boolean crearActualizarEspetaculo(String nombre, String plataforma, String artista, String descripcion, int duracion, int espMax, int espMin, String url, float costo) {
        boolean existe = this.checkEspectaculo(nombre);
        try {
            if (!existe) {
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
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
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
<<<<<<< HEAD
            }else{
                PreparedStatement status = conexion.prepareStatement("UPDATE espetaculos "
                                                                   + "SET esp_plat_nombre = ?, esp_art_organizador = ?,esp_descripcion = ?, esp_duracion = ?,esp_espectadores_max = ?, esp_espectadores_min = ?, esp_url_asociada = ?,esp_costo = ?"
                                                                   + "WHERE esp_nombre = ?");
=======
            } else {
                PreparedStatement status = conexion.prepareStatement("UPDATE espetaculos "
                        + "SET esp_plat_nombre = ?, esp_art_organizador = ?,esp_descripcion = ?, esp_duracion = ?,esp_espectadores_max = ?, esp_espectadores_min = ?, esp_url_asociada = ?,esp_costo = ?"
                        + "WHERE esp_nombre = ?");
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
                
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
            
<<<<<<< HEAD
                return true;
=======
            return true;
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false; // No existe la plataforma
        }
        
    }
    
<<<<<<< HEAD
    
    public ArrayList<Espectaculo> datosLista(){
=======
    public ArrayList<Espectaculo> datosLista() {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
        Espectaculo model;
        ArrayList<Espectaculo> datos = new ArrayList<>();
        ResultSet rs;
        PreparedStatement ps;
<<<<<<< HEAD
        try{
            ps = conexion.prepareStatement("SELECT * FROM espetaculos");
            rs = ps.executeQuery();
            while(rs.next())
            {
=======
        try {
            ps = conexion.prepareStatement("SELECT * FROM espetaculos");
            rs = ps.executeQuery();
            while (rs.next()) {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
                model = new Espectaculo();
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
<<<<<<< HEAD
        }catch (SQLException ex) {
=======
        } catch (SQLException ex) {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
            ex.printStackTrace();
        }
        return datos;
    }
    
<<<<<<< HEAD
    public ArrayList<Espectaculo> datosListaPlataforma(String plataforma){
=======
    public ArrayList<Espectaculo> datosListaPlataforma(String plataforma) {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
        Espectaculo model;
        ArrayList<Espectaculo> datos = new ArrayList<>();
        ResultSet rs;
        PreparedStatement ps;
<<<<<<< HEAD
        try{
            ps = conexion.prepareStatement("SELECT * FROM espetaculos WHERE esp_plat_nombre = ?");
            ps.setString(1, plataforma);
            rs = ps.executeQuery();
            while(rs.next())
            {
=======
        try {
            ps = conexion.prepareStatement("SELECT * FROM espetaculos WHERE esp_plat_nombre = ?");
            ps.setString(1, plataforma);
            rs = ps.executeQuery();
            while (rs.next()) {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
                model = new Espectaculo();
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
<<<<<<< HEAD
        }catch (SQLException ex) {
=======
        } catch (SQLException ex) {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
            ex.printStackTrace();
        }
        return datos;
    }
    
<<<<<<< HEAD
    public Espectaculo obtenerDato(String nombre)
    {
        Espectaculo esp = new Espectaculo();
        ResultSet rs;
        PreparedStatement ps;
        try{
            ps = conexion.prepareStatement("SELECT * FROM espetaculos WHERE esp_nombre = ?");
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            while(rs.next())
            {
=======
    public Espectaculo obtenerDato(String nombre) {
        Espectaculo esp = new Espectaculo();
        ResultSet rs;
        PreparedStatement ps;
        try {
            ps = conexion.prepareStatement("SELECT * FROM espetaculos WHERE esp_nombre = ?");
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            while (rs.next()) {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
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
<<<<<<< HEAD
        }catch (SQLException ex) {
=======
        } catch (SQLException ex) {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
            ex.printStackTrace();
        }
        return esp;
    }
    
<<<<<<< HEAD
    
    public ArrayList<Espectaculo> espectaculosLibresPaquete(String paquete,String plataforma){
=======
    public ArrayList<Espectaculo> espectaculosLibresPaquete(String paquete, String plataforma) {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
        Espectaculo model;
        ArrayList<Espectaculo> datos = new ArrayList<>();
        ResultSet rs;
        PreparedStatement ps;
<<<<<<< HEAD
        try{
=======
        try {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
            ps = conexion.prepareStatement("SELECT * FROM espetaculos WHERE esp_plat_nombre = ? AND NOT EXISTS(SELECT 1 FROM  paquete_espetaculo WHERE paqesp_paq_nombre = ? AND  paqesp_esp_nombre = esp_nombre)");
            ps.setString(1, plataforma);
            ps.setString(2, paquete);
            rs = ps.executeQuery();
<<<<<<< HEAD
            while(rs.next())
            {
=======
            while (rs.next()) {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
                model = new Espectaculo();
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
<<<<<<< HEAD
        }catch (SQLException ex) {
=======
        } catch (SQLException ex) {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
            ex.printStackTrace();
        }
        return datos;
    }
    
<<<<<<< HEAD
=======
    public ArrayList<Categoria> Categorias() {
        
        ArrayList<Categoria> datos = new ArrayList<>();
        
        try {
            
            PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM categorias");
            ResultSet resultadoConsulta = consulta.executeQuery();
            
            while (resultadoConsulta.next()) {
                Categoria categoria = new Categoria();
                categoria.setId(resultadoConsulta.getInt("cat_id"));
                categoria.setNombre(resultadoConsulta.getString("cat_nombre"));
                categoria.setVigente(resultadoConsulta.getString("cat_vigente").charAt(0));
                datos.add(categoria);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(PlataformaServicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datos;
    }
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
}
