/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Timestamp;
import Clases.TimeStamp;

/**
 *
 * @author Cristian
 */
public class Espectador extends Usuarios {
    
    public Espectador(String Nickname, String Clave, String Nombre, String Apellido, String Mail,DtFecha f,String i, String imagen) {
        super(Nickname, Nombre, Apellido, Clave , Mail, f, i, imagen);
    }
    
}
