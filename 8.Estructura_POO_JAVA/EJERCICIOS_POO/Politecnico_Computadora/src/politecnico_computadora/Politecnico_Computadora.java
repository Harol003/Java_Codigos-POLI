/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package politecnico_computadora;

/**
 *
 * @author Harol
 */
public class Politecnico_Computadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Encabezado de la salida
        System.out.println("Politécnico Internacional");
        System.out.println("Asignatura: Programación Orientada a Objetos");
        System.out.println("----------------------------------------------");

        // Crear un objeto de la clase Computadora
        Computadora miComputadora = new Computadora("Lenovo", "ThinkPad X1", 16);

        // Llamar a los métodos del objeto
        miComputadora.mostrarInformacion(); // Muestra los datos iniciales
        miComputadora.encender();           // Enciende la computadora
        miComputadora.mostrarInformacion(); // Muestra el estado después de encender
        miComputadora.apagar();             // Apaga la computadora
        miComputadora.mostrarInformacion(); // Muestra el estado después de apagar
    }
    
}
