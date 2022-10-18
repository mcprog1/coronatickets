/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import Clases.Categorias;
import Servicios.CategoriaServicio;
import java.util.ArrayList;
import Servicios.*;
import logica.interfaz.IControladorCategoria;

/**
 *
 * @author Nico
 */
public class ControladorCategoria implements IControladorCategoria{
    
    private static ControladorCategoria instancia;
    private CategoriaServicio categoriaServicio;
    
    public ControladorCategoria()
    {
        this.categoriaServicio = new CategoriaServicio();
    }
    
    public static ControladorCategoria getInstance() {
        if (instancia == null) {
            instancia = new ControladorCategoria();
        }
        return instancia;
    }
    
    public ArrayList<Categorias> tblCategorias(){
        ArrayList<Categorias> categoria = new ArrayList<>();
        categoria = this.categoriaServicio.datosList();
        return categoria;
    }
    
    public String crearCategoria(String nombre)
    {
        return this.categoriaServicio.crearCategoria(nombre);
    }
    
        
}
