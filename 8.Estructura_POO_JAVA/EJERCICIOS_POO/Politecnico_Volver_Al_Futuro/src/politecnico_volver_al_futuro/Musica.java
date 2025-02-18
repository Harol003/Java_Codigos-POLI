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
 * Clase Musica que representa al compositor de la banda sonora de "Volver al Futuro".
 */
public class Musica {
    // Atributo de la clase Musica
    private String compositor;

    // Constructor
    public Musica(String compositor) {
        this.compositor = compositor;
    }

    // Método para mostrar la información del compositor
    public void mostrarInformacion() {
        System.out.println("El compositor de la banda sonora es: " + compositor);
    }
}
