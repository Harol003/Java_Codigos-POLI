/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package politecnico_tienda_electronica_2;

/**
 *
 * @author Harol
 */

/**
 * Clase ClientePreferencial que representa a un cliente con descuento.
 */
public class ClientePreferencial {
    // Atributos del cliente
    private String nombre;
    private double descuento; // Porcentaje de descuento

    // Constructor
    public ClientePreferencial(String nombre, double descuento) {
        this.nombre = nombre;
        this.descuento = descuento;
    }

    // Método para calcular el precio con descuento
    public double calcularPrecioConDescuento(Producto producto) {
        return producto.getPrecio() * (1 - descuento / 100);
    }

    // Método para mostrar la información del cliente
    public void mostrarInformacion() {
        System.out.println("Cliente Preferencial: " + nombre + " | Descuento: " + descuento + "%");
    }
}
