
package logica.interfaz;
import Clases.Espectaculo;
import Clases.Funciones;
import Clases.Plataformas;
import Clases.TimeStamp;
import java.sql.Time;
import java.util.ArrayList;
/**
 *
 * @author Nico
 */
public interface IControladorEspetaculo {
    public abstract String crearPlataforma(String nombre, String desc, String url);
    public abstract ArrayList<Plataformas> tblPlataforma();
    public abstract ArrayList<Espectaculo> tblEspectaculo();
    public abstract ArrayList<Espectaculo> tblEspectaculoPlataforma(String plataforma);
    public abstract ArrayList<Espectaculo> tblEspectaculoNoPaquete(String paquete, String plataforma);
    public abstract Espectaculo obtenerDato(String nombre);
    public abstract String crearEspetaculo(String plataforma, String artista, String nombre, int duracion, int maximo, int minimo, String url, float costo);
    public abstract ArrayList<Espectaculo> tablaespetaculo(String nom);//Busco espetaculo a traves del nickname del artista
    public abstract ArrayList<Funciones> ListaFuncionesEspectador(String nick);//funciones que esta registrado el Espectador
    
    
   
}
