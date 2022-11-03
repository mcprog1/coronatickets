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
<<<<<<< HEAD
    
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
=======

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
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
        Paquetes model;
        ArrayList<Paquetes> datos = new ArrayList<>();
        ResultSet rs;
        PreparedStatement ps;
<<<<<<< HEAD
        try{
            ps = conexion.prepareStatement("SELECT * FROM  paquete_espetaculo WHERE paqesp_esp_nombre = ?");
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            while(rs.next())
            {
=======
        try {
            ps = conexion.prepareStatement("SELECT * FROM  paquete_espetaculo WHERE paqesp_esp_nombre = ?");
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            while (rs.next()) {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
                model = new Paquetes();
                model.setNombre(rs.getString("paqesp_paq_nombre"));
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
=======

    public ArrayList<Paquetes> obtenerPaquetes() {
        Paquetes model;
        ArrayList<Paquetes> datos = new ArrayList<>();
        ResultSet rs;
        PreparedStatement ps;
        try {
            ps = conexion.prepareStatement("SELECT * FROM  paquetes");
            rs = ps.executeQuery();
            while (rs.next()) {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
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
=======

    public Paquetes obtenerDatos(String nombre) {
        Paquetes model = new Paquetes();
        ResultSet rs;
        PreparedStatement ps;
        try {
            ps = conexion.prepareStatement("SELECT * FROM  paquetes WHERE paq_nombre = ?");
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            while (rs.next()) {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
                model.setNombre(rs.getString("paq_nombre"));
                model.setDescripcion(rs.getString("paq_descripcion"));
                model.setDescuento(rs.getFloat("paq_descuento"));
                model.setFechaInicio(dateToDTFecha(rs.getDate("paq_fecha_inicio")));
                model.setFechafinalizado(dateToDTFecha(rs.getDate("paq_fecha_fin")));
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
        return model;
    }
<<<<<<< HEAD
    
    
    public ArrayList<Espectaculo> obtenerEspectaculoPaquetes(String nombre){
=======

    public ArrayList<Espectaculo> obtenerEspectaculoPaquetes(String nombre) {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
        Espectaculo model;
        ArrayList<Espectaculo> datos = new ArrayList<>();
        ResultSet rs;
        PreparedStatement ps;
<<<<<<< HEAD
        try{
            ps = conexion.prepareStatement("SELECT * FROM  paquete_espetaculo WHERE paqesp_paq_nombre = ?");
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            while(rs.next())
            {
=======
        try {
            ps = conexion.prepareStatement("SELECT * FROM  paquete_espetaculo WHERE paqesp_paq_nombre = ?");
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            while (rs.next()) {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
                model = new Espectaculo();
                model.setNombre(rs.getString("paqesp_esp_nombre"));
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
    
    public void agregarPaqueteEspectaculo(String espectaculo, String paquete)
    {
=======

    public void agregarPaqueteEspectaculo(String espectaculo, String paquete) {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
        try { // Creo la plataforma - Probando el GitIgnore jeje 
            PreparedStatement status = conexion.prepareStatement("INSERT INTO paquete_espetaculo (paqesp_esp_nombre, paqesp_paq_nombre) VALUES (?,?)");
            status.setString(1, espectaculo);
            status.setString(2, paquete);
            status.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
<<<<<<< HEAD
    
    public String comprarPaquete(String paquete, String nickname)
    {
        String compra= "N";
        try { // Creo la plataforma - Probando el GitIgnore jeje 

            ResultSet rs;
            PreparedStatement ps;
            ps = conexion.prepareStatement("SELECT  e.esp_nombre as nome, f.fun_nombre as fune  FROM  paquete_espetaculo as pe, espetaculos as e , espetaculo_funcion as ef, funciones as f WHERE paqesp_paq_nombre = ? AND paqesp_esp_nombre = esp_nombre AND esp_nombre = ef.espfun_esp_nombre AND ef.espfun_fun_nombre = f.fun_nombre AND NOT EXISTS(SELECT 1 FROM registro as r WHERE r.reg_usu_nick = ?  AND r.reg_esp_nombre = e.esp_nombre  AND r.reg_esp_funcion = f.fun_nombre)");
            ps.setString(1, paquete);
            ps.setString(2, nickname);
            rs = ps.executeQuery();
            FuncionServicio fs = new FuncionServicio();
            
            while(rs.next()) //Registro a las funciones
            {
                fs.RegistrarEspectadorFuncion(nickname, rs.getString("nome"), rs.getString("fune"));
            }
            ps = conexion.prepareStatement("SELECT SUM(e.esp_costo)*(1-p.paq_descuento/100) as precio_total, p.paq_descuento as descuento FROM  paquetes as p ,paquete_espetaculo as pe, espetaculos as e WHERE p.paq_nombre = ? AND p.paq_nombre = pe.paqesp_paq_nombre AND pe.paqesp_esp_nombre = e.esp_nombre");
            ps.setString(1, paquete);
            float precio = 0, descuento =0;
            while(rs.next()) //Registro a las funciones
            {
                precio = precio+rs.getFloat("precio_total");
                descuento = descuento+rs.getFloat("descuento");
            }
            
            PreparedStatement status = conexion.prepareStatement("INSERT INTO compra_paquete (comp_usu, comp_paquete, comp_descuento, comp_precio_total) VALUES (?,?,?,?)");
            status.setString(1, nickname);
            status.setString(2, paquete);
            status.setFloat(3, precio);
            status.setFloat(4, descuento);
            status.execute();
            rs.close();
            compra = "S";
        } catch (SQLException ex) {
           return ex.getMessage();
        }
        return compra;
    }
    
    
    public String comproPaquete(String paquete, String nickname)
    {
        String compro = "N";
        try { // Creo la plataforma - Probando el GitIgnore jeje 
            
            ResultSet rs;
            PreparedStatement ps;
            ps = conexion.prepareStatement("SELECT * FROM compra_paquete WHERE comp_usu = ? AND comp_paquete = ?");
            ps.setString(1, nickname);
            ps.setString(2, paquete);
            rs = ps.executeQuery();
            while(rs.next()) //Registro a las funciones
            {
                compro = "S";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return compro;
    }
        
    
=======

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

>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
}
