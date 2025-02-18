/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package politecnico_robot;

import java.util.Scanner;  // Importamos la librería para capturar datos del usuario
/**
 *
 * @author Harol
 */
public class Politecnico_Robot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);  // Scanner para capturar el nombre del robot

         
        // Mostrar la información en pantalla
        System.out.println("Politécnico Internacional");
         System.out.println("Asignatura: Programación Orientada a Objetos");
       
         
        // Pedimos el nombre del robot al usuario
        System.out.print("Ingresa el nombre de tu robot: ");
        String nombreRobot = scanner.nextLine();  // Captura el nombre ingresado

        // Creamos un objeto de la clase Robot con el nombre dado por el usuario
        Robot miRobot = new Robot(nombreRobot);

        // Creamos un objeto de la clase Entrenamiento
        Entrenamiento entrenamientoRobot = new Entrenamiento();

        // Llamamos a los métodos para mostrar detalles del robot y su entrenamiento
        miRobot.presentarse();
        entrenamientoRobot.mostrarEntrenamiento();

        scanner.close();  // Cerramos el Scanner
    }
    
}
