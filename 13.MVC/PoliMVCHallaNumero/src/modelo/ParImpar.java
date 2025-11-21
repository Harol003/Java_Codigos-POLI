/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

// Clase que determina si un numero es par o impar
public class ParImpar {

    private int numero;

    // Constructor
    public ParImpar(int numero) {
        this.numero = numero;
    }

    // Metodo para verificar si es par
    public boolean esPar() {
        return numero % 2 == 0;
    }

    // Metodo para obtener el numero
    public int getNumero() {
        return numero;
    }
}
