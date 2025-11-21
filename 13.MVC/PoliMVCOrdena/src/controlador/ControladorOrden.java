/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Ordenador;
import vista.VistaConsola;

// Clase que coordina la logica del programa
public class ControladorOrden {

    private VistaConsola vista;

    public ControladorOrden(VistaConsola vista) {
        this.vista = vista;
    }

    public void iniciar() {

        // Bienvenida
        vista.mostrarMensaje("=======================================");
        vista.mostrarMensaje(" Bienvenido al programa Ordena Numeros ");
        vista.mostrarMensaje("=======================================");

        // Obtener nombre del usuario
        String nombreUsuario = vista.leerTexto("Ingrese su nombre de usuario: ");

        // Leer numeros
        int numero1 = vista.leerEntero("Ingrese el primer numero: ");
        int numero2 = vista.leerEntero("Ingrese el segundo numero: ");

        // Crear modelo
        Ordenador ordenador = new Ordenador(numero1, numero2);

        // Obtener menor y mayor
        int menor = ordenador.obtenerMenor();
        int mayor = ordenador.obtenerMayor();

        // Mostrar resultados personalizados
        vista.mostrarMensaje("\nHola " + nombreUsuario + ", los numeros ordenados de menor a mayor son:");
        vista.mostrarMensaje(menor + " - " + mayor);

        // Mensaje final
        vista.mostrarMensaje("\nDesarrollado por: Harol.Torres@pi.edu.co - 2025");
    }
}
