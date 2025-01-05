/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Utilidades;

import java.sql.Connection;
import java.sql.SQLException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 * Clase de pruebas unitarisas para la clase ConexionBBDD.
 *
 * @author JFG
 */
public class ConexiónBBDDTest {
    
    private Connection conexion;
    
    /**
     * Configurar una conexión antes de cada prueba.
     */
    @BeforeEach
    void configuracion(){
        try {
            conexion = ConexionBBDD.conectar();
        } catch (SQLException e) {
            fail("no se puedo establecer la conexión: " + e.getMessage());
        }
    }
    
    /**
     * Cierra la conexión despues de cada prueba
     */
    @AfterEach
    void desconectar(){
        ConexionBBDD.cerrarConexion(conexion);
    }
    
    /**
     * Comprueba que se conecta correctamente.
     */
    @Test
    void testConectar(){
        assertNotNull(conexion, "La conexión debe ser válida y no nula.");
        try {
            assertFalse(conexion.isClosed(), "La conexión debería estar abierta.");
        } catch (SQLException e){
            fail("Error al verificar el estado de la conexión: " + e.getMessage());
        }
    }
    
    /**
     * Comprueba que cerrar la conexión funciona correctamente.
     */
    @Test
    public void testCerrarConexion() {
        ConexionBBDD.cerrarConexion(conexion);
        try {
            assertTrue(conexion.isClosed(), "La conexión debería estar cerrada");
        } catch (SQLException e){
            fail("Error al comprobar si la conexión está cerrada: " + e.getMessage());
        }
    }
}
