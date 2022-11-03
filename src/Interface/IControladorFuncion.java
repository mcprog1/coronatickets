/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Clases.Artista;
import Clases.Funciones;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luciano
 */
public interface IControladorFuncion {

    public int AltaFuncion(String nombreEspectaculo, String nombre, String dia, String mes, String anio, String hora, String minuto, List artistas, String url);

    public Funciones ConsultaFuncion(String nombreFuncion, String nombreEspectaculo) throws SQLException;

    public ArrayList ListarPlataformas();

    public ArrayList ListarEspectaculosPlataforma(String nombre);

    public ArrayList ListarArtistas();

    public ArrayList ListarNombreArtistasFuncion(String nombre);

    public ArrayList ListarFuncionesEspectaculo(String nombre);

    public ArrayList ListarEspectadores();
    
    public ArrayList ListarRegistrosUsuarioEspectaculo(String nickEspectador, String nombreEspectaculo);
    
    public int EspectaculoLleno(String nombreEspectaculo, String nombreFuncion);
    
    public int EspectadorEnFuncion(String nick,  String nombreFuncion);
    
    public void RegistrarEspectadorFuncion(String nickEspectador, String nombreEspectaculo, String nombreFuncion);
    
    public void CanjearRegistroEspectadorFuncion(String nickEspectador, String nombreEspectaculo, String nombreFuncion, List RegistrosPrevios);
    
    public abstract Funciones obtenerDatosFuncion(String nombre);
    
    public abstract String existeNombreFuncion(String nombre);
    
    public abstract ArrayList<Artista> obtenerArtistasFuncion(String nombre);
    
    public abstract String tieneCanjeDisponible(String nickname);
    public abstract String obtenerRegistroCanjera(String nickname);
}
