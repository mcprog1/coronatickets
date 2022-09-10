package logica;
import Clases.Espectaculo;
import Clases.Funciones;
import logica.interfaz.IControladorEspetaculo;
import Servicios.EspectaculoServicio;
import Servicios.PlataformaServicio;
import java.util.ArrayList;
import Clases.Plataformas;
import Servicios.ServiciosRegistros;
/**
 *
 * @author Cristian
 */
public class ControladorEspectaculo implements IControladorEspetaculo{
    private EspectaculoServicio espectaculoServicio;
    private PlataformaServicio plataformaServicio;
    private ServiciosRegistros servicioRegistro;
    private static ControladorEspectaculo instancia;
    
    public ControladorEspectaculo(){
        this.espectaculoServicio = new EspectaculoServicio();
        this.plataformaServicio = new PlataformaServicio();
        this.servicioRegistro = new ServiciosRegistros();
    }
    
    public static ControladorEspectaculo getInstance() {
        if (instancia == null) {
            instancia = new ControladorEspectaculo();
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
    
     public ArrayList<Espectaculo> tblEspectaculo(){
        ArrayList<Espectaculo> datos = new ArrayList<>();
        datos = this.espetaculoServicio.datosLista();
        return datos;
    }
    
      public ArrayList<Espectaculo> tblEspectaculoPlataforma(String plataforma){
        ArrayList<Espectaculo> datos = new ArrayList<>();
        datos = this.espetaculoServicio.datosListaPlataforma(plataforma);
        return datos;
    }
    
    public ArrayList<Espectaculo> tblEspectaculoNoPaquete(String paquete, String plataforma){
        ArrayList<Espectaculo> datos = new ArrayList<>();
        datos = this.espetaculoServicio.espectaculosLibresPaquete(paquete, plataforma);
        return datos;
    }
    
    public Espectaculo obtenerDato(String nombre){
        Espectaculo esp ;
        esp = this.espetaculoServicio.obtenerDato(nombre);
        return esp;
    }
     
    public ArrayList<Espectaculo> tablaespetaculo(String nom) {
        ArrayList<Espectaculo> espectaculos = new ArrayList<>();
        try {
            espectaculos = espectaculoServicio.consultarOrganizadorEspetaculo(nom);
        } catch (Exception e) {
            System.out.println("Error en buscar el nombre de los espetaculos por el nombre del artista");
        }
        return espectaculos;
    }
    
   
   public ArrayList<Funciones> ListaFuncionesEspectador(String nick){
        ArrayList<Funciones> f = new ArrayList<>();
        try {
            f = servicioRegistro.funcionesEspectador(nick);
            return f;
        } catch (Exception e) {
            System.out.println("Error al buscar funciones de un espectador");
        }
        return f;
    
    }
}