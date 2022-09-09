
package logica.interfaz;
import Clases.Espetaculo;
import Clases.Plataformas;
import java.util.ArrayList;
/**
 *
 * @author Nico
 */
public interface IControladorEspetaculo {
    public abstract String crearPlataforma(String nombre, String desc, String url);
    public abstract ArrayList<Plataformas> tblPlataforma();
    public abstract ArrayList<Espetaculo> tblEspectaculo();
    public abstract ArrayList<Espetaculo> tblEspectaculoPlataforma(String plataforma);
    public abstract ArrayList<Espetaculo> tblEspectaculoNoPaquete(String paquete, String plataforma);
    public abstract Espetaculo obtenerDato(String nombre);
    public abstract void crearEspetaculo(String plataforma, String artista, String nombre, int duracion, int maximo, int minimo, String url, float costo);
}
