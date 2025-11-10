/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.Producto;

// Vista Arepas
public class VistaArepas {

    Scanner sc = new Scanner(System.in);

    // Menu
    public int mostrarMenu() {
        System.out.println("\n--- Menu Fabrica de Arepas ---");
        System.out.println("1. Registrar venta");
        System.out.println("2. Ver inventario");
        System.out.println("3. Consultar precios");
        System.out.println("4. Salir");
        System.out.print("Opcion: ");
        return sc.nextInt();
    }

    // Mostrar inventario
    public void mostrarInventario(ArrayList<Producto> lista) {
        for(int i = 0; i < lista.size(); i++) {
            Producto p = lista.get(i);
            System.out.println((i+1) + ". " + p.getNombre() + " - Cantidad: " + p.getCantidad());
        }
    }

    // Mostrar precios
    public void mostrarPrecios(ArrayList<Producto> lista) {
        for(int i = 0; i < lista.size(); i++) {
            Producto p = lista.get(i);
            System.out.println((i+1) + ". " + p.getNombre() + " - Precio: $" + p.getPrecio());
        }
    }

    // Elegir producto por numero
    public int elegirProducto(int totalProductos) {
        System.out.print("Seleccione el producto (1-" + totalProductos + "): ");
        return sc.nextInt() - 1;
    }

    public int pedirCantidadVenta() {
        System.out.print("Ingrese cantidad a vender: ");
        return sc.nextInt();
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}
