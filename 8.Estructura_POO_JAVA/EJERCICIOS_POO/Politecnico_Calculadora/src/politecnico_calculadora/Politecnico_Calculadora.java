/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package politecnico_calculadora;
import java.util.Scanner;

/**
 *
 * @author Harol
 */
public class Politecnico_Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solicitar los números al usuario
        try ( // TODO code application logic here
                Scanner scanner = new Scanner(System.in)) {
            // Solicitar los números al usuario
            System.out.print("POLITECNICO INTERNACIONAL\n");
            System.out.print("Curso: Programacion Orientada a Objetos\n");
            System.out.print("Objetivo: Calculadora\n");
            // Solicitar los números al usuario
            System.out.print("Ingrese el primer número: ");
            double numero1 = scanner.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double numero2 = scanner.nextDouble();
            // Crear una instancia de la clase Calculadora
            Calculadora calculadora = new Calculadora(numero1, numero2);
            // Mostrar resultados de las operaciones
            System.out.println("Suma: " + calculadora.sumar());
            System.out.println("Resta: " + calculadora.restar());
            System.out.println("Multiplicación: " + calculadora.multiplicar());
            try {
                System.out.println("División: " + calculadora.dividir());
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Potencia: " + calculadora.potencia());
            // Cerrar el scanner
            }
    }
    
}
