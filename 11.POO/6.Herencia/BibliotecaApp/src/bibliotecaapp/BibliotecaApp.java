/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bibliotecaapp;


import controlador.BibliotecaControlador;
import vista.BibliotecaVista;
import modelo.Libro;
import modelo.Publicacion;

/**
 *
 * @author Harol
 */
public class BibliotecaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Creamos la vista
        BibliotecaVista vista = new BibliotecaVista();

        // Creamos el controlador
        BibliotecaControlador controlador = new BibliotecaControlador(vista);

        // Creamos objetos del modelo
        Publicacion pub1 = new Publicacion("Revista Ciencia Hoy", "Varios");
        Libro libro1 = new Libro("Java Basico", "Harol Torres", 250);

        // Mostramos los datos con el controlador
        controlador.mostrarPublicacion(pub1);
        controlador.mostrarPublicacion(libro1);
    }
    
}
