/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Bicicleta;
import vista.VistaParqueadero;

/**
 * Clase ControladorParqueadero que maneja la lógica entre modelo y vista.
 */
public class ControladorParqueadero {
    private VistaParqueadero vista;
    private Bicicleta bicicleta;

    /**
     * Constructor del controlador.
     * @param vista Instancia de la vista.
     */
    public ControladorParqueadero(VistaParqueadero vista) {
        this.vista = vista;
    }

    /**
     * Método para registrar una bicicleta en el parqueadero.
     */
    public void registrarBicicleta() {
        String nombre = vista.pedirDato("Ingrese su nombre: ");
        String marca = vista.pedirDato("Ingrese la marca de la bicicleta: ");
        String color = vista.pedirDato("Ingrese el color de la bicicleta: ");
        
        bicicleta = new Bicicleta(nombre, marca, color);
        vista.mostrarMensaje("\n🚴‍♂️ Bicicleta registrada con éxito.\n");
    }

    /**
     * Método para mostrar los datos de la bicicleta.
     */
    public void mostrarBicicleta() {
        if (bicicleta != null) {
            vista.mostrarMensaje("\n📋 Información de la bicicleta estacionada:");
            vista.mostrarMensaje(bicicleta.obtenerDatos());
        } else {
            vista.mostrarMensaje("\n⚠️ No hay bicicletas registradas.");
        }
    }
}
