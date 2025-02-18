/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package politecnico_biblioteca;

/**
 *
 * @author Harol
 */

// Definimos la clase Biblioteca
class Biblioteca {
    // Atributo que almacena un único libro
    private Libro libro;

    // Método para agregar un libro a la biblioteca
    public void agregarLibro(Libro libro) {
        this.libro = libro;
        System.out.println("📚 Libro agregado a la biblioteca.");
    }

    // Método para mostrar el libro almacenado en la biblioteca
    public void mostrarLibro() {
        if (libro != null) {
            libro.mostrarDetalles();
        } else {
            System.out.println("⚠️ No hay libros en la biblioteca.");
        }
    }
}