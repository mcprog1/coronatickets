/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
<<<<<<< HEAD
=======

import Clases.Categoria;
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
import Clases.Espectaculo;
import Clases.Paquetes;
import Persistencia.ConexionDB;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
<<<<<<< HEAD
=======
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
/**
 *
 * @author Nico
 */
public class EspectaculoServicio {
<<<<<<< HEAD
    
    private Connection conn = new ConexionDB().getConexion();

    /*public EspectaculoServicio() {

    }*/
=======

    private Connection conn = new ConexionDB().getConexion();

    public EspectaculoServicio() {

    }

>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
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
<<<<<<< HEAD
    
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
    public String DtFechaToStringSql(Clases.DtFecha f)
    {
        return f.getAnio()+"-"+f.getMes()+"-"+f.getDia();
    }
    
     public Date dtFechaToDate(Clases.DtFecha fecha){
         
        Date fechaFinal = Date.valueOf(DtFechaToStringSql(fecha));
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
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        

        return false;
    }
        
    public boolean validarPaquetes(String nombre) {
        boolean v = true;
        try {
            PreparedStatement status = conn.prepareStatement("SELECT * FROM paquetes WHERE paq_nombre= ?");
            status.setString(1, nombre);
            
            ResultSet ResultadoConsulta = status.executeQuery();
            
            System.err.println(ResultadoConsulta.next());
            
            if (ResultadoConsulta.next()){
                v =  false;
            } 
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return v; // No existe el usuario
    }
    
=======

    //Crear paquetes
    public Clases.DtFecha dateToDTFecha(Date fecha) {
        if (fecha != null) {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String fechaDB = dateFormat.format(fecha);
            String[] partes = fechaDB.split("-");
            return new Clases.DtFecha(partes[2], partes[1], partes[0]);
        } else {
            return new Clases.DtFecha("0", "0", "0");
        }
    }

    public String DtFechaToString(Clases.DtFecha f) {
        return f.getAnio() + "-" + f.getMes() + "-" + f.getDia();
    }

    public Date dtFechaToDate(Clases.DtFecha fecha) {

        Date fechaFinal = Date.valueOf(DtFechaToString(fecha));
        return fechaFinal;
    }

    public boolean addPaquetes(Paquetes p) throws SQLException {

        try {
            PreparedStatement result = conn.prepareStatement("INSERT INTO paquetes (paq_nombre ,paq_descripcion ,paq_fecha_inicio, paq_fecha_fin, paq_descuento, paq_imagen) VALUE (?,?,?,?,?,?)");

            result.setString(1, p.getNombre());
            result.setString(2, p.getDescripcion());
            result.setString(3, DtFechaToString(p.getFechaInicio()));
            result.setString(4, DtFechaToString(p.getFechafinalizado()));
            result.setFloat(5, p.getDescuento());
            result.setString(6, p.getImagen());
            
            result.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public boolean validarPaquetes(String nombre) {
        try {
            PreparedStatement status = conn.prepareStatement("SELECT * FROM paquetes WHERE paq_nombre= ?");
            status.setString(1, nombre);
            ResultSet ResultadoConsulta = status.executeQuery();
            if (ResultadoConsulta.next()) {
                return false;
            } else {
                return true;// existe el usuario
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return true; // No existe el usuario
        }
    }

>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
    public boolean checkEspectaculo(String nombre) {
        try {
            PreparedStatement status = conn.prepareStatement("SELECT * FROM espetaculos WHERE esp_nombre=?");
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
=======
        }
        return false;
    }

    public boolean crearActualizarEspetaculo(String nombre, String plataforma, String artista, String descripcion, int duracion, int espMax, int espMin, String url, float costo, List categorias, String imagen) {
        boolean existe = this.checkEspectaculo(nombre);
        try {
            if (!existe) {
                PreparedStatement status = conn.prepareStatement("INSERT INTO espetaculos "
                        + "(esp_nombre, "
                        + "esp_plat_nombre, "
                        + "esp_art_organizador, "
                        + "esp_descripcion, "
                        + "esp_duracion, "
                        + "esp_espectadores_max, "
                        + "esp_espectadores_min, "
                        + "esp_url_asociada, "
                        + "esp_costo, "
                        + "esp_imagen) "
                        + "VALUES (?,?,?,?,?,?,?,?,?,?)");
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
<<<<<<< HEAD
                status.execute();
            }else{
                PreparedStatement status = conn.prepareStatement("UPDATE espetaculos "
                                                                   + "SET esp_plat_nombre = ?, esp_art_organizador = ?,esp_descripcion = ?, esp_duracion = ?,esp_espectadores_max = ?, esp_espectadores_min = ?, esp_url_asociada = ?,esp_costo = ?"
                                                                   + "WHERE esp_nombre = ?");
                
=======
                status.setString(10, imagen);
                status.execute();

                for (int i = 0; i < categorias.size(); i++) {

                    String idCategoria = idCategoria(categorias.get(i).toString());
                    System.out.println(idCategoria);
                    status = conn.prepareStatement("INSERT INTO categorias_espectaculo"
                            + "(esp_nombre,"
                            + "cat_id)"
                            + "VALUES (?,?)");
                    status.setString(1, nombre);
                    status.setString(2, idCategoria);
                    status.execute();
                }
            } else {
                PreparedStatement status = conn.prepareStatement("UPDATE espetaculos "
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
<<<<<<< HEAD
            }
            
                return true;
=======

                for (int i = 0; i < categorias.size(); i++) {

                    String idCategoria = idCategoria(categorias.get(i).toString());

                    status = conn.prepareStatement("UPDATE categorias_espectaculo SET esp_nombre = '" + nombre + "', cat_id = '" + idCategoria + "' WHERE esp_nombre = '" + nombre + "'");
                    status.execute();
                }
            }

            return true;
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false; // No existe la plataforma
        }
<<<<<<< HEAD
        
    }
    
    
    public ArrayList<Espectaculo> datosLista(){
=======

    }

    private String idCategoria(String nombre) {

        String idCategoria = "";

        try {
            PreparedStatement status = conn.prepareStatement("SELECT cat_id FROM categorias WHERE cat_nombre= ?");
            status.setString(1, nombre);

            ResultSet ResultadoConsulta = status.executeQuery();

            if (ResultadoConsulta.next()) {
                idCategoria = ResultadoConsulta.getString("cat_id");
            }

        } catch (SQLException ex) {
            Logger.getLogger(EspectaculoServicio.class.getName()).log(Level.SEVERE, null, ex);
        }

        return idCategoria;
    }

    public ArrayList<Espectaculo> datosLista() {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
        Espectaculo model;
        ArrayList<Espectaculo> datos = new ArrayList<>();
        ResultSet rs;
        PreparedStatement ps;
<<<<<<< HEAD
        try{
            ps = conn.prepareStatement("SELECT * FROM espetaculos");
            rs = ps.executeQuery();
            while(rs.next())
            {
=======
        try {
            ps = conn.prepareStatement("SELECT * FROM espetaculos");
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
<<<<<<< HEAD
                
=======

>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
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
            ps = conn.prepareStatement("SELECT * FROM espetaculos WHERE esp_plat_nombre = ?");
            ps.setString(1, plataforma);
            rs = ps.executeQuery();
            while(rs.next())
            {
=======
        try {
            ps = conn.prepareStatement("SELECT * FROM espetaculos WHERE esp_plat_nombre = ?");
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
<<<<<<< HEAD
                
=======

>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
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
            ps = conn.prepareStatement("SELECT * FROM espetaculos WHERE esp_nombre = ?");
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
            ps = conn.prepareStatement("SELECT * FROM espetaculos WHERE esp_nombre = ?");
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
<<<<<<< HEAD
                
            }
            rs.close();
            ps.close();
        }catch (SQLException ex) {
=======

            }
            rs.close();
            ps.close();
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
            ps = conn.prepareStatement("SELECT * FROM espetaculos WHERE esp_plat_nombre = ? AND NOT EXISTS(SELECT 1 FROM  paquete_espetaculo WHERE paqesp_paq_nombre = ? AND  paqesp_esp_nombre = esp_nombre)");
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
<<<<<<< HEAD
                
                datos.add(model);
            }
            rs.close();
            ps.close();
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return datos;
    }
 
    public ArrayList<Espectaculo> obtenerEspectaculos(String soloPendientes){
        Espectaculo model;
        ArrayList<Espectaculo> datos = new ArrayList<>();
        ResultSet rs;
        PreparedStatement ps;
        try{
            String subWhere = " != UPPER(?)";
            if(soloPendientes == "S")//Si manda eso entonces tragio solo los pendientes
            {
                subWhere = "= UPPER(?)";
            }
            ps = conn.prepareStatement("SELECT * FROM espetaculos WHERE UPPER(esp_estado) "+subWhere);
            ps.setString(1, "p");
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
    
    public boolean actualizarEstadoEspectaculo(String nombre, String estado)
    {
         try {
            PreparedStatement status = conn.prepareStatement("UPDATE espetaculos "
                                                               + "SET esp_estado = ?"
                                                               + "WHERE esp_nombre = ?");

            status.setString(1, estado);
            status.setString(2, nombre);
            status.execute();
                return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false; // No existe la plataforma
        }
    }
    
    public ArrayList<Espectaculo> obtenerEspectaculosEstado(String estado){
        Espectaculo model;
        ArrayList<Espectaculo> datos = new ArrayList<>();
        ResultSet rs;
        PreparedStatement ps;
        try{
            String subWhere = " WHERE esp_estado = UPPER(?)";
            if(estado == "")//Si manda vacio es que trae todos los espectaculos sin importar el 
            {
                subWhere = "";
            }
            ps = conn.prepareStatement("SELECT * FROM espetaculos "+subWhere);
            if(estado != "")//Si manda vacio es que trae todos los espectaculos sin importar el 
            {
                ps.setString(1, estado);
            }
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
                model.setEstado(rs.getString("esp_estado"));
                datos.add(model);
            }
            rs.close();
            ps.close();
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return datos;
    }
    
=======

                datos.add(model);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return datos;
    }

    public ArrayList<Categoria> Categorias() {

        ArrayList<Categoria> datos = new ArrayList<>();

        try {

            PreparedStatement consulta = conn.prepareStatement("SELECT * FROM categorias where cat_vigente = 's'");
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

    public void nuevoEspectaculo(String nombre, String plataforma, String artista, String descripcion, String duracion, String espMax, String espMin, String url, String costo, ArrayList<String> categorias, String imagen) {

        try {
            PreparedStatement status = conn.prepareStatement("INSERT INTO espetaculos "
                    + "(esp_nombre, "
                    + "esp_plat_nombre, "
                    + "esp_art_organizador, "
                    + "esp_descripcion, "
                    + "esp_duracion, "
                    + "esp_espectadores_max, "
                    + "esp_espectadores_min, "
                    + "esp_url_asociada, "
                    + "esp_imagen, "
                    + "esp_costo) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?)");
            status.setString(1, nombre);
            status.setString(2, plataforma);
            status.setString(3, artista);
            status.setString(4, descripcion);
            status.setString(5, duracion);
            status.setString(6, espMax);
            status.setString(7, espMin);
            status.setString(8, url);
            status.setString(9, imagen);
            status.setString(10, costo);
            status.execute();

            for (int i = 0; i < categorias.size(); i++) {

                PreparedStatement consulta = conn.prepareStatement("SELECT cat_id FROM categorias where cat_nombre = '" + categorias.get(i) + "'");
                ResultSet resultadoConsulta = consulta.executeQuery();

                int idCategoria = 0;

                while (resultadoConsulta.next()) {
                    idCategoria = resultadoConsulta.getInt("cat_id");
                }

                status = conn.prepareStatement("INSERT INTO categorias_espectaculo (esp_nombre, cat_id) VALUES (?,?)");
                status.setString(1, nombre);
                status.setInt(2, idCategoria);
                status.execute();
            }
        } catch (SQLException ex) {
            Logger.getLogger(EspectaculoServicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String espectaculos(String paquete, String plataforma) {

        String espectaculos = "";

        try {
            PreparedStatement consulta = conn.prepareStatement("SELECT esp_nombre FROM espetaculos WHERE esp_plat_nombre = ? AND esp_estado = 'a' AND NOT EXISTS(SELECT 1 FROM  paquete_espetaculo WHERE paqesp_paq_nombre = ? AND  paqesp_esp_nombre = esp_nombre)");
            consulta.setString(1, plataforma);
            consulta.setString(2, paquete);
            ResultSet resultadoConsulta = consulta.executeQuery();

            while (resultadoConsulta.next()) {
                espectaculos = espectaculos + "-" + resultadoConsulta.getString("esp_nombre");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return espectaculos;
    }

    public String Espectaculo(String nombre) {

        String espectaculo = "";

        try {
            PreparedStatement consulta = conn.prepareStatement("SELECT * FROM espetaculos WHERE esp_nombre = ?");
            consulta.setString(1, nombre);
            ResultSet resultadoConsulta = consulta.executeQuery();

            if (resultadoConsulta.next()) {
                espectaculo = resultadoConsulta.getString("esp_nombre") + ".." + resultadoConsulta.getString("esp_plat_nombre") + ".." + resultadoConsulta.getString("esp_art_organizador") + ".." + resultadoConsulta.getString("esp_descripcion") + ".." + resultadoConsulta.getString("esp_duracion") + ".." + resultadoConsulta.getString("esp_espectadores_max") + ".." + resultadoConsulta.getString("esp_espectadores_min") + ".." + resultadoConsulta.getString("esp_url_asociada") + ".." + resultadoConsulta.getString("esp_costo") + ".." + resultadoConsulta.getString("esp_fecha_creado") + ".." + resultadoConsulta.getString("esp_imagen");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return espectaculo;
    }

    public String funcionesEspectaculo(String nombre) {

        String funcionesEspectaculo = "";

        try {
            PreparedStatement consulta = conn.prepareStatement("SELECT espfun_fun_nombre from espetaculo_funcion where espfun_esp_nombre = ?");
            consulta.setString(1, nombre);
            ResultSet resultadoConsulta = consulta.executeQuery();

            while (resultadoConsulta.next()) {
                funcionesEspectaculo = funcionesEspectaculo + "-" + resultadoConsulta.getString("espfun_fun_nombre");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return funcionesEspectaculo;
    }

    public String paquetesEspectaculo(String nombre) {

        String paquetesEspectaculo = "";

        try {
            PreparedStatement consulta = conn.prepareStatement("SELECT paqesp_paq_nombre from paquete_espetaculo where paqesp_esp_nombre = ?");
            consulta.setString(1, nombre);
            ResultSet resultadoConsulta = consulta.executeQuery();

            while (resultadoConsulta.next()) {
                paquetesEspectaculo = paquetesEspectaculo + "-" + resultadoConsulta.getString("paqesp_paq_nombre");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return paquetesEspectaculo;
    }

    public String categoriasEspectaculo(String nombre) {

        String categoriasEspectaculo = "";

        try {
            PreparedStatement consulta = conn.prepareStatement("SELECT cat_nombre FROM categorias_espectaculo AS CE, categorias AS C where C.cat_id = CE.cat_id and esp_nombre = ?");
            consulta.setString(1, nombre);
            ResultSet resultadoConsulta = consulta.executeQuery();

            while (resultadoConsulta.next()) {
                categoriasEspectaculo = categoriasEspectaculo + "-" + resultadoConsulta.getString("cat_nombre");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return categoriasEspectaculo;
    }

    public String espectaculosPaquete(String paquete) {

        String espectaculos = "";

        try {
            PreparedStatement consulta = conn.prepareStatement("SELECT paqesp_esp_nombre FROM paquete_espetaculo WHERE paqesp_paq_nombre = ?");
            consulta.setString(1, paquete);
            ResultSet resultadoConsulta = consulta.executeQuery();

            while (resultadoConsulta.next()) {
                espectaculos = espectaculos + "-" + resultadoConsulta.getString("paqesp_esp_nombre");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return espectaculos;
    }

    public String espectaculosPlataforma(String plataforma) {

        String espectaculos = "";

        try {
            PreparedStatement consulta = conn.prepareStatement("SELECT esp_nombre FROM espetaculos WHERE esp_plat_nombre = ?");
            consulta.setString(1, plataforma);
            ResultSet resultadoConsulta = consulta.executeQuery();

            while (resultadoConsulta.next()) {
                espectaculos = espectaculos + "-" + resultadoConsulta.getString("esp_nombre");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return espectaculos;
    }

    public String espectaculosCategoria(String categoria) {

        String espectaculos = "";

        try {
            PreparedStatement consulta = conn.prepareStatement("SELECT esp_nombre FROM categorias_espectaculo AS CE, categorias AS C WHERE C.cat_id = CE.cat_id and C.cat_nombre = ?");
            consulta.setString(1, categoria);
            ResultSet resultadoConsulta = consulta.executeQuery();

            while (resultadoConsulta.next()) {
                espectaculos = espectaculos + "-" + resultadoConsulta.getString("esp_nombre");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return espectaculos;
    }

    public String Categorias2() {

        String categorias = "";

        try {

            PreparedStatement consulta = conn.prepareStatement("SELECT cat_nombre FROM categorias where cat_vigente = 's'");
            ResultSet resultadoConsulta = consulta.executeQuery();

            while (resultadoConsulta.next()) {
                categorias = categorias + "-" + resultadoConsulta.getString("cat_nombre");
            }

        } catch (SQLException ex) {
            Logger.getLogger(PlataformaServicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return categorias;
    }
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
}
