/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo_division;

import java.util.Scanner;

/**
 * Clase principal POO_Division
 * @author Harol
 */
public class POO_Division {

    public static void main(String[] args) {
        // Crear una instancia de la clase Division
        Division division = new Division();

        // Llamar al método dividir
        division.dividir();
    }
}

// Clase Division que contiene el método para dividir dos números
class Division {

    // Método para dividir dos números proporcionados por el usuario
    public void dividir() {
        // Crear el objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Impresion en Pantalla de la informacion del programa con salto de línea
        System.out.println("Politecnico Internacional - Division de Dos Numeros POO\n");

        // Pedir el primer número al usuario
        System.out.print("Ingrese el primer numero: ");
        int numero1 = scanner.nextInt();

        // Pedir el segundo número al usuario
        System.out.print("Ingrese el segundo numero: ");
        int numero2 = scanner.nextInt();

        // Verificar si el segundo número es diferente de cero
        if (numero2 != 0) {
            // Realizar la división de los dos números
            double resultado = (double) numero1 / numero2;

            // Mostrar el resultado de la división
            System.out.println("\nLa division de " + numero1 + " entre " + numero2 + " es: " + resultado);
        } else {
            // Mensaje de error si el usuario intenta dividir por cero
            System.out.println("\nError: No se puede dividir entre cero.");
        }

        // Impresion en Pantalla de agradecimiento con salto de línea
        System.out.println("\nMuchas gracias por utilizar este programa. POLI | POO");

        // Cerrar el Scanner
        scanner.close();
    }
}
