/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Clases.Funciones;
import Persistencia.ConexionDB;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Cristian
 */
public class ServiciosRegistros {
    
      private Connection conn = new ConexionDB().getConexion();

    public ServiciosRegistros() {

    }
    
     //Esto esta bien 
    public ArrayList<Funciones> funcionesEspectador(String nick){
        ArrayList<Funciones> funciones = new ArrayList<>();
        Funciones fun;
        try {
            PreparedStatement sentencia = conn.prepareStatement("SELECT registro.reg_esp_funcion FROM registro WHERE registro.reg_usu_nick = ?");
            sentencia.setString(1, nick);
            ResultSet resultado = sentencia.executeQuery();
            while(resultado.next()){
                fun = new Funciones();
                fun.setNombre(resultado.getString("reg_esp_funcion"));
                funciones.add(fun);     
            }
            resultado.close();
            sentencia.close();
            return funciones;
            
            
        } catch (SQLException e) {
            System.out.println("Error al buscar Funciones");
        }
        return funciones;
        
    }
    
    
}
