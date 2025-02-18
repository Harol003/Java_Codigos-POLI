/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package politecnico_automovil;

/**
 *
 * @author Harol
 */

/**
 * Clase que representa un automóvil con atributos y métodos básicos.
 */
public class Automovil {
    // Atributos (características del automóvil)
    String marca;
    String modelo;
    int año;
    boolean encendido;

    /**
     * Constructor de la clase Automovil.
     * Se ejecuta cuando se crea un objeto de tipo Automovil.
     * 
     * @param marca  Marca del automóvil (ej. Renault, Mazda).
     * @param modelo Modelo del automóvil (ej. Twingo, Renault4).
     * @param año    Año de fabricación.
     */
    public Automovil(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.encendido = false; // Por defecto, el automóvil inicia apagado.
    }

    /**
     * Método para encender el automóvil.
     */
    public void encender() {
        encendido = true;
        System.out.println("El automóvil está encendido.");
    }

    /**
     * Método para apagar el automóvil.
     */
    public void apagar() {
        encendido = false;
        System.out.println("El automóvil está apagado.");
    }

    /**
     * Método para mostrar la información del automóvil.
     */
    public void mostrarInformacion() {
        System.out.println("Automóvil: " + marca + " " + modelo + " - Año: " + año);
        System.out.println("Estado: " + (encendido ? "Encendido" : "Apagado"));
    }
}
