/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Controladores;

import Modelos.Vivienda;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 * Pruebas unitarias para la clase ControladorVivienda
 *
 * @author JFG
 */
public class ControladorViviendaTest {

    private ControladorVivienda controladorVivienda;
    
    /**
     * Configuración de inicio antes de cada prueba.
     */
    @BeforeEach
    void configuracion(){
        controladorVivienda = new ControladorVivienda();
    }

    /**
     * Prueba para comprobar que se pueden obtener todas las viviendas.
     */
    @Test
    public void testObtenerTodasLasViviendas() {
        List<Vivienda> viviendas = controladorVivienda.obtenerTodasLasViviendas();
        assertNotNull(viviendas, "La lista de viviendas no debe ser nula.");
        assertTrue(viviendas.size() >= 0, "La lista de viviendas debería tener al menos 0 elementos.");
    }

    /**
     * Prueba para comprobar que una vivienda se puede buscar por su referencia.
     */
    @Test
    public void testBuscarViviendaPorReferencia() {
        Vivienda vivienda = new Vivienda("REF123", "Calle Luna 12", 90, 3, 2, 750.0);
        controladorVivienda.guardarVivienda(vivienda);
        
        Vivienda encontrada = controladorVivienda.buscarViviendaPorReferencia("REF123");
        assertNotNull(encontrada, "La vivienda no debe ser nula.");
        assertEquals("REF123", encontrada.getReferencia(), "La referencia debería coincidir.");
    }

    /**
     * Prueba para comprobar que una vivienda se puede guardar correctamente.
     */
    @Test
    public void testGuardarVivienda() {
        Vivienda vivienda = new Vivienda("REF456", "Avenida Sol 45", 120, 4, 3, 1200.0);
        controladorVivienda.guardarVivienda(vivienda);
        
        Vivienda encontrada = controladorVivienda.buscarViviendaPorReferencia("REF456");
        assertNotNull(encontrada, "La vivienda debería haberse guardado.");
        assertEquals("Avenida Sol 45", encontrada.getUbicacion(), "La ubicación debería coincidir.");
    }

    /**
     * Prueba para verificar que una vivienda se puede eliminar correctemente.
     */
    @Test
    public void testEliminarVivienda() {
        Vivienda vivienda = new Vivienda ("REF789", "Calle Estrella 78", 85, 2, 1, 600.0);
        controladorVivienda.guardarVivienda(vivienda);
        
        controladorVivienda.eliminarVivienda("REF789");
        Vivienda eliminada = controladorVivienda.buscarViviendaPorReferencia("REF789");
        assertNull(eliminada, "La vivienda debería haber sido eliminada.");
    }
}
