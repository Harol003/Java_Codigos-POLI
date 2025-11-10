/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimascotas;

import vista.VistaMascota;
import controlador.ControladorMascota;
import modelo.Mascota;
import java.util.Scanner;

// Main PoliMascotas
public class PoliMascotas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String user, pass;

        // Login con reintento
        do {
            
            System.out.print("Bienvenido a PoliMascotas! \n Ingresa tu Usuario: ");
            user = sc.next();
            System.out.print("Ingresa tu Contraseña: ");
            pass = sc.next();
        } while(!user.equals("admin") || !pass.equals("admin"));

        System.out.println("Bienvenido a PoliMascotas!");

        VistaMascota vista = new VistaMascota();
        ControladorMascota ctrl = new ControladorMascota();

        int opcion;
        do {
            opcion = vista.mostrarMenu();

            switch(opcion) {
                case 1:
                    // Registrar
                    Mascota m = vista.pedirDatosMascota();
                    ctrl.registrarMascota(m);
                break;
                case 2:
                    // Mostrar
                    vista.mostrarMascotas(ctrl.obtenerMascotas());
                break;
                case 3:
                    // Buscar
                    System.out.print("Ingrese nombre de la mascota a buscar: ");
                    String nombre = sc.next();
                    vista.mostrarResultadoBusqueda(ctrl.buscarPorNombre(nombre));
                break;
                case 4:
                    System.out.println("PoliMascotas, Hasta pronto! \n Desarrollado por Harol.Torres@pi.edu.co \n 2025");
                break;
                default:
                    System.out.println("Opcion no valida.");
            }

        } while(opcion != 4);
    }
}
