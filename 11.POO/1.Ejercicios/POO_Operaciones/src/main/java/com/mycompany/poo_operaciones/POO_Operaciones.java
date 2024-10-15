/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo_operaciones;

import java.util.Scanner;

/**
 * Clase principal POO_Operaciones
 * @author Harol
 */
public class POO_Operaciones {

    public static void main(String[] args) {
        // Crear una instancia de la clase Operaciones
        Operaciones operaciones = new Operaciones();
        
        // Ciclo para continuar hasta que el usuario decida salir
        boolean continuar = true;
        Scanner scanner = new Scanner(System.in);
        
        while (continuar) {
            // Mostrar el menú de opciones
            System.out.println("\n--- Politecnico Internacional | Calculadora Basica | POO ---");
            System.out.println("\n--- Menu de Operaciones ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    operaciones.sumar();
                    break;
                case 2:
                    operaciones.restar();
                    break;
                case 3:
                    operaciones.multiplicar();
                    break;
                case 4:
                    operaciones.dividir();
                    break;
                case 5:
                    System.out.println("Gracias por utilizar este programa. POLI | POO | 2024.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opcion invalida. Intente nuevamente.");
            }
            
            // Preguntar si el usuario quiere realizar otra operación
            if (continuar) {
                System.out.print("\n¿Desea realizar otra operacion? (si/no): ");
                String respuesta = scanner.next();
                if (!respuesta.equalsIgnoreCase("si")) {
                    continuar = false;
                    System.out.println("Gracias por utilizar este programa. POLI | POO | 2024.");
                }
            }
        }
        scanner.close();
    }
}

// Clase Operaciones que contiene los métodos para las operaciones básicas
class Operaciones {

    private final Scanner scanner = new Scanner(System.in);
    
    // Método para sumar dos números
    public void sumar() {
        System.out.print("\nIngrese el primer numero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int numero2 = scanner.nextInt();
        int resultado = numero1 + numero2;
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + resultado);
    }

    // Método para restar dos números
    public void restar() {
        System.out.print("\nIngrese el primer numero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int numero2 = scanner.nextInt();
        int resultado = numero1 - numero2;
        System.out.println("La resta de " + numero1 + " y " + numero2 + " es: " + resultado);
    }

    // Método para multiplicar dos números
    public void multiplicar() {
        System.out.print("\nIngrese el primer numero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int numero2 = scanner.nextInt();
        int resultado = numero1 * numero2;
        System.out.println("La multiplicacion de " + numero1 + " y " + numero2 + " es: " + resultado);
    }

    // Método para dividir dos números con validación de división por cero
    public void dividir() {
        System.out.print("\nIngrese el primer numero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int numero2 = scanner.nextInt();
        if (numero2 != 0) {
            double resultado = (double) numero1 / numero2;
            System.out.println("La division de " + numero1 + " entre " + numero2 + " es: " + resultado);
        } else {
            System.out.println("Error: No se puede dividir entre cero.");
        }
    }
}
