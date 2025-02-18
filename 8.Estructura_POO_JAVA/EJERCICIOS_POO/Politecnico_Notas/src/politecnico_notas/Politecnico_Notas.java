/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package politecnico_notas;

/**
 *
 * @author Harol
 */
public class Politecnico_Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Encabezado de la salida
        System.out.println("Politécnico Internacional");
        System.out.println("Asignatura: Programación Orientada a Objetos");
        System.out.println("----------------------------------------------");

        // Crear estudiantes
        Estudiante estudiante1 = new Estudiante("Harol Torres", 4.5, 3.8, 4.2);
        Estudiante estudiante2 = new Estudiante("Hernan Torres", 3.2, 2.9, 3.5);
        Estudiante estudiante3 = new Estudiante("Matias Torres", 4.8, 4.6, 4.7);

        // Mostrar información de los estudiantes
        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();
        estudiante3.mostrarInformacion();
    }
    
}
