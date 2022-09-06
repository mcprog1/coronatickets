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
public class Usuarios {
    private String Nickname,Clave,Nombre,Apellido,Mail;
    String fechai,identificador;
    //private DtFecha fecha;
    public Usuarios(){
        
    }
    public Usuarios (String Nickname_,String Nombre_,String Apellido_,String Clave_,String Mail_,String f,String i){
        this.Nickname = Nickname_;
        this.Nombre = Nombre_;
        this.Apellido = Apellido_;
        this.Clave = Clave_;
        this.Mail = Mail_;
        this.fechai = f;
        this.identificador = i;
    }

    public String getFechai() {
        return fechai;
    }

    public void setFechai(String fechai) {
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


