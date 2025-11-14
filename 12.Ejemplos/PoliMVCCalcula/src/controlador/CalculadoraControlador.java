/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.CalculadoraModelo;
import vista.CalculadoraVista;

// Controlador: conecta la vista y el modelo
public class CalculadoraControlador {

    private CalculadoraModelo modelo;
    private CalculadoraVista vista;

    public CalculadoraControlador(CalculadoraModelo modelo, CalculadoraVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {

        String nombreUsuario = vista.pedirNombreUsuario();
        vista.mostrarMensaje("Bienvenido " + nombreUsuario + " a PoliMVCCalcula");

        boolean continuar = true;

        while (continuar) {
            int opcion = vista.mostrarMenu();

            switch (opcion) {
                case 1: {
                    float a = vista.pedirNumero("Ingrese el primer numero: ");
                    float b = vista.pedirNumero("Ingrese el segundo numero: ");
                    float resultado = modelo.sumar(a, b);
                    vista.mostrarResultado(resultado);
                    break;
                }

                case 2: {
                    float a = vista.pedirNumero("Ingrese el primer numero: ");
                    float b = vista.pedirNumero("Ingrese el segundo numero: ");
                    float resultado = modelo.restar(a, b);
                    vista.mostrarResultado(resultado);
                    break;
                }

                case 3: {
                    float a = vista.pedirNumero("Ingrese el primer numero: ");
                    float b = vista.pedirNumero("Ingrese el segundo numero: ");
                    float resultado = modelo.multiplicar(a, b);
                    vista.mostrarResultado(resultado);
                    break;
                }

                case 4: {
                    float a = vista.pedirNumero("Ingrese el primer numero: ");
                    float b = vista.pedirNumero("Ingrese el segundo numero: ");
                    float resultado = modelo.dividir(a, b);
                    vista.mostrarResultado(resultado);
                    break;
                }

                case 5:
                    vista.mostrarMensaje("Gracias por usar PoliMVCCalcula desarrollado por Harol.Torres@pi.educo - 2025.");
                    continuar = false;
                    break;

                default:
                    vista.mostrarMensaje("Opcion no valida.");
            }
        }
    }
}
