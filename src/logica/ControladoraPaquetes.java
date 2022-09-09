/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;


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
public class ControladoraPaquetes implements IControladorPaquetes {
    
    private EspectaculoServicio serviciosP;
    public ControladoraPaquetes(){
       this.serviciosP = new EspectaculoServicio();
    }
    
    private static ControladoraPaquetes instancia;
   
    public static ControladoraPaquetes getinstancia(){
        if(instancia == null){
            instancia = new ControladoraPaquetes();
        }
        return instancia;
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
