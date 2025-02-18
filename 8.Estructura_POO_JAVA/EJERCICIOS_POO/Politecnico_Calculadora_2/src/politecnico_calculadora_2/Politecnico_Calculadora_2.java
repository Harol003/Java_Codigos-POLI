/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package politecnico_calculadora_2;

import java.util.Scanner;
/**
 *
 * @author Harol
 */
public class Politecnico_Calculadora_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( // TODO code application logic here
                Scanner scanner = new Scanner (System.in)) {
            double num1, num2;
            // Solicitar los numeros al usuario
            
            System.out.println("Politecnico Internacional");
            System.out.println("Programacion");
            System.out.println("Calculadora");
            System.out.println("Ingrese el primer numero:");
            num1 = scanner.nextDouble();
            System.out.println("Ingrese el segundo numero: ");
            num2 = scanner.nextDouble();
            // Crear la instancia de la calculadora
            
            Calculadora calculadora = new Calculadora (num1, num2);
            int opcion;
            do {
                
                // Menu de Opciones
                
                System.out.println("Politecnico Internacional");
                System.out.println("Programacion");
                System.out.println("Calculadora");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Potencia");
                System.out.println("6. Cambiar números");
                System.out.println("0. Salir");
                System.out.print("Seleccione una opción: ");
                
                opcion = scanner.nextInt();
                
                
                // Evaluar la opción seleccionada
                switch (opcion) {
                    case 1:
                        System.out.println("El Resultado de la suma de los numeros es: " + calculadora.sumar());
                        break;
                    case 2:
                        System.out.println("El Resultado de la resta de los numeros es: " + calculadora.restar());
                        break;
                    case 3:
                        System.out.println("El Resultado de la multiplicacion de los numeros es: " + calculadora.multiplicar());
                        break;
                    case 4:
                        try {
                            System.out.println("El Resultado de la division de los numeros es: " + calculadora.dividir());
                        } catch (ArithmeticException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 5:
                        try {
                            System.out.println("El Resultado de la potencia de los numeros es: " + calculadora.potencia());
                        } catch (ArithmeticException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 6:
                        System.out.print("Ingrese el nuevo primer número: ");
                        calculadora.setNumero1(scanner.nextDouble());
                        System.out.print("Ingrese el nuevo segundo número: ");
                        calculadora.setNumero2(scanner.nextDouble());
                        System.out.println("Números actualizados.");
                        break;
                    case 0:
                        System.out.println("Saliendo de la calculadora...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            } while (opcion != 0);
        }
            
            
        }
        }
        
    
    

