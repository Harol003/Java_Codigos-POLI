/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poli_navevelocidad;

/**
 *
 * @author Harol
 */
// Ejercicio 4: Ajustar velocidad segun destino en Poli_NaveVelocidad
public class Poli_NaveVelocidad {
    private String nombre;
    private double velocidad;
    private String destino;

    public Poli_NaveVelocidad(String nombre, double velocidad, String destino) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.destino = destino;
    }

    public void ajustarVelocidad() {
        if (destino.equalsIgnoreCase("Vulcano")) {
            velocidad = 8.0;
        } else if (destino.equalsIgnoreCase("Marte")) {
            velocidad = 6.0;
        } else {
            velocidad = 5.0;
        }
        System.out.println("Velocidad ajustada a " + velocidad + " warp para el destino " + destino);
    }

    public static void main(String[] args) {
        System.out.println("Bienvenido a Politecnico Internacional");
        System.out.println("Ejemplo Abstraccion | POO | Harol H. Torres");

        Poli_NaveVelocidad nave = new Poli_NaveVelocidad("USS Defiant", 5.0, "Vulcano");
        nave.ajustarVelocidad();

        System.out.println("Gracias por utilizar este software.");
        System.out.println("Ejemplo Abstraccion | POO | Harol H. Torres");
    }
}
