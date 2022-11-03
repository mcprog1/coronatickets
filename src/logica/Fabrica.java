/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;
import logica.interfaz.*;
import logica.*;

import Interface.IControladorFuncion;
import logica.interfaz.IControladorEspetaculo;
import logica.ControladorEspectaculo;
<<<<<<< HEAD
import logica.interfaz.*;
=======
import logica.interfaz.IControladorPaquetes;
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7

import logica.interfaz.IControladorUsuario;

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

<<<<<<< HEAD
=======
    private Fabrica() {
    }

>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
    public IControladorEspetaculo getIControladorEspectaculo() {
        IControladorEspetaculo ControladorE = ControladorEspectaculo.getInstance();
        return ControladorE; 
    }
    
    public IControladorPaquetes getIControladorpaquetes() {
        IControladorPaquetes ControladorP = ControladoraPaquetes.getInstance();
        return ControladorP;
        
        
    }
    
     public IControladorPaquetes getIControladorPaquete() {
        IControladorPaquetes ControladorP = ControladoraPaquetes.getInstance();
        return ControladorP; //To change body of generated methods, choose Tools | Templates.
    }

    public IControladorFuncion getIControladorFuncion() {
        IControladorFuncion Controlador = ControladorFuncion.getInstance();
        return Controlador;
    }
<<<<<<< HEAD
    
    public IControladorCategoria getIControladorCategoria() {
        IControladorCategoria Controlador = ControladorCategoria.getInstance();
        return Controlador;
    }
    
    public IControladorBusqueda getIControladorBusqueda() {
        IControladorBusqueda Controlador = ControladorBusqueda.getInstance();
        return Controlador;
    }
=======
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
}
