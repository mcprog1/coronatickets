package logica;
import Clases.Espetaculo;
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
        
    public void crearEspetaculo(String plataforma, String artista, String nombre, int duracion, int maximo, int minimo, String url, float costo)
    {
        this.espetaculoServicio.crearActualizarEspetaculo(nombre, plataforma, artista, url, duracion, minimo, minimo, url, costo);
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
    
     public ArrayList<Espetaculo> tblEspectaculo(){
        ArrayList<Espetaculo> datos = new ArrayList<>();
        datos = this.espetaculoServicio.datosLista();
        return datos;
    }
    
      public ArrayList<Espetaculo> tblEspectaculoPlataforma(String plataforma){
        ArrayList<Espetaculo> datos = new ArrayList<>();
        datos = this.espetaculoServicio.datosListaPlataforma(plataforma);
        return datos;
    }
    
    public ArrayList<Espetaculo> tblEspectaculoNoPaquete(String paquete, String plataforma){
        ArrayList<Espetaculo> datos = new ArrayList<>();
        datos = this.espetaculoServicio.espectaculosLibresPaquete(paquete, plataforma);
        return datos;
    }
    
    public Espetaculo obtenerDato(String nombre){
        Espetaculo esp ;
        esp = this.espetaculoServicio.obtenerDato(nombre);
        return esp;
    }
     
}
