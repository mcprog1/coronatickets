
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
    public ArrayList<Plataformas> tblPlataforma();
    public abstract void crearEspetaculo();
}
