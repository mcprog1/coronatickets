/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.interfaz;

import Clases.Artista;
import Clases.*;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author laptopwin
 */
public interface IControladorUsuario {
    
    public abstract String addEspectador(String nick,String nombre,String apellido,String clave,String gmail,DtFecha f,String i);
    public abstract String addArtista(String nick,String nombre,String apellido,String clave,String gmail,DtFecha f,String i,String Descripcion,String bio,String url);
    public abstract ArrayList<Usuarios> tablaUsuarios();//consulto todos los usuarios
    public abstract ArrayList<Artista> tablaArtistas();//consulto todos los artistas
    public abstract Usuarios Consultar_un_Espectador_particular(String nick);
    public abstract int Artista_o_Espectador(String nick);//consulto si es artista(1) o espectador (2) con el nickname
    public abstract Artista Consultar_un_artista_particular(String nick);//consulto un artista identificado con el nick
    public abstract boolean EdiarEspectador(String nick,String nombre,String apellido,String clave ,Date fecha);
    public boolean editarArtistas(String nick ,String nombre,String apellido,String clave ,Date fecha,String descripcion ,String url,String biografia);
    public int login(String nombreCorreo, String clave);
    public String nickUsuario(String nickCorreo, String password);
    public String[] infoUsuario(String nick, String password);
}
