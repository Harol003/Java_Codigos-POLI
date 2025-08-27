/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leyohm;

/**
 *
 * @author Harol
 */

import controlador.OhmControlador;
import vista.OhmVista;
import javax.swing.*;

public class LeyOhm {

    public static void main(String[] args) {
        
        final String usuario; // 👈 ahora es final

        String tempUsuario = JOptionPane.showInputDialog("Ingrese su nombre:");

        if (tempUsuario == null || tempUsuario.trim().isEmpty()) {
            usuario = "Usuario";
        } else {
            usuario = tempUsuario;
        }

        String mensaje = "⚡ Bienvenido, " + usuario + " ⚡\n"
                       + "A la aplicación de la Ley de Ohm\n"
                       + "Calcule Voltaje (V), Corriente (I) o Resistencia (Ω) fácilmente.";
        JOptionPane.showMessageDialog(null, mensaje, "Ley de Ohm", JOptionPane.INFORMATION_MESSAGE);

        SwingUtilities.invokeLater(() -> {
            OhmVista vista = new OhmVista();
            new OhmControlador(vista, usuario);
            vista.setVisible(true);
        });
    }
}
