/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.Cliente;
import Utilidades.ConexionBBDD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Controlador para manejar operaciones relacionadas con los clientes.
 *
 * @author JFG
 */
public class ControladorCliente {
    // Métodos

    /**
     * Obtiene todos los clientes almacenados en la base de datos.
     *
     * @return una lista de objetos Cliente.
     */
    public List<Cliente> obtenerTodosLosClientes() {
        List<Cliente> clientes = new ArrayList<>();
        String consulta = "SELECT * FROM Cliente";

        try (Connection conexion = ConexionBBDD.conectar(); Statement stmt = conexion.createStatement(); ResultSet resultado = stmt.executeQuery(consulta)) {

            while (resultado.next()) {
                Cliente cliente = new Cliente(
                        resultado.getString("dni"),
                        resultado.getString("nombre"),
                        resultado.getString("apellidos"),
                        resultado.getString("telefono"),
                        resultado.getString("email"),
                        resultado.getString("direccion_facturacion")
                );
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener los clientes: " + e.getMessage());
        }
        return clientes;
    }

    /**
     * Busca un cliente por DNI.
     *
     * @param dni el DNI del cliente a buscar.
     * @return el objeto Cliente encontrado, o null si no se encuentra.
     */
    public Cliente buscarClientePorDni(String dni) {
        String consulta = "SELECT * FROM Cliente WHERE dni = ?";
        Cliente cliente = null;

        try (Connection conexion = ConexionBBDD.conectar(); PreparedStatement pstmt = conexion.prepareStatement(consulta)) {

            pstmt.setString(1, dni);
            ResultSet resultado = pstmt.executeQuery();

            if (resultado.next()) {
                cliente = new Cliente(
                        resultado.getString("dni"),
                        resultado.getString("nombre"),
                        resultado.getString("apellidos"),
                        resultado.getString("telefono"),
                        resultado.getString("email"),
                        resultado.getString("direccion_facturacion")
                );
            }
        } catch (SQLException e) {
            System.err.println("Error al buscar cliente por DNI: " + e.getMessage());
        }
        return cliente;

    }

    /**
     * Guarda un cliente en la base de datos. Si el cliente ya existe, se
     * actualiza la información.
     *
     * @param cliente el objeto Cliente a guardar o actualizar.
     */
    public void guardarCliente(Cliente cliente) {
        String consultaExiste = "SELECT * FROM Cliente WHERE dni = ?";
        String consultaInsert = "INSERT INTO Cliente (dni, nombre, apellidos, telefono, email, direccion_facturacion) VALUES (?, ?, ?, ?, ?, ?)";
        String consultaUpdate = "UPDATE Cliente SET nombre = ?, apellidos = ?, telefono = ?, email = ?, direccion_facturacion = ? WHERE dni = ?";

        try (Connection conexion = ConexionBBDD.conectar(); PreparedStatement pstmtExiste = conexion.prepareStatement(consultaExiste)) {

            pstmtExiste.setString(1, cliente.getDni());
            ResultSet resultado = pstmtExiste.executeQuery();

            if (resultado.next()) {
                try (PreparedStatement pstmtUpdate = conexion.prepareStatement(consultaUpdate)) {
                    pstmtUpdate.setString(1, cliente.getNombre());
                    pstmtUpdate.setString(2, cliente.getApellidos());
                    pstmtUpdate.setString(3, cliente.getTelefono());
                    pstmtUpdate.setString(4, cliente.getEmail());
                    pstmtUpdate.setString(5, cliente.getDireccionFacturacion());
                    pstmtUpdate.setString(6, cliente.getDni());
                    pstmtUpdate.executeUpdate();
                }
            } else {
                try (PreparedStatement pstmtInsert = conexion.prepareStatement(consultaInsert)) {
                    pstmtInsert.setString(1, cliente.getDni());
                    pstmtInsert.setString(2, cliente.getNombre());
                    pstmtInsert.setString(3, cliente.getApellidos());
                    pstmtInsert.setString(4, cliente.getTelefono());
                    pstmtInsert.setString(5, cliente.getEmail());
                    pstmtInsert.setString(6, cliente.getDireccionFacturacion());
                    pstmtInsert.executeUpdate();
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al guardar cliente: " + e.getMessage());
        }
    }

    /**
     * Elimina un cliente de la base de datos basandose en su DNI.
     *
     * @param dni el DNI del cliente a eliminar.
     * @throws IllegalArgumentException si el cliente no existe.
     */
    public void eliminarCliente(String dni) {
        String consulta = "DELETE FROM Cliente WHERE dni = ?";

        try (Connection conexion = ConexionBBDD.conectar(); 
            PreparedStatement pstmt = conexion.prepareStatement(consulta)) {

            pstmt.setString(1, dni);
            int filasAfectadas = pstmt.executeUpdate();

            if (filasAfectadas == 0) {
                throw new IllegalArgumentException("Cliente con DNI " + dni + " no encontrado.");
            }
        } catch (SQLException e) {
            System.err.println("Error al eliminar cliente: " + e.getMessage());
        }
    }
}
