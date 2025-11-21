/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimvccilindro;

import vista.VistaConsola;
import controlador.ControladorCilindro;
/**
 *
 * @author Harol
 */
public class PoliMVCCilindro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        VistaConsola vista = new VistaConsola();
        ControladorCilindro controlador = new ControladorCilindro(vista);

        controlador.iniciar();
    }
    
}
