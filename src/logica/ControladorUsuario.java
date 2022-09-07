/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Servicios.Servicios;
import Clases.Usuarios;
import Interface.IControladorUsuario;
import java.sql.Timestamp;

/**
 *
 * @author Cristian
 */
public class ControladorUsuario implements IControladorUsuario {

    private final Servicios serviciosUsuarios;

    public ControladorUsuario() {
        this.serviciosUsuarios = new Servicios();
    }

    private static ControladorUsuario instancia;

    public static ControladorUsuario getinstancia() {
        if (instancia == null) {
            instancia = new ControladorUsuario();
        }
        return instancia;
    }
    
    
    public boolean ValidarUsuario(String Nickname, String Gmail) {
        
        return false;

    }
    
    @Override
    public void addEspectador(String nick, String nombre, String apellido, String clave, String mail, Timestamp f,String i) {
        
            Usuarios u = new Usuarios(nick, nombre, apellido, clave, mail,f,i);
            String add = String.format("INSERT INTO usuarios (usu_nick,usu_nombre,usu_apellido,usu_clave,usu_mail,usu_tipo_usuario,usu_fecha_nacimiento) "
                    + "VALUE ('%s','%s','%s','%s','%s','%s','%s')", u.getNickname(), u.getNombre(), u.getApellido(), u.getClave(), u.getMail(),u.getFechai(),u.getIdentificador());
            serviciosUsuarios.UpdateBD(add);
        
    }

    /*
    @Override
    public void addArtista(String nick,String nombre,String apellido,String clave,String gmail,String Descripcion,String bio,String url){
        
    }

    public void addEspectador(String nick, String nombre, String apellido, String clave, String gmail,String descripcion,String bio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     */

   
    public void addEspectador(String nick, String nombre, String apellido, String clave, String gmail, int f, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
