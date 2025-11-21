/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;

// Clase encargada de la interaccion con el usuario
public class VistaConsola {

    private Scanner entrada = new Scanner(System.in);

    // Leer texto
    public String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    // Leer numero entero
    public int leerEntero(String mensaje) {
        System.out.print(mensaje);
        return Integer.parseInt(entrada.nextLine());
    }

    // Mostrar mensaje
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
