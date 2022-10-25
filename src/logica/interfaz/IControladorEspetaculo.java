
package logica.interfaz;
import Clases.Categoria;
import Clases.Espectaculo;
import Clases.Funciones;
import Clases.Plataformas;
import java.util.ArrayList;
/**
 *
 * @author Nico
 */
public interface IControladorEspetaculo {
    public abstract String crearPlataforma(String nombre, String desc, String url);
    public abstract ArrayList<Plataformas> tblPlataforma();
    public abstract ArrayList<Categoria> tblCategoria();
    public abstract ArrayList<Espectaculo> tblEspectaculo();
    public abstract ArrayList<Espectaculo> tblEspectaculoPlataforma(String plataforma);
    public abstract ArrayList<Espectaculo> tblEspectaculoNoPaquete(String paquete, String plataforma);
    public abstract Espectaculo obtenerDato(String nombre);
    public abstract String crearEspetaculo(String plataforma, String artista, String nombre, int duracion, int maximo, int minimo, String url, float costo);
    public abstract ArrayList<Espectaculo> tablaespetaculo(String nom);//Busco espetaculo a traves del nickname del artista
    public abstract ArrayList<Funciones> ListaFuncionesEspectador(String nick);//funciones que esta registrado el Espectador
    public abstract void nuevoEspectaculo(String nombre, String plataforma, String artista, String descripcion, String duracion, String espMax, String espMin, String url, String costo, ArrayList<String> categorias, String imagen);
    public abstract boolean checkEspectaculo(String nombre);
    public abstract String Espectaculos(String paquete, String plataforma);
    public abstract String Espectaculo(String nombre);
    public abstract String funcionesEspectaculo(String nombre);
    public abstract String paquetesEspectaculo(String nombre);
    public abstract String categoriasEspectaculo(String nombre);
    public abstract String espectaculosPaquete(String paquete);
    public abstract String espectaculosPlataforma(String plataforma);
    public abstract String espectaculosCategoria(String categoria); //aa
    public abstract String Plataformas();
    public abstract String Categorias();
}
