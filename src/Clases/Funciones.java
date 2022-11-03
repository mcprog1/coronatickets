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

<<<<<<< HEAD
    private String Nombre, imagen;
    private Timestamp Fecha;
    private Timestamp FechaCreado;
    private Timestamp HoraDeInicio;
   
=======
    private String Nombre, Imagen;
    private Timestamp Fecha;
    private Timestamp FechaCreado;
    private Timestamp HoraDeInicio;
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
    
    public Funciones(String nombre, Timestamp fecha,  Timestamp horaDeInicio, Timestamp fechaCreado, String imagen){
        this.Nombre = nombre;
        this.Fecha = fecha;
        this.FechaCreado = fechaCreado;
        this.HoraDeInicio = horaDeInicio;
<<<<<<< HEAD
        this.imagen = imagen;
=======
        this.Imagen = imagen;
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
    }

    public Funciones() {}
    
<<<<<<< HEAD
=======
    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String Imagen) {
        this.Imagen = Imagen;
    }
    
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
    public String getNombre() {
        return Nombre;
    }

<<<<<<< HEAD
    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
=======
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
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
