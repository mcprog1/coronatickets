/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Time;

/**
 *
 * @author Cristian
 */
public class Paquetes {
    private String Nombre,Descripcion;
    private Time FechaInicio,Fechafinalizado;
    private float Descuento;
    private TimeStamp  FechaCreada;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Time getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Time FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public Time getFechafinalizado() {
        return Fechafinalizado;
    }

    public void setFechafinalizado(Time Fechafinalizado) {
        this.Fechafinalizado = Fechafinalizado;
    }

    public float getDescuento() {
        return Descuento;
    }

    public void setDescuento(float Descuento) {
        this.Descuento = Descuento;
    }

    public TimeStamp getFechaCreada() {
        return FechaCreada;
    }

    public void setFechaCreada(TimeStamp FechaCreada) {
        this.FechaCreada = FechaCreada;
    }
    
    
}
