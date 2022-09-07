/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Timestamp;

/**
 *
 * @author Cristian
 */
public class Usuarios {
    private String Nickname,Clave,Nombre,Apellido,Mail;
    private String identificador;
    private Timestamp fechai;
    public Usuarios(){
        
    }
    public Usuarios (String Nickname,String Clave,String Nombre,String Apellido,String Mail,Timestamp f,String i){
        this.Nickname = Nickname;
        this.Clave = Clave;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Mail = Mail;
        this.fechai = f;
        this.identificador = i;
    }

    public Timestamp getFechai() {
        return fechai;
    }

    public void setFechai(Timestamp fechai) {
        this.fechai = fechai;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
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


