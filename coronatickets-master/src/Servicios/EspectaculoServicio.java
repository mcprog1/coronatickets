/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import Clases.Espectaculo;
import Clases.Paquetes;
import Persistencia.ConexionDB;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
/**
 *
 * @author Nico
 */
public class EspectaculoServicio {
    
    private Connection conn = new ConexionDB().getConexion();

    public EspectaculoServicio() {

    }
    //Consulto los Espetaculos de un Artista con "NomArtista" , este arista puede tener 1 o mas espetaculos
    //Esta funcion tendria que estar en servicios espetaculos
    public ArrayList<Espectaculo> consultarOrganizadorEspetaculo(String NomArtista) {
        Espectaculo es;
        ArrayList<Espectaculo> organizador = new ArrayList<>();
        try {
            PreparedStatement consulta = conn.prepareStatement("SELECT * FROM espetaculos  WHERE esp_art_organizador = ?");
            consulta.setString(1, NomArtista);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                es = new Espectaculo();//para que sean registros nuevos 
                es.setNombre(resultado.getString("esp_nombre"));
                es.setDescripcion(resultado.getString("esp_descripcion"));
                es.setCosto(resultado.getInt("esp_costo"));
                es.setArtistaOrganizador(resultado.getString("esp_art_organizador"));
                es.setURL(resultado.getString("esp_url_asociada"));
                es.setCapacidadMaxima(resultado.getInt("esp_espectadores_max"));
                es.setCapacidadMinima(resultado.getInt("esp_espectadores_min"));

                organizador.add(es);
            }

            return organizador;
        } catch (SQLException e) {
            System.out.println("Error al buscar Espetaculos");
        }
        return organizador;
    }
    
    //Crear paquetes
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
    
    public String DtFechaToString(Clases.DtFecha f)
    {
        return f.getDia()+"/"+f.getMes()+"/"+f.getAnio();
    }
     public Date dtFechaToDate(Clases.DtFecha fecha){
         
        Date fechaFinal = Date.valueOf(DtFechaToString(fecha));
        return fechaFinal;
    }
     
    
    public boolean addPaquetes(Paquetes p) throws SQLException{
      
        try {
            PreparedStatement result = conn.prepareStatement("INSERT INTO paquetes (paq_nombre ,paq_descripcion ,paq_fecha_inicio, paq_fecha_fin, paq_descuento,paq_fecha_creado ) VALUE (?,?,?,?,?,?)");
            
            result.setString(1, p.getNombre());
            result.setString(2, p.getDescripcion());
            result.setDate(3,dtFechaToDate(p.getFechaInicio()));
            result.setDate(4, dtFechaToDate(p.getFechafinalizado()));
            result.setFloat(5, p.getDescuento());
            result.setString(6,p.getFechaCreada());
   
            result.execute();
            return true;
        } catch (Exception e) {
            System.out.println("Ocurrio un error al crear un paquete");
        }
        

        return false;
    }
        
    public boolean validarPaquetes(String nombre) {
        try {
            PreparedStatement status = conn.prepareStatement("SELECT * FROM paquetes WHERE paq_nombre= ?");
            status.setString(1, nombre);
            ResultSet ResultadoConsulta = status.executeQuery();
            if (ResultadoConsulta.first()) {
                return true;
            } else {
                return false;// existe el usuario
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false; // No existe el usuario
        }
    }
    
    public boolean checkEspectaculo(String nombre) {
        try {
            PreparedStatement status = conn.prepareStatement("SELECT * FROM espetaculos WHERE esp_nombre=?");
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
                PreparedStatement status = conn.prepareStatement("INSERT INTO espetaculos "
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
                PreparedStatement status = conn.prepareStatement("UPDATE espetaculos "
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
    
    
    public ArrayList<Espectaculo> datosLista(){
        Espectaculo model;
        ArrayList<Espectaculo> datos = new ArrayList<>();
        ResultSet rs;
        PreparedStatement ps;
        try{
            ps = conn.prepareStatement("SELECT * FROM espetaculos");
            rs = ps.executeQuery();
            while(rs.next())
            {
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
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return datos;
    }
    
    public ArrayList<Espectaculo> datosListaPlataforma(String plataforma){
        Espectaculo model;
        ArrayList<Espectaculo> datos = new ArrayList<>();
        ResultSet rs;
        PreparedStatement ps;
        try{
            ps = conn.prepareStatement("SELECT * FROM espetaculos WHERE esp_plat_nombre = ?");
            ps.setString(1, plataforma);
            rs = ps.executeQuery();
            while(rs.next())
            {
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
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return datos;
    }
    
    public Espectaculo obtenerDato(String nombre)
    {
        Espectaculo esp = new Espectaculo();
        ResultSet rs;
        PreparedStatement ps;
        try{
            ps = conn.prepareStatement("SELECT * FROM espetaculos WHERE esp_nombre = ?");
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
    
    
    public ArrayList<Espectaculo> espectaculosLibresPaquete(String paquete,String plataforma){
        Espectaculo model;
        ArrayList<Espectaculo> datos = new ArrayList<>();
        ResultSet rs;
        PreparedStatement ps;
        try{
            ps = conn.prepareStatement("SELECT * FROM espetaculos WHERE esp_plat_nombre = ? AND NOT EXISTS(SELECT 1 FROM  paquete_espetaculo WHERE paqesp_paq_nombre = ? AND  paqesp_esp_nombre = esp_nombre)");
            ps.setString(1, plataforma);
            ps.setString(2, paquete);
            rs = ps.executeQuery();
            while(rs.next())
            {
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
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return datos;
    }
    
}
