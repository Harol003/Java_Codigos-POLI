/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poli_naveespacial;

/**
 *
 * @author Harol
 */
// Ejercicio 1: Clase basica Poli_NaveEspacial
public class Poli_NaveEspacial {
    // Atributos basicos de la nave
    private String nombre;
    private double velocidad;

    // Constructor de la clase Poli_NaveEspacial
    public Poli_NaveEspacial(String nombre, double velocidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
    }

    // Metodo para obtener el nombre de la nave
    public String obtenerNombre() {
        return nombre;
    }

    // Metodo para obtener la velocidad actual de la nave
    public double obtenerVelocidad() {
        return velocidad;
    }

    // Metodo para mostrar la informacion de la nave
    public void mostrarInfo() {
        System.out.println("Nombre de la nave: " + nombre);
        System.out.println("Velocidad actual: " + velocidad + " warp");
    }

    public static void main(String[] args) {
        System.out.println("Bienvenido a Politecnico Internacional");
        System.out.println("Ejemplo Abstraccion | POO | Harol H. Torres");

        // Crear una instancia de la clase Poli_NaveEspacial
        Poli_NaveEspacial enterprise = new Poli_NaveEspacial("USS Enterprise", 5.0);
        enterprise.mostrarInfo();

        System.out.println("Gracias por utilizar este software.");
        System.out.println("Ejemplo Abstraccion | POO | Harol H. Torres");
    }
}
