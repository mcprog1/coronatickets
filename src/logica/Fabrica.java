/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;
import logica.interfaz.*;
import logica.*;

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
    
    public IControladorEspetaculo getIControladorEspectaculo() {
        IControladorEspetaculo ControladorE = ControladorEspetaculo.getInstance();
        return ControladorE; //To change body of generated methods, choose Tools | Templates.
    }
    
     public IControladorPaquetes getIControladorPaquete() {
        IControladorPaquetes ControladorP = ControladoraPaquetes.getInstance();
        return ControladorP; //To change body of generated methods, choose Tools | Templates.
    }
    
}
