/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author JFG
 */
public class Vivienda {
    // Atributos
    private String referencia;
    private String ubicacion;
    private int metros;
    private int habitaciones;
    private int banios;
    private double precioMes;

    public Vivienda(String referencia, String ubicacion, int metros, int habitaciones, int banios, double precioMes) {
        this.referencia = referencia;
        this.ubicacion = ubicacion;
        this.metros = metros;
        this.habitaciones = habitaciones;
        this.banios = banios;
        this.precioMes = precioMes;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getMetros() {
        return metros;
    }

    public void setMetros(int metros) {
        this.metros = metros;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getBanios() {
        return banios;
    }

    public void setBanios(int banios) {
        this.banios = banios;
    }

    public double getPrecioMes() {
        return precioMes;
    }

    public void setPrecioMes(double precioMes) {
        this.precioMes = precioMes;
    }
    
    
}
