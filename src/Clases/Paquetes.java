/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Time;
import java.sql.Timestamp;

/**
 *
 * @author Cristian
 */
public class Paquetes {
<<<<<<< HEAD
    private String Nombre,Descripcion;
    private DtFecha FechaInicio,Fechafinalizado;
    private float Descuento;
    private /*Timestamp*/String  FechaCreada;
    
     public Paquetes (String nom ,String Descripcion,DtFecha FechaInicio ,DtFecha Fechafinalizado,float Descuento,/*Timestamp*/String FechaCreada){
=======

    private String Nombre, Descripcion, Imagen;
    private DtFecha FechaInicio, Fechafinalizado;
    private float Descuento;
    private /*Timestamp*/ String FechaCreada;

    public Paquetes(String nom, String Descripcion, DtFecha FechaInicio, DtFecha Fechafinalizado, float Descuento,/*Timestamp*/ String FechaCreada, String imagen) {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
        this.Nombre = nom;
        this.Descripcion = Descripcion;
        this.FechaInicio = FechaInicio;
        this.Fechafinalizado = Fechafinalizado;
        this.Descuento = Descuento;
        this.FechaCreada = FechaCreada;
<<<<<<< HEAD
        
    }

    
    public Paquetes(String nombre_, String Descripcion_, DtFecha Fecha_Inicio_, DtFecha Fecha_Fin_,Float Descuento_) {
        this.Nombre=nombre_;
        this.Descripcion=Descripcion_;
        this.FechaInicio= Fecha_Inicio_;
        this.Fechafinalizado= Fecha_Fin_;
        this.Descuento= Descuento_;
    }

    public Paquetes() {}
    
=======
        this.Imagen = imagen;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String Imagen) {
        this.Imagen = Imagen;
    }

    public Paquetes(String nombre_, String Descripcion_, DtFecha Fecha_Inicio_, DtFecha Fecha_Fin_, Float Descuento_) {
        this.Nombre = nombre_;
        this.Descripcion = Descripcion_;
        this.FechaInicio = Fecha_Inicio_;
        this.Fechafinalizado = Fecha_Fin_;
        this.Descuento = Descuento_;
    }

    public Paquetes() {
    }

>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
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

    public DtFecha getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(DtFecha FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public DtFecha getFechafinalizado() {
        return Fechafinalizado;
    }

    public void setFechafinalizado(DtFecha Fechafinalizado) {
        this.Fechafinalizado = Fechafinalizado;
    }

    public float getDescuento() {
        return Descuento;
    }

    public void setDescuento(float Descuento) {
        this.Descuento = Descuento;
    }

<<<<<<< HEAD
    public /*Timestamp*/String getFechaCreada() {
=======
    public /*Timestamp*/ String getFechaCreada() {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
        return FechaCreada;
    }

    public void setFechaCreada(/*Timestamp*/String FechaCreada) {
        this.FechaCreada = FechaCreada;
    }
<<<<<<< HEAD
    
    
=======

>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
}
