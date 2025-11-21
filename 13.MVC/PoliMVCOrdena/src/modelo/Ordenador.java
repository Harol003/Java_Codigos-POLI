/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

// Clase encargada de ordenar dos numeros
public class Ordenador {

    private int numero1;
    private int numero2;

    // Constructor
    public Ordenador(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Metodo que devuelve el menor de los dos
    public int obtenerMenor() {
        return (numero1 < numero2) ? numero1 : numero2;
    }

    // Metodo que devuelve el mayor de los dos
    public int obtenerMayor() {
        return (numero1 > numero2) ? numero1 : numero2;
    }
}
