/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.interfaz;

import Clases.Espectaculo;
import Clases.Paquetes;
import Clases.Plataformas;
import java.util.ArrayList;
import java.sql.Time;
import java.sql.Date;
/**
 *
 * @author Nico
 */
public interface IControladorPaquetes {
    public abstract String crearpaquete(String nom ,String Descripcion,Date FechaInicio ,Date Fechafinalizado,float Descuento,/*TimeStamp*/String FechaCreada);
    public abstract ArrayList<Paquetes>obtenerPaquetesEspectaculos(String nombre);
    public abstract ArrayList<Espectaculo>obtenerEspectaculosPaquetes(String nombre);
    public abstract ArrayList<Paquetes>obtenerPaquetes();
    public abstract Paquetes obtenerDato(String nombre);
    public abstract void agregarPaqueteEspectaculo(String espectaculo, String paquete);
    
    public String comprarPaquete(String paquete, String nickname);
}
