/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poli_tripulacionespacial;

/**
 *
 * @author Harol
 */
// Ejercicio 3: Introducir clase Poli_TripulacionEspacial y relacionarla con Poli_NaveEstelar
class Poli_TripulacionEspacial {
    private final String nombreCapitan;
    private final int numeroTripulantes;

    // Constructor para la tripulacion
    public Poli_TripulacionEspacial(String nombreCapitan, int numeroTripulantes) {
        this.nombreCapitan = nombreCapitan;
        this.numeroTripulantes = numeroTripulantes;
    }

    public void mostrarInfo() {
        System.out.println("Capitan: " + nombreCapitan);
        System.out.println("Numero de tripulantes: " + numeroTripulantes);
    }
}

public class Poli_NaveEstelar {
    private String nombre;
    private double velocidad;
    private Poli_TripulacionEspacial tripulacion;

    public Poli_NaveEstelar(String nombre, double velocidad, Poli_TripulacionEspacial tripulacion) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.tripulacion = tripulacion;
    }

    public void despegar() {
        System.out.println(nombre + " ha despegado a una velocidad de " + velocidad + " warp.");
    }

    public void mostrarInfo() {
        System.out.println("Nombre de la nave: " + nombre);
        tripulacion.mostrarInfo();
    }

    public static void main(String[] args) {
        System.out.println("Bienvenido a Politecnico Internacional");
        System.out.println("Ejemplo Abstraccion | POO | Harol H. Torres");

        Poli_TripulacionEspacial tripulacion = new Poli_TripulacionEspacial("Capitan Kirk", 430);
        Poli_NaveEstelar enterprise = new Poli_NaveEstelar("USS Enterprise", 5.0, tripulacion);
        enterprise.despegar();
        enterprise.mostrarInfo();

        System.out.println("Gracias por utilizar este software.");
        System.out.println("Ejemplo Abstraccion | POO | Harol H. Torres");
    }
}
