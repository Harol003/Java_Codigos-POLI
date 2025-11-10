/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.Mascota;

// Vista Mascota
public class VistaMascota {
    Scanner sc = new Scanner(System.in);

    // Menu
    public int mostrarMenu() {
        System.out.println("\n--- Menu PoliMascotas ---");
        System.out.println("1. Registrar mascota");
        System.out.println("2. Mostrar mascotas");
        System.out.println("3. Buscar mascota por nombre");
        System.out.println("4. Salir");
        System.out.print("Opcion: ");
        return sc.nextInt();
    }

    // Pedir datos mascota
    public Mascota pedirDatosMascota() {
        System.out.print("Ingrese nombre de la mascota: ");
        String nombre = sc.next();
        System.out.print("Ingrese Especie: ");
        String tipo = sc.next();
        System.out.print("Ingrese edad de la mascota: ");
        int edad = sc.nextInt();
        return new Mascota(nombre, tipo, edad);
    }

    // Mostrar lista
    public void mostrarMascotas(ArrayList<Mascota> lista) {
        if(lista.isEmpty()) {
            System.out.println("No hay mascotas registradas.");
        } else {
            for(Mascota m : lista) {
                System.out.println(m.getNombre() + " - " + m.getTipo() + " - " + m.getEdad() + " anos");
            }
        }
    }

    // Mostrar resultado de busqueda
    public void mostrarResultadoBusqueda(Mascota m) {
        if(m == null) {
            System.out.println("Mascota no encontrada.");
        } else {
            System.out.println("Encontrada: " + m.getNombre() + " - " + m.getTipo() + " - " + m.getEdad() + " anos");
        }
    }
}
