/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;
import Clases.Espetaculo;
import Clases.Paquetes;
import Servicios.*;
import java.util.ArrayList;
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
    
   public ControladoraPaquetes(){
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
    
    public ArrayList<Espetaculo> obtenerEspectaculosPaquetes(String nombre){
        ArrayList<Espetaculo> datos = new ArrayList<>();
        datos = this.paquetesServicio.obtenerEspectaculoPaquetes(nombre);
        return datos;
    }
    
    public void agregarPaqueteEspectaculo(String espectaculo,String paquete)
    {
        this.paquetesServicio.agregarPaqueteEspectaculo(espectaculo, paquete);
    }
    
}
