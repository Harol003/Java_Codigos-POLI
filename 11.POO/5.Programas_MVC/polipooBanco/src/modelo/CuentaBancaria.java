/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

// Clase que representa una cuenta bancaria
public class CuentaBancaria {
    private String titular;
    private String numeroCuenta;
    private double saldo;

    // Constructor
    public CuentaBancaria(String titular, String numeroCuenta, double saldoInicial) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    // Metodo para depositar dinero
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Deposito exitoso.");
        } else {
            System.out.println("La cantidad debe ser positiva.");
        }
    }

    // Metodo para retirar dinero
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso.");
        } else {
            System.out.println("Fondos insuficientes o cantidad invalida.");
        }
    }

    // Metodo para consultar saldo
    public double consultarSaldo() {
        return saldo;
    }

    // Metodo para obtener informacion de la cuenta
    public String getInformacion() {
        return "Titular: " + titular + " | Numero de cuenta: " + numeroCuenta + " | Saldo: " + saldo;
    }
}
