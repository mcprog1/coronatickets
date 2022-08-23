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
//hola
public class Usuarios {
    private String Nickname,Clave,Nombre,Apellido,Mail;
    private DtFecha fecha;
    
    public Usuarios (String Nickname,String Clave,String Nombre,String Apellido,String Mail){
        this.Nickname = Nickname;
        this.Clave = Clave;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Mail = Mail;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }
    
    
    
    
    
}


