/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;
import logica.interfaz.IControladorEspetaculo;
import logica.ControladorEspetaculo;

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
    
     

    private Fabrica() {
    }
    
    public IControladorEspetaculo getIControladorEspectaculo() {
        IControladorEspetaculo ControladorE = ControladorEspetaculo.getInstance();
        return ControladorE; //To change body of generated methods, choose Tools | Templates.
    }
    
}
