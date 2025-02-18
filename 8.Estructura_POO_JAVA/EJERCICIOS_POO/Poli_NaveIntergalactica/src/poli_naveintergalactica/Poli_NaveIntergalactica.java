/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poli_naveintergalactica;

/**
 *
 * @author Harol
 */
// Ejercicio 2: Agregar metodos despegar y aterrizar en Poli_NaveIntergalactica
public class Poli_NaveIntergalactica {
    private String nombre;
    private double velocidad;

    public Poli_NaveIntergalactica(String nombre, double velocidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
    }

    public void mostrarInfo() {
        System.out.println("Nombre de la nave: " + nombre);
        System.out.println("Velocidad actual: " + velocidad + " warp");
    }

    // Metodo para simular el despegue
    public void despegar() {
        System.out.println(nombre + " ha despegado a una velocidad de " + velocidad + " warp.");
    }

    // Metodo para simular el aterrizaje
    public void aterrizar() {
        System.out.println(nombre + " ha aterrizado.");
    }

    public static void main(String[] args) {
        System.out.println("Bienvenido a Politecnico Internacional");
        System.out.println("Ejemplo Abstraccion | POO | Harol H. Torres");

        Poli_NaveIntergalactica voyager = new Poli_NaveIntergalactica("USS Voyager", 7.0);
        voyager.despegar();
        voyager.aterrizar();

        System.out.println("Gracias por utilizar este software.");
        System.out.println("Ejemplo Abstraccion | POO | Harol H. Torres");
    }
}
