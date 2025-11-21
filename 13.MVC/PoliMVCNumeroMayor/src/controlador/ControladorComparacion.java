/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.ComparadorNumeros;
import vista.VistaConsola;

// Clase que integra el modelo y la vista
public class ControladorComparacion {

    private VistaConsola vista;

    // Constructor
    public ControladorComparacion(VistaConsola vista) {
        this.vista = vista;
    }

    // Metodo principal de ejecucion
    public void iniciar() {

        // Mensaje de bienvenida
        vista.mostrarMensaje("============================================");
        vista.mostrarMensaje(" Bienvenido al programa Comparacion Numeros ");
        vista.mostrarMensaje("============================================");

        // Solicitar nombre del usuario
        String nombreUsuario = vista.leerTexto("Ingrese su nombre de usuario: ");

        // Leer valores
        float A = vista.leerValor("Ingrese el valor de A: ");
        float B = vista.leerValor("Ingrese el valor de B: ");
        float C = vista.leerValor("Ingrese el valor de C: ");

        // Crear objeto del modelo
        ComparadorNumeros comparador = new ComparadorNumeros(A, B, C);

        // Procesar resultados
        float mayor = comparador.obtenerMayor();
        float menor = comparador.obtenerMenor();

        // Mostrar resultados al usuario
        vista.mostrarMensaje("\nHola " + nombreUsuario + ", estos son los resultados:");
        vista.mostrarMensaje("El numero mayor es: " + mayor);
        vista.mostrarMensaje("El numero menor es: " + menor);

        // Mensaje de despedida
        vista.mostrarMensaje("\nDesarrollado por: Harol.Torres@pi.edu.co - 2025");
    }
}
