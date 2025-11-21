/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

// Clase encargada de convertir velocidad de km/h a m/s
public class ConversorVelocidad {

    private float velocidadKmH;

    // Constructor
    public ConversorVelocidad(float velocidadKmH) {
        this.velocidadKmH = velocidadKmH;
    }

    // Metodo de conversion
    // Formula: m/s = km/h / 3.6
    public float convertirAMetrosPorSegundo() {
        return velocidadKmH / 3.6f;
    }
}
