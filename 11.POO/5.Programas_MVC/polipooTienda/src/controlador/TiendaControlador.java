/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Producto;
import vista.TiendaVista;
import java.util.ArrayList;
import java.util.List;

// Clase que conecta la vista con el modelo
public class TiendaControlador {
    private TiendaVista vista;
    private List<Producto> productos;

    public TiendaControlador(TiendaVista vista) {
        this.vista = vista;
        this.productos = new ArrayList<>();
    }

    public void iniciar() {
        boolean salir = false;

        while (!salir) {
            int opcion = vista.mostrarMenu();

            switch (opcion) {
                case 1:
                    String nombre = vista.leerTexto("Ingrese el nombre del producto: ");
                    double precio = vista.leerDouble("Ingrese el precio: ");
                    int stock = vista.leerEntero("Ingrese el stock inicial: ");
                    productos.add(new Producto(nombre, precio, stock));
                    vista.mostrarMensaje("Producto agregado con exito.");
                    break;

                case 2:
                    vista.mostrarProductos(productos);
                    break;

                case 3:
                    if (productos.isEmpty()) {
                        vista.mostrarMensaje("No hay productos disponibles.");
                    } else {
                        String nombreVenta = vista.leerTexto("Ingrese el nombre del producto a vender: ");
                        int cantidadVenta = vista.leerEntero("Ingrese la cantidad a vender: ");
                        Producto productoVenta = buscarProducto(nombreVenta);
                        if (productoVenta != null && productoVenta.vender(cantidadVenta)) {
                            vista.mostrarMensaje("Venta realizada con exito.");
                        } else {
                            vista.mostrarMensaje("No se pudo realizar la venta. Verifique stock y nombre.");
                        }
                    }
                    break;

                case 4:
                    if (productos.isEmpty()) {
                        vista.mostrarMensaje("No hay productos disponibles.");
                    } else {
                        String nombreStock = vista.leerTexto("Ingrese el nombre del producto para aumentar stock: ");
                        int cantidadStock = vista.leerEntero("Ingrese la cantidad a agregar: ");
                        Producto productoStock = buscarProducto(nombreStock);
                        if (productoStock != null) {
                            productoStock.agregarStock(cantidadStock);
                            vista.mostrarMensaje("Stock actualizado correctamente.");
                        } else {
                            vista.mostrarMensaje("Producto no encontrado.");
                        }
                    }
                    break;

                case 5:
                    vista.mostrarMensaje("Saliendo del sistema...");
                    salir = true;
                    break;

                default:
                    vista.mostrarMensaje("Opcion invalida, intente de nuevo.");
            }
        }
    }

    private Producto buscarProducto(String nombre) {
        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }
}
