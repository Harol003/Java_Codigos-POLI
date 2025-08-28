/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polipoocalculadora;

import polipoocalculadora.controlador.CalculadoraControlador;
import polipoocalculadora.vista.CalculadoraVista;
/**
 *
 * @author Harol
 */
public class PolipooCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CalculadoraVista vista = new CalculadoraVista();
        CalculadoraControlador controlador = new CalculadoraControlador(vista);
        controlador.iniciar();
        
        
    }
    
}
