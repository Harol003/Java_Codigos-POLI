/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package politecnico_computadora;

/**
 *
 * @author Harol
 */


/**
 * Clase que representa una computadora con atributos y métodos básicos.
 */
public class Computadora {
    // Atributos (características de la computadora)
    String marca;
    String modelo;
    int ram; // Capacidad de RAM en GB
    boolean encendida;

    /**
     * Constructor de la clase Computadora.
     * Se ejecuta cuando se crea un objeto de tipo Computadora.
     * 
     * @param marca  Marca de la computadora (ej. Dell, HP, Lenovo).
     * @param modelo Modelo de la computadora (ej. Inspiron, ThinkPad).
     * @param ram    Cantidad de memoria RAM en GB.
     */
    public Computadora(String marca, String modelo, int ram) {
        this.marca = marca;
        this.modelo = modelo;
        this.ram = ram;
        this.encendida = false; // Por defecto, la computadora inicia apagada.
    }

    /**
     * Método para encender la computadora.
     */
    public void encender() {
        encendida = true;
        System.out.println("La computadora está encendida.");
    }

    /**
     * Método para apagar la computadora.
     */
    public void apagar() {
        encendida = false;
        System.out.println("La computadora está apagada.");
    }

    /**
     * Método para mostrar la información de la computadora.
     */
    public void mostrarInformacion() {
        System.out.println("Computadora: " + marca + " " + modelo + " - RAM: " + ram + "GB");
        System.out.println("Estado: " + (encendida ? "Encendida" : "Apagada"));
    }
}
