/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Controladores;

import Modelos.Cliente;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 * Pruebas unitarias para la clase ControladorCliente.
 *
 * @author JFG
 */
public class ControladorClienteTest {

    private ControladorCliente controladorCliente;

    /**
     * Configuración de inicio antes de cada prueba.
     */
    @BeforeEach
    void configuracion() {
        controladorCliente = new ControladorCliente();
    }

    /**
     * Prueba para comprobar que se pueden obtener todos los clientes.
     */
    @Test
    public void testObtenerTodosLosClientes() {
        List<Cliente> clientes = controladorCliente.obtenerTodosLosClientes();
        assertNotNull(clientes, "La lista de clientes no debe ser nula.");
        assertTrue(clientes.size() >= 0, "La lista de clientes debe tener al menos 0 elementos.");
    }

    /**
     * Prueba para comprobar que un cliente se puede buscar por su DNI.
     */
    @Test
    public void testBuscarClientePorDni() {
        Cliente cliente = new Cliente("12345678F", "Juan", "Perez", "123456789", "juan.perez@gmail.com", "Calle Falsa 23");
        controladorCliente.guardarCliente(cliente);

        Cliente encontrado = controladorCliente.buscarClientePorDni("12345678F");
        assertNotNull(encontrado, "El cliente no debe ser nulo");
        assertEquals(("12345678F"), encontrado.getDni(), "El DNI debería coincidir.");
    }

    /**
     * Prueba para comprobar que un cliente se puede guardar correctamete.
     */
    @Test
    public void testGuardarCliente() {
        Cliente cliente = new Cliente("98765432L", "Javier", "Fernandez", "678932145", "javi.fernandez@gmail.com", "Avenida dos de mayo 8");
        controladorCliente.guardarCliente(cliente);

        Cliente encontrado = controladorCliente.buscarClientePorDni("98765432L");
        assertNotNull(encontrado, "El cliente debería haberse guardado.");
        assertEquals("Javier", encontrado.getNombre(), "El nombre debería coincidir.");
    }

    /**
     * Prueba para comprobar que un cliente se puede eliminar correctamente.
     */
    @Test
    public void testEliminarCliente() {
        Cliente cliente = new Cliente("12345678F", "Juan", "Perez", "123456789", "juan.perez@gmail.com", "Calle Falsa 23");
        controladorCliente.guardarCliente(cliente);
        
        controladorCliente.eliminarCliente("12345678F");
        Cliente eliminado = controladorCliente.buscarClientePorDni("12345678F");
        assertNull(eliminado, "El cliente debería haber sido eliminado.");
    }
}
