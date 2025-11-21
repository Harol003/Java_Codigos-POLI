/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimvcautomovil;

import vista.VistaConsola;
import controlador.ControladorVelocidad;
/**
 *
 * @author Harol
 */
public class PoliMVCAutomovil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           VistaConsola vista = new VistaConsola();
        ControladorVelocidad controlador = new ControladorVelocidad(vista);

        controlador.iniciar();
    }
    
}
