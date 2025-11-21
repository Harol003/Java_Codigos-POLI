/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

// Clase encargada de realizar la logica de la sumatoria
public class Sumatoria {

    // Metodo que calcula la sumatoria de 1 a 10
    public int calcularSumatoria() {
        int suma = 0;

        // Ciclo para sumar los numeros del 1 al 10
        for (int i = 1; i <= 10; i++) {
            suma += i;
        }

        return suma;
    }
}
