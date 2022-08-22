/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Cristian
 */
public class ControladorEspetaculo {
    
    public ControladorEspetaculo(){
        
    }
    private static ControladorEspetaculo instancia;
    
    public ControladorEspetaculo getinstancia(){
        if( instancia == null){
            instancia = new ControladorEspetaculo();
        }
        return instancia;
    }
    
}
