/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.InventarioModelo;
import vista.InventarioVista;

// Controlador: conecta la vista y el modelo
public class InventarioControlador {

    private InventarioModelo modelo;
    private InventarioVista vista;

    public InventarioControlador(InventarioModelo modelo, InventarioVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {

        String nombreUsuario = vista.pedirNombreUsuario();
        vista.mostrarMensaje("Bienvenido " + nombreUsuario + " al sistema PoliMVCInventario");

        boolean continuar = true;

        while (continuar) {
            int opcion = vista.mostrarMenu();

            switch (opcion) {

                case 1: {
                    String producto = vista.pedirProducto("Ingrese el nombre del producto: ");
                    modelo.agregarProducto(producto);
                    vista.mostrarMensaje("Producto agregado correctamente.");
                    break;
                }

                case 2: {
                    vista.mostrarProductos(modelo.obtenerProductos());
                    break;
                }

                case 3: {
                    String producto = vista.pedirProducto("Ingrese el producto a buscar: ");
                    boolean encontrado = modelo.buscarProducto(producto);

                    if (encontrado) {
                        vista.mostrarMensaje("El producto SI esta en el inventario.");
                    } else {
                        vista.mostrarMensaje("El producto NO se encuentra registrado.");
                    }
                    break;
                }

                case 4:
                    vista.mostrarMensaje("Gracias por usar PoliMVCInventario desarrollado por Harol.Torres@pi.educo - 2025.");
                    continuar = false;
                    break;

                default:
                    vista.mostrarMensaje("Opcion no valida.");
            }
        }
    }
}
