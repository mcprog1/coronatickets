/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author Cristian
 */
public class Funciones {

    private String Nombre, imagen;
    private Timestamp Fecha;
    private Timestamp FechaCreado;
    private Timestamp HoraDeInicio;
   
    
    public Funciones(String nombre, Timestamp fecha,  Timestamp horaDeInicio, Timestamp fechaCreado, String imagen){
        this.Nombre = nombre;
        this.Fecha = fecha;
        this.FechaCreado = fechaCreado;
        this.HoraDeInicio = horaDeInicio;
        this.imagen = imagen;
    }

    public Funciones() {}
    
    public String getNombre() {
        return Nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    public void setNombre(String Nombre_) {
        this.Nombre = Nombre_;
    }

    public Timestamp getFecha() {
        return Fecha;
    }

    public void setFecha(Timestamp Fecha) {
        this.Fecha = Fecha;
    }

    public Timestamp getFechaCreado() {
        return FechaCreado;
    }

    public void setFechaCreado(Timestamp FechaCreado) {
        this.FechaCreado = FechaCreado;
    }

    public Timestamp getHoraDeInicio() {
        return HoraDeInicio;
    }

    public void setHoraDeInicio(Timestamp HoraDeInicio) {
        this.HoraDeInicio = HoraDeInicio;
    }

}
