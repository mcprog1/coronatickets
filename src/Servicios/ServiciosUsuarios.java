/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Clases.Artista;
import Clases.Espetaculo;
import Clases.Plataformas;
import Clases.Usuarios;
import Persistencia.ConexionDB;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Cristian
 */
public class ServiciosUsuarios {

    private ArrayList<Usuarios> usuarios;
    private Connection conn = new ConexionDB().getConexion();

    public ServiciosUsuarios() {

    }

    public boolean UpdateBDEspectador(Usuarios u) {

        try {

            PreparedStatement result = conn.prepareStatement("INSERT INTO usuarios (usu_nick,usu_nombre,usu_apellido,usu_clave,usu_mail,usu_fecha_nacimiento ,usu_tipo_usuario) VALUE (?,?,?,?,?,?,?)");
            result.setString(1, u.getNickname());
            result.setString(2, u.getNombre());
            result.setString(3, u.getApellido());
            result.setString(4, u.getClave());
            result.setString(5, u.getMail());
            result.setString(6, u.getFechai());
            result.setString(7, u.getIdentificador());
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
            try (ResultSet rs = status.executeQuery()) {
                while (rs.next()) {
                    String nick = rs.getString("usu_nick");
                    String nombre = rs.getString("usu_nombre");
                    String apellido = rs.getString("usu_apellido");
                    String password = rs.getString("usu_clave");
                    String mail = rs.getString("usu_mail");
                    String fecha = rs.getString("usu_fecha_nacimiento");
                    String id = rs.getString("usu_tipo_usuario");
                    if (mail.equals(correo) & nick.equals(nickname)) {
                        resultado = new Usuarios(nick, nombre, apellido, password, mail, fecha, id);
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
                usu.setFechai(resultadoConsulta.getString("usu_tipo_usuario"));
                usu.setIdentificador(resultadoConsulta.getString("usu_fecha_nacimiento"));
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

}
