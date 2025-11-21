/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimvchallanumero;

import vista.VistaConsola;
import controlador.ControladorParImpar;
/**
 *
 * @author Harol
 */
public class PoliMVCHallaNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VistaConsola vista = new VistaConsola();
        ControladorParImpar controlador = new ControladorParImpar(vista);

        controlador.iniciar();
    }
    
}
