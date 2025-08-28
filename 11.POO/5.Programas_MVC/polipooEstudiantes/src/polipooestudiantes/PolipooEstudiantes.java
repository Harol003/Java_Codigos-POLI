/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polipooestudiantes;


import controlador.EstudianteControlador;
import vista.EstudianteVista;
/**
 *
 * @author Harol
 */
public class PolipooEstudiantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EstudianteVista vista = new EstudianteVista();
        EstudianteControlador controlador = new EstudianteControlador(vista);
        controlador.iniciar();
    }
    
}
