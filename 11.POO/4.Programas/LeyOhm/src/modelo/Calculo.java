/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

// Abstraccion: definimos una clase base abstracta para calculos electricos
public abstract class Calculo {
    protected double voltaje;
    protected double corriente;
    protected double resistencia;

    // Encapsulamiento con getters y setters
    public double getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(double voltaje) {
        this.voltaje = voltaje;
    }

    public double getCorriente() {
        return corriente;
    }

    public void setCorriente(double corriente) {
        this.corriente = corriente;
    }

    public double getResistencia() {
        return resistencia;
    }

    public void setResistencia(double resistencia) {
        this.resistencia = resistencia;
    }

    // Metodo abstracto (Polimorfismo)
    public abstract double calcular();
}
