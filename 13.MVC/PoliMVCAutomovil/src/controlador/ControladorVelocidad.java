/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.ConversorVelocidad;
import vista.VistaConsola;

// Clase que coordina la vista y el modelo
public class ControladorVelocidad {

    private VistaConsola vista;

    public ControladorVelocidad(VistaConsola vista) {
        this.vista = vista;
    }

    public void iniciar() {

        // Mensaje de bienvenida
        vista.mostrarMensaje("=======================================");
        vista.mostrarMensaje(" Bienvenido al programa Velocidad Carro ");
        vista.mostrarMensaje(" Convertidor de velocidad km/h a m/s ");
        vista.mostrarMensaje("=======================================");

        // Nombre del usuario
        String nombreUsuario = vista.leerTexto("Ingrese su nombre de usuario: ");

        // Leer velocidad
        float velocidadKmH = vista.leerFloat("Ingrese la velocidad en kilometros por hora: ");

        // Crear el modelo
        ConversorVelocidad conversor = new ConversorVelocidad(velocidadKmH);

        // Realizar conversion
        float velocidadMS = conversor.convertirAMetrosPorSegundo();

        // Mostrar resultado
        vista.mostrarMensaje("\nHola " + nombreUsuario + ", la velocidad en metros por segundo es: " + velocidadMS);

        // Despedida
        vista.mostrarMensaje("\nDesarrollado por: Harol.Torres@pi.edu.co - 2025");
    }
}
