/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.Aporte;

// Controlador Aportes
public class ControladorAportes {

    private ArrayList<Aporte> lista = new ArrayList<>();

    // Calcular y guardar aportes
    public void calcularAportes(String nombre, int tipo, double ingreso) {
        String tipoTrabajador = (tipo == 1) ? "Dependiente" : "Independiente";

        double salud = (tipo == 1) ? ingreso * 0.04 : ingreso * 0.125;
        double pension = (tipo == 1) ? ingreso * 0.04 : ingreso * 0.16;
        double arl = (tipo == 1) ? 0 : ingreso * 0.00522;

        lista.add(new Aporte(nombre, tipoTrabajador, ingreso, salud, pension, arl));
    }

    // Obtener historial
    public ArrayList<Aporte> obtenerHistorial() {
        return lista;
    }
}
