/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.Alquiler;
import Modelos.Cliente;
import Modelos.Vivienda;
import Utilidades.ConexionBBDD;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase maneja las acciones relacionadas con los clientes, como buscar,
 * guardar y eliminar clientes.
 *
 * @author JFG
 */
public class ControladorAlquiler {

    /**
     * Obtiene todos los alquileres almacenados en la base de datos.
     *
     * @return una lista de objetos Alquiler.
     */
    public List<Alquiler> obtenerTodosLosAlquileres() {
        List<Alquiler> alquileres = new ArrayList<>();
        String consulta = "SELECT * FROM Alquiler";

        try (Connection conexion = ConexionBBDD.conectar(); Statement stmt = conexion.createStatement(); ResultSet resultado = stmt.executeQuery(consulta)) {

            while (resultado.next()) {
                Alquiler alquiler = new Alquiler(
                        resultado.getInt("numero_expediente"),
                        resultado.getDate("fecha_inicio").toString(),
                        resultado.getInt("duracion_meses"),
                        new Cliente(resultado.getString("dni_cliente"), null, null, null, null, null),
                        new Vivienda(resultado.getString("referencia_vivienda"), null, 0, 0, 0, 0.0),
                        resultado.getBoolean("estado_pago")
                );
                alquileres.add(alquiler);
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener los alquileres: " + e.getMessage());
        }
        return alquileres;
    }

    /**
     * Busca alquileres con filtros opcionales como fechas, DNI del cliente o
     * referencia de la vivienda.
     *
     * @param fechaInicio La fecha de inicio del alquiler.
     * @param fechaFin La fecha de fin del alquiler.
     * @param dniCliente El DNI del cliente.
     * @param referenciaVivienda Referencia de la vivienda.
     * @return una lista de objetos Alquiler que coinciden con los filtros.
     */
    public List<Alquiler> buscarAlquileresConFiltros(String fechaInicio, String fechaFin, String dniCliente, String referenciaVivienda) {
        List<Alquiler> alquileres = new ArrayList<>();
        StringBuilder consulta = new StringBuilder("SELECT * FROM alquiler WHERE 1=1");

        // Construcción de la consulta según los filtros añadidos.
        if (fechaInicio != null && !fechaInicio.isEmpty()) {
            consulta.append(" AND fecha_inicio >= ?");
        }
        if (fechaFin != null && !fechaFin.isEmpty()) {
            consulta.append(" AND fecha_inicio <= ?");
        }
        if (dniCliente != null && !dniCliente.isEmpty()) {
            consulta.append(" AND dni_cliente = ?");
        }
        if (referenciaVivienda != null && !referenciaVivienda.isEmpty()) {
            consulta.append(" AND referencia_vivienda = ?");
        }

        try (Connection conexion = ConexionBBDD.conectar(); PreparedStatement pstmt = conexion.prepareStatement(consulta.toString())) {

            int indice = 1;
            if (fechaInicio != null && !fechaInicio.isEmpty()) {
                pstmt.setDate(indice++, Date.valueOf(fechaInicio));
            }
            if (fechaFin != null && !fechaFin.isEmpty()) {
                pstmt.setDate(indice++, Date.valueOf(fechaFin));
            }
            if (dniCliente != null && !dniCliente.isEmpty()) {
                pstmt.setString(indice++, dniCliente);
            }
            if (referenciaVivienda != null && !referenciaVivienda.isEmpty()) {
                pstmt.setString(indice++, referenciaVivienda);
            }

            // Procesar los resultados
            ResultSet resultado = pstmt.executeQuery();
            while (resultado.next()) {

                // Objeto Cliente solo con DNI
                Cliente cliente = new Cliente(
                        resultado.getString("dni_cliente"),
                        null,
                        null,
                        null,
                        null,
                        null
                );

                // Objeto Vivienda solo con Referencia
                Vivienda vivienda = new Vivienda(
                        resultado.getString("referencia_vivienda"),
                        null,
                        0,
                        0,
                        0,
                        0.0
                );

                Alquiler alquiler = new Alquiler(
                        resultado.getInt("numero_expediente"),
                        resultado.getDate("fecha_inicio").toString(),
                        resultado.getInt("duracion_meses"),
                        cliente,
                        vivienda,
                        resultado.getBoolean("estado_pago")
                );

                alquileres.add(alquiler);
            }
        } catch (SQLException e) {
            System.err.println("Error al buscar alquileres con filtros: " + e.getMessage());
        }
        return alquileres;
    }

    /**
     * Guarda un alquiler en la base de datos.
     *
     * @param alquiler el objeto Alquiler a guardar.
     */
    public void guardarAlquiler(Alquiler alquiler) {
        ControladorCliente controladorCliente = new ControladorCliente();
        ControladorVivienda controladorVivienda = new ControladorVivienda();

        // Guardar o actualizar el cliente
        controladorCliente.guardarCliente(alquiler.getCliente());

        // Guardar o actualizar la vivienda
        controladorVivienda.guardarVivienda(alquiler.getVivienda());

        // Guardar el alquiler
        String consulta = "INSERT INTO alquiler (fecha_inicio, duracion_meses, estado_pago, dni_cliente, referencia_vivienda) VALUES (?, ?, ?, ?, ?)";

        // Guardar el alquiler
        try (Connection conexion = ConexionBBDD.conectar(); PreparedStatement pstmt = conexion.prepareStatement(consulta)) {
            pstmt.setDate(1, Date.valueOf(alquiler.getFechaInicio()));
            pstmt.setInt(2, alquiler.getDuracion());
            pstmt.setBoolean(3, alquiler.isEstadoPago());
            pstmt.setString(4, alquiler.getCliente().getDni());
            pstmt.setString(5, alquiler.getVivienda().getReferencia());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al guardar el alquiler: " + e.getMessage());
        }
    }

    /**
     * Elimina un alquiler de la base de datos basandose en el número de
     * expediente.
     *
     * @param numeroExpediente el número de expediente del alquiler a eliminar.
     * @throws IllegalArgumentException si el alquiler no existe.
     */
    public void eliminarAlquiler(int numeroExpediente) {
        String consulta = ("DELETE FROM alquiler WHERE numero_expediente = ?");

        try (Connection conexion = ConexionBBDD.conectar(); PreparedStatement pstmt = conexion.prepareStatement(consulta)) {

            pstmt.setInt(1, numeroExpediente);
            int filasAfectadas = pstmt.executeUpdate();
            conexion.commit(); // Confirmar la transacción a ver si elimina por fin

            if (filasAfectadas == 0) {
                throw new IllegalArgumentException("Alquiler con número de expèdiente " + numeroExpediente + " no encontrado.");
            } else {
                System.out.println("Alquiler con numerode expediente " + numeroExpediente + " eliminado correctamente.");
            }
        } catch (SQLException e) {
            System.err.println("Error al eliminar alquiler: " + e.getMessage());
        }
    }
}
