/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Clases.Artista;
import Clases.Espectador;
import Clases.Espectaculo;
import Clases.Funciones;
import Clases.Plataformas;
import Clases.TimeStamp;
import Persistencia.ConexionDB;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luciano
 */
public class FuncionServicio {


//------------------------------------------------------------------------------

    public ArrayList ListarPlataformas() throws SQLException {

        ConexionDB conexion = new ConexionDB();
        Connection con = conexion.getConexion();

        Statement st;
        st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from Plataforma");

        ArrayList<Plataformas> lista = new ArrayList();
        while (rs.next()) {
            Plataformas plataforma = new Plataformas(rs.getString(1), rs.getString(2), rs.getString(3));
            lista.add(plataforma);
        }
        conexion.cerrar();

        return lista;
    }
//------------------------------------------------------------------------------

    public ArrayList ListarEspectaculosPlataforma(String URL) throws SQLException {

        ConexionDB conexion = new ConexionDB();
        Connection con = conexion.getConexion();

        Statement st;
        st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from Espetaculos where esp_plat_nombre = '" + URL + "'");

        ArrayList<Espectaculo> lista = new ArrayList();
        while (rs.next()) {
            Espectaculo espetaculo = new Espectaculo(rs.getString(1), rs.getString(3), rs.getString(4), rs.getString(8), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getFloat(9), rs.getTimestamp(10));
            lista.add(espetaculo);
        }
        conexion.cerrar();

        return lista;
    }
//------------------------------------------------------------------------------

