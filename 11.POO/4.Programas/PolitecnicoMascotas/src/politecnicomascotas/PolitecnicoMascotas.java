/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package politecnicomascotas;

/**
 *
 * @author Harol
 */

import javax.swing.SwingUtilities;
import controlador.Controlador;
import modelo.GestorMascotas;
import vista.VistaPrincipal;


public class PolitecnicoMascotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       SwingUtilities.invokeLater(() -> {
            VistaPrincipal vista = new VistaPrincipal();
            GestorMascotas gestor = new GestorMascotas();
            Controlador controlador = new Controlador(vista, gestor);
            controlador.iniciar();
        });
    }
    
}
