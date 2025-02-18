/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package politecnico_biblioteca;

/**
 *
 * @author Harol
 */

// Definimos la clase Libro
class Libro {
    // Atributos del libro
    private String titulo;
    private String autor;
    private String editorial;

    // Constructor para inicializar los atributos del libro
    public Libro(String titulo, String autor, String editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
    }

    // Método para mostrar detalles del libro
    public void mostrarDetalles() {
        System.out.println("\n📖 DETALLES DEL LIBRO 📖");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Editorial: " + editorial);
    }
}
