/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimvcinventario;

import modelo.InventarioModelo;
import vista.InventarioVista;
import controlador.InventarioControlador;

/**
 *
 * @author Harol
 */
public class PoliMVCInventario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InventarioModelo modelo = new InventarioModelo();
        InventarioVista vista = new InventarioVista();
        InventarioControlador controlador = new InventarioControlador(modelo, vista);

        controlador.iniciar();
    }
    
}
