/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Persistencia.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Nico
 */
public class BusquedaServicio {
    private Connection conexion = new ConexionDB().getConexion();
    
    
   public String busqueda(String plataformas, String categorias, String busqueda)
   {
       
        String subWherePlataformasPaquete = "", 
               subWherePlataformasEspectaculos = "", 
               subWhereCategoriaPaquete = "", 
               subWhereCategoriaEspectaculo = "",
               json = "",
               subPlat = "",
               subCat = "",
               subWhere = " WHERE ",
               sql = "";
        
        
        if(!plataformas.isEmpty())
        {
            String subP = "";
            String[] plataformasA = plataformas.split(",");
            if(plataformasA.length > 0)
            {
                for(int i = 0; i < plataformasA.length;i++)
                {
                    if(i > 0)
                    {
                        subP = subP + ",";
                    }
                    subP = subP + "\""+plataformasA[i]+"\"";
                }
            }
            subWherePlataformasEspectaculos = "  ( b.tipo = 'E' AND EXISTS(SELECT 1 FROM espetaculos as e WHERE  e.esp_nombre = b.nombre AND e.esp_plat_nombre IN("+subP+")))";
            subWherePlataformasPaquete= " OR ( b.tipo = 'P' AND EXISTS(SELECT 1 FROM paquete_espetaculo as pe, espetaculos as e WHERE pe.paqesp_paq_nombre = b.nombre AND e.esp_nombre = pe.paqesp_esp_nombre AND e.esp_plat_nombre IN("+subP+")))";
            subPlat = "("+subWherePlataformasEspectaculos+"   "+subWherePlataformasPaquete+")";
        }
        
        
        if(!categorias.isEmpty())
        {
            String[] categoriasA = categorias.split(",");
            String subC = "";
            if(categoriasA.length > 0)
            {
                for(int i = 0; i < categoriasA.length;i++)
                {
                    if(i > 0)
                    {
                        subC = subC + ",";
                    }
                    subC = subC + ""+categoriasA[i]+"";
                }   
            }
            subWhereCategoriaPaquete = " ( b.tipo = 'E' AND EXISTS(SELECT 1 FROM categorias_espectaculo as ce WHERE ce.esp_nombre = b.nombre AND ce.cat_id IN("+subC+")))";
            subWhereCategoriaEspectaculo = "  OR ( b.tipo = 'P' AND EXISTS(SELECT 1 FROM paquete_espetaculo as pe, categorias_espectaculo as ce WHERE pe.paqesp_paq_nombre = b.nombre AND ce.esp_nombre = b.nombre AND ce.cat_id IN("+subC+")))";
            subCat = "("+subWhereCategoriaPaquete+"   "+subWhereCategoriaEspectaculo+")";
        }
       
        if(!busqueda.isEmpty())
        {
            subWhere = subWhere+" UPPER(b.nombre) LIKE UPPER(\"%"+busqueda+"%\") ";
            if(!subCat.isEmpty() || !subPlat.isEmpty())
            {
                subWhere = subWhere+ " AND ";
            }
        }
        String subTemp = "";
        if(!subCat.isEmpty())
        {
            subTemp = subCat;
        }
        
        if(!subPlat.isEmpty())
        {
            subTemp = subPlat;
        }
        
        if(!subPlat.isEmpty() && !subCat.isEmpty())
        {
            subTemp = "("+subPlat + " OR " +subCat+")";
        }
        
        subWhere = subWhere+subTemp;
        sql = "SELECT * "
              + "FROM buscador as b "
              + subWhere;
        
        try{
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            int i = 0;
            while (rs.next()) {
                if(i > 0)
                {
                    json = json +",";
                }        
                json =  json+ "{"
                                + "\"nombre\":" + "\""+ rs.getString("nombre").trim() +"\","
                                + "\"descripcion\":" + "\""+ rs.getString("descripcion").trim() +"\","
                                + "\"tipo\":" + "\""+ rs.getString("tipo").trim() +"\","
                                + "\"imagen\":" + "\""+ rs.getString("imagen") +"\""
                            + "}";
                i++;
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return json;
   }
    
    
}
