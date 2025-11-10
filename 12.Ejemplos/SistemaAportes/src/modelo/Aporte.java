/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Harol
 */

// Modelo Aporte
public class Aporte {
    private String nombre;
    private String tipoTrabajador;
    private double ingreso;
    private double salud;
    private double pension;
    private double arl;

    // Constructor
    public Aporte(String nombre, String tipoTrabajador, double ingreso, double salud, double pension, double arl) {
        this.nombre = nombre;
        this.tipoTrabajador = tipoTrabajador;
        this.ingreso = ingreso;
        this.salud = salud;
        this.pension = pension;
        this.arl = arl;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getTipoTrabajador() { return tipoTrabajador; }
    public double getIngreso() { return ingreso; }
    public double getSalud() { return salud; }
    public double getPension() { return pension; }
    public double getArl() { return arl; }
}
