/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Clases.Artista;
import Clases.*;
import Persistencia.ConexionDB;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Cristian
 */
public class ServiciosUsuarios {

    private ArrayList<Usuarios> usuarios;
    private Connection conn = new ConexionDB().getConexion();

    public ServiciosUsuarios() {

    }

    public class ParameterStringBuilder {

    }

    public boolean UpdateBDEspectador(Usuarios u) {

        try {

            PreparedStatement result = conn.prepareStatement("INSERT INTO usuarios (usu_nick,usu_nombre,usu_apellido,usu_clave,usu_mail,usu_fecha_nacimiento ,usu_tipo_usuario,usu_imagen) VALUE (?,?,?,?,?,?,?,?)");
            result.setString(1, u.getNickname());
            result.setString(2, u.getNombre());
            result.setString(3, u.getApellido());
            result.setString(4, u.getClave());
            result.setString(5, u.getMail());
            result.setDate(6, dtFechaToDate(u.getFechai()));
            result.setString(7, u.getIdentificador());
            result.setString(8, u.getImagen());
            result.execute();
            return true;

        } catch (SQLException e) {
            System.out.println(e);

        }
        return false;
    }

    public boolean UpdateBDArtista(Artista u) {

        try {
            if (UpdateBDEspectador(u) == true) {
                PreparedStatement result = conn.prepareStatement("INSERT INTO artistas (art_usu_nick,art_descripcion,art_biografia,art_url) VALUE (?,?,?,?)");
                result.setString(1, u.getNickname());
                result.setString(2, u.getDescripcion());
                result.setString(3, u.getBiografia());
                result.setString(4, u.getURL());
                result.execute();
                return true;
            } else {
                return false;
            }
            //ver si falta el nick de arttista que es el mismo del usuario
        } catch (SQLException e) {
            System.out.println(e);

        }
        return false;
    }

    @SuppressWarnings("empty-statement")
    //Me devuelve un usuario pasando el nickname
    public Usuarios getUser(String nickname, String correo) throws SQLException { //Valida desde la base de datos si existe el usurio a traves del email
        try {
            Usuarios resultado = new Usuarios();
            PreparedStatement status = conn.prepareStatement("SELECT * FROM usuarios");
            try ( ResultSet rs = status.executeQuery()) {
                while (rs.next()) {
                    String nick = rs.getString("usu_nick");
                    String nombre = rs.getString("usu_nombre");
                    String apellido = rs.getString("usu_apellido");
                    String password = rs.getString("usu_clave");
                    String mail = rs.getString("usu_mail");
                    Date fecha = rs.getDate("usu_fecha_nacimiento");
                    String id = rs.getString("usu_tipo_usuario");
                    String imagen = rs.getString("usu_imagen");
                    if (mail.equals(correo) & nick.equals(nickname)) {
                        resultado = new Usuarios(nick, nombre, apellido, password, mail, dateToDTFecha(fecha), id, imagen);
                    };
                }
            }
            return resultado;
        } catch (SQLException ex) {
            return null;
        }
    }

