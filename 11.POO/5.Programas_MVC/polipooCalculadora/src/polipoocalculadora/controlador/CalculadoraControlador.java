/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polipoocalculadora.controlador;

/**
 *
 * @author Harol
 */


import polipoocalculadora.modelo.Operacion;
import polipoocalculadora.vista.CalculadoraVista;

// Clase que conecta la vista con el modelo
public class CalculadoraControlador {
    private CalculadoraVista vista;

    public CalculadoraControlador(CalculadoraVista vista) {
        this.vista = vista;
    }

    public void iniciar() {
        boolean salir = false;

        while (!salir) {
            int opcion = vista.mostrarMenu();

            if (opcion >= 1 && opcion <= 4) {
                double num1 = vista.leerNumero("Ingrese el primer numero: ");
                double num2 = vista.leerNumero("Ingrese el segundo numero: ");
                Operacion operacion = new Operacion(num1, num2);

                double resultado = 0;
                switch (opcion) {
                    case 1:
                        resultado = operacion.sumar();
                        break;
                    case 2:
                        resultado = operacion.restar();
                        break;
                    case 3:
                        resultado = operacion.multiplicar();
                        break;
                    case 4:
                        resultado = operacion.dividir();
                        break;
                }
                vista.mostrarResultado(resultado);

            } else if (opcion == 5) {
                vista.mostrarMensaje("Saliendo del programa...");
                salir = true;
            } else {
                vista.mostrarMensaje("Opcion no valida, intente de nuevo.");
            }
        }
    }
}
