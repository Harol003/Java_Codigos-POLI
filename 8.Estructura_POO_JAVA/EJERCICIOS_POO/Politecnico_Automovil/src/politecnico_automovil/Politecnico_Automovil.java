/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package politecnico_automovil;

/**
 *
 * @author Harol
 */
public class Politecnico_Automovil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Encabezado de la salida
        System.out.println("Politécnico Internacional");
        System.out.println("Curso: Programación Orientada a Objetos");
        System.out.println("----------------------------------------------");

        
        // Crear un objeto de la clase Automovil
        Automovil miAutomovil = new Automovil("Twingo", "Authentic", 2022);

        // Llamar a los métodos del objeto
        miAutomovil.mostrarInformacion(); // Muestra los datos iniciales
        miAutomovil.encender();           // Enciende el automóvil
        miAutomovil.mostrarInformacion(); // Muestra el estado después de encender
        miAutomovil.apagar();             // Apaga el automóvil
        miAutomovil.mostrarInformacion(); // Muestra el estado después de apagar
    }
    
}
