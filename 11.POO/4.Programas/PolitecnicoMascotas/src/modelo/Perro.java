/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Harol
 */

// Herencia: Perro hereda de Mascota
public class Perro extends Mascota {

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public String saludar() {
        return "Guau!";
    }
}