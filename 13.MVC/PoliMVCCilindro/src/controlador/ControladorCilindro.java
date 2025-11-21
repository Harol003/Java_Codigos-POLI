/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Cilindro;
import vista.VistaConsola;

// Clase que coordina el proceso entre vista y modelo
public class ControladorCilindro {

    private VistaConsola vista;

    public ControladorCilindro(VistaConsola vista) {
        this.vista = vista;
    }

    public void iniciar() {

        // Mensaje de bienvenida
        vista.mostrarMensaje("========================================");
        vista.mostrarMensaje(" Bienvenido al programa Calcula Cilindro ");
        vista.mostrarMensaje("========================================");

        // Leer nombre del usuario
        String nombreUsuario = vista.leerTexto("Ingrese su nombre de usuario: ");

        // Solicitar datos del cilindro
        float radio = vista.leerValor("Ingrese el valor del radio R: ");
        float altura = vista.leerValor("Ingrese el valor de la altura H: ");

        // Crear objeto del modelo
        Cilindro cilindro = new Cilindro(radio, altura);

        // Calcular resultados
        float area = cilindro.calcularArea();
        float volumen = cilindro.calcularVolumen();

        // Mostrar los resultados
        vista.mostrarMensaje("\nHola " + nombreUsuario + ", estos son los resultados:");
        vista.mostrarMensaje("El area del cilindro es: " + area);
        vista.mostrarMensaje("El volumen del cilindro es: " + volumen);

        // Mensaje de despedida
        vista.mostrarMensaje("\nDesarrollado por: Harol.Torres@pi.edu.co - 2025");
    }
}
