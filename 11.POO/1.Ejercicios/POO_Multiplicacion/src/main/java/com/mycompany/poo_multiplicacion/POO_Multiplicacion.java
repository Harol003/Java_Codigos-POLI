/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo_multiplicacion;

import java.util.Scanner;

/**
 * Clase principal POO_Multiplicacion
 * @author Harol
 */
public class POO_Multiplicacion {

    public static void main(String[] args) {
        // Crear una instancia de la clase Multiplicacion
        Multiplicacion multiplicacion = new Multiplicacion();

        // Llamar al método multiplicar
        multiplicacion.multiplicar();
    }
}

// Clase Multiplicacion que contiene el método para multiplicar dos números
class Multiplicacion {

    // Método para multiplicar dos números proporcionados por el usuario
    public void multiplicar() {
        // Crear el objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Impresion en Pantalla de la informacion del programa con salto de línea
        System.out.println("Politecnico Internacional - Multiplicacion de Dos Numeros POO\n");

        // Pedir el primer número al usuario
        System.out.print("Ingrese el primer numero: ");
        int numero1 = scanner.nextInt();

        // Pedir el segundo número al usuario
        System.out.print("Ingrese el segundo numero: ");
        int numero2 = scanner.nextInt();

        // Realizar la multiplicación de los dos números
        int resultado = numero1 * numero2;

        // Mostrar el resultado de la multiplicación
        System.out.println("\nLa multiplicacion de " + numero1 + " y " + numero2 + " es: " + resultado);

        // Impresion en Pantalla de agradecimiento con salto de línea
        System.out.println("\nMuchas gracias por utilizar este programa. POLI | POO");

        // Cerrar el Scanner
        scanner.close();
    }
}
