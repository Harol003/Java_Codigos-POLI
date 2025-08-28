/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.CuentaBancaria;
import vista.BancoVista;

// Clase que conecta la vista con el modelo
public class BancoControlador {
    private BancoVista vista;
    private CuentaBancaria cuenta;

    public BancoControlador(BancoVista vista) {
        this.vista = vista;
    }

    public void iniciar() {
        boolean salir = false;

        while (!salir) {
            int opcion = vista.mostrarMenu();

            switch (opcion) {
                case 1:
                    String titular = vista.leerTexto("Ingrese el nombre del titular: ");
                    String numeroCuenta = vista.leerTexto("Ingrese el numero de cuenta: ");
                    double saldoInicial = vista.leerCantidad("Ingrese el saldo inicial: ");
                    cuenta = new CuentaBancaria(titular, numeroCuenta, saldoInicial);
                    vista.mostrarMensaje("Cuenta creada con exito.");
                    break;

                case 2:
                    if (cuenta != null) {
                        vista.mostrarSaldo(cuenta.consultarSaldo());
                    } else {
                        vista.mostrarMensaje("Primero debe crear una cuenta.");
                    }
                    break;

                case 3:
                    if (cuenta != null) {
                        double deposito = vista.leerCantidad("Ingrese la cantidad a depositar: ");
                        cuenta.depositar(deposito);
                    } else {
                        vista.mostrarMensaje("Primero debe crear una cuenta.");
                    }
                    break;

                case 4:
                    if (cuenta != null) {
                        double retiro = vista.leerCantidad("Ingrese la cantidad a retirar: ");
                        cuenta.retirar(retiro);
                    } else {
                        vista.mostrarMensaje("Primero debe crear una cuenta.");
                    }
                    break;

                case 5:
                    if (cuenta != null) {
                        vista.mostrarMensaje(cuenta.getInformacion());
                    } else {
                        vista.mostrarMensaje("Primero debe crear una cuenta.");
                    }
                    break;

                case 6:
                    vista.mostrarMensaje("Saliendo del sistema...");
                    salir = true;
                    break;

                default:
                    vista.mostrarMensaje("Opcion invalida, intente de nuevo.");
            }
        }
    }
}
