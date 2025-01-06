/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import Modelos.Alquiler;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;


/**
 * Clase para generar informes PDF a partir de una lista de alquileres.
 *
 * @author JFG
 */
public class GenerarInforme {
    
    /**
     * Genera un informe en PDF a partir de una lista de alquileres.
     * 
     * @param alquileres la lista de objetos Alquiler para incluir en el informe.
     * @param rutaArchivo la ruta donde se guardará el archivo generado.
     */
    public static void generarInformePDF(List<Alquiler> alquileres, String rutaArchivo){
        Document documento = new Document();
        try {
            PdfWriter.getInstance(documento, new FileOutputStream(rutaArchivo));
            documento.open();
            
            // Título del documento
            documento.add(new Paragraph("Informe de alquileres"));
            documento.add(new Paragraph(" "));
            
            // Crear una tabla con columnas para los datos de alquiler
            PdfPTable tabla = new PdfPTable(6);
            tabla.setWidthPercentage(100);
            tabla.setSpacingBefore(10f);
            tabla.setSpacingAfter(10f);
            
            // Encabezados de la tabla
            String[] encabezados = {"Expediente", "Fecha  Inicio", "Duración", "DNI Cliente", "Ref. Vivienda", "Pagado"};
            for (String encabezado :  encabezados){
                PdfPCell celda= new PdfPCell(new Phrase(encabezado));
                celda.setHorizontalAlignment(Element.ALIGN_CENTER);
                tabla.addCell(celda);
            }
            
            // Agregar filas con datos de los alquileres
            for (Alquiler alquiler : alquileres){
                tabla.addCell(String.valueOf(alquiler.getnExpediente()));
                tabla.addCell(alquiler.getFechaInicio());
                tabla.addCell(String.valueOf(alquiler.getDuracion()));
                tabla.addCell(alquiler.getCliente().getDni());
                tabla.addCell(alquiler.getVivienda().getReferencia());
                tabla.addCell(alquiler.isEstadoPago() ? "Sí" : "No");
            }
            
            documento.add(tabla);
            System.out.println("Informe PDF generado correctamente en " + rutaArchivo);
            
        } catch (DocumentException | IOException e) {
            System.err.println("Error al generar el informe PDF: " + e.getMessage());
        } finally {
            documento.close();
        }
    }
}
