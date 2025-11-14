/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimvccalcula;


import modelo.CalculadoraModelo;
import vista.CalculadoraVista;
import controlador.CalculadoraControlador;
/**
 *
 * @author Harol
 */
public class PoliMVCCalcula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CalculadoraModelo modelo = new CalculadoraModelo();
        CalculadoraVista vista = new CalculadoraVista();
        CalculadoraControlador controlador = new CalculadoraControlador(modelo, vista);

        controlador.iniciar();
    }
    
}
