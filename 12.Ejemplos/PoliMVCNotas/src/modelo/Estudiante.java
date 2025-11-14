/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

// Clase Estudiante: representa a un estudiante y calcula su promedio
public class Estudiante {
    public String nombre;
    public float nota1;
    public float nota2;
    public float nota3;

    public Estudiante(String nombre, float nota1, float nota2, float nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public float calcularPromedio() {
        return (nota1 + nota2 + nota3) / 3.0f;
    }
}
