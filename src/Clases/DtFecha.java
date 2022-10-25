/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Cristian
 */
public class DtFecha {
    String Dia,mes,anio;
    
    //constructor
    public DtFecha(){}
    
    public DtFecha(String dia, String mes, String anio){
        this.Dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    public String getDia() {
        return Dia;
    }

    public void setDia(String Dia) {
        this.Dia = Dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }
    
    
    
}