    public boolean validarusuariosNick(String nombre) {
        try {
            PreparedStatement status = conn.prepareStatement("SELECT * FROM usuarios WHERE usu_nick= ?");
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

    public boolean validarusuariosMail(String mail) {
        try {
            PreparedStatement status = conn.prepareStatement("SELECT * FROM usuarios WHERE usu_mail=?");
            status.setString(1, mail);
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

//Consulta los registros de una sentencia
    public ResultSet consularRegistros(String strSentenciaSQL) {
        try {
            PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);//prepara la sentencia de SQL para que nosotros podamos ejecutarla
            ResultSet respuesta = pstm.executeQuery();//para devolver executeQuery
            return respuesta;//es la tabla que retorna la base de datos

        } catch (SQLException e) {
            System.out.println("Error en consultar registros en la base de datos");
            return null;
        }
    }

    public ArrayList<Usuarios> consultarUsuario() throws SQLException {
        Usuarios usu;
        ArrayList<Usuarios> listaUsu = new ArrayList<>();
        try {
            PreparedStatement consulta = conn.prepareStatement("SELECT * FROM usuarios");
            ResultSet resultadoConsulta = consulta.executeQuery();
            while (resultadoConsulta.next()) {
                usu = new Usuarios();
                usu.setNickname(resultadoConsulta.getString("usu_nick"));
                usu.setApellido(resultadoConsulta.getString("usu_apellido"));
                usu.setNombre(resultadoConsulta.getString("usu_nombre"));
                usu.setClave(resultadoConsulta.getString("usu_clave"));
                usu.setMail(resultadoConsulta.getString("usu_mail"));
                usu.setFechai(dateToDTFecha(resultadoConsulta.getDate("usu_fecha_nacimiento")));
                usu.setIdentificador(resultadoConsulta.getString("usu_tipo_usuario"));
                listaUsu.add(usu);
            }
            return listaUsu;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaUsu;

    }

    public ArrayList<Artista> consultarArtista() throws SQLException {
        Artista A;
        ArrayList<Artista> listaA = new ArrayList<>();
        try {
            PreparedStatement consulta = conn.prepareStatement("SELECT * FROM artistas");
            ResultSet resultadoConsulta = consulta.executeQuery();
            while (resultadoConsulta.next()) {
                A = new Artista();
                A.setNickname(resultadoConsulta.getString("art_usu_nick"));
                A.setApellido(resultadoConsulta.getString("art_descripcion"));
                A.setNombre(resultadoConsulta.getString("art_biografia"));
                A.setClave(resultadoConsulta.getString("art_url"));
                listaA.add(A);
            }
            return listaA;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaA;

    }

    public Artista consultar_Un_Artista_Particular(String nick) throws SQLException {
        Artista A = null;
        try {
            PreparedStatement consulta = conn.prepareStatement("SELECT * FROM artistas,usuarios WHERE art_usu_nick= ?");
            consulta.setString(1, nick);
            ResultSet resultadoConsulta = consulta.executeQuery();
            while (resultadoConsulta.next()) {
                A = new Artista();
                A.setNickname(resultadoConsulta.getString("art_usu_nick"));
                A.setNombre(resultadoConsulta.getString("usu_nombre"));
                A.setApellido(resultadoConsulta.getString("usu_apellido"));
                A.setClave(resultadoConsulta.getString("usu_clave"));
                A.setMail(resultadoConsulta.getString("usu_mail"));
                A.setFechai(dateToDTFecha(resultadoConsulta.getDate("usu_fecha_nacimiento")));
                A.setBiografia(resultadoConsulta.getString("art_biografia"));
                A.setURL(resultadoConsulta.getString("art_url"));
                A.setDescripcion(resultadoConsulta.getString("art_descripcion"));
                return A;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return A;
    }

    public int EsArtistaoEspectador(String nick) {
        try {
            PreparedStatement consultar = conn.prepareStatement("SELECT * FROM artistas WHERE art_usu_nick = ?");
            consultar.setString(1, nick);
            ResultSet resultado = consultar.executeQuery();
            if (resultado.next()) {
                return 1;//Es artista
            } else {
                return 2; //Es espectador
            }
        } catch (Exception e) {
            System.out.println("Error al verificar que es artista o espectador");
        }
        return 3;//error

    }

    public Usuarios consultar_Un_Espectador_Particular(String nick) throws SQLException {
        Usuarios E = null;
        try {
            PreparedStatement consulta = conn.prepareStatement("SELECT * FROM usuarios WHERE usu_nick ='" + nick + "'");
            consulta.setString(1, nick);
            ResultSet resultadoConsulta = consulta.executeQuery();
            while (resultadoConsulta.next()) {
                E = new Usuarios();
                E.setNickname(resultadoConsulta.getString("usu_nick"));
                E.setNombre(resultadoConsulta.getString("usu_nombre"));
                E.setApellido(resultadoConsulta.getString("usu_apellido"));
                E.setClave(resultadoConsulta.getString("usu_clave"));
                E.setMail(resultadoConsulta.getString("usu_mail"));
                E.setFechai(dateToDTFecha(resultadoConsulta.getDate("usu_fecha_nacimiento")));
                return E;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return E;
    }

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
        return f.getDia() + "/" + f.getMes() + "/" + f.getAnio();
    }

    public String DtFechaToBD(Clases.DtFecha f) {
        return f.getAnio() + "-" + f.getMes() + "-" + f.getDia();
    }

    public Date dtFechaToDate(Clases.DtFecha fecha) {

        Date fechaFinal = Date.valueOf(DtFechaToBD(fecha));
        return fechaFinal;
    }

    public boolean editarEspectador(String nick, String nombre, String apellido, String clave, Date fecha) {
        try {
            PreparedStatement sn = conn.prepareStatement("UPDATE usuarios SET usu_nombre = '" + nombre + "' ,usu_apellido = '" + apellido + "' ,usu_clave = '" + clave + "' ,usu_fecha_nacimiento = '" + fecha + "' WHERE usu_nick = '" + nick + "'");
            sn.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("Ocurrio un error al editar el espectador");
        }
        return false;
    }

    public boolean editarArtista(String nick, String nombre, String apellido, String clave, Date fecha, String descripcion, String url, String biografia) {
        try {
            PreparedStatement sn = conn.prepareStatement("UPDATE usuarios AS u,artistas AS a SET u.usu_nombre=? ,u.usu_apellido=? ,u.usu_clave=? ,u.usu_fecha_nacimiento=? ,a.art_descripcion=? ,a.art_biografia=?,a.art_url=?   WHERE u.usu_nick = ?  AND a.art_usu_nick = u.usu_nick ");
            sn.setString(1, nombre);
            sn.setString(2, apellido);
            sn.setString(3, clave);
            sn.setDate(4, fecha);
            sn.setString(5, descripcion);
            sn.setString(6, biografia);
            sn.setString(7, url);
            sn.setString(8, nick);
            sn.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("Ocurrio un error al editar al artista");
        }
        return false;
    }

    public int login(String nickCorreo, String clave) throws SQLException {

        int tipoUsuario = 0;

        PreparedStatement consulta = conn.prepareStatement("SELECT usu_tipo_usuario FROM usuarios WHERE usu_nick='" + nickCorreo + "' and usu_clave='" + clave + "'");
        ResultSet resultadoConsulta = consulta.executeQuery();

        if (resultadoConsulta.next()) {

            tipoUsuario = resultadoConsulta.getInt("usu_tipo_usuario");

            return tipoUsuario;

        } else {
            return tipoUsuario;
        }

    }

    public String nickUsuario(String nickCorreo, String password) {

        String nickUsuario = "";

        try {
            PreparedStatement consulta = conn.prepareStatement("SELECT usu_nick FROM usuarios WHERE usu_mail='" + nickCorreo + "' and usu_clave='" + password + "'");
            ResultSet resultadoConsulta = consulta.executeQuery();

            while (resultadoConsulta.next()) {
                nickUsuario = resultadoConsulta.getString("usu_nick");
            }

        } catch (SQLException ex) {
            Logger.getLogger(ServiciosUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nickUsuario;
    }

    public String[] infoUsuario(String nick, String password) {

        String[] infoUsuario = new String[7];

        try {
            PreparedStatement consulta = conn.prepareStatement("SELECT * FROM usuarios WHERE usu_nick ='" + nick + "' and usu_clave = '" + password + "'");
            ResultSet resultadoConsulta = consulta.executeQuery();

            while (resultadoConsulta.next()) {

                infoUsuario[0] = resultadoConsulta.getString("usu_nombre");
                infoUsuario[1] = resultadoConsulta.getString("usu_apellido");
                infoUsuario[2] = resultadoConsulta.getDate("usu_fecha_nacimiento").toString();
                infoUsuario[3] = resultadoConsulta.getString("usu_clave");

            }

            PreparedStatement consultaA = conn.prepareStatement("SELECT * FROM artistas WHERE art_usu_nick ='" + nick + "'");
            ResultSet resultadoConsultaA = consultaA.executeQuery();

            while (resultadoConsultaA.next()) {

                infoUsuario[4] = resultadoConsultaA.getString("art_descripcion");
                infoUsuario[5] = resultadoConsultaA.getString("art_biografia");
                infoUsuario[6] = resultadoConsultaA.getString("art_url");

            }

        } catch (SQLException e) {
        }

        return infoUsuario;
    }

}
