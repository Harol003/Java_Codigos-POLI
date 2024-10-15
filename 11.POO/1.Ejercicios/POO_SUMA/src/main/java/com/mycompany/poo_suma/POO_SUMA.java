/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo_suma;

import java.util.Scanner;

/**
 * Clase principal POO_SUMA
 * @author Harol
 */
public class POO_SUMA {

    public static void main(String[] args) {
        // Crear una instancia de la clase Suma
        Suma suma = new Suma();

        // Llamar al método sumar
        suma.sumar();
    }
}

// Clase Suma que contiene el método para sumar dos números
class Suma {

    // Método para sumar dos números proporcionados por el usuario
    public void sumar() {
        // Crear el objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Impresion en Pantalla de la informacion del programa
        System.out.print("Politecnico Internacional - Suma de Dos Numeros POO\n");
        // Pedir el primer número al usuario
        System.out.print("Ingrese el primer numero: ");
        int numero1 = scanner.nextInt();

        // Pedir el segundo número al usuario
        System.out.print("Ingrese el segundo numero: ");
        int numero2 = scanner.nextInt();

        // Realizar la suma de los dos números
        int resultado = numero1 + numero2;

        // Mostrar el resultado de la suma
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + resultado);
        
        // Impresion en Pantalla de la informacion del programa
        System.out.print("Muchas gracias por utilizar este programa. POLI | POO");

        // Cerrar el Scanner
        scanner.close();
    }
}

