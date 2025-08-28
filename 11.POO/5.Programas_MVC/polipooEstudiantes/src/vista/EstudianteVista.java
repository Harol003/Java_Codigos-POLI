/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.List;
import java.util.Scanner;
import modelo.Estudiante;

// Clase que maneja la interaccion con el usuario
public class EstudianteVista {
    private Scanner scanner;

    public EstudianteVista() {
        scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("\n--- MENU ESTUDIANTES ---");
        System.out.println("1. Registrar estudiante");
        System.out.println("2. Mostrar estudiantes");
        System.out.println("3. Asignar notas a estudiante");
        System.out.println("4. Calcular promedio de estudiante");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opcion: ");
        return scanner.nextInt();
    }

    public String leerTexto(String mensaje) {
        System.out.print(mensaje);
        scanner.nextLine(); // limpiar buffer
        return scanner.nextLine();
    }

    public int leerEntero(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    public double leerDouble(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarEstudiantes(List<Estudiante> estudiantes) {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            System.out.println("\n--- LISTA DE ESTUDIANTES ---");
            for (Estudiante e : estudiantes) {
                System.out.println(e.getInformacion());
            }
        }
    }
}
