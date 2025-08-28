/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;

// Clase que maneja la interaccion con el usuario
public class BancoVista {
    private Scanner scanner;

    public BancoVista() {
        scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("\n--- MENU BANCO ---");
        System.out.println("1. Crear cuenta");
        System.out.println("2. Consultar saldo");
        System.out.println("3. Depositar dinero");
        System.out.println("4. Retirar dinero");
        System.out.println("5. Mostrar informacion de la cuenta");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opcion: ");
        return scanner.nextInt();
    }

    public String leerTexto(String mensaje) {
        System.out.print(mensaje);
        scanner.nextLine(); // limpiar buffer
        return scanner.nextLine();
    }

    public double leerCantidad(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarSaldo(double saldo) {
        System.out.println("Saldo actual: $" + saldo);
    }
}
