/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Timestamp;
import Clases.TimeStamp;
/**
 *
 * @author Cristian
 */
public class Artista extends Usuarios {
    private String Descripcion;
    private String Biografia;
    private String URL;
<<<<<<< HEAD

    public Artista(){
        
    }
    public Artista(String Nickname, String Nombre, String Apellido, String Clave, String Mail,DtFecha f,String i,String Descripcion,String Biografia,String URL) {
        super(Nickname,Nombre,Apellido,Clave,Mail, f, i);
=======
       
    public Artista(){
        
    }
    public Artista(String Nickname, String Nombre, String Apellido, String Clave, String Mail, DtFecha f, String i, String imagen, String Descripcion, String Biografia, String URL) {
        super(Nickname,Nombre,Apellido,Clave,Mail, f, i, imagen);
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
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
    
<<<<<<< HEAD
    
=======
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
}
