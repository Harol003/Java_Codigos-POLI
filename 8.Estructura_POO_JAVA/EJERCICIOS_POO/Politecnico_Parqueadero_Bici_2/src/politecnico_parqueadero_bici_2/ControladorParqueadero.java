/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package politecnico_parqueadero_bici_2;

/**
 *
 * @author Harol
 */

// --- CONTROLADOR ---


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorParqueadero {
    private Parqueadero modelo;
    private VistaParqueadero vista;
    
    public ControladorParqueadero(Parqueadero modelo, VistaParqueadero vista) {
        // Asigna las instancias del modelo y la vista a los atributos de la clase Controlador
        this.modelo = modelo;
        this.vista = vista;

        // Agrega un listener al botón de ingresar bicicleta en la vista
        this.vista.agregarListenerIngresar(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        // Verifica si se puede ingresar una bicicleta al parqueadero
        if (modelo.ingresarBicicleta()) {
            // Actualiza la vista con el nuevo estado del parqueadero
            vista.setEstado(modelo.obtenerEstado());
        } else {
            // Muestra un mensaje si el parqueadero está lleno
            JOptionPane.showMessageDialog(null, "Parqueadero lleno");
        }
      }
    });

        // Agrega un listener al botón de retirar bicicleta en la vista
        this.vista.agregarListenerRetirar(new ActionListener() {
        @Override
    public void actionPerformed(ActionEvent e) {
        // Verifica si se puede retirar una bicicleta del parqueadero
        if (modelo.retirarBicicleta()) {
            // Actualiza la vista con el nuevo estado del parqueadero
            vista.setEstado(modelo.obtenerEstado());
        } else {
            // Muestra un mensaje si no hay bicicletas para retirar
            JOptionPane.showMessageDialog(null, "No hay bicicletas para retirar");
        }
         }
    });

        // Inicializa la vista con el estado actual del parqueadero
        vista.setEstado(modelo.obtenerEstado());

        // Hace visible la ventana de la interfaz gráfica
        vista.setVisible(true);
    }
}