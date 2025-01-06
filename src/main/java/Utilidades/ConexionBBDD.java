/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase que gestiona la conexión con la base de datos.
 * 
 * @author JFG
 */
public class ConexionBBDD {
    
    // configuración de la base de datos
    private static final String URL = "jdbc:mariadb://localhost:3308/smartocupation";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "diciembre2024";
    
    // Métodos
    /**
     * Conecta con la base de datos.
     * 
     * @return una instancia de la clase Connection si la conexión es exitosa
     * @throws SQLException si hay un error al establecer la conexión.
     */
    public static Connection conectar() throws SQLException{
        try {
            // Intentar conectar a la base de datos
            return DriverManager.getConnection(URL, USUARIO, CONTRASENA);
        }   catch (SQLException e){
            // Imprimir mensaje de error
            System.err.println("Error al conectar a la base de datos: "+ e.getMessage());
            throw e;
        }        
    }
    
    /**
     * Cierra la conexión existente con la base de datos.
     * 
     * @param conexion la conexión a cerrar. Se es null, no realiza ninguna acción.
     */
    public static void cerrarConexion(Connection conexion){
        if (conexion != null){
            try {
                conexion.close();
            } catch (SQLException e) {
                // Imprimir mensaje de error si hay un problema al cerrar la conexión
                System.err.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }        
    }
}
