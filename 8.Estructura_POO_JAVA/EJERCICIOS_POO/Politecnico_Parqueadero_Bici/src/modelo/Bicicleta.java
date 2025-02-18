/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Harol
 */

public class Bicicleta {
    private String nombreDueno;
    private String marca;
    private String color;

    /**
     * Constructor de la bicicleta.
     * @param nombreDueno Nombre del dueño de la bicicleta.
     * @param marca Marca de la bicicleta.
     * @param color Color de la bicicleta.
     */
    public Bicicleta(String nombreDueno, String marca, String color) {
        this.nombreDueno = nombreDueno;
        this.marca = marca;
        this.color = color;
    }

    /**
     * Método para obtener la información de la bicicleta.
     * @return Datos de la bicicleta.
     */
    public String obtenerDatos() {
        return "Dueño: " + nombreDueno + "\nMarca: " + marca + "\nColor: " + color;
    }
}