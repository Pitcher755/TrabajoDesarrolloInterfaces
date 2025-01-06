/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.Vivienda;
import Utilidades.ConexionBBDD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Controlador para manejar las operaciones relacionadas con las viviendas.
 *
 * @author JFG
 */
public class ControladorVivienda {
    // Métodos
    
    /**
     * Obtiene todas las viviendas almacenadas en la base de datos.
     *
     * @return una lista de objetos Vivienda.
     */
    public List<Vivienda> obtenerTodasLasViviendas(){
        List<Vivienda> viviendas = new ArrayList<>();
        String consulta = "SELECT * FROM Vivienda";

        try (Connection conexion = ConexionBBDD.conectar(); Statement stmt = conexion.createStatement(); ResultSet resultado = stmt.executeQuery(consulta)) {

            while (resultado.next()) {
                Vivienda vivienda = new Vivienda(
                        resultado.getString("referencia"),
                        resultado.getString("ubicacion"),
                        resultado.getInt("metros"),
                        resultado.getInt("habitaciones"),
                        resultado.getInt("banios"),
                        resultado.getDouble("precio_mensual")
                );
                viviendas.add(vivienda);
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener las viviendas: " + e.getMessage());
        }
        return viviendas;
    }

    /**
     * Busca una vivienda por su número de referencia.
     *
     * @param referencia el número de referencias de la vivienda a buscar.
     * @return el objeto Vivienda encontrado, o null si no se encuentra.
     */
    public Vivienda buscarViviendaPorReferencia(String referencia) {
        String consulta = "SELECT * FROM Vivienda WHERE referencia = ?";
        Vivienda vivienda = null;

        try (Connection conexion = ConexionBBDD.conectar(); PreparedStatement pstmt = conexion.prepareStatement(consulta)) {

            pstmt.setString(1, referencia);
            ResultSet resultado = pstmt.executeQuery();

            if (resultado.next()) {
                vivienda = new Vivienda(
                        resultado.getString("referencia"),
                        resultado.getString("ubicacion"),
                        resultado.getInt("metros"),
                        resultado.getInt("habitaciones"),
                        resultado.getInt("banios"),
                        resultado.getDouble("precio_mensual")
                );
            }
        } catch (SQLException e) {
            System.err.println("Error al buscar vivienda por referencia: " + e.getMessage());
        }
        return vivienda;
    }

    /**
     * Guarda una vivienda en la base de datos. Si la vivienda ya existe, se
     * actualiza la información.
     *
     * @param vivienda el objeto Vivienda a guardar o actualizar.
     */
    public void guardarVivienda(Vivienda vivienda) {
        String consultaExiste = "SELECT * FROM Vivienda WHERE referencia = ?";
        String consultaInsert = "INSERT INTO Vivienda (referencia, ubicacion, metros, habitaciones, banios, precio_mensual) VALUES (?, ?, ?, ?, ?, ?)";
        String consultaUpdate = "UPDATE Vivienda SET ubicacion = ?, metros = ?, habitaciones = ?, banios = ?, precio_mensual = ? WHERE referencia = ?";

        try (Connection conexion = ConexionBBDD.conectar(); PreparedStatement pstmtExiste = conexion.prepareStatement(consultaExiste)) {

            pstmtExiste.setString(1, vivienda.getReferencia());
            ResultSet resultado = pstmtExiste.executeQuery();

            if (resultado.next()) {
                try (PreparedStatement pstmtUpdate = conexion.prepareStatement(consultaUpdate)) {
                    pstmtUpdate.setString(1, vivienda.getUbicacion());
                    pstmtUpdate.setInt(2, vivienda.getMetros());
                    pstmtUpdate.setInt(3, vivienda.getHabitaciones());
                    pstmtUpdate.setInt(4, vivienda.getBanios());
                    pstmtUpdate.setDouble(5, vivienda.getPrecioMes());
                    pstmtUpdate.setString(6, vivienda.getReferencia());
                    pstmtUpdate.executeUpdate();
                }
            } else {
                try (PreparedStatement pstmtInsert = conexion.prepareStatement(consultaInsert)) {
                    pstmtInsert.setString(1, vivienda.getReferencia());
                    pstmtInsert.setString(2, vivienda.getUbicacion());
                    pstmtInsert.setInt(3, vivienda.getMetros());
                    pstmtInsert.setInt(4, vivienda.getHabitaciones());
                    pstmtInsert.setInt(5, vivienda.getBanios());
                    pstmtInsert.setDouble(6, vivienda.getPrecioMes());
                    pstmtInsert.executeUpdate();
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al guardar la vivienda: " + e.getMessage());
        }
    }

    /**
     * Elimina una vivienda de la base de datos en base a su número de
     * referencia.
     *
     * @param referencia el número de referencia de la vivienda a eliminar.
     * @throws IllegalArgumentException si la vivienda no existe.
     */
    public void eliminarVivienda(String referencia) {
        String consulta = "DELETE FROM Vivienda WHERE referencia = ?";

        try (Connection conexion = ConexionBBDD.conectar(); PreparedStatement pstmt = conexion.prepareStatement(consulta)) {

            pstmt.setString(1, referencia);
            int filasAfectadas = pstmt.executeUpdate();

            if (filasAfectadas == 0) {
                throw new IllegalArgumentException("Vivienda con referencia " + referencia + " no encontrada");
            }
        } catch (SQLException e) {
            System.err.println("Error al eliminar vivienda: " + e.getMessage());
        }
    }
}
