/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimvcsumatoria;

import vista.VistaConsola;
import controlador.ControladorSumatoria;
/**
 *
 * @author Harol
 */
public class PoliMVCSumatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Crear la vista
        VistaConsola vista = new VistaConsola();

        // Crear el controlador
        ControladorSumatoria controlador = new ControladorSumatoria(vista);

        // Iniciar
        controlador.iniciar();
    }
    
}
