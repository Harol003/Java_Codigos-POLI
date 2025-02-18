/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package politecnico_notas;

/**
 *
 * @author Harol
 */

/**
 * Clase Estudiante que representa a un estudiante con sus notas.
 */
public class Estudiante {
    // Atributos del estudiante
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;

    // Constructor
    public Estudiante(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    // Método para calcular el promedio del estudiante
    public double calcularPromedio() {
        return (nota1 + nota2 + nota3) / 3;
    }

    // Método para mostrar la información del estudiante
    public void mostrarInformacion() {
        System.out.println("Estudiante: " + nombre);
        System.out.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3);
        System.out.println("Promedio: " + calcularPromedio());
        System.out.println("----------------------------------------------");
    }
}

