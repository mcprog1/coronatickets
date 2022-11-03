/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;
<<<<<<< HEAD
=======

>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
import Clases.Espectaculo;
import Clases.Paquetes;
import Servicios.*;
import java.util.ArrayList;
import Clases.TimeStamp;
import Servicios.EspectaculoServicio;
<<<<<<< HEAD
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
=======
import java.io.File;
import java.sql.Date;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
import logica.interfaz.IControladorPaquetes;

/**
 *
 * @author Cristian
 */
<<<<<<< HEAD
public class ControladoraPaquetes implements IControladorPaquetes{
    
      
    
=======
public class ControladoraPaquetes implements IControladorPaquetes {

>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
    private static ControladoraPaquetes instancia;
    private EspetaculoServicio espetaculoServicio;
    private PlataformaServicio plataformaServicio;
    private PaquetesServicio paquetesServicio;
    private EspectaculoServicio serviciosP;

<<<<<<< HEAD
    public ControladoraPaquetes(){
=======
    public ControladoraPaquetes() {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
        this.serviciosP = new EspectaculoServicio();
        this.espetaculoServicio = new EspetaculoServicio();
        this.plataformaServicio = new PlataformaServicio();
        this.paquetesServicio = new PaquetesServicio();
<<<<<<< HEAD
       
    }
    public static ControladoraPaquetes getInstance(){
        if(instancia == null){
=======

    }

    public static ControladoraPaquetes getInstance() {
        if (instancia == null) {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
            instancia = new ControladoraPaquetes();
        }
        return instancia;
    }
<<<<<<< HEAD
    
    public ArrayList<Paquetes> obtenerPaquetesEspectaculos(String nombre){
=======

    public ArrayList<Paquetes> obtenerPaquetesEspectaculos(String nombre) {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
        ArrayList<Paquetes> datos = new ArrayList<>();
        datos = this.paquetesServicio.obtenerPaquetesEspectaculo(nombre);
        return datos;
    }
<<<<<<< HEAD
     
    public ArrayList<Paquetes>obtenerPaquetes()
    {
=======

    public ArrayList<Paquetes> obtenerPaquetes() {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
        ArrayList<Paquetes> datos = new ArrayList<>();
        datos = this.paquetesServicio.obtenerPaquetes();
        return datos;
    }
<<<<<<< HEAD
     
    public Paquetes obtenerDato(String nombre)
    {
=======

    public Paquetes obtenerDato(String nombre) {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
        Paquetes datos;
        datos = this.paquetesServicio.obtenerDatos(nombre);
        return datos;
    }
<<<<<<< HEAD
    
    public ArrayList<Espectaculo> obtenerEspectaculosPaquetes(String nombre){
=======

    public ArrayList<Espectaculo> obtenerEspectaculosPaquetes(String nombre) {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
        ArrayList<Espectaculo> datos = new ArrayList<>();
        datos = this.paquetesServicio.obtenerEspectaculoPaquetes(nombre);
        return datos;
    }
<<<<<<< HEAD
    
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
    
    public String comprarPaquete(String paquete, String nickname)
    {
        String r = "E";
        if(paquetesServicio.comproPaquete(paquete, nickname).equals("N"))
        {
           r = paquetesServicio.comprarPaquete(paquete, nickname);
        }else{
            r = "Y";
        }
        return r;
    }
    
=======

    public void agregarPaqueteEspectaculo(String espectaculo, String paquete) {
        this.paquetesServicio.agregarPaqueteEspectaculo(espectaculo, paquete);
    }

    public Clases.DtFecha dateToDTFecha(Date fecha) {
        if (fecha != null) {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String fechaDB = dateFormat.format(fecha);
            String[] partes = fechaDB.split("-");
            return new Clases.DtFecha(partes[2], partes[1], partes[0]);
        } else {
            return new Clases.DtFecha("0", "0", "0");
        }
    }

    public String crearpaquete(String nom, String Descripcion, Date FechaInicio, Date Fechafinalizado, float Descuento, File imagen) {
        
          String urlimagen = null;
        try {
            Map<String, String> headers = new HashMap<>();
            headers.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.88 Safari/537.36");
            ServicioImagen multipart = new ServicioImagen("https://upload-image-to-imgur.vercel.app/upload", "utf-8", headers);

            multipart.addFilePart("file", imagen);
            String response = multipart.finish();
            urlimagen = response;
        } catch (Exception ex) {
            Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        boolean i = false;
        String info;
        boolean verificar = false;
        Paquetes p = new Paquetes(nom, Descripcion, dateToDTFecha(FechaInicio), dateToDTFecha(Fechafinalizado), Descuento, "", urlimagen);

        verificar = serviciosP.validarPaquetes(nom);

        try {
            if (verificar == true) {
                serviciosP.addPaquetes(p);
                info = "B";//bien
                return info;

            } else {
                return info = "D";//denegado
            }
        } catch (Exception e) {
            System.out.println("Error al crear el paquete");
        }
        return info = "F";//fallo
    }

    public String obtenerPaquete(String nombre) {

        String paquete = paquetesServicio.obtenerPaquete(nombre);
        return paquete;

    }

    public void AltaPaquete(String nombre, String Descripcion, String FechaInicio, String Fechafinalizado, String Descuento, String imagen) {
        paquetesServicio.altaPaquete(nombre, Descripcion, FechaInicio, Fechafinalizado, Descuento, imagen);
    }

    public void ActualizarPaquete(String nombre, String Descripcion, String FechaInicio, String Fechafinalizado, String Descuento, String imagen) {
        paquetesServicio.actualizarPaquete(nombre, Descripcion, FechaInicio, Fechafinalizado, Descuento, imagen);
    }

    public String categoriasPaquete(String nombre) {
        String categoriasPaquete = paquetesServicio.categoriasPaquete(nombre);

        return categoriasPaquete;
    }

>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
}
