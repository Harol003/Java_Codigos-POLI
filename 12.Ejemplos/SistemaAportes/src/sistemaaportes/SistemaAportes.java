/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaaportes;

/**
 *
 * @author Harol
 */
import vista.VistaAportes;
import controlador.ControladorAportes;
import java.util.Scanner;

// Main Sistema Aportes
public class SistemaAportes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String user, pass;

        // Login con reintento
        do {
            System.out.print("Bienvenido a PoliSeguridadSocial, \n Usuario: ");
            user = sc.next();
            System.out.print("Contrasena: ");
            pass = sc.next();
        } while(!user.equals("admin") || !pass.equals("admin"));

        System.out.println("Bienvenido al Sistema de Aportes!");

        VistaAportes vista = new VistaAportes();
        ControladorAportes ctrl = new ControladorAportes();

        int opcion;
        do {
            opcion = vista.mostrarMenu();

            switch(opcion) {
                case 1:
                    String nombre = vista.pedirNombre();
                    int tipo = vista.pedirTipoTrabajador();
                    double ingreso = vista.pedirIngreso();
                    ctrl.calcularAportes(nombre, tipo, ingreso);
                    vista.mostrarMensaje("Aportes calculados y guardados.");
                break;

                case 2:
                    vista.mostrarHistorial(ctrl.obtenerHistorial());
                break;

                case 3:
                    System.out.println("Gracias por utilizar, PoliSeguridadSocial Hasta pronto! \n Desarrollado por Harol.Torres@pi.edu.co \n 2025");
                break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while(opcion != 3);
    }
}
