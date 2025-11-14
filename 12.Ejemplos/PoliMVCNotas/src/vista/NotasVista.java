/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;
import java.util.List;
import modelo.Estudiante;

// Vista: captura y muestra informacion
public class NotasVista {

    private Scanner entrada = new Scanner(System.in);

    public String pedirNombreUsuario() {
        System.out.print("Bienvenido a PoliMVCNotas \n Ingrese su nombre: ");
        return entrada.nextLine();
    }

    public int mostrarMenu() {
        System.out.println("\n--- Menu PoliMVCNotas ---");
        System.out.println("1. Registrar estudiante");
        System.out.println("2. Ver promedio de un estudiante");
        System.out.println("3. Ver estado (aprobado / reprobado)");
        System.out.println("4. Listar estudiantes");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opcion: ");
        while (!entrada.hasNextInt()) {
            System.out.print("Ingrese un numero valido: ");
            entrada.next();
        }
        int opcion = entrada.nextInt();
        entrada.nextLine(); // limpiar buffer
        return opcion;
    }

    public String pedirTexto(String mensaje) {
        System.out.print(mensaje);
        return entrada.nextLine();
    }

    public float pedirNota(String mensaje) {
        System.out.print(mensaje);
        while (!entrada.hasNextFloat()) {
            System.out.print("Ingrese una nota valida (ej: 3.5): ");
            entrada.next();
        }
        float nota = entrada.nextFloat();
        entrada.nextLine(); // limpiar buffer
        return nota;
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarListaEstudiantes(List<Estudiante> lista) {
        System.out.println("\n--- Estudiantes Registrados ---");
        if (lista.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            for (Estudiante e : lista) {
                System.out.println("- " + e.nombre);
            }
        }
    }
}
