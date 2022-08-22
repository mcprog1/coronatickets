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
public class ControladoraPaquetes {
    
      public ControladoraPaquetes(){
       
    }
    
    private static ControladoraPaquetes instancia;
   
    public ControladoraPaquetes getinstancia(){
        if(instancia == null){
            instancia = new ControladoraPaquetes();
        }
        return instancia;
    }
}
