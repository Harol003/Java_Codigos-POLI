/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package politecnico_volver_al_futuro;

/**
 *
 * @author Harol
 */

/**
 * Clase Ventas que representa las ventas de la película en diferentes países en dólares.
 */
public class Ventas {
    // Atributos de la clase Ventas
    private String pais;
    private double ventasDolares;

    // Constructor
    public Ventas(String pais, double ventasDolares) {
        this.pais = pais;
        this.ventasDolares = ventasDolares;
    }

    // Método para mostrar la información de ventas
    public void mostrarInformacion() {
        System.out.println("Ventas en " + pais + ": $" + ventasDolares + " USD");
    }
}
