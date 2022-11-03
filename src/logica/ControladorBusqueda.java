/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import logica.interfaz.IControladorBusqueda;
import Servicios.BusquedaServicio;
/**
 *
 * @author Nico
 */
public class ControladorBusqueda implements IControladorBusqueda{
    BusquedaServicio servicio = new BusquedaServicio();
    private static ControladorBusqueda instancia;
    
    
    public ControladorBusqueda()
    {
        this.servicio = new BusquedaServicio();
    }
    
    public static ControladorBusqueda getInstance() {
        if (instancia == null) {
            instancia = new ControladorBusqueda();
        }
        return instancia;
    }
    
    public String busqueda(String plataformas, String categorias, String busqueda){
        String json = "";
        
        
        json = servicio.busqueda(plataformas, categorias, busqueda);
        
        return json;
    }
}