      public TimeStamp timestampToDTFecha(Timestamp fecha){
        if(fecha != null){
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            /*
            yyyy-mm-dd hh:mm => (-) 
            yyyy
            mm
            dd hh:mm
            */
            String fechaDB = dateFormat.format(fecha);
            String[] partes = fechaDB.split("-");
            String[] partesDiaHora = partes[2].split(" ");
            /*
                dd hh:mm => ( )
                dd
                   hh:mm
            */
            String[] parteHora = partesDiaHora[1].split(":");
            /*
            hh:mm => (:)
                hh
            mm
            */
            return new TimeStamp(partesDiaHora[0],partes[1],partes[0], Integer.parseInt(parteHora[0]), Integer.parseInt(parteHora[1]));
        }
        else{
            return new TimeStamp("0","0","0",0,0);
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
    public ArrayList ListarArtistas() throws SQLException {

        ConexionDB conexion = new ConexionDB();
        Connection con = conexion.getConexion();

        Statement st;
        Statement st2;
        st = con.createStatement();
        st2 = con.createStatement();
        ResultSet rs = st.executeQuery("select * from Artistas");

        ArrayList<Artista> lista = new ArrayList();

        while (rs.next()) {

            ResultSet rs2 = st2.executeQuery("select * from Usuarios where usu_nick ='" + rs.getString(1) + "'");

            while (rs2.next()) {
                Artista artista = new Artista(rs2.getString(1), rs2.getString(2), rs2.getString(3), rs2.getString(4), rs2.getString(5), dateToDTFecha(rs2.getDate(7)), rs2.getString(6), rs.getString(2), rs.getString(3), rs.getString(4));
                lista.add(artista);
            }
        }
        conexion.cerrar();

        return lista;
    }
//------------------------------------------------------------------------------

    public Funciones ConsultaFuncion(String nombreFuncion, String nombreEspectaculo) throws SQLException {

        ConexionDB conexion = new ConexionDB();
        Connection con = conexion.getConexion();

        Statement st;
        st = con.createStatement();
        ResultSet rs = st.executeQuery("select fun_nombre,fun_fecha,fun_hora_inicio,fun_fecha_creado from Funciones,Espetaculo_funcion where Funciones.fun_nombre = Espetaculo_funcion.espfun_fun_nombre and Funciones.fun_nombre = '" + nombreFuncion + "' and espetaculo_funcion.espfun_esp_nombre = '" + nombreEspectaculo + "'");

        if (rs.next()) {
            Funciones funcion = new Funciones(rs.getString(1), rs.getTimestamp(2), rs.getTimestamp(3), rs.getTimestamp(4));
            return funcion;
        }
        conexion.cerrar();
        return null;
    }
//------------------------------------------------------------------------------  

    public ArrayList ListarArtistasFuncion(String nombre) throws SQLException {

        ConexionDB conexion = new ConexionDB();
        Connection con = conexion.getConexion();

        Statement st;
        st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from funcion_artista where funart_fun_nombre = '" + nombre + "'");

        ArrayList<String> lista = new ArrayList();

        while (rs.next()) {
            lista.add(rs.getString(1));
        }

        conexion.cerrar();
        return lista;
    }
//------------------------------------------------------------------------------

    public int AltaFuncion(String nombreEspectaculo, String nombre, Timestamp Tfecha, Timestamp Thora, Timestamp fechaCreacion, List artistas) throws SQLException {

        ConexionDB conexion = new ConexionDB();
        Connection con = conexion.getConexion();

        Statement st;
        st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from Funciones where fun_nombre = '" + nombre + "'");

        if (rs.next()) {
            //Update
            st.executeUpdate("update Funciones set fun_fecha = '" + Tfecha + "', fun_hora_inicio = '" + Thora + "', fun_fecha_creado = '" + fechaCreacion + "' where fun_nombre = '" + nombre + "'");
            st.executeUpdate("delete from funcion_artista where funart_fun_nombre = '" + nombre + "'");

            for (int i = 0; i < artistas.size(); i++) {
                st.executeUpdate("insert into funcion_artista (funart_art_nick, funart_fun_nombre) values ('" + artistas.get(i) + "', '" + nombre + "')");
            }
            conexion.cerrar();
            return 8;
        } else {
            //Insert
            st.executeUpdate("insert into Funciones (fun_nombre, fun_fecha, fun_hora_inicio, fun_fecha_creado) values ('" + nombre + "', '" + Tfecha + "', '" + Thora + "', '" + fechaCreacion + "')");
            st.executeUpdate("insert into espetaculo_funcion (espfun_esp_nombre, espfun_fun_nombre) values ('" + nombreEspectaculo + "', '" + nombre + "')");

            for (int i = 0; i < artistas.size(); i++) {
                st.executeUpdate("insert into funcion_artista (funart_art_nick, funart_fun_nombre) values ('" + artistas.get(i) + "', '" + nombre + "')");
            }
            conexion.cerrar();
            return 9;
        }
    }
//------------------------------------------------------------------------------

    public ArrayList ListarFuncionesEspectaculo(String nombre) throws SQLException {

        ConexionDB conexion = new ConexionDB();
        Connection con = conexion.getConexion();

        Statement st;
        st = con.createStatement();
        ResultSet rs = st.executeQuery("select fun_nombre,fun_fecha,fun_hora_inicio,fun_fecha_creado from Funciones,Espetaculo_funcion where Funciones.fun_nombre = Espetaculo_funcion.espfun_fun_nombre and espetaculo_funcion.espfun_esp_nombre = '" + nombre + "'");

        ArrayList<Funciones> lista = new ArrayList();

        while (rs.next()) {
            Funciones funcion = new Funciones(rs.getString(1), rs.getTimestamp(2), rs.getTimestamp(3), rs.getTimestamp(4));
            lista.add(funcion);
        }

        conexion.cerrar();
        return lista;
    }
//------------------------------------------------------------------------------

    public ArrayList ListarEspectadores() throws SQLException {

        ConexionDB conexion = new ConexionDB();
        Connection con = conexion.getConexion();

        Statement st;
        st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from Usuarios where usu_tipo_usuario = 1");

        ArrayList<Espectador> lista = new ArrayList();
        while (rs.next()) {
            Espectador espectador = new Espectador(rs.getString(1), rs.getString(4), rs.getString(2), rs.getString(3), rs.getString(5), dateToDTFecha(rs.getDate(7)), rs.getString(6));
            lista.add(espectador);
        }
        conexion.cerrar();

        return lista;
    }

//------------------------------------------------------------------------------
    public ArrayList ListarRegistrosUsuarioEspectaculo(String nickEspectador, String nombreEspectaculo) throws SQLException {

        ConexionDB conexion = new ConexionDB();
        Connection con = conexion.getConexion();

        Statement st;
        st = con.createStatement();
        ResultSet rs = st.executeQuery("select reg_id from Registro where reg_usu_nick = '" + nickEspectador + "' and reg_esp_nombre = '" + nombreEspectaculo + "' and reg_canjeado = 'n'");

        ArrayList<String> lista = new ArrayList();

        while (rs.next()) {
            lista.add(rs.getString(1));
        }
        conexion.cerrar();

        return lista;
    }
//------------------------------------------------------------------------------

    public int EspectaculoLleno(String nombreEspectaculo, String nombreFuncion) throws SQLException {

        ConexionDB conexion = new ConexionDB();
        Connection con = conexion.getConexion();

        Statement st;
        st = con.createStatement();
        ResultSet rs = st.executeQuery("select count(reg_esp_nombre) from registro where reg_esp_nombre = '" + nombreEspectaculo + "' and reg_esp_funcion = '" + nombreFuncion + "'");

        int cantidadEspectadores = 5000;
        int cantidadMaximaEspectaculo = 0;

        while (rs.next()) {
            cantidadEspectadores = rs.getInt(1);
        }

        rs = st.executeQuery("select esp_espectadores_max from espetaculos where esp_nombre = '" + nombreEspectaculo + "'");

        while (rs.next()) {
            cantidadMaximaEspectaculo = rs.getInt(1);
        }

        conexion.cerrar();

        if (cantidadEspectadores < cantidadMaximaEspectaculo) {
            return 0;
        } else {
            return 1;
        }
    }
//------------------------------------------------------------------------------

    public int EspectadorEnFuncion(String nick, String nombreFuncion) throws SQLException {

        ConexionDB conexion = new ConexionDB();
        Connection con = conexion.getConexion();

        Statement st;
        st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from registro where reg_usu_nick = '" + nick + "' and reg_esp_funcion = '" + nombreFuncion + "'");

        if (rs.next()) {
            conexion.cerrar();
            return 1;
        } else {
            conexion.cerrar();
            return 0;
        }
    }
//------------------------------------------------------------------------------

    public void RegistrarEspectadorFuncion(String nickEspectador, String nombreEspectaculo, String nombreFuncion) throws SQLException {

        ConexionDB conexion = new ConexionDB();
        Connection con = conexion.getConexion();

        Statement st;
        st = con.createStatement();

        ResultSet costoEspectaculo = st.executeQuery("select esp_costo from espetaculos where esp_nombre = '" + nombreEspectaculo + "'");
        int costo = 0;

        if (costoEspectaculo.next()) {
            costo = costoEspectaculo.getInt(1);
        }

        ResultSet id = st.executeQuery("select max(reg_id) from registro");
        int identificador;

        if (id.next()) {
            identificador = id.getInt(1) + 1;
        } else {
            identificador = 1;
        }

        Long datetime = System.currentTimeMillis();
        Timestamp fechaCreado = new Timestamp(datetime);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");

        st.executeUpdate("insert into registro (reg_id, reg_usu_nick, reg_esp_nombre, reg_fecha_creado, reg_canjeado, reg_vigente, reg_paq_nombre, reg_costo, reg_esp_funcion) values ('" + identificador + "', '" + nickEspectador + "', '" + nombreEspectaculo + "', '" + sdf.format(fechaCreado) + "', 'n', 's', 'null', '" + costo + "', '" + nombreFuncion + "')");

        conexion.cerrar();
    }
//------------------------------------------------------------------------------

    public void CanjearRegistroEspectadorFuncion(String nickEspectador, String nombreEspectaculo, String nombreFuncion, List RegistrosPrevios) throws SQLException {

   ConexionDB conexion = new ConexionDB();
        Connection con = conexion.getConexion();

        Statement st;
        st = con.createStatement();

        ResultSet id = st.executeQuery("select max(reg_id) from registro");
        int identificador;

        if (id.next()) {
            identificador = id.getInt(1) + 1;
        } else {
            identificador = 1;
        }
        
        for (int i = 0; i < RegistrosPrevios.size(); i++) {
            st.executeUpdate("update registro set reg_canjeado = 's', reg_vigente = 'n' where reg_id = '" + RegistrosPrevios.get(i) + "'");
        }

        Long datetime = System.currentTimeMillis();
        Timestamp fechaCreado = new Timestamp(datetime);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");

        st.executeUpdate("insert into registro (reg_id, reg_usu_nick, reg_esp_nombre, reg_fecha_creado, reg_canjeado, reg_vigente, reg_paq_nombre, reg_costo, reg_esp_funcion) values ('" + identificador + "', '" + nickEspectador + "', '" + nombreEspectaculo + "', '" + sdf.format(fechaCreado) + "', 'n', 's', 'null', '0', '" + nombreFuncion + "')");

        conexion.cerrar();
    }
}

/*create table registro_canjeado (
reg_id int not null,
reg_id_asociado int not null,
foreign key (reg_id) references registro(reg_id));
*/