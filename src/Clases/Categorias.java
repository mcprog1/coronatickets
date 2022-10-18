/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Nico
 */
public class Categorias {
    int id;
    String nombre;
    
    public Categorias(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }
    
    public Categorias() {}
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public int getId()
    {
        return this.id;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
}
