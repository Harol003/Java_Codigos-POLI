/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polielectronica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase principal PoliElectronica
 * @author Harol
 */
public class PoliElectronica {

    // Lista para almacenar los productos
    private List<Producto> productos;

    // Constructor de la clase PoliElectronica
    public PoliElectronica() {
        this.productos = new ArrayList<>();
    }

    // Método para guardar la información de un producto
    public void guardarProducto() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese el costo del producto: ");
        double costo = scanner.nextDouble();
        
        System.out.print("Ingrese la cantidad de productos: ");
        int cantidad = scanner.nextInt();
        
        // Crear un nuevo producto y añadirlo a la lista
        Producto producto = new Producto(nombre, costo, cantidad);
        productos.add(producto);
        
        System.out.println("Producto guardado exitosamente.");
    }

    // Método para consultar la lista de productos
    public void consultarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos guardados.");
        } else {
            System.out.println("\n--- Lista de Productos ---");
            for (Producto producto : productos) {
                System.out.println(producto);
            }
        }
    }

    // Método principal
    public static void main(String[] args) {
        PoliElectronica tienda = new PoliElectronica();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- Menu PoliElectronica ---");
            System.out.println("1. Guardar producto");
            System.out.println("2. Consultar productos");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    tienda.guardarProducto();
                    break;
                case 2:
                    tienda.consultarProductos();
                    break;
                case 3:
                    System.out.println("Gracias por utilizar este programa. POLI | POO | 2024.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opcion invalida. Intente nuevamente.");
            }
        }
        
        scanner.close();
    }
}

// Clase Producto que representa un producto en la tienda
class Producto {
    private String nombre;
    private double costo;
    private int cantidad;

    // Constructor de la clase Producto
    public Producto(String nombre, double costo, int cantidad) {
        this.nombre = nombre;
        this.costo = costo;
        this.cantidad = cantidad;
    }

    // Método toString para mostrar la información del producto
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Costo: " + costo + ", Cantidad: " + cantidad;
    }
}
