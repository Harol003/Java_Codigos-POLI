/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fabricaarepas;

import vista.VistaArepas;
import controlador.ControladorArepas;

// Main Fabrica Arepas
public class FabricaArepas {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        String user, pass;

        // Login con reintento
        do {
            System.out.print("¡Bienvenido a PoliArepas!\nIngresa tu Usuario: ");
            user = sc.next();
            System.out.print("Ingresa tu Contrasena: ");
            pass = sc.next();
        } while(!user.equals("admin") || !pass.equals("admin"));

        System.out.println("Bienvenido a la Fabrica de Arepas!");

        VistaArepas vista = new VistaArepas();
        ControladorArepas ctrl = new ControladorArepas();
        ctrl.cargarInventario();

        int opcion;
        do {
            opcion = vista.mostrarMenu();

            switch(opcion) {
                case 1 -> {
                    // Registrar venta mostrando productos validos
                    vista.mostrarInventario(ctrl.obtenerInventario());
                    int indice = vista.elegirProducto(ctrl.obtenerInventario().size());
                    int cantidad = vista.pedirCantidadVenta();
                    boolean venta = ctrl.registrarVenta(indice, cantidad);

                    if(venta) vista.mostrarMensaje("Venta exitosa!");
                    else vista.mostrarMensaje("No se pudo realizar la venta.");
                }

                case 2 -> vista.mostrarInventario(ctrl.obtenerInventario());

                case 3 -> vista.mostrarPrecios(ctrl.obtenerPrecios());

                case 4 -> System.out.println("Gracias por utilizar PoliArepas, Hasta pronto!\n Desarrollado por Harol.Torres@pi.edu.co \n 2025 ");

                default -> System.out.println("Opcion no valida.");
            }

        } while(opcion != 4);
    }
}
