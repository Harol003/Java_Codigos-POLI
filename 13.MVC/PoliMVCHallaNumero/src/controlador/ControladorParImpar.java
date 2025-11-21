/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.ParImpar;
import vista.VistaConsola;

// Clase que coordina la vista y el modelo
public class ControladorParImpar {

    private VistaConsola vista;

    public ControladorParImpar(VistaConsola vista) {
        this.vista = vista;
    }

    public void iniciar() {

        // Bienvenida
        vista.mostrarMensaje("=======================================");
        vista.mostrarMensaje(" Bienvenido al programa PoliEjer4 ");
        vista.mostrarMensaje("=======================================");

        // Solicitar nombre del usuario
        String nombreUsuario = vista.leerTexto("Ingrese su nombre de usuario: ");

        // Leer numero
        int numero = vista.leerEntero("Ingrese un numero entero N: ");

        // Crear modelo
        ParImpar verificador = new ParImpar(numero);

        // Determinar si es par o impar
        String resultado = verificador.esPar() ? "par" : "impar";

        // Mostrar mensaje personalizado
        vista.mostrarMensaje("\nHola " + nombreUsuario + ", el numero " + numero + " es " + resultado + ".");

        // Despedida
        vista.mostrarMensaje("\nDesarrollado por: Harol.Torres@pi.edu.co - 2025");
    }
}
