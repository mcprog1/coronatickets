/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Clases.Usuarios;
import Persistencia.ConexionDB;
import java.sql.*;


/**
 *
 * @author Cristian
 */
public class Servicios {

    private Connection conn =  new ConexionDB().getConexion();

    public Servicios() {

    }

    public Usuarios getusuario() {

        return null;

    }

    public boolean UpdateBD(String strSentenciaSQL) {
        
        try {
            Statement result = conn.createStatement();
            result.executeUpdate(strSentenciaSQL);

        } catch (SQLException e) {
            System.out.println(e);

        }

        return false;
    }

    @SuppressWarnings("empty-statement")
    //Me devuelve un usuario pasando el nickname
    public Usuarios getUser(String nickname) throws SQLException { //Valida desde la base de datos si existe el usurio a traves del email
        try {
            Usuarios  resultado = new Usuarios();
            PreparedStatement status = conn.prepareStatement("SELECT * FROM usuarios");
            try (ResultSet rs = status.executeQuery()) {
                while (rs.next()) {
                    String nick = rs.getString("usu_nick");
                    String nombre = rs.getString("usu_nombre");
                    String apellido = rs.getString("usu_apellido");
                    String mail = rs.getString("usu_mail");
                    String password = rs.getString("usu_clave");
                    Timestamp fecha = rs.getTimestamp("usu_fecha_nacimiento");
                    String id = rs.getString("usu_tipo_usuario");
                    if (mail.equals(nickname))//Si existe email
                    {
                      resultado = new Usuarios(nick, nombre, apellido, mail, password,fecha,id);
                    };
                }
            }
            return resultado;
        } catch (SQLException ex) {
            return null;
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

    public boolean validarUsuario(String nick) throws SQLException {
        try {
            Usuarios u = new Usuarios();
            u = getUser(nick);
            
            if(u != null){
                return true;
            }else {
                return false;
            }
            
        } catch (SQLException e) {
        }

        return true;
    }

}
