/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package politecnico_biblioteca;

import java.util.Scanner; // Importamos la librería para capturar datos del usuario

/**
 *
 * @author Harol
 */
public class Politecnico_Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in); // Scanner para capturar el nombre del usuario

        // Mostrar la información en pantalla
        System.out.println("Politécnico Internacional");
        System.out.println("Asignatura: Programación Orientada a Objetos");
        
        // Pedir el nombre del usuario
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombreUsuario = scanner.nextLine(); // Almacena el nombre ingresado

        // Dar la bienvenida al usuario
        System.out.println("\n¡Bienvenido a la biblioteca, " + nombreUsuario + "!");

        // Crear una biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Crear un libro de programación en Java
        Libro libroJava = new Libro("Programación en Java", "Herbert Schildt", "McGraw-Hill");

        // Agregar el libro a la biblioteca
        biblioteca.agregarLibro(libroJava);

        // Mostrar el libro almacenado en la biblioteca
        biblioteca.mostrarLibro();

        scanner.close(); // Cerrar el Scanner
    }
    
}
