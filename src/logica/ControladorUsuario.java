/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Clases.Artista;
import Servicios.ServiciosUsuarios;
import Clases.Usuarios;
import logica.interfaz.IControladorUsuario;
import java.sql.SQLException;
import Clases.*;
import Servicios.ServicioImagen;
import java.io.File;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cristian
 */
public class ControladorUsuario implements IControladorUsuario {

    private final ServiciosUsuarios serviciosUsuarios;
    private ServicioImagen ServicioImagen;

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

    public String addEspectador(String nick, String nombre, String apellido, String clave, String mail, DtFecha f, File imagen) {

        boolean verificaNick = true;
        boolean verificaMail = true;
        String valido = "E";//Error si es que no se ejecuta

        verificaNick = serviciosUsuarios.validarusuariosNick(nick);
        verificaMail = serviciosUsuarios.validarusuariosMail(mail);

        String urlimagen = null;
        try {
            Map<String, String> headers = new HashMap<>();
            headers.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.88 Safari/537.36");
            ServicioImagen multipart = new ServicioImagen("https://upload-image-to-imgur.vercel.app/upload", "utf-8", headers);

            multipart.addFilePart("file", imagen);
            String response = multipart.finish();
            urlimagen = response;
        } catch (Exception ex) {
            Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (verificaNick == false & verificaMail == false) {

            Usuarios u = new Usuarios(nick, nombre, apellido, clave, mail, f, "1", urlimagen);
            serviciosUsuarios.UpdateBDEspectador(u);
            valido = "V";//Usuario valido
            return valido;

        } else {
            valido = "I"; // Usuario es invalido

        }
        return valido;

    }

    public String addArtista(String Nickname, String Nombre, String Apellido, String Clave, String Mail, DtFecha f, String Descripcion, String Biografia, String URL, File imagen) {
        boolean verificaNick = true;
        boolean verificaMail = true;
        String valido = "E";//Error si es que no se ejecuta

        verificaNick = serviciosUsuarios.validarusuariosNick(Nickname);
        verificaMail = serviciosUsuarios.validarusuariosMail(Mail);
        
         String urlimagen = null;
        try {
            Map<String, String> headers = new HashMap<>();
            headers.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.88 Safari/537.36");
            ServicioImagen multipart = new ServicioImagen("https://upload-image-to-imgur.vercel.app/upload", "utf-8", headers);

            multipart.addFilePart("file", imagen);
            String response = multipart.finish();
            urlimagen = response;
        } catch (Exception ex) {
            Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (verificaNick == false && verificaMail == false) {

            Artista a = new Artista(Nickname, Nombre, Apellido, Clave, Mail, f, "2", urlimagen, Descripcion, Biografia, URL);
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

    public boolean EdiarEspectador(String nick, String nombre, String apellido, String clave, Date fecha) {
        boolean verificar = false;
        try {
            verificar = serviciosUsuarios.editarEspectador(nick, nombre, apellido, clave, fecha);
            if (verificar == true) {
                return true;
            } else {
                return false;

            }
        } catch (Exception e) {
            System.out.println("ocurrio un error al ediar al especador : " + nombre + " " + apellido);
        }
        return false;
    }

    public boolean editarArtistas(String nick, String nombre, String apellido, String clave, Date fecha, String descripcion, String url, String biografia) {
        boolean verificar = false;
        try {
            verificar = serviciosUsuarios.editarArtista(nick, nombre, apellido, clave, fecha, descripcion, url, biografia);
            if (verificar == true) {
                return true;
            } else {
                return false;

            }
        } catch (Exception e) {
            System.out.println("ocurrio un error al ediar al especador : " + nombre + " " + apellido);
        }
        return false;
    }

    public int login(String nombreCorreo, String clave) {

        int tipoUsuario = 0;

        try {
            tipoUsuario = serviciosUsuarios.login(nombreCorreo, clave);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tipoUsuario;
    }

    public String nickUsuario(String nickCorreo, String password) {

        String nickUsuario = serviciosUsuarios.nickUsuario(nickCorreo, password);

        return nickUsuario;
    }

    public String[] infoUsuario(String nick, String password) {

        String[] infoUsuario = serviciosUsuarios.infoUsuario(nick, password);

        return infoUsuario;
    }
}
