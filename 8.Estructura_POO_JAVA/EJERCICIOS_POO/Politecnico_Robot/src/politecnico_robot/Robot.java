/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package politecnico_robot;

/**
 *
 * @author Harol
 */
// Definimos la clase Robot
class Robot {
    // Atributos del robot
    private String nombre;
    private double altura;  // en metros
    private double peso;    // en toneladas
    private String armamento;

    // Constructor para inicializar los atributos
    public Robot(String nombre) {
        this.nombre = nombre;
        this.altura = 10.0;  // Altura en metros (ejemplo basado en Optimus Prime)
        this.peso = 4.3;     // Peso en toneladas
        this.armamento = "Espada de energía y cañón de plasma";
    }

    // Método para que el robot se presente y muestre sus especificaciones
    public void presentarse() {
        System.out.println("\n* ESPECIFICACIONES DEL ROBOT *");
        System.out.println("Nombre: " + nombre);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Peso: " + peso + " toneladas");
        System.out.println("Armamento: " + armamento);
    }
}