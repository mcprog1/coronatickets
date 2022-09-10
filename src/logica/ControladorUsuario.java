/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Clases.Artista;
import Clases.Espectaculo;
import Clases.Funciones;
import Clases.Plataformas;
import Servicios.ServiciosUsuarios;
import Clases.Usuarios;
import Servicios.ServiciosRegistros;
import java.io.IOException;
import logica.interfaz.IControladorUsuario;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cristian
 */
public class ControladorUsuario implements IControladorUsuario {

    private final ServiciosUsuarios serviciosUsuarios;
    

    public ControladorUsuario() {
        this.serviciosUsuarios = new ServiciosUsuarios();
       
    }

    private static ControladorUsuario instancia;

    public static ControladorUsuario getinstancia() {
        if (instancia == null) {
            instancia = new ControladorUsuario();
        }
        return instancia;
    }

    
    public String addEspectador(String nick, String nombre, String apellido, String clave, String mail, /*Timestamp*/String f, String i) {

        boolean verificaNick = true;
        boolean verificaMail = true;
        String valido = "E";//Error si es que no se ejecuta

        verificaNick = serviciosUsuarios.validarusuariosNick(nick);
        verificaMail = serviciosUsuarios.validarusuariosMail(mail);

        if (verificaNick == false & verificaMail == false) {
            Usuarios u = new Usuarios(nick, nombre, apellido, clave, mail, f, i);
            serviciosUsuarios.UpdateBDEspectador(u);
            valido = "V";//Usuario valido
            return valido;

        } else {
            valido = "I"; // Usuario es invalido

        }
        return valido;

    }

    public String addArtista(String Nickname, String Nombre, String Apellido, String Clave, String Mail, /*Timestamp*/String f, String i, String Descripcion, String Biografia, String URL) {
        boolean verificaNick = true;
        boolean verificaMail = true;
        String valido = "E";//Error si es que no se ejecuta

        verificaNick = serviciosUsuarios.validarusuariosNick(Nickname);
        verificaMail = serviciosUsuarios.validarusuariosMail(Mail);

        if (verificaNick == false & verificaMail == false) {
            Artista a = new Artista(Nickname, Nombre, Apellido, Clave, Mail, f, i, Descripcion, Biografia, URL);
            if (serviciosUsuarios.UpdateBDArtista(a) == true) {
                valido = "V";//Usuario valido
                return valido;
            } else {
                valido = "E";
                return valido;
            }
        } else {
            valido = "I"; // Usuario es invalido

        }
        return valido;
    }

    public ArrayList<Usuarios> tablaUsuarios() {
        ArrayList<Usuarios> datos = new ArrayList<>();
        try {
            datos = serviciosUsuarios.consultarUsuario();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datos;
    }

    public ArrayList<Artista> tablaArtistas() {
        ArrayList<Artista> datos = new ArrayList<>();
        try {
            datos = serviciosUsuarios.consultarArtista();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datos;
    }

    

    public Artista Consultar_un_artista_particular(String nick) {
        Artista A = new Artista();
        try {
            A = serviciosUsuarios.consultar_Un_Artista_Particular(nick);
            return A;
        } catch (SQLException e) {
            System.out.println("Error en buscar el artista por el nombre");
            return A;
        }
    }
        
    
    public void addEspectador(String nick, String nombre, String apellido, String clave, String mail, Timestamp f,String i) {
        
            Usuarios u = new Usuarios(nick, nombre, apellido, clave, mail,f,i);
            String add = String.format("INSERT INTO usuarios (usu_nick,usu_nombre,usu_apellido,usu_clave,usu_mail,usu_tipo_usuario,usu_fecha_nacimiento) "
                    + "VALUE ('%s','%s','%s','%s','%s','%s','%s')", u.getNickname(), u.getNombre(), u.getApellido(), u.getClave(), u.getMail(),u.getFechai(),u.getIdentificador());
            serviciosUsuarios.UpdateBD(add);
        
    }

    public int Artista_o_Espectador(String nick) {
        if (serviciosUsuarios.EsArtistaoEspectador(nick) == 1) {
            return 1;
        } else if (serviciosUsuarios.EsArtistaoEspectador(nick) == 2) {
            return 2;
        } else {
            return 3;
        }

    }
    
    
    public Usuarios Consultar_un_Espectador_particular(String nick) {
        Usuarios E = new Usuarios();
        try {
            E = serviciosUsuarios.consultar_Un_Espectador_Particular(nick);
            return E;
        } catch (SQLException e) {
            System.out.println("Error en buscar el Espectador por el nombre");
            return E;
        }
        
    }
    
    public boolean EdiarEspectador(String nick,String nombre,String apellido,String clave ,String fecha){
        boolean verificar = false;
        try {
            verificar  = serviciosUsuarios.editarEspectador(nick, nombre, apellido, clave, fecha);
            if(verificar == true){
                return true;
            }else{
                return false;
                
            }
        } catch (Exception e) {
            System.out.println("ocurrio un error al ediar al especador : "+nombre+" "+apellido);
        }
        return false;
    }
    public boolean editarArtistas(String nick ,String nombre,String apellido,String clave ,/*Timestamp*/String fecha,String descripcion ,String url,String biografia){
        boolean verificar = false;
        try {
            verificar  = serviciosUsuarios.editarArtista(nick, nombre, apellido, clave, fecha, descripcion, url, biografia);
            if(verificar == true){
                return true;
            }else{
                return false;
                
            }
        } catch (Exception e) {
            System.out.println("ocurrio un error al ediar al especador : "+nombre+" "+apellido);
        }
        return false;
    }
    
    


}
