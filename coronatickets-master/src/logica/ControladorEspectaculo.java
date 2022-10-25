package logica;

import Clases.Categoria;
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
public class ControladorEspectaculo implements IControladorEspetaculo {

    private EspectaculoServicio espectaculoServicio;
    private PlataformaServicio plataformaServicio;
    private ServiciosRegistros servicioRegistro;
    private static ControladorEspectaculo instancia;

    public ControladorEspectaculo() {
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

    public String crearEspetaculo(String plataforma, String artista, String nombre, int duracion, int maximo, int minimo, String url, float costo) {
        String creo = "N";
        if (this.espectaculoServicio.crearActualizarEspetaculo(nombre, plataforma, artista, url, duracion, minimo, minimo, url, costo)) {
            creo = "S";
        }
        return creo;
    }

    public String crearPlataforma(String nombre, String desc, String url) {
        boolean checkName = this.plataformaServicio.checkPlataforma(nombre);
        String cod = "N";

        if (!checkName) //Entonces si puedo continuar
        {
            if (this.plataformaServicio.crearPlataforma(nombre, desc, url)) {
                cod = "S";
            }
        } else {
            cod = "E";
        }
        return cod;
    }

    public ArrayList<Plataformas> tblPlataforma() {
        ArrayList<Plataformas> datos = new ArrayList<>();
        datos = plataformaServicio.datosList();
        return datos;
    }

    public ArrayList<Espectaculo> tblEspectaculo() {
        ArrayList<Espectaculo> datos = new ArrayList<>();
        datos = this.espectaculoServicio.datosLista();
        return datos;
    }

    public ArrayList<Espectaculo> tblEspectaculoPlataforma(String plataforma) {
        ArrayList<Espectaculo> datos = new ArrayList<>();
        datos = this.espectaculoServicio.datosListaPlataforma(plataforma);
        return datos;
    }

    public ArrayList<Categoria> tblCategoria() {
        ArrayList<Categoria> datos = new ArrayList<>();
        datos = this.espectaculoServicio.Categorias();
        return datos;
    }

    public ArrayList<Espectaculo> tblEspectaculoNoPaquete(String paquete, String plataforma) {
        ArrayList<Espectaculo> datos = new ArrayList<>();
        datos = this.espectaculoServicio.espectaculosLibresPaquete(paquete, plataforma);
        return datos;
    }

    public Espectaculo obtenerDato(String nombre) {
        Espectaculo esp;
        esp = this.espectaculoServicio.obtenerDato(nombre);
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

    public ArrayList<Funciones> ListaFuncionesEspectador(String nick) {
        ArrayList<Funciones> f = new ArrayList<>();
        try {
            f = servicioRegistro.funcionesEspectador(nick);
            return f;
        } catch (Exception e) {
            System.out.println("Error al buscar funciones de un espectador");
        }
        return f;

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
}
