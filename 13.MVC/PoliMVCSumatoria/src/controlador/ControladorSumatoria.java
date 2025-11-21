/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Sumatoria;
import vista.VistaConsola;

// Clase que coordina la ejecucion entre la vista y el modelo
public class ControladorSumatoria {

    private VistaConsola vista;

    // Constructor
    public ControladorSumatoria(VistaConsola vista) {
        this.vista = vista;
    }

    // Metodo principal
    public void iniciar() {

        // Mensaje de bienvenida
        vista.mostrarMensaje("=======================================");
        vista.mostrarMensaje(" Bienvenido al programa Sumatoria ");
        vista.mostrarMensaje("=======================================");

        // Leer nombre del usuario
        String nombreUsuario = vista.leerTexto("Ingrese su nombre de usuario: ");

        // Crear el modelo
        Sumatoria sumatoria = new Sumatoria();

        // Calcular sumatoria
        int resultado = sumatoria.calcularSumatoria();

        // Mostrar el resultado personalizado
        vista.mostrarMensaje("\nHola " + nombreUsuario + ", el resultado de la sumatoria del 1 al 10 es: " + resultado);

        // Mensaje de despedida
        vista.mostrarMensaje("\nDesarrollado por: Harol.Torres@pi.edu.co - 2025");
    }
}
