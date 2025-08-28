/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polipoobanco;


import controlador.BancoControlador;
import vista.BancoVista;
/**
 *
 * @author Harol
 */
public class PolipooBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BancoVista vista = new BancoVista();
        BancoControlador controlador = new BancoControlador(vista);
        controlador.iniciar();
    }
    
}
