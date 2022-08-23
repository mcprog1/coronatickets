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
public class Espetaculo {
    private String Nombre,ArtistaOrganizador,Descripcion,URL;
    private int Duracion,CapacidadMinima,CapacidadMaxima;
    private float Costo;
    private TimeStamp FechaCreado; 

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getArtistaOrganizador() {
        return ArtistaOrganizador;
    }

    public void setArtistaOrganizador(String ArtistaOrganizador) {
        this.ArtistaOrganizador = ArtistaOrganizador;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }

    public int getCapacidadMinima() {
        return CapacidadMinima;
    }

    public void setCapacidadMinima(int CapacidadMinima) {
        this.CapacidadMinima = CapacidadMinima;
    }

    public int getCapacidadMaxima() {
        return CapacidadMaxima;
    }

    public void setCapacidadMaxima(int CapacidadMaxima) {
        this.CapacidadMaxima = CapacidadMaxima;
    }

    public float getCosto() {
        return Costo;
    }

    public void setCosto(float Costo) {
        this.Costo = Costo;
    }

    public TimeStamp getFechaCreado() {
        return FechaCreado;
    }

    public void setFechaCreado(TimeStamp FechaCreado) {
        this.FechaCreado = FechaCreado;
    }
    
    
}
