/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.Producto;

// Controlador Arepas
public class ControladorArepas {

    private ArrayList<Producto> lista = new ArrayList<>();

    public void cargarInventario() {
        lista.add(new Producto("queso", 50, 2000));
        lista.add(new Producto("choclo", 40, 2500));
        lista.add(new Producto("rellena", 30, 3000));
        lista.add(new Producto("tradicional", 60, 1500));
    }

    public boolean registrarVenta(int indice, int cantidad) {
        if(indice >= 0 && indice < lista.size()) {
            Producto p = lista.get(indice);
            if(p.getCantidad() >= cantidad) {
                p.setCantidad(p.getCantidad() - cantidad);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Producto> obtenerInventario() { return lista; }
    public ArrayList<Producto> obtenerPrecios() { return lista; }
}
