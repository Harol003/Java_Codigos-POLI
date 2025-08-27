/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Harol
 */
public class ResistenciaModelo {
    // Calcular en serie
    public double calcularSerie(double[] resistencias) {
        double total = 0;
        for (double r : resistencias) {
            total += r;
        }
        return total;
    }

    // Calcular en paralelo
    public double calcularParalelo(double[] resistencias) {
        double inversa = 0;
        for (double r : resistencias) {
            if (r != 0) {
                inversa += 1 / r;
            }
        }
        return inversa == 0 ? 0 : 1 / inversa;
    }
}
