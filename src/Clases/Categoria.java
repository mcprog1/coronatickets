/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Luciano
 */
public class Categoria {

    private int Id;
    private String Nombre;
    private char Vigente;

    public Categoria(int id, String nombre, char vigente) {

        this.Id = id;
        this.Nombre = nombre;
        this.Vigente = vigente;
    }
    
    public Categoria(){
        
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getNombre(){
        return Nombre;
    }
    
    public void setNombre(String nombre){
        this.Nombre = nombre;
    }
    
    public char getVigente(){
       return Vigente;
    }
    
    public void setVigente(char vigente){
        this.Vigente = vigente;
    }
}
