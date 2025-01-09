/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package InterfazGrafica;

import Controladores.ControladorAlquiler;
import Modelos.Alquiler;
import Modelos.Cliente;
import Modelos.Vivienda;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 * Clase de pruebas unitarias para la clase {@link VentanaConsultarAlquileres}.
 * Verifica el correcto funcionamiento de los componentes y funcionalidades
 * principales de la interfaz gráfica.
 *
 * @author JFG
 */
public class VentanaConsultarAlquileresTest {

    private VentanaConsultarAlquileres ventanaConsultar;

    /**
     * Configuración inicial antes de cada prueba. Inicializa una nueva
     * instancia de {@link VentanaConsultarAlquileres}.
     */
    @BeforeEach
    public void configuracion() {
        ventanaConsultar = new VentanaConsultarAlquileres();
    }

    /**
     * Prueba para verificar que la ventana se centra correctamente en la
     * pantalla.
     */
    @Test
    public void testVentanaCentrada() {
        // Ejecutar el método centrarVentana indirectamente al inicializar la ventana
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension ventana = ventanaConsultar.getSize();
        Point posicion = ventanaConsultar.getLocation();

        int xEsperado = (pantalla.width - ventana.width) / 2;
        int yEsperado = (pantalla.height - ventana.height) / 2;

        assertEquals(xEsperado, posicion.x, "La ventana no está centrada horizontalmente.");
        assertEquals(yEsperado, posicion.y, "La ventana no está centrada verticalmente.");
    }

    /**
     * Prueba para verificar que el botón "Buscar" está presente y funcional.
     */
    @Test
    public void testBotonBuscar() {
        // Encuentra el botón Buscar
        JButton jbBuscar = ventanaConsultar.getJbBuscar();
        assertNotNull(jbBuscar, "El botón jbBuscar no fue encontrado.");

        // Simula el clic en el botón Buscar
        jbBuscar.doClick();

        // Obtiene la tabla de resultados
        JTable jtabResultados = ventanaConsultar.getJtabResultados();
        assertNotNull(jtabResultados, "La tabla de resultados no fue encontrada.");

        // Valida que la tabla contiene los alquileres esperados
        int alquileresEsperados = obtenerCantidadDeAlquileresEnBaseDeDatos(); // Método auxiliar
        assertEquals(alquileresEsperados, jtabResultados.getRowCount(),
                "La tabla no tiene el número esperado de filas.");
    }

    /**
     * Método para obtener la cantidad de alquileres en la base de
     * datos.
     *
     * @return Número de alquileres en la base de datos.
     */
    private int obtenerCantidadDeAlquileresEnBaseDeDatos() {
        ControladorAlquiler controlador = new ControladorAlquiler();
        return controlador.obtenerTodosLosAlquileres().size();
    }

    /**
     * Prueba para verificar que el botón "Volver" está presente y funcional.
     */
    @Test
    public void testBotonVolver() {
        JButton jbVolver = ventanaConsultar.getJbVolver();
        assertNotNull(jbVolver, "El botón jbVolver no fue encontrado.");

        // Simular clic en el botón Volver
        jbVolver.doClick();

        // Validar que la acción se ejecuta correctamente (sin excepciones)
        // Puedes agregar validaciones adicionales si implementas lógica al volver
        System.out.println("El botón Volver se ejecutó correctamente.");
    }

    /**
     * Prueba para verificar que los resultados se actualizan correctamente en
     * la tabla.
     */
    @Test
    public void testActualizarTablaResultados() {
        JTable jtabResultados = ventanaConsultar.getJtabResultados();
        assertNotNull(jtabResultados, "La tabla de resultados no fue encontrada.");

        // Crear datos simulados con objetos completos
        List<Alquiler> alquileres = List.of(
                new Alquiler(1, "2023-01-01", 12,
                        new Cliente("12345678A", "John", "Doe", "123456789", "john.doe@example.com", "Calle Falsa 123"),
                        new Vivienda("REF001", "Centro", 80, 2, 1, 650.0),
                        true),
                new Alquiler(2, "2023-06-01", 6,
                        new Cliente("87654321B", "Jane", "Smith", "987654321", "jane.smith@example.com", "Avenida Siempreviva 742"),
                        new Vivienda("REF002", "Norte", 100, 3, 2, 850.0),
                        false)
        );

        // Actualizar la tabla
        ventanaConsultar.actualizarTablaResultados(alquileres);

        // Validar los resultados
        DefaultTableModel modelo = (DefaultTableModel) jtabResultados.getModel();
        assertEquals(2, modelo.getRowCount(), "La tabla debería contener 2 filas.");
        assertEquals("12345678A", modelo.getValueAt(0, 3), "El DNI del cliente en la primera fila no coincide.");
        assertEquals("87654321B", modelo.getValueAt(1, 3), "El DNI del cliente en la segunda fila no coincide.");
    }

    /**
     * Encuentra un componente por su nombre dentro de un contenedor.
     *
     * @param contenedor El contenedor principal.
     * @param nombre El nombre del componente a buscar.
     * @return El componente encontrado, o {@code null} si no se encuentra.
     */
    private Component encontrarComponentePorNombre(Container contenedor, String nombre) {
        for (Component componente : contenedor.getComponents()) {
            if (nombre.equals(componente.getName())) {
                return componente;
            }
            if (componente instanceof Container) {
                Component resultado = encontrarComponentePorNombre((Container) componente, nombre);
                if (resultado != null) {
                    return resultado;
                }
            }
        }
        return null;
    }
}
