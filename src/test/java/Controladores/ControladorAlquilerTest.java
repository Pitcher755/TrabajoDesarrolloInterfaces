/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Controladores;

import Modelos.Alquiler;
import Modelos.Cliente;
import Modelos.Vivienda;
import java.awt.BorderLayout;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 * Pruebas unitarias para la clase ControladorAlquiler.
 *
 * @author JFG
 */
public class ControladorAlquilerTest {

    private ControladorAlquiler controladorAlquiler;

    /**
     * Configuración de inicio antes de cada prueba.
     */
    @BeforeEach
    void configuracion() {
        controladorAlquiler = new ControladorAlquiler();
    }

    /**
     * Prueba para comprobar que se pueden obtener todos los alquileres.
     */
    @Test
    public void testObtenerTodosLosAlquileres() {
        List<Alquiler> alquileres = controladorAlquiler.obtenerTodosLosAlquileres();
        assertNotNull(alquileres, "La lista de alquileres no debe ser nula.");
        assertTrue(alquileres.size() >= 0, "La lista de alquileres debería tener al menos 0 elementos.");
    }

    /**
     * Prueba para comprobar que se pueden buscar alquileres con filtros.
     */
    @Test
    public void testBuscarAlquileresConFiltros() {
        List<Alquiler> alquileres = controladorAlquiler.buscarAlquileresConFiltros("2023-01-01", "2023-12-31", null, null);
        assertNotNull(alquileres, "La lista de alquileres no debe ser nula.");
        assertTrue(alquileres.size() >= 0, "La lista de alquileres debería tener al menos 0 elementos.");
    }

    /**
     * Prueba para comprobar que un alquiler se puede guardar correctamente.
     */
    @Test
    public void testGuardarAlquiler() {
        Cliente cliente = new Cliente("12345678A", "Juan", "Pérez", "123456789", "juan.perez@example.com", "Calle Falsa 123");
        Vivienda vivienda = new Vivienda("REF123", "Calle Luna 12", 90, 3, 2, 750.0);
        Alquiler alquiler = new Alquiler(0, "2023-01-01", 12, cliente, vivienda, true);

        controladorAlquiler.guardarAlquiler(alquiler);

        List<Alquiler> alquileres = controladorAlquiler.buscarAlquileresConFiltros("2023-01-01", null, "12345678A", "REF123");
        assertTrue(alquileres.size() > 0, "Debe haber al menos un alquiler guardado");
        
        // Limpiar el registro para que no interfiera con el test de eliminarAlquiler.
        if (!alquileres.isEmpty()){
            Alquiler guardado = alquileres.get(0);
            controladorAlquiler.eliminarAlquiler(guardado.getnExpediente());
        }
    }

    /**
     * Prueba para comprobar si se puede eliminar un alquiler correctamente.
     */
    @Test
    public void testEliminarAlquiler() {
        Cliente cliente = new Cliente("12345678A", "Juan", "Pérez", "123456789", "juan.perez@example.com", "Calle Falsa 123");
        Vivienda vivienda = new Vivienda("REF123", "Calle Luna 12", 90, 3, 2, 750.0);
        Alquiler alquiler = new Alquiler(0, "2023-01-01", 12, cliente, vivienda, true);

        controladorAlquiler.guardarAlquiler(alquiler);
        Alquiler guardado = controladorAlquiler.buscarAlquileresConFiltros("2023-01-01", null, "12345678A", "REF123").get(0);
        
        controladorAlquiler.eliminarAlquiler(guardado.getnExpediente());
        List<Alquiler> alquileres = controladorAlquiler.buscarAlquileresConFiltros(null, null, "12345678A", "REF123");
        assertTrue(alquileres.isEmpty(), "El alquiler debería haber sido eliminado.");       
    }
}
