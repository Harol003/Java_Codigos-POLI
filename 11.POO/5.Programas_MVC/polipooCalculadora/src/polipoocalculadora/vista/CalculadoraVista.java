/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polipoocalculadora.vista;

/**
 *
 * @author Harol
 */


import java.util.Scanner;

// Clase que se encarga de la interaccion con el usuario
public class CalculadoraVista {
    private Scanner scanner;

    public CalculadoraVista() {
        scanner = new Scanner(System.in);
    }

    public double leerNumero(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }

    public int mostrarMenu() {
        System.out.println("\n--- MENU CALCULADORA ---");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opcion: ");
        return scanner.nextInt();
    }

    public void mostrarResultado(double resultado) {
        System.out.println("El resultado es: " + resultado);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
