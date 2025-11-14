/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimvcnotas;


import modelo.NotasModelo;
import vista.NotasVista;
import controlador.NotasControlador;
/**
 *
 * @author Harol
 */
public class PoliMVCNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        NotasModelo modelo = new NotasModelo();
        NotasVista vista = new NotasVista();
        NotasControlador controlador = new NotasControlador(modelo, vista);

        controlador.iniciar();
    }
    
}
