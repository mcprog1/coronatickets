/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Interface.IControladorUsuario;


/**
 *
 * @author Cristian
 */
public class Fabrica {
    
    private static Fabrica instancia;
    
    public static Fabrica getInstance() {
        if (instancia == null) {
            instancia = new Fabrica();
        }
        return instancia;
    }
    
     
     public IControladorUsuario getIControladorUsuario() {
        IControladorUsuario Controlador = ControladorUsuario.getinstancia();
        return Controlador;
        
    }
    private Fabrica() {
    }
    
}
