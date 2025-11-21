/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimvcordena;


import vista.VistaConsola;
import controlador.ControladorOrden;
/**
 *
 * @author Harol
 */
public class PoliMVCOrdena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VistaConsola vista = new VistaConsola();
        ControladorOrden controlador = new ControladorOrden(vista);
        controlador.iniciar();
    }
    
}
