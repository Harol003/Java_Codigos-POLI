/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polipootienda;


import controlador.TiendaControlador;
import vista.TiendaVista;

/**
 *
 * @author Harol
 */
public class PolipooTienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TiendaVista vista = new TiendaVista();
        TiendaControlador controlador = new TiendaControlador(vista);
        controlador.iniciar();
    }
    
}
