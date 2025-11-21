/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;

// Clase encargada de la interaccion con el usuario
public class VistaConsola {

    private Scanner entrada = new Scanner(System.in);

    // Metodo para leer texto
    public String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    // Metodo para leer un numero entero
    public int leerEntero(String mensaje) {
        System.out.print(mensaje);
        return Integer.parseInt(entrada.nextLine());
    }

    // Metodo para mostrar mensajes
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
