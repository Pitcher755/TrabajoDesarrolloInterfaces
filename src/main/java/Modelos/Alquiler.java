/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author JFG
 */
public class Alquiler {
    // Atributos
    private int nExpediente;
    private String fechaInicio;
    private int duracion;
    private Cliente cliente;
    private Vivienda vivienda;
    private boolean estadoPago;

    // Constructor con parámetros
    public Alquiler(int nExpediente, String fechaInicio, int duracion, Cliente cliente, Vivienda vivienda, boolean estadoPago) {
        this.nExpediente = nExpediente;
        this.fechaInicio = fechaInicio;
        this.duracion = duracion;
        this.cliente = cliente;
        this.vivienda = vivienda;
        this.estadoPago = estadoPago;
    }
    
    // Getters y Setters
    public int getnExpediente() {
        return nExpediente;
    }

    public void setnExpediente(int nExpediente) {
        this.nExpediente = nExpediente;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vivienda getVivienda() {
        return vivienda;
    }

    public void setVivienda(Vivienda vivienda) {
        this.vivienda = vivienda;
    }

    public boolean isEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(boolean estadoPago) {
        this.estadoPago = estadoPago;
    }
    
}
