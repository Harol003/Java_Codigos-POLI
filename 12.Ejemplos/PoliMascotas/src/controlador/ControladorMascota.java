/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.Mascota;

// Controlador Mascota
public class ControladorMascota {
    private ArrayList<Mascota> lista = new ArrayList<>();

    // Registrar
    public void registrarMascota(Mascota m) {
        lista.add(m);
    }

    // Mostrar
    public ArrayList<Mascota> obtenerMascotas() {
        return lista;
    }

    // Buscar
    public Mascota buscarPorNombre(String nombre) {
        for(Mascota m : lista) {
            if(m.getNombre().equalsIgnoreCase(nombre)) {
                return m;
            }
        }
        return null;
    }
}
