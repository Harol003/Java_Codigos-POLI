/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo; // Definimos el paquete "modelo"

// Clase que representa la biblioteca
public class Biblioteca {
    private Libro libro; // Solo almacena un libro

    // Método para agregar un libro a la biblioteca
    public void agregarLibro(Libro libro) {
        this.libro = libro;
    }

    // Método para obtener el libro almacenado
    public Libro obtenerLibro() {
        return libro;
    }
}
