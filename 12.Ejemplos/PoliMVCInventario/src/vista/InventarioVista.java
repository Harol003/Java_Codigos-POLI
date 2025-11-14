/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;

// Vista: muestra informacion y captura datos
public class InventarioVista {

    private Scanner entrada = new Scanner(System.in);

    public String pedirNombreUsuario() {
        System.out.print("Bienvenido a PoliMVCInventario \n Ingrese su nombre: ");
        return entrada.nextLine();
    }

    public int mostrarMenu() {
        System.out.println("\n--- Menu PoliMVCInventario ---");
        System.out.println("1. Agregar producto");
        System.out.println("2. Ver inventario");
        System.out.println("3. Buscar producto");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opcion: ");
        return entrada.nextInt();
    }

    public String pedirProducto(String mensaje) {
        System.out.print(mensaje);
        entrada.nextLine(); // limpiar buffer
        return entrada.nextLine();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarProductos(java.util.List<String> lista) {
        System.out.println("\n--- Lista de productos ---");
        if (lista.isEmpty()) {
            System.out.println("No hay productos registrados.");
        } else {
            for (String p : lista) {
                System.out.println("- " + p);
            }
        }
    }
}
