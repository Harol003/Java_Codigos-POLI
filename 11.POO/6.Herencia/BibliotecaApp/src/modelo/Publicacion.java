/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

// Clase padre Publicacion
// Representa una publicacion generica en la biblioteca
public class Publicacion {
    protected String titulo;
    protected String autor;

    // Constructor
    public Publicacion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Metodo para mostrar la informacion
    public String mostrarInformacion() {
        return "Titulo: " + titulo + ", Autor: " + autor;
    }
}
