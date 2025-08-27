/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polibarbershop;

import javax.swing.SwingUtilities;
/**
 *
 * @author Harol
 */
public class Polibarbershop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // iniciar interfaz en el hilo de eventos de Swing
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                VistaPrincipal vista = new VistaPrincipal();
                Controlador controlador = new Controlador(vista);
                vista.setVisible(true);
            }
        });
    }
    
}
