/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

// Clase que representa un producto en la tienda
public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    // Constructor
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Metodo para vender un producto
    public boolean vender(int cantidad) {
        if (cantidad > 0 && cantidad <= stock) {
            stock -= cantidad;
            return true;
        } else {
            return false;
        }
    }

    // Metodo para aumentar el stock
    public void agregarStock(int cantidad) {
        if (cantidad > 0) {
            stock += cantidad;
        }
    }

    // Metodo para mostrar la informacion del producto
    public String getInformacion() {
        return "Producto: " + nombre + " | Precio: $" + precio + " | Stock: " + stock;
    }

    public String getNombre() {
        return nombre;
    }
}
