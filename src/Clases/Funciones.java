/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Date;

/**
 *
 * @author Cristian
 */
public class Funciones {
    private String Nombre;
    private Date Fecha;
    private TimeStamp FechaCreado;
    //privete Time HoradeInicio;
    
    public String getNombre(){
        return Nombre;
        
    }
    
    public void setNombre(String Nombre_){
         this.Nombre = Nombre_;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public TimeStamp getFechaCreado() {
        return FechaCreado;
    }

    public void setFechaCreado(TimeStamp FechaCreado) {
        this.FechaCreado = FechaCreado;
    }
    
}
