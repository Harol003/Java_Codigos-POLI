/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package politecnico_tienda_electronica;

/**
 *
 * @author Harol
 */
public class Politecnico_Tienda_Electronica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       // Encabezado de la tienda
        System.out.println("Politécnico Internacional");
        System.out.println("Asignatura: Programación Orientada a Objetos");
        System.out.println("----------------------------------------------");

        // Crear productos
        Producto arduino = new Producto("Arduino Uno", 25000, 10);
        Producto sensor = new Producto("Sensor de temperatura", 5500, 20);

        // Mostrar la información de los productos
        arduino.mostrarInformacion();
        sensor.mostrarInformacion();
    }
    
}
