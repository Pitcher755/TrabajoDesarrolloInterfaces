/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Utilidades;

import Modelos.Alquiler;
import Modelos.Cliente;
import Modelos.Vivienda;
import java.io.File;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Prueba para comprobarque se genera un informe PDF correctamente.
 *
 * @author JFG
 */
public class GenerarInformeTest {
    /**
     * Prueba para verificar que se genera un informe PDF correctamente.
     */
    @Test
    public void testGenerarInformePDF() {
        // Crear datos de prueba
        Cliente cliente = new Cliente("12345678A", "Juan", "Pérez", "123456789", "juan.perez@example.com", "Calle Falsa 123");
        Vivienda vivienda = new Vivienda("REF123", "Calle Luna 12", 90, 3, 2, 750.0);
        Alquiler alquiler = new Alquiler(1, "2023-01-01", 12, cliente, vivienda, true);

        String rutaArchivo = "InformeAlquileres.pdf";

        // Generar el informe PDF
        GenerarInforme.generarInformePDF(Arrays.asList(alquiler), rutaArchivo);

        // Verificar que el archivo se ha creado
        File archivo = new File(rutaArchivo);
        assertTrue(archivo.exists(), "El archivo PDF debería haberse creado.");
        
        // Limpieza: eliminar el archivo después de la prueba
        if (archivo.exists()) {
            archivo.delete();
        }
    }
    
}
