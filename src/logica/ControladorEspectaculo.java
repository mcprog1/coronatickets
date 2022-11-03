package logica;
<<<<<<< HEAD
=======

import Clases.Categoria;
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
import Clases.Espectaculo;
import Clases.Funciones;
import logica.interfaz.IControladorEspetaculo;
import Servicios.EspectaculoServicio;
import Servicios.PlataformaServicio;
import java.util.ArrayList;
import Clases.Plataformas;
<<<<<<< HEAD
import Servicios.ServiciosRegistros;
=======
import Servicios.ServicioImagen;
import Servicios.ServiciosRegistros;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
/**
 *
 * @author Cristian
 */
<<<<<<< HEAD
public class ControladorEspectaculo implements IControladorEspetaculo{
=======
public class ControladorEspectaculo implements IControladorEspetaculo {

>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
    private EspectaculoServicio espectaculoServicio;
    private PlataformaServicio plataformaServicio;
    private ServiciosRegistros servicioRegistro;
    private static ControladorEspectaculo instancia;
<<<<<<< HEAD
    
    public ControladorEspectaculo(){
=======

    public ControladorEspectaculo() {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
        this.espectaculoServicio = new EspectaculoServicio();
        this.plataformaServicio = new PlataformaServicio();
        this.servicioRegistro = new ServiciosRegistros();
    }
<<<<<<< HEAD
    
=======

>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
    public static ControladorEspectaculo getInstance() {
        if (instancia == null) {
            instancia = new ControladorEspectaculo();
        }
        return instancia;
    }
<<<<<<< HEAD
        
    public String crearEspetaculo(String plataforma, String artista, String nombre, int duracion, int maximo, int minimo, String url, float costo, String descripcion)
    {
        String creo = "N";
        if(this.espectaculoServicio.crearActualizarEspetaculo(nombre, plataforma, artista, descripcion, duracion, maximo, minimo, url, costo))
        {
=======

    public String crearEspetaculo(String plataforma, String artista, String nombre, String descipcion, int duracion, int maximo, int minimo, String url, float costo, List categorias, File imagen) {
        String creo = "N";
        
          String urlimagen = null;
        try {
            Map<String, String> headers = new HashMap<>();
            headers.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.88 Safari/537.36");
            ServicioImagen multipart = new ServicioImagen("https://upload-image-to-imgur.vercel.app/upload", "utf-8", headers);

            multipart.addFilePart("file", imagen);
            String response = multipart.finish();
            urlimagen = response;
        } catch (Exception ex) {
            Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (this.espectaculoServicio.crearActualizarEspetaculo(nombre, plataforma, artista, descipcion, duracion, maximo, minimo, url, costo, categorias, urlimagen)) {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
            creo = "S";
        }
        return creo;
    }
<<<<<<< HEAD
    
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
=======

    public String crearPlataforma(String nombre, String desc, String url) {
        boolean checkName = this.plataformaServicio.checkPlataforma(nombre);
        String cod = "N";

        if (!checkName) //Entonces si puedo continuar
        {
            if (this.plataformaServicio.crearPlataforma(nombre, desc, url)) {
                cod = "S";
            }
        } else {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
            cod = "E";
        }
        return cod;
    }
<<<<<<< HEAD
    
    
    public ArrayList<Plataformas> tblPlataforma(){
        ArrayList<Plataformas> datos = new ArrayList<>();
        datos = this.plataformaServicio.datosList();
        return datos;
    }
    
     public ArrayList<Espectaculo> tblEspectaculo(){
=======

    public ArrayList<Plataformas> tblPlataforma() {
        ArrayList<Plataformas> datos = new ArrayList<>();
        datos = plataformaServicio.datosList();
        return datos;
    }

    public ArrayList<Espectaculo> tblEspectaculo() {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
        ArrayList<Espectaculo> datos = new ArrayList<>();
        datos = this.espectaculoServicio.datosLista();
        return datos;
    }
<<<<<<< HEAD
    
      public ArrayList<Espectaculo> tblEspectaculoPlataforma(String plataforma){
=======

    public ArrayList<Espectaculo> tblEspectaculoPlataforma(String plataforma) {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
        ArrayList<Espectaculo> datos = new ArrayList<>();
        datos = this.espectaculoServicio.datosListaPlataforma(plataforma);
        return datos;
    }
<<<<<<< HEAD
    
    public ArrayList<Espectaculo> tblEspectaculoNoPaquete(String paquete, String plataforma){
=======

    public ArrayList<Categoria> tblCategoria() {
        ArrayList<Categoria> datos = new ArrayList<>();
        datos = this.espectaculoServicio.Categorias();
        return datos;
    }

    public ArrayList<Espectaculo> tblEspectaculoNoPaquete(String paquete, String plataforma) {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
        ArrayList<Espectaculo> datos = new ArrayList<>();
        datos = this.espectaculoServicio.espectaculosLibresPaquete(paquete, plataforma);
        return datos;
    }
<<<<<<< HEAD
    
    public Espectaculo obtenerDato(String nombre){
        Espectaculo esp ;
        esp = this.espectaculoServicio.obtenerDato(nombre);
        return esp;
    }
     
=======

    public Espectaculo obtenerDato(String nombre) {
        Espectaculo esp;
        esp = this.espectaculoServicio.obtenerDato(nombre);
        return esp;
    }

>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
    public ArrayList<Espectaculo> tablaespetaculo(String nom) {
        ArrayList<Espectaculo> espectaculos = new ArrayList<>();
        try {
            espectaculos = espectaculoServicio.consultarOrganizadorEspetaculo(nom);
        } catch (Exception e) {
            System.out.println("Error en buscar el nombre de los espetaculos por el nombre del artista");
        }
        return espectaculos;
    }
<<<<<<< HEAD
    
   
   public ArrayList<Funciones> ListaFuncionesEspectador(String nick){
=======

    public ArrayList<Funciones> ListaFuncionesEspectador(String nick) {
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
        ArrayList<Funciones> f = new ArrayList<>();
        try {
            f = servicioRegistro.funcionesEspectador(nick);
            return f;
        } catch (Exception e) {
            System.out.println("Error al buscar funciones de un espectador");
        }
        return f;
<<<<<<< HEAD
    
    }
   
   public ArrayList<Espectaculo> obtenerEspectaculos(String soloPendientes)
   {
       ArrayList<Espectaculo> esp = new ArrayList<>();
       esp = espectaculoServicio.obtenerEspectaculos(soloPendientes);
       return esp;
   }
   
   public ArrayList<Espectaculo> obtenerEspectaculosEstado(String estado)
   {
       ArrayList<Espectaculo> esp = new ArrayList<>();
       esp = espectaculoServicio.obtenerEspectaculosEstado(estado);
       return esp;
   }
   
   public boolean actualizarEstadoEspectaculo(String nombre, String estado)
   {
       return espectaculoServicio.actualizarEstadoEspectaculo( nombre,  estado);
   }
=======

    }

    public void nuevoEspectaculo(String nombre, String plataforma, String artista, String descripcion, String duracion, String espMax, String espMin, String url, String costo, ArrayList<String> categorias, String imagen) {
        espectaculoServicio.nuevoEspectaculo(nombre, plataforma, artista, descripcion, duracion, espMax, espMin, url, costo, categorias, imagen);
    }

    public boolean checkEspectaculo(String nombre) {
        return espectaculoServicio.checkEspectaculo(nombre);
    }

    public String Espectaculos(String paquete, String plataforma) {
        String espectaculos = espectaculoServicio.espectaculos(paquete, plataforma);

        return espectaculos;
    }

    public String Espectaculo(String nombre) {
        String espectaculo = espectaculoServicio.Espectaculo(nombre);

        return espectaculo;
    }

    public String funcionesEspectaculo(String nombre) {
        String funcionesEspectaculo = espectaculoServicio.funcionesEspectaculo(nombre);

        return funcionesEspectaculo;
    }

    public String paquetesEspectaculo(String nombre) {
        String paquetesEspectaculo = espectaculoServicio.paquetesEspectaculo(nombre);

        return paquetesEspectaculo;
    }

    public String categoriasEspectaculo(String nombre) {
        String categoriasEspectaculo = espectaculoServicio.categoriasEspectaculo(nombre);

        return categoriasEspectaculo;
    }

    public String espectaculosPaquete(String paquete) {
        String espectaculos = espectaculoServicio.espectaculosPaquete(paquete);

        return espectaculos;
    }

    public String espectaculosPlataforma(String plataforma) {
        String espectaculos = espectaculoServicio.espectaculosPlataforma(plataforma);

        return espectaculos;
    }

    public String espectaculosCategoria(String categoria) {
        String espectaculos = espectaculoServicio.espectaculosCategoria(categoria);

        return espectaculos;
    }

    public String Plataformas() {
        String plataformas = plataformaServicio.Plataformas();

        return plataformas;
    }

    public String Categorias() {
        String categorias = espectaculoServicio.Categorias2();

        return categorias;
    }
>>>>>>> 2c68efd283358ad6834c5a1e2c6affc39b92eeb7
}
