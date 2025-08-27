/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Harol
 */

// Fabrica de mascotas (polimorfismo)
public class GestorMascotas {
    public Mascota crearMascota(String tipo, String nombre) {
        if (tipo.equalsIgnoreCase("Perro")) {
            return new Perro(nombre);
        } else {
            return new Gato(nombre);
        }
    }
}