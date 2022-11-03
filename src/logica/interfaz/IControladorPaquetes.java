/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.interfaz;

import Clases.Espectaculo;
import Clases.Paquetes;
import Clases.Plataformas;
<<<<<<< HEAD
=======
import java.io.File;
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
import java.util.ArrayList;
import java.sql.Time;
import java.sql.Date;
/**
 *
 * @author Nico
 */
public interface IControladorPaquetes {
<<<<<<< HEAD
    public abstract String crearpaquete(String nom ,String Descripcion,Date FechaInicio ,Date Fechafinalizado,float Descuento,/*TimeStamp*/String FechaCreada);
=======
    public abstract String crearpaquete(String nom ,String Descripcion,Date FechaInicio ,Date Fechafinalizado,float Descuento, File imagen);
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
    public abstract ArrayList<Paquetes>obtenerPaquetesEspectaculos(String nombre);
    public abstract ArrayList<Espectaculo>obtenerEspectaculosPaquetes(String nombre);
    public abstract ArrayList<Paquetes>obtenerPaquetes();
    public abstract Paquetes obtenerDato(String nombre);
    public abstract void agregarPaqueteEspectaculo(String espectaculo, String paquete);
<<<<<<< HEAD
    
    public String comprarPaquete(String paquete, String nickname);
=======
    public abstract  String obtenerPaquete(String nombre);
    public abstract void AltaPaquete(String nombre ,String Descripcion,String FechaInicio ,String Fechafinalizado,String Descuento, String imagen);
    public abstract void ActualizarPaquete(String nombre ,String Descripcion,String FechaInicio ,String Fechafinalizado,String Descuento, String imagen);
    public String categoriasPaquete(String nombre);
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
}
