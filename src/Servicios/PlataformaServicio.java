/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import Clases.Plataformas;
import Persistencia.ConexionDB;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Nico
 */
public class PlataformaServicio {
    
    
    private Connection conexion = new ConexionDB().getConexion();
    
    public boolean checkPlataforma(String nombre){
        try {
            PreparedStatement status = conexion.prepareStatement("SELECT * FROM plataforma WHERE plat_nombre=?");
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
    
    public boolean crearPlataforma(String nombre, String desc, String url)
    {
        try { // Creo la plataforma - Probando el GitIgnore jeje 
            PreparedStatement status = conexion.prepareStatement("INSERT INTO plataforma (plat_nombre, plat_descripcion , plat_url) VALUES (?,?,?)");
            status.setString(1, nombre);
            status.setString(2, desc);
            status.setString(3, url);
            status.execute();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    public ArrayList<Plataformas> datosList(){
        Plataformas model;
        ArrayList<Plataformas> plat = new ArrayList<>();
        ResultSet rs;
        PreparedStatement ps;
        try{
            ps = conexion.prepareStatement("SELECT * FROM plataforma");
            rs = ps.executeQuery();
            while(rs.next())
            {
                model = new Plataformas();
                model.setNombre(rs.getString("plat_nombre"));
                model.setDescripcion(rs.getString("plat_descripcion"));
                model.setURL(rs.getString("plat_url"));
                plat.add(model);
            }
            rs.close();
            ps.close();
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return plat;
    }
    
}
