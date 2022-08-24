package logica;
import logica.interfaz.IControladorEspetaculo;
import Servicios.EspetaculoServicio;
import Servicios.PlataformaServicio;
import java.util.ArrayList;
import Clases.Plataformas;
/**
 *
 * @author Cristian
 */
public class ControladorEspetaculo implements IControladorEspetaculo{
    private EspetaculoServicio espetaculoServicio;
    private PlataformaServicio plataformaServicio;
    private static ControladorEspetaculo instancia;
    
    public ControladorEspetaculo(){
        this.espetaculoServicio = new EspetaculoServicio();
        this.plataformaServicio = new PlataformaServicio();
    }
    
    public static ControladorEspetaculo getInstance() {
        if (instancia == null) {
            instancia = new ControladorEspetaculo();
        }
        return instancia;
    }
        
    public void crearEspetaculo()
    {
        
    }
    
    public String crearPlataforma(String nombre, String desc, String url)
    {
        boolean checkName =this.plataformaServicio.checkPlataforma(nombre); 
        String cod = "N";
        
        if(!checkName) //Entonces si puedo continuar
        {
            if(this.plataformaServicio.crearPlataforma(nombre, desc, url))
            {
                cod = "S";                
            }
        }else{
            cod = "E";
        }
        return cod;
    }
    
    
    public ArrayList<Plataformas> tblPlataforma(){
        ArrayList<Plataformas> datos = new ArrayList<>();
        datos = this.plataformaServicio.datosList();
        return datos;
    }
    
}
