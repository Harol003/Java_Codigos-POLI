/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador; // Definimos el paquete "controlador"

import modelo.*; // Importamos clases del modelo
import vista.*; // Importamos clases de la vista

// Clase que controla la lógica del programa
public class ControladorBiblioteca {
    private Biblioteca biblioteca;
    private VistaConsola vista;

    // Constructor
    public ControladorBiblioteca(Biblioteca biblioteca, VistaConsola vista) {
        this.biblioteca = biblioteca;
        this.vista = vista;
    }

    // Método para iniciar la aplicación
    public void iniciar() {
        // Obtener el nombre del usuario
        String nombreUsuario = vista.obtenerNombreUsuario();
        vista.mostrarBienvenida(nombreUsuario);

        // Crear un libro de programación en Java
        Libro libroJava = new Libro("Programación en Java", "Herbert Schildt", "McGraw-Hill");

        // Agregar el libro a la biblioteca
        biblioteca.agregarLibro(libroJava);

        // Mostrar los detalles del libro
        vista.mostrarDetallesLibro(libroJava.obtenerDetalles());
    }
}
