/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package politecnico_parqueadero_bici_2;

import javax.swing.JOptionPane;
/**
 *
 * @author Harol
 */
public class Politecnico_Parqueadero_Bici_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Muestra un mensaje emergente de bienvenida al usuario
        JOptionPane.showMessageDialog(null, "Politécnico Internacional POO - Parqueadero Bicicletas");

        // Solicita al usuario que ingrese la capacidad del parqueadero mediante un cuadro de diálogo
        // Convierte la entrada de tipo String a un número entero (int)
        int capacidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad del parqueadero:"));

        // Crea una instancia de la clase Parqueadero con la capacidad ingresada por el usuario
        Parqueadero modelo = new Parqueadero(capacidad);

        // Crea una instancia de la interfaz gráfica (Vista) para mostrar la información del parqueadero
        VistaParqueadero vista = new VistaParqueadero();

        // Crea una instancia del Controlador, que gestiona la comunicación entre la Vista y el Modelo
        new ControladorParqueadero(modelo, vista);

        
    }
    
}
