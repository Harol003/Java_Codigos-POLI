/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package politecnico_parqueadero_bici_2;

/**
 *
 * @author Harol
 */

// --- VISTA ---

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class VistaParqueadero extends JFrame {
    private JButton btnIngresar, btnRetirar;
    private JLabel lblEstado;
    
    public VistaParqueadero() {
       
        // Establece el título de la ventana de la interfaz gráfica
        setTitle("Parqueadero de Bicicletas");

        // Define el tamaño de la ventana (ancho: 300 píxeles, alto: 200 píxeles)
        setSize(300, 200);

        // Configura la operación de cierre: al cerrar la ventana, el programa finaliza su ejecución
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Establece el diseño de la ventana como FlowLayout, organizando los componentes en fila
        setLayout(new FlowLayout());

        // Crea una etiqueta JLabel para mostrar el estado del parqueadero (ejemplo: "Estado: 0/0")
        lblEstado = new JLabel("Estado: 0/0");

        // Crea un botón para ingresar bicicletas al parqueadero
        btnIngresar = new JButton("Ingresar Bicicleta");

        // Crea un botón para retirar bicicletas del parqueadero
        btnRetirar = new JButton("Retirar Bicicleta");

        // Agrega la etiqueta y los botones a la ventana
        add(lblEstado);
        add(btnIngresar);
        add(btnRetirar);

        // Centra la ventana en la pantalla para mejorar la experiencia del usuario
        setLocationRelativeTo(null);
  
    }
    
    public void setEstado(String estado) {
        lblEstado.setText(estado);
    }
    
    public void agregarListenerIngresar(ActionListener listener) {
        btnIngresar.addActionListener(listener);
    }
    
    public void agregarListenerRetirar(ActionListener listener) {
        btnRetirar.addActionListener(listener);
    }
}