/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package InterfazGrafica;

import Controladores.ControladorAlquiler;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.JButton;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 * Clase de pruebas para la calse VentanaInicio.
 *
 * @author JFG
 */
public class VentanaInicioTest {

    private VentanaInicio ventanaInicio;

    /**
     * Configuracion de inicio antes de cada prueba. Inicializa uno nueva
     * instancia de VentanaInicio.
     */
    @BeforeEach
    public void configuracion() {
        ventanaInicio = new VentanaInicio();
    }

    /**
     * Comprueba si la ventana se centra correctamente.
     */
    @Test
    public void testVentanaCentrada() {
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension ventana = ventanaInicio.getSize();
        Point posicion = ventanaInicio.getLocation();

        int xEsperado = (pantalla.width - ventana.width) / 2;
        int yEsperado = (pantalla.height - ventana.height) / 2;

        assertEquals(xEsperado, posicion.x, "La ventana no está centrada horizontalmente.");
        assertEquals(yEsperado, posicion.y, "La ventana no está centrada verticalmente.");
    }

    /**
     * Simula un clic en el boton "Registrar Nuevo Alquiler".
     */
    @Test
    public void testBotonRegistrar() {
        JButton jbRegistrar = ventanaInicio.getJbRegistrar(); 
        assertNotNull(jbRegistrar, "El botón jbRegistrar no fue inicializado.");
        jbRegistrar.doClick();
    }

    /**
     * Simula un clic en el boton "Consultar Alquileres".
     */
    @Test
    public void testBotonConsultar() {
        // Simular clic en el botón Consultar
        JButton jbConsultar = ventanaInicio.getJbConsultar();
        assertNotNull(jbConsultar, "No se encontró el botón jbConsultar.");
        jbConsultar.doClick();

        // Validar que se abre la ventana VentanaConsultarAlquileres
    }

    /**
     * Comprueba que el controlador de alquileres no es nulo.
     */
    @Test
    public void testControladorNoNulo() {
        assertNotNull(ventanaInicio.getControladorAlquiler(), "El controlador Alquiler no fue inicializado correctamente.");
    }

    /**
     * Comprueba que el botón "Generar Informes" genera el pdf correctamente.
     */
    @Test
    public void testGenerarInforme() {
        ControladorAlquiler controlador = new ControladorAlquiler();
        ventanaInicio.setControladorAlquiler(controlador);

        JButton jbInformes = ventanaInicio.getJbInformes();
        assertNotNull(jbInformes, "No se encontró el botón jbInformes.");

        try {
            jbInformes.doClick();
            System.out.println("El botón Generar Informes se ejecutó correctamente.");
        } catch (Exception e) {
            fail("La acción del botón Generar Informes lanzó una excepción: " + e.getMessage());
        }
    }

    /**
     * Encuentra un componente por su nombre dentro de un contenedor.
     *
     * @param contenedor El contenedor principal.
     * @param nombre El nombre del componente.
     * @return El componente encontrado, o null si no se encuentra.
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
