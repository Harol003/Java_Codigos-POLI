/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

// Clase que representa un estudiante
public class Estudiante {
    private String nombre;
    private int edad;
    private double nota1;
    private double nota2;
    private double nota3;

    // Constructor
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota1 = 0;
        this.nota2 = 0;
        this.nota3 = 0;
    }

    // Metodo para asignar notas
    public void asignarNotas(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    // Metodo para calcular el promedio
    public double calcularPromedio() {
        return (nota1 + nota2 + nota3) / 3;
    }

    // Metodo para mostrar la informacion del estudiante
    public String getInformacion() {
        return "Nombre: " + nombre + " | Edad: " + edad +
               " | Nota1: " + nota1 + " | Nota2: " + nota2 +
               " | Nota3: " + nota3 + " | Promedio: " + calcularPromedio();
    }

    public String getNombre() {
        return nombre;
    }
}
