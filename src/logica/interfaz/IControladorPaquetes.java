/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.interfaz;

import Clases.Espetaculo;
import Clases.Paquetes;
import Clases.Plataformas;
import java.util.ArrayList;

/**
 *
 * @author Nico
 */
public interface IControladorPaquetes {
    public abstract ArrayList<Paquetes>obtenerPaquetesEspectaculos(String nombre);
    public abstract ArrayList<Espetaculo>obtenerEspectaculosPaquetes(String nombre);
    public abstract ArrayList<Paquetes>obtenerPaquetes();
    public abstract Paquetes obtenerDato(String nombre);
    public abstract void agregarPaqueteEspectaculo(String espectaculo, String paquete);
}
