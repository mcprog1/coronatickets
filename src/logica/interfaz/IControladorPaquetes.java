/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.interfaz;

import java.sql.Time;

/**
 *
 * @author laptopwin
 */
public interface IControladorPaquetes {
    
    public abstract String crearpaquete(String nom ,String Descripcion,Time FechaInicio ,Time Fechafinalizado,float Descuento,/*TimeStamp*/String FechaCreada);
    
}
