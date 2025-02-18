/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poli_misionnave;

/**
 *
 * @author Harol
 */
// Ejercicio 5: Interaccion con el usuario en Poli_MisionNave
import java.util.Scanner;

public class Poli_MisionNave {
    private String nombreNave;
    private String nombreCapitan;
    private double velocidad;
    private String destino;
    private double distancia;

    public Poli_MisionNave(String nombreNave, String nombreCapitan, double velocidad, String destino, double distancia) {
        this.nombreNave = nombreNave;
        this.nombreCapitan = nombreCapitan;
        this.velocidad = velocidad;
        this.destino = destino;
        this.distancia = distancia;
    }

    public void mostrarInfoMision() {
        System.out.println("Mision: " + nombreNave + " comandada por el Capitan " + nombreCapitan);
        System.out.println("Destino: " + destino + " a una velocidad de " + velocidad + " warp.");
        System.out.println("Distancia al destino: " + distancia + " años luz.");
    }

    public static void main(String[] args) {
        System.out.println("Bienvenido a Politecnico Internacional");
        System.out.println("Ejemplo Abstraccion | POO | Harol H. Torres");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la nave: ");
        String nombreNave = scanner.nextLine();

        System.out.print("Ingrese el nombre del capitan: ");
        String nombreCapitan = scanner.nextLine();

        System.out.print("Ingrese la velocidad de la nave (en warp): ");
        double velocidad = scanner.nextDouble();

        scanner.nextLine();  // Limpiar el buffer

        System.out.print("Ingrese el destino de la mision: ");
        String destino = scanner.nextLine();

        System.out.print("Ingrese la distancia al destino (en años luz): ");
        double distancia = scanner.nextDouble();

        Poli_MisionNave mision = new Poli_MisionNave(nombreNave, nombreCapitan, velocidad, destino, distancia);
        mision.mostrarInfoMision();

        System.out.println("Gracias por utilizar este software.");
        System.out.println("Ejemplo Abstraccion | POO | Harol H. Torres");
    }
}
