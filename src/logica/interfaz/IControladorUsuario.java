/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.interfaz;

import Clases.Artista;
<<<<<<< HEAD
import Clases.Espectaculo;
import Clases.Funciones;
import Clases.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
=======
import Clases.*;
import java.io.File;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.ImageIcon;
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7

/**
 *
 * @author laptopwin
 */
public interface IControladorUsuario {
    
<<<<<<< HEAD
    public abstract String addEspectador(String nick,String nombre,String apellido,String clave,String gmail,DtFecha f,String i);
    public abstract String addArtista(String nick,String nombre,String apellido,String clave,String gmail,DtFecha f,String i,String Descripcion,String bio,String url);
=======
    public abstract String addEspectador(String nick,String nombre,String apellido,String clave,String gmail,DtFecha f, File imagen);
    public abstract String addArtista(String nick,String nombre,String apellido,String clave,String gmail,DtFecha f,String Descripcion,String bio,String url, File imagen);
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
    public abstract ArrayList<Usuarios> tablaUsuarios();//consulto todos los usuarios
    public abstract ArrayList<Artista> tablaArtistas();//consulto todos los artistas
    public abstract Usuarios Consultar_un_Espectador_particular(String nick);
    public abstract int Artista_o_Espectador(String nick);//consulto si es artista(1) o espectador (2) con el nickname
    public abstract Artista Consultar_un_artista_particular(String nick);//consulto un artista identificado con el nick
    public abstract boolean EdiarEspectador(String nick,String nombre,String apellido,String clave ,Date fecha);
<<<<<<< HEAD
    public boolean editarArtistas(String nick ,String nombre,String apellido,String clave ,Date fecha,String descripcion ,String url,String biografia);    
    public abstract String crearUsuario(String nickname, String nombre, String apellido, String fecha, String email, String password, String esArtista, String descripcionGeneral, String biografia, String url, String imagen);
    public int login(String nombreCorreo, String clave);
    public String nickUsuario(String nickCorreo, String password);
    public String[] infoUsuario(String nick, String password);
=======
    public boolean editarArtistas(String nick ,String nombre,String apellido,String clave ,Date fecha,String descripcion ,String url,String biografia);
    public int login(String nombreCorreo, String clave);
    public String nickUsuario(String nickCorreo, String password);
    public String[] infoUsuario(String nick, String password);
    //prueba
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
}
