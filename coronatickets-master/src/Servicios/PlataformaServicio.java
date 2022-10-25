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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nico
 */
public class PlataformaServicio {

    private Connection conexion = new ConexionDB().getConexion();

    public boolean checkPlataforma(String nombre) {
        try {
            PreparedStatement status = conexion.prepareStatement("SELECT * FROM plataforma WHERE plat_nombre=?");
            status.setString(1, nombre);
            ResultSet rs = status.executeQuery();
            if (rs.next()) {
                return true;
            }// existe la plataforma
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false; // No existe la plataforma
        }
        return false;
    }

    public boolean crearPlataforma(String nombre, String desc, String url) {
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

    public ArrayList<Plataformas> datosList() {
        
        ArrayList<Plataformas> plat = new ArrayList<>();
        
        try {

            PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM plataforma");
            ResultSet resultadoConsulta = consulta.executeQuery();

            while (resultadoConsulta.next()) {
                Plataformas plataforma = new Plataformas();
                plataforma.setNombre(resultadoConsulta.getString("plat_nombre"));
                plataforma.setDescripcion(resultadoConsulta.getString("plat_descripcion"));
                plataforma.setURL(resultadoConsulta.getString("plat_url"));
                plat.add(plataforma);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PlataformaServicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return plat;
    }
    
      public String Plataformas() {
        
       String plataformas = "";
        
        try {

            PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM plataforma");
            ResultSet resultadoConsulta = consulta.executeQuery();

            while (resultadoConsulta.next()) {
                plataformas = plataformas + "-" + resultadoConsulta.getString("plat_nombre");
            }

        } catch (SQLException ex) {
            Logger.getLogger(PlataformaServicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return plataformas;
    }
}
