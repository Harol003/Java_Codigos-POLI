/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package resistencias;

import modelo.ResistenciaModelo;
import vista.ResistenciaVista;
import controlador.ResistenciaControlador;
import javax.swing.*;

/**
 *
 * @author Harol
 */
public class Resistencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        final String usuario;
        String tempUsuario = JOptionPane.showInputDialog("Ingrese su nombre:");

        if (tempUsuario == null || tempUsuario.trim().isEmpty()) {
            usuario = "Usuario";
        } else {
            usuario = tempUsuario;
        }

        String mensaje = "⚡ Bienvenido, " + usuario + " ⚡\n"
                       + "Calculadora de Resistencia Equivalente\n"
                       + "Seleccione Serie o Paralelo y digite los valores.";
        JOptionPane.showMessageDialog(null, mensaje, "Resistencias", JOptionPane.INFORMATION_MESSAGE);

        SwingUtilities.invokeLater(() -> {
            ResistenciaVista vista = new ResistenciaVista();
            ResistenciaModelo modelo = new ResistenciaModelo();
            new ResistenciaControlador(vista, modelo, usuario);
            vista.setVisible(true);
        });
    }
}


