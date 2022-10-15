/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package logica.interfaz;

import Clases.Categorias;
import java.util.ArrayList;

/**
 *
 * @author Nico
 */
public interface IControladorCategoria {
    public abstract ArrayList<Categorias> tblCategorias();
    public String crearCategoria(String nombre);
    
}
