/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
/**
 *
 * @author Cristian
 */
public class Artista extends Usuarios {
    private String Descripcion;
    private String Biografia;
    private String URL;

    public Artista(String Nickname, String Clave, String Nombre, String Apellido, String Mail,String f,String i,String Descripcion,String Biografia,String URL) {
        super(Nickname,Clave,Nombre,Apellido,Mail, f, i);
        this.Descripcion = Descripcion;
        this.Biografia = Biografia;
        this.URL = URL;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getBiografia() {
        return Biografia;
    }

    public void setBiografia(String Biografia) {
        this.Biografia = Biografia;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
    
    
}
