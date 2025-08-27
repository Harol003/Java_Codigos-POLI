/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Harol
 */

// Herencia: Gato hereda de Mascota
public class Gato extends Mascota {

    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public String saludar() {
        return "Miau!";
    }
}