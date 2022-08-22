package Persistencia;
 
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.sql.Connection;
//import java.sql.Driver;
//import java.util.Properties;
//import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ConexionDB {
   
    private com.mysql.jdbc.Connection conn = null;
    static String URL = "jdbc:mysql://localhost:3306/bdempleados";
    static String Usuario = "root";
    static String Contraseña = "";

    
    public com.mysql.jdbc.Connection getConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");//o tambien -> Driver driver = new com.mysql.jdbc.Driver(); DriverManager.registerDriver(driver);
            conn = (com.mysql.jdbc.Connection)DriverManager.getConnection(URL, Usuario, Contraseña);
            if (conn != null) {
                System.out.println("Conexion establecida correctamente");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error en la conexion" + e);
        }

        return conn;
    }
    
    public void cerrar(){
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                //ex.printStackTrace();
                Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
    }

//---------------------------Conexion manual---------------------------------------------------------------------------------------------
     

     
     /* private final String host= "127.0.0.1";
    private final String port= "3306";
    private final String db= "coronaticket";
    private final String user= "root";
    private final String pass= "";*/
     
    //Para hacer ConexionDB singleton descomentar
    //private static Connection conexion=null;
  //  private Connection conexion=null;
    //Para hacer ConexionDB singleton descomentar
    //private ConexionDB(){};
   // public ConexionDB(){};
    //Para hacer ConexionDB singleton descomentar
    //public static Connection getConexion() {
    
   /* public String LeerProperties(String caso) {
        
        Properties prop = new Properties();
        InputStream archivo = null;

        try {
            archivo = new FileInputStream(System.getProperty("user.dir") + "\\Config.properties");
            System.out.println(archivo);
            prop.load(archivo);

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }     
        
        switch (caso) {
            case "host":  return prop.getProperty("host");
       
            case "port":  return prop.getProperty("port");
                     
            case "db":  return prop.getProperty("db");
                     
            case "user":  return prop.getProperty("user");
                     
            case "pass":  return prop.getProperty("pass");

            default: return "";
              
        }     
    }*/
   
   /* public Connection getConexion() {
           
        if (conexion == null) {
            try {
                Driver driver = new com.mysql.jdbc.Driver();
                DriverManager.registerDriver(driver);
                conexion = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+db, user, pass);
            } catch (SQLException ex) {
                ex.printStackTrace();
                Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return conexion;
    }*/
    
   /* public void cerrar(){
        if (conexion != null) {
            try {
                conexion.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
    }*/
    
}