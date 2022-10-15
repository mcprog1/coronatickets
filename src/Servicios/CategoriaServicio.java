    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Persistencia.ConexionDB;
import java.sql.Connection;
import java.util.ArrayList;
import Clases.Categorias;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Nico
 */
public class CategoriaServicio {
    
    private Connection conexion = new ConexionDB().getConexion();
    
    
    public ArrayList<Categorias> datosList(){
        Categorias model;
        ArrayList<Categorias> cat = new ArrayList<>();
        ResultSet rs;
        PreparedStatement ps;
        try{
            ps = conexion.prepareStatement("SELECT * FROM categorias WHERE cat_vigente = ? ");
            ps.setString(1, "S");
            rs = ps.executeQuery();
            while(rs.next())
            {
                model = new Categorias();
                model.setId(rs.getInt("cat_id"));
                model.setNombre(rs.getString("cat_nombre"));
                cat.add(model);
            }
            rs.close();
            ps.close();
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return cat;
    }
    
   public String crearCategoria(String nombre)
   {
      String status = "E";
        ResultSet rs;
        PreparedStatement ps;
        try{
            if(!existeCategoria(nombre))
            {
                ps = conexion.prepareStatement("INSERT INTO categorias(cat_nombre, cat_vigente) VALUES(?,?)");
                ps.setString(1, nombre);            
                ps.setString(2, "S");
                ps.execute();
                status = "S";
            }else{
                status = "A";
            }
            
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return status;
   }
    
   public String actualizarCategoria(String nombreAnterior, String nombreNuevo)
   {
       String estado = "E";
        PreparedStatement ps;
        try{
            ps = conexion.prepareStatement("UPDATE categorias SET cat_nombre = ? WHERE cat_nombre = ? AND cat_vigente = ?");
            ps.setString(1, nombreNuevo);            
            ps.setString(2, nombreAnterior);
            ps.setString(3, "S");
            if(ps.execute())
            {
               estado = "S";
            }  
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
       return estado;
   }
   
    public boolean existeCategoria(String nombre)
    {
        boolean existe = false;
        ResultSet rs;
        PreparedStatement ps;
        try{
            ps = conexion.prepareStatement("SELECT * FROM categorias WHERE cat_nombre = ? AND cat_vigente = ? ");
            ps.setString(1, nombre);            
            ps.setString(2, "S");
            rs = ps.executeQuery();
            if(rs.next())
            {
               existe = true; 
            }  
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return existe;
    }
   
}
