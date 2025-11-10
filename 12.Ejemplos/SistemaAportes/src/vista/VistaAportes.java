/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author Harol
 */

import java.util.ArrayList;
import java.util.Scanner;
import modelo.Aporte;

// Vista Aportes
public class VistaAportes {

    Scanner sc = new Scanner(System.in);

    // Menu
    public int mostrarMenu() {
        System.out.println("\n--- Menu Aportes Seguridad Social ---");
        System.out.println("1. Calcular aportes");
        System.out.println("2. Ver historial");
        System.out.println("3. Salir");
        System.out.print("Opcion: ");
        return sc.nextInt();
    }

    // Pedir datos
    public String pedirNombre() {
        System.out.print("Ingrese nombre del trabajador: ");
        return sc.next();
    }

   // Metodo para pedir tipo de trabajador evitando errores de ingreso
public int pedirTipoTrabajador() {
    int tipo = 0;
    while (true) {
        try {
            System.out.println("Seleccione tipo de trabajador:");
            System.out.println("1. Dependiente");
            System.out.println("2. Independiente");
            System.out.print("Opcion: ");
            tipo = Integer.parseInt(sc.nextLine()); // lee como texto y convierte
            if (tipo == 1 || tipo == 2) {
                return tipo;
            } else {
                System.out.println("Opcion no valida. Intente de nuevo.\n");
            }
        } catch (Exception e) {
            System.out.println("Error: Ingrese solo numeros. Intente nuevamente.\n");
        }
    }
}


    public double pedirIngreso() {
        System.out.print("Ingrese ingreso mensual: ");
        return sc.nextDouble();
    }

    // Mostrar historial
    public void mostrarHistorial(ArrayList<Aporte> lista) {
        if(lista.isEmpty()) {
            System.out.println("No hay registros.");
        } else {
            for(Aporte a : lista) {
                System.out.println(a.getNombre() + " - " + a.getTipoTrabajador() + 
                " - Salud: $" + a.getSalud() + " - Pension: $" + a.getPension() + 
                " - ARL: $" + a.getArl());
            }
        }
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}
