
package logica.interfaz;
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
    public ArrayList<Plataformas> tblPlataforma();
    public abstract void crearEspetaculo();
    public abstract ArrayList<Espectaculo> tablaespetaculo(String nom);//Busco espetaculo a traves del nickname del artista
    public abstract ArrayList<Funciones> ListaFuncionesEspectador(String nick);//funciones que esta registrado el Espectador
}
