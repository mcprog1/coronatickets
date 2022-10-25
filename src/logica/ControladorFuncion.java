/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Clases.Artista;
import Clases.Espectador;
import Clases.Espectaculo;
import Clases.Funciones;
import Clases.Plataformas;
import Interface.IControladorFuncion;
import Servicios.FuncionServicio;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luciano
 */
public class ControladorFuncion implements IControladorFuncion {

    private FuncionServicio servicioFunciones;
    private static ControladorFuncion instancia;

    public ControladorFuncion() {
        this.servicioFunciones = new FuncionServicio();
    }
//------------------------------------------------------------------------------

    public static ControladorFuncion getInstance() {
        if (instancia == null) {
            instancia = new ControladorFuncion();
        }
        return instancia;
    }
//------------------------------------------------------------------------------

    public int AltaFuncion(String nombreEspectaculo, String nombre, String dia, String mes, String anio, String hora, String minuto, List artistas) {

        GregorianCalendar calendar = new GregorianCalendar();//Para saber si el año es bisiesto

        if (Integer.parseInt(anio) < 2022) {//Verifica que el año sea mayor al actual
            return 1;
        } else {
            if (Integer.parseInt(mes) > 12 || Integer.parseInt(mes) < 1) {//Verifica que sea un mes valido
                return 2;
            } else {
                if (Integer.parseInt(dia) > 31 || Integer.parseInt(dia) < 1) {//Verifica que sea un dia valido
                    return 3;
                } else {
                    if (Integer.parseInt(mes) != 1 && Integer.parseInt(mes) != 3 && Integer.parseInt(mes) != 5 && Integer.parseInt(mes) != 7 && Integer.parseInt(mes) != 8 && Integer.parseInt(mes) != 10 && Integer.parseInt(mes) != 12 && Integer.parseInt(dia) > 30) {// Verifica que el dia coincida con los meses que tienen 31 dias
                        return 4;
                    } else {
                        if (Integer.parseInt(mes) == 2 && Integer.parseInt(dia) > 29) {//Verifica que febrero no tenga mas de 29 dias
                            return 4;
                        } else {
                            if (Integer.parseInt(mes) == 2 && Integer.parseInt(dia) == 29 && calendar.isLeapYear(Integer.parseInt(anio)) == false) {//Verifica que el año sea bisiesto
                                return 4;
                            } else {
                                if (Integer.parseInt(hora) > 23 || Integer.parseInt(hora) < 0) {//Verifica que la hora sea correcta
                                    return 5;
                                } else {
                                    if (Integer.parseInt(minuto) > 59 || Integer.parseInt(minuto) < 0) {//Verifica que los minutos sean correctos
                                        return 6;
                                    } else {
                                        String Fecha = anio + "-" + mes + "-" + dia;
                                        String Hora = Fecha + " " + hora + ":" + minuto + ":" + "00";
                                        Fecha = Fecha + " 00:00:00";

                                        Timestamp Tfecha = Timestamp.valueOf(Fecha);
                                        Timestamp Thora = Timestamp.valueOf(Hora);

                                        Long datetime = System.currentTimeMillis();
                                        Timestamp fechaCreacion = new Timestamp(datetime);

                                        if (Tfecha.before(fechaCreacion)) {
                                            return 7;
                                        } else {
                                            try {
                                                return servicioFunciones.AltaFuncion(nombreEspectaculo, nombre, Tfecha, Thora, fechaCreacion, artistas);
                                            } catch (SQLException ex) {
                                                Logger.getLogger(ControladorFuncion.class.getName()).log(Level.SEVERE, null, ex);
                                            }
                                            return 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
//------------------------------------------------------------------------------

    public ArrayList ListarPlataformas() {

        ArrayList<Plataformas> lista = new ArrayList();

        try {
            lista = servicioFunciones.ListarPlataformas();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorFuncion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
//------------------------------------------------------------------------------

    public ArrayList ListarEspectaculosPlataforma(String nombre) {

        ArrayList<Espectaculo> lista = new ArrayList();

        try {
            lista = servicioFunciones.ListarEspectaculosPlataforma(nombre);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorFuncion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
//------------------------------------------------------------------------------    

    public ArrayList ListarArtistas() {

        ArrayList<Artista> lista = new ArrayList();

        try {
            lista = servicioFunciones.ListarArtistas();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorFuncion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
//------------------------------------------------------------------------------   

    public Funciones ConsultaFuncion(String nombreFuncion, String nombreEspectaculo) throws SQLException {

        Funciones funcion = servicioFunciones.ConsultaFuncion(nombreFuncion, nombreEspectaculo);

        return funcion;
    }
//------------------------------------------------------------------------------   

    public ArrayList ListarNombreArtistasFuncion(String nombre) {

        ArrayList<String> lista = new ArrayList();

        try {
            lista = servicioFunciones.ListarArtistasFuncion(nombre);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorFuncion.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }
//------------------------------------------------------------------------------

    public ArrayList ListarFuncionesEspectaculo(String nombre) {

        ArrayList<Funciones> lista = new ArrayList();

        try {
            lista = servicioFunciones.ListarFuncionesEspectaculo(nombre);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorFuncion.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }
//------------------------------------------------------------------------------    

    public ArrayList ListarEspectadores() {

        ArrayList<Espectador> lista = new ArrayList();

        try {
            lista = servicioFunciones.ListarEspectadores();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorFuncion.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }
//------------------------------------------------------------------------------

    public ArrayList ListarRegistrosUsuarioEspectaculo(String nickEspectador, String nombreEspectaculo) {

        ArrayList<String> lista = new ArrayList();

        try {
            lista = servicioFunciones.ListarRegistrosUsuarioEspectaculo(nickEspectador, nombreEspectaculo);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorFuncion.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }
//------------------------------------------------------------------------------

    public int EspectaculoLleno(String nombreEspectaculo, String nombreFuncion) {

        try {
            return servicioFunciones.EspectaculoLleno(nombreEspectaculo, nombreFuncion);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorFuncion.class.getName()).log(Level.SEVERE, null, ex);
        }

        return 0;
    }
//------------------------------------------------------------------------------    

    public int EspectadorEnFuncion(String nick, String nombreFuncion) {

        try {
            return servicioFunciones.EspectadorEnFuncion(nick, nombreFuncion);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorFuncion.class.getName()).log(Level.SEVERE, null, ex);
        }

        return 0;
    }
//------------------------------------------------------------------------------  

    public void RegistrarEspectadorFuncion(String nickEspectador, String nombreEspectaculo, String nombreFuncion) {

        try {
            servicioFunciones.RegistrarEspectadorFuncion(nickEspectador, nombreEspectaculo, nombreFuncion);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorFuncion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //------------------------------------------------------------------------------
    public void CanjearRegistroEspectadorFuncion(String nickEspectador, String nombreEspectaculo, String nombreFuncion, List RegistrosPrevios) {
        try {
            servicioFunciones.CanjearRegistroEspectadorFuncion(nickEspectador, nombreEspectaculo, nombreFuncion, RegistrosPrevios);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorFuncion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Funciones obtenerDatosFuncion(String nombre)
    {
        Funciones funcion = servicioFunciones.obtenerDatosFuncion(nombre);
        return funcion;
    }
}
