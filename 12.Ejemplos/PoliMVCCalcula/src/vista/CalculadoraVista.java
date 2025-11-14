/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;

// Vista: muestra informacion y captura datos del usuario
public class CalculadoraVista {

    private Scanner entrada = new Scanner(System.in);

    public String pedirNombreUsuario() {
        System.out.print("Bienvenido a PoliMVCCalcula \nIngrese su nombre: ");
        return entrada.nextLine();
    }

    public int mostrarMenu() {
        System.out.println("\n--- Menu PoliMVCCalcula ---");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opcion: ");
        return entrada.nextInt();
    }

    public float pedirNumero(String mensaje) {
        System.out.print(mensaje);
        return entrada.nextFloat();
    }

    public void mostrarResultado(float resultado) {
        System.out.println("El Resultado de la operacion es: " + resultado);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
