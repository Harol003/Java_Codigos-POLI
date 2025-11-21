/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimvcnumeromayor;


import vista.VistaConsola;
import controlador.ControladorComparacion;
/**
 *
 * @author Harol
 */
public class PoliMVCNumeroMayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
           // Crear la vista
        VistaConsola vista = new VistaConsola();

        // Crear el controlador
        ControladorComparacion controlador = new ControladorComparacion(vista);

        // Iniciar el programa
        controlador.iniciar();
    }
    
}
