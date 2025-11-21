/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;

// Clase encargada de leer y mostrar informacion al usuario
public class VistaConsola {

    private Scanner entrada = new Scanner(System.in);

    // Leer texto
    public String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    // Leer numero real (float)
    public float leerFloat(String mensaje) {
        System.out.print(mensaje);
        return Float.parseFloat(entrada.nextLine());
    }

    // Mostrar mensaje
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
