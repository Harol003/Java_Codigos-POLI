/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

// Clase que representa un cilindro y realiza los calculos
public class Cilindro {

    private float radio;
    private float altura;
    private final float PI = 3.1416f;

    // Constructor
    public Cilindro(float radio, float altura) {
        this.radio = radio;
        this.altura = altura;
    }

    // Metodo para calcular el area del cilindro
    // Formula: 2 * PI * r * (r + h)
    public float calcularArea() {
        return 2 * PI * radio * (radio + altura);
    }

    // Metodo para calcular el volumen del cilindro
    // Formula: PI * r^2 * h
    public float calcularVolumen() {
        return PI * radio * radio * altura;
    }
}
