/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import Clases.Espetaculo;
import Persistencia.ConexionDB;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author Nico
 */
public class EspetaculoServicio {
    
    private Connection conn = new ConexionDB().getConexion();

    public EspetaculoServicio() {

    }
    //Consulto los Espetaculos de un Artista con "NomArtista" , este arista puede tener 1 o mas espetaculos
    //Esta funcion tendria que estar en servicios espetaculos
    public ArrayList<Espetaculo> consultarOrganizadorEspetaculo(String NomArtista) {
        Espetaculo es;
        ArrayList<Espetaculo> organizador = new ArrayList<>();
        try {
            PreparedStatement consulta = conn.prepareStatement("SELECT * FROM espetaculos  WHERE esp_art_organizador = ?");
            consulta.setString(1, NomArtista);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                es = new Espetaculo();//para que sean registros nuevos 
                es.setNombre(resultado.getString("esp_nombre"));
                es.setDescripcion(resultado.getString("esp_descripcion"));
                es.setCosto(resultado.getInt("esp_costo"));
                es.setArtistaOrganizador(resultado.getString("esp_art_organizador"));
                es.setURL(resultado.getString("esp_url_asociada"));
                es.setCapacidadMaxima(resultado.getInt("esp_espectadores_max"));
                es.setCapacidadMinima(resultado.getInt("esp_espectadores_min"));

                organizador.add(es);
            }

            return organizador;
        } catch (SQLException e) {
            System.out.println("Error al buscar Espetaculos");
        }
        return organizador;
    }
}
