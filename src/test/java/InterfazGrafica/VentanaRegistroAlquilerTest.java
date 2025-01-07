/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package InterfazGrafica;

import Controladores.ControladorAlquiler;
import static Utilidades.ConexionBBDD.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author JFG
 */
public class VentanaRegistroAlquilerTest {

    private VentanaRegistroAlquiler ventanaRegistroAlquiler;
    private ControladorAlquiler controladorAlquiler;

    @BeforeEach
    public void configuracion() {
        controladorAlquiler = new ControladorAlquiler();
        ventanaRegistroAlquiler = new VentanaRegistroAlquiler();
        ventanaRegistroAlquiler.setControladorAlquiler(controladorAlquiler);
    }

    @AfterEach
    public void limpiar() {
        // Limpiar la base de datos después de cada prueba
        try (Connection conexion = conectar()) {
            PreparedStatement pstmt = conexion.prepareStatement("DELETE FROM alquiler WHERE dni_cliente = ?");
            pstmt.setString(1, "12345678A");
            pstmt.executeUpdate();

            pstmt = conexion.prepareStatement("DELETE FROM cliente WHERE dni = ?");
            pstmt.setString(1, "12345678A");
            pstmt.executeUpdate();

            pstmt = conexion.prepareStatement("DELETE FROM vivienda WHERE referencia = ?");
            pstmt.setString(1, "REF123");
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Prueba para registrar un alquiler y verificar que se guarda correctamente
     * en la base de datos.
     */
    @Test
    public void testRegistrarAlquiler() {
        // Configurar datos válidos en los campos de texto
        ventanaRegistroAlquiler.setJtDni("12345678A");
        ventanaRegistroAlquiler.setJtNombre("Juan");
        ventanaRegistroAlquiler.setJtApellidos("Pérez");
        ventanaRegistroAlquiler.setJtTelefono("123456789");
        ventanaRegistroAlquiler.setJtEmail("juan.perez@example.com");
        ventanaRegistroAlquiler.setJtFacturacion("Calle Falsa 123");

        ventanaRegistroAlquiler.setJtReferencia("REF123");
        ventanaRegistroAlquiler.setJtUbicacion("Calle Luna 12");
        ventanaRegistroAlquiler.setJtMetros("90");
        ventanaRegistroAlquiler.setJtHabitaciones("3");
        ventanaRegistroAlquiler.setJtBanos("2");
        ventanaRegistroAlquiler.setJtPrecio("750.0");

        ventanaRegistroAlquiler.setJDateChooser1(new java.util.Date(java.sql.Date.valueOf("2023-01-01").getTime()));
        ventanaRegistroAlquiler.setJtDuracion("12");
        ventanaRegistroAlquiler.setJtPagado("true");

        // Llamar al método para registrar el alquiler
        ventanaRegistroAlquiler.registrarAlquiler();

        // Verificar que el alquiler se guardó en la base de datos
        try (Connection conexion = conectar()) {
            PreparedStatement pstmt = conexion.prepareStatement("SELECT * FROM alquiler WHERE dni_cliente = ?");
            pstmt.setString(1, "12345678A");
            ResultSet rs = pstmt.executeQuery();
            assertTrue(rs.next(), "El alquiler debería haberse guardado en la base de datos.");
            assertEquals("12345678A", rs.getString("dni_cliente"));
        } catch (SQLException e) {
            e.printStackTrace();
            fail("Error al verificar el alquiler en la base de datos.");
        }
    }

}
