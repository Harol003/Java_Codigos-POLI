/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

// Modelo: maneja los datos del inventario
public class InventarioModelo {

    private ArrayList<String> listaProductos = new ArrayList<>();

    public void agregarProducto(String producto) {
        listaProductos.add(producto);
    }

    public ArrayList<String> obtenerProductos() {
        return listaProductos;
    }

    public boolean buscarProducto(String producto) {
        return listaProductos.contains(producto);
    }
}
