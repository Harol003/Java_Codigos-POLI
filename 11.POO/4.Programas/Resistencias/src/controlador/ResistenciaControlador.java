/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Harol
 */
import modelo.ResistenciaModelo;
import vista.ResistenciaVista;

import javax.swing.*;

public class ResistenciaControlador {
    private ResistenciaVista vista;
    private ResistenciaModelo modelo;
    private JTextField[] camposResistencias;
    private String usuario;

    public ResistenciaControlador(ResistenciaVista vista, ResistenciaModelo modelo, String usuario) {
        this.vista = vista;
        this.modelo = modelo;
        this.usuario = usuario;

        vista.botonGenerarCampos.addActionListener(e -> generarCampos());
        vista.botonCalcular.addActionListener(e -> calcular());
        vista.botonLimpiar.addActionListener(e -> limpiar());
    }

    private void generarCampos() {
        try {
            int n = Integer.parseInt(vista.campoNumResistencias.getText());
            if (n <= 0) throw new NumberFormatException();

            vista.panelResistencias.removeAll();
            vista.panelResistencias.setLayout(new java.awt.GridLayout(n, 2, 5, 5));
            camposResistencias = new JTextField[n];

            for (int i = 0; i < n; i++) {
                vista.panelResistencias.add(new JLabel("R" + (i + 1) + " (Ω):"));
                camposResistencias[i] = new JTextField();
                vista.panelResistencias.add(camposResistencias[i]);
            }

            vista.panelResistencias.revalidate();
            vista.panelResistencias.repaint();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(vista, "Ingrese un número válido de resistencias.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void calcular() {
        try {
            double[] resistencias = new double[camposResistencias.length];
            for (int i = 0; i < camposResistencias.length; i++) {
                resistencias[i] = Double.parseDouble(camposResistencias[i].getText());
            }

            String tipo = (String) vista.comboTipo.getSelectedItem();
            double resultado = tipo.equals("Serie") ?
                    modelo.calcularSerie(resistencias) :
                    modelo.calcularParalelo(resistencias);

            vista.areaResultados.setText("Usuario: " + usuario + "\n");
            vista.areaResultados.append("Tipo de circuito: " + tipo + "\n");
            vista.areaResultados.append("Resistencia equivalente: " + resultado + " Ω\n");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(vista, "Ingrese valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpiar() {
        vista.campoNumResistencias.setText("");
        vista.panelResistencias.removeAll();
        vista.areaResultados.setText("");
        vista.panelResistencias.revalidate();
        vista.panelResistencias.repaint();
    }
}