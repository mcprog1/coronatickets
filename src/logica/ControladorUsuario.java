/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Servicios.Servicios;
import Clases.Usuarios;
import java.util.Map;

/**
 *
 * @author Cristian
 */
public class ControladorUsuario {
    
    private Map<String,Usuarios> Usuarios;
    private final  Servicios serviciosUsuarios;
            
    public ControladorUsuario(){
       this.serviciosUsuarios = new Servicios();
    }
    
    private static ControladorUsuario instancia;
   
    public ControladorUsuario getinstancia(){
        if(instancia == null){
            instancia = new ControladorUsuario();
        }
        return instancia;
    }
    
    
    public boolean ValidarUsuario(String Nickname, String Gmail) {
        
        return false;
     
  }
    public void AltadeUsuario(){
        
        
        
    }
    
    
    
    
    
}
