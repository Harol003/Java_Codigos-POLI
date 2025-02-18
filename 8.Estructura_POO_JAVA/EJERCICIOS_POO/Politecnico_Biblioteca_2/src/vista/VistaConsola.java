/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista; // Definimos el paquete "vista"

import java.util.Scanner; // Importamos Scanner

// Clase que maneja la interacción con el usuario
public class VistaConsola {
    private Scanner scanner = new Scanner(System.in);

    // Método para pedir el nombre del usuario
    public String obtenerNombreUsuario() {
        System.out.print("Por favor, ingresa tu nombre: ");
        return scanner.nextLine();
    }

    // Método para mostrar la bienvenida
    public void mostrarBienvenida(String nombre) {
        System.out.println("\n¡Bienvenido a la biblioteca, " + nombre + "!");
    }

    // Método para mostrar detalles del libro
    public void mostrarDetallesLibro(String detalles) {
        System.out.println(detalles);
    }
}
