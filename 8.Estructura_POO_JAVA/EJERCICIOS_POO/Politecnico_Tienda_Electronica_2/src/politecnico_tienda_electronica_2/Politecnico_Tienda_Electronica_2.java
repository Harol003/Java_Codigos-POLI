/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package politecnico_tienda_electronica_2;

/**
 *
 * @author Harol
 */
public class Politecnico_Tienda_Electronica_2 {

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

        // Crear un cliente preferencial
        ClientePreferencial cliente = new ClientePreferencial("Harol Torres", 10); // 10% de descuento

        // Mostrar información
        arduino.mostrarInformacion();
        sensor.mostrarInformacion();
        System.out.println("----------------------------------------------");

        // Mostrar información del cliente
        cliente.mostrarInformacion();

        // Calcular y mostrar el precio con descuento
        System.out.println("Precio de " + arduino.getNombre() + " con descuento: $" + cliente.calcularPrecioConDescuento(arduino));
        System.out.println("Precio de " + sensor.getNombre() + " con descuento: $" + cliente.calcularPrecioConDescuento(sensor));
    }
    
}
