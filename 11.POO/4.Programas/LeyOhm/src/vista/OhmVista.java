/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import javax.swing.*;
import java.awt.*;

public class OhmVista extends JFrame {
    public JTextField txtVoltaje = new JTextField(10);
    public JTextField txtCorriente = new JTextField(10);
    public JTextField txtResistencia = new JTextField(10);
    public JTextField txtResultado = new JTextField(10);
    public JComboBox<String> comboCalculo = new JComboBox<>(new String[]{
            "Hallar Voltaje (V)", 
            "Hallar Corriente (I)", 
            "Hallar Resistencia (Ω)"});
    public JButton btnCalcular = new JButton("Calcular");
    public JLabel lblUsuario = new JLabel("Bienvenido");
    public JLabel lblInfo = new JLabel("Seleccione una variable para calcular según la Ley de Ohm");

    public OhmVista() {
        setTitle("⚡ Calculadora Ley de Ohm ⚡");
        setSize(550, 420);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // ---- Encabezado estilo banner ----
        JPanel header = new JPanel();
        header.setBackground(new Color(33, 150, 243));
        JLabel titulo = new JLabel("Calculadora - Ley de Ohm");
        titulo.setFont(new Font("Arial", Font.BOLD, 22));
        titulo.setForeground(Color.WHITE);
        header.add(titulo);

        // ---- Panel de datos ----
        JPanel panelDatos = new JPanel(new GridLayout(5, 2, 10, 10));
        panelDatos.setBorder(BorderFactory.createTitledBorder("Ingrese los datos"));
        panelDatos.setBackground(new Color(240, 248, 255));

        panelDatos.add(new JLabel("Voltaje (V):"));
        panelDatos.add(txtVoltaje);

        panelDatos.add(new JLabel("Corriente (A):"));
        panelDatos.add(txtCorriente);

        panelDatos.add(new JLabel("Resistencia (Ω):"));
        panelDatos.add(txtResistencia);

        panelDatos.add(new JLabel("Variable a Calcular:"));
        panelDatos.add(comboCalculo);

        panelDatos.add(new JLabel("Resultado:"));
        txtResultado.setEditable(false);
        txtResultado.setBackground(Color.LIGHT_GRAY);
        panelDatos.add(txtResultado);

        // ---- Panel inferior ----
        JPanel panelInferior = new JPanel(new GridLayout(3, 1, 5, 5));
        panelInferior.setBackground(Color.WHITE);

        JPanel panelBoton = new JPanel();
        btnCalcular.setBackground(new Color(76, 175, 80));
        btnCalcular.setForeground(Color.WHITE);
        btnCalcular.setFont(new Font("Arial", Font.BOLD, 14));
        panelBoton.add(btnCalcular);

        panelInferior.add(panelBoton);
        lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        lblUsuario.setFont(new Font("Arial", Font.ITALIC, 14));
        panelInferior.add(lblUsuario);
        lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
        lblInfo.setFont(new Font("Arial", Font.BOLD, 13));
        panelInferior.add(lblInfo);

        // ---- Layout principal ----
        setLayout(new BorderLayout(10, 10));
        add(header, BorderLayout.NORTH);
        add(panelDatos, BorderLayout.CENTER);
        add(panelInferior, BorderLayout.SOUTH);
    }
}
