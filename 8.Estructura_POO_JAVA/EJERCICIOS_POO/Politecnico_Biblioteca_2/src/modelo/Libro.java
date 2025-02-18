/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo; // Definimos el paquete "modelo"

// Clase que representa un libro
public class Libro {
    private String titulo;
    private String autor;
    private String editorial;

    // Constructor
    public Libro(String titulo, String autor, String editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
    }

    // Método para obtener los detalles del libro
    public String obtenerDetalles() {
        return "📖 DETALLES DEL LIBRO 📖\n" +
               "Título: " + titulo + "\n" +
               "Autor: " + autor + "\n" +
               "Editorial: " + editorial;
    }
}
