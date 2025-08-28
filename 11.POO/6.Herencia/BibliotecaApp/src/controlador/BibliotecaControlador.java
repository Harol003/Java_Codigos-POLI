/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import vista.BibliotecaVista;

import modelo.Publicacion;

// Controlador: conecta el modelo con la vista
public class BibliotecaControlador {
    private BibliotecaVista vista;

    // Constructor
    public BibliotecaControlador(BibliotecaVista vista) {
        this.vista = vista;
    }

    // Metodo para mostrar informacion de una publicacion
    public void mostrarPublicacion(Publicacion publicacion) {
        vista.mostrarMensaje(publicacion.mostrarInformacion());
    }
}
