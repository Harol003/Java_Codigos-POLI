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
 * Clase Reparto que representa a los actores de la película "Volver al Futuro".
 */
public class Reparto {
    // Atributos de la clase Reparto
    private String nombreActor;
    private String personaje;

    // Constructor
    public Reparto(String nombreActor, String personaje) {
        this.nombreActor = nombreActor;
        this.personaje = personaje;
    }

    // Método para mostrar la información del actor
    public void mostrarInformacion() {
        System.out.println(nombreActor + " interpreta a " + personaje);
    }
}
