/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package politecnico_parqueadero_bici;

import vista.VistaParqueadero;
import controlador.ControladorParqueadero;

/**
 *
 * @author Harol
 */
public class Politecnico_Parqueadero_Bici {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                // Mostrar la información en pantalla
        System.out.println("Politécnico Internacional");
        System.out.println("Asignatura: Programación Orientada a Objetos");
        
        // Crear vista y controlador
        VistaParqueadero vista = new VistaParqueadero();
        ControladorParqueadero controlador = new ControladorParqueadero(vista);

        // Mostrar bienvenida
        vista.mostrarMensaje("🚲 Bienvenido al Parqueadero de Bicicletas 🚲\n");

        // Registrar bicicleta
        controlador.registrarBicicleta();

        // Mostrar bicicleta registrada
        controlador.mostrarBicicleta();
    }
    
}
