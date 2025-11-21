/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

// Clase del modelo que almacena los valores y realiza la logica
public class ComparadorNumeros {
    
    private float A;
    private float B;
    private float C;

    // Constructor
    public ComparadorNumeros(float A, float B, float C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    // Metodo para obtener el mayor numero
    public float obtenerMayor() {
        float mayor = A;

        if (B > mayor) {
            mayor = B;
        }
        if (C > mayor) {
            mayor = C;
        }
        return mayor;
    }

    // Metodo para obtener el menor numero
    public float obtenerMenor() {
        float menor = A;

        if (B < menor) {
            menor = B;
        }
        if (C < menor) {
            menor = C;
        }
        return menor;
    }
}
