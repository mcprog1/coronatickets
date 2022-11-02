/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.*;

import java.sql.Timestamp;

/**
 *
 * @author Cristian
 */
public class Espectaculo {

    private String Nombre, ArtistaOrganizador, Descripcion, URL, Plataforma, Imagen;
    private int Duracion, CapacidadMinima, CapacidadMaxima;
    private float Costo;
    private Timestamp FechaCreado;

    public Espectaculo(String nombre, String artistaOrganizador, String descripcion, String url, int duracion, int capacidadMinima, int capacidadMaxima, float costo, Timestamp fechaCreado, String imagen) {
        this.Nombre = nombre;
        this.ArtistaOrganizador = artistaOrganizador;
        this.Descripcion = descripcion;
        this.URL = url;
        this.Duracion = duracion;
        this.CapacidadMinima = capacidadMinima;
        this.CapacidadMaxima = capacidadMaxima;
        this.Costo = costo;
        this.FechaCreado = fechaCreado;
        this.Imagen = imagen;
    }

    public Espectaculo() {
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String Imagen) {
        this.Imagen = Imagen;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPLataforma() {
        return Plataforma;
    }

    public void setPLataforma(String Plataforma) {
        this.Plataforma = Plataforma;
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

    public Timestamp getFechaCreado() {
        return FechaCreado;
    }

    public void setFechaCreado(Timestamp FechaCreado) {
        this.FechaCreado = FechaCreado;
    }

}
