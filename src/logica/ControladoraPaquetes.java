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
import Clases.TimeStamp;
import Servicios.EspectaculoServicio;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
    
    public Clases.DtFecha dateToDTFecha(Date fecha){
        if(fecha != null){
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String fechaDB = dateFormat.format(fecha);
            String[] partes = fechaDB.split("-");
            return new Clases.DtFecha(partes[2],partes[1],partes[0]);
        }
        else{
            return new Clases.DtFecha("0","0","0");
        }
    }
    
    public String crearpaquete(String nom ,String Descripcion,Date FechaInicio ,Date Fechafinalizado,float Descuento,/*Timestamp*/String FechaCreada){
        
        boolean i = false;
        String info;
        boolean verificar = false;
        Paquetes p = new Paquetes(nom , Descripcion, dateToDTFecha(FechaInicio), dateToDTFecha(Fechafinalizado), Descuento, FechaCreada);
        
        
        System.out.println(nom);
        verificar = serviciosP.validarPaquetes(nom) ;
        System.out.println(verificar);
        try {
            if(verificar == true){
                serviciosP.addPaquetes(p);
                //info = "B";//bien
                return "B";
            }else{
                return "D";//denegado
            }
            
            
        }  catch (SQLException ex) {
            ex.printStackTrace();
                return "F";//denegado
        }
    }
    
    
}
