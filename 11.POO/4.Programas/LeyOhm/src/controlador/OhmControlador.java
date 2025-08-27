/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.LeyOhm;
import vista.OhmVista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OhmControlador {
    private OhmVista vista;

    public OhmControlador(OhmVista vista, String usuario) {
        this.vista = vista;
        this.vista.lblUsuario.setText("Bienvenido, " + usuario);

        // --- Control de habilitacion de campos segun la seleccion ---
        this.vista.comboCalculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarCampos();
            }
        });

        // --- Boton calcular ---
        this.vista.btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularResultado();
            }
        });

        // Inicializar campos correctamente
        actualizarCampos();
    }

    private void actualizarCampos() {
        String seleccion = vista.comboCalculo.getSelectedItem().toString();

        // Habilitamos todos por defecto
        vista.txtVoltaje.setEnabled(true);
        vista.txtCorriente.setEnabled(true);
        vista.txtResistencia.setEnabled(true);

        if (seleccion.contains("Voltaje")) {
            vista.txtVoltaje.setEnabled(false); // Se calcula V
            vista.lblInfo.setText("Ley de Ohm: V = I × R");
        } else if (seleccion.contains("Corriente")) {
            vista.txtCorriente.setEnabled(false); // Se calcula I
            vista.lblInfo.setText("Ley de Ohm: I = V ÷ R");
        } else {
            vista.txtResistencia.setEnabled(false); // Se calcula R
            vista.lblInfo.setText("Ley de Ohm: R = V ÷ I");
        }

        vista.txtResultado.setText("");
    }

    private void calcularResultado() {
        String seleccion = vista.comboCalculo.getSelectedItem().toString();

        String tipo = seleccion.contains("Voltaje") ? "V" :
                      seleccion.contains("Corriente") ? "I" : "R";

        LeyOhm ley = new LeyOhm(tipo);

        try {
            if (!vista.txtVoltaje.getText().isEmpty())
                ley.setVoltaje(Double.parseDouble(vista.txtVoltaje.getText()));

            if (!vista.txtCorriente.getText().isEmpty())
                ley.setCorriente(Double.parseDouble(vista.txtCorriente.getText()));

            if (!vista.txtResistencia.getText().isEmpty())
                ley.setResistencia(Double.parseDouble(vista.txtResistencia.getText()));

            double resultado = ley.calcular();

            String unidad = tipo.equals("V") ? " V" : tipo.equals("I") ? " A" : " Ω";
            vista.txtResultado.setText(String.format("%.2f%s", resultado, unidad));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(vista, "Error en los datos ingresados");
        }
    }
}
