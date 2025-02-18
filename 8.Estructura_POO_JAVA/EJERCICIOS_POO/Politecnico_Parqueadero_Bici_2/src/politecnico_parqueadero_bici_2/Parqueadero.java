/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package politecnico_parqueadero_bici_2;

/**
 *
 * @author Harol
 */

// --- MODELO ---



public class Parqueadero {
    private int capacidad;
    private int ocupados;
    
    public Parqueadero(int capacidad) {
        this.capacidad = capacidad;
        this.ocupados = 0;
    }
    
    public boolean ingresarBicicleta() {
        if (ocupados < capacidad) {
            ocupados++;
            return true;
        }
        return false;
    }
    
    public boolean retirarBicicleta() {
        if (ocupados > 0) {
            ocupados--;
            return true;
        }
        return false;
    }
    
    public String obtenerEstado() {
        return "Bicicletas estacionadas: " + ocupados + " / " + capacidad;
    }
}