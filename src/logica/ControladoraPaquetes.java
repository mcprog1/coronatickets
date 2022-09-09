/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;
import Clases.Espectaculo;
import Clases.Paquetes;
import Servicios.*;
import java.util.ArrayList;
import logica.interfaz.IControladorPaquetes;


import Clases.Paquetes;
import Clases.TimeStamp;
import Servicios.EspectaculoServicio;

import java.sql.Time;

import java.sql.Timestamp;
import logica.interfaz.IControladorPaquetes;

/**
 *
 * @author Cristian
 */
public class ControladoraPaquetes implements IControladorPaquetes{
    
      
    
    private static ControladoraPaquetes instancia;
    private EspetaculoServicio espetaculoServicio;
    private PlataformaServicio plataformaServicio;
    private PaquetesServicio paquetesServicio;
    private EspectaculoServicio serviciosP;

    public ControladoraPaquetes(){
        this.serviciosP = new EspectaculoServicio();
        this.espetaculoServicio = new EspetaculoServicio();
        this.plataformaServicio = new PlataformaServicio();
        this.paquetesServicio = new PaquetesServicio();
       
    }
    public static ControladoraPaquetes getInstance(){
        if(instancia == null){
            instancia = new ControladoraPaquetes();
        }
        return instancia;
    }
    
    public ArrayList<Paquetes> obtenerPaquetesEspectaculos(String nombre){
        ArrayList<Paquetes> datos = new ArrayList<>();
        datos = this.paquetesServicio.obtenerPaquetesEspectaculo(nombre);
        return datos;
    }
     
    public ArrayList<Paquetes>obtenerPaquetes()
    {
        ArrayList<Paquetes> datos = new ArrayList<>();
        datos = this.paquetesServicio.obtenerPaquetes();
        return datos;
    }
     
    public Paquetes obtenerDato(String nombre)
    {
        Paquetes datos;
        datos = this.paquetesServicio.obtenerDatos(nombre);
        return datos;
    }
    
    public ArrayList<Espectaculo> obtenerEspectaculosPaquetes(String nombre){
        ArrayList<Espectaculo> datos = new ArrayList<>();
        datos = this.paquetesServicio.obtenerEspectaculoPaquetes(nombre);
        return datos;
    }
    
    public void agregarPaqueteEspectaculo(String espectaculo,String paquete)
    {
        this.paquetesServicio.agregarPaqueteEspectaculo(espectaculo, paquete);
    }
    
    public String crearpaquete(String nom ,String Descripcion,Time FechaInicio ,Time Fechafinalizado,float Descuento,/*Timestamp*/String FechaCreada){
        
        boolean i = false;
        String info;
        boolean verificar = false;
        Paquetes p = new Paquetes(nom , Descripcion, FechaInicio , Fechafinalizado, Descuento, FechaCreada);
        
        
        verificar = serviciosP.validarPaquetes(nom) ;
        
        try {
            if(verificar == true){
                serviciosP.addPaquetes(p);
                info = "B";//bien
                return info;
                
                
            }else return info = "D";//denegado
            
        } catch (Exception e) {
            System.out.println("Error al crear el paquete");
        }
        return info = "F";//fallo
    }
    
    
}
