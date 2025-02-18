/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package politecnico_biblioteca_2;

import vista.VistaConsola;
import controlador.ControladorBiblioteca;
import modelo.Biblioteca;

/**
 *
 * @author Harol
 */
public class Politecnico_Biblioteca_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Mostrar la información en pantalla
        System.out.println("Politécnico Internacional");
        System.out.println("Asignatura: Programación Orientada a Objetos");
        
        
        Biblioteca biblioteca = new Biblioteca();
        VistaConsola vista = new VistaConsola();
        ControladorBiblioteca controlador = new ControladorBiblioteca(biblioteca, vista);

        controlador.iniciar(); // Inicia el programa
    }
    
}
