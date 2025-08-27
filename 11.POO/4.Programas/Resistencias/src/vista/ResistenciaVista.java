package vista;

import javax.swing.*;
import java.awt.*;

public class ResistenciaVista extends JFrame {
    public JComboBox<String> comboTipo;
    public JTextField campoNumResistencias;
    public JButton botonGenerarCampos, botonCalcular, botonLimpiar;
    public JPanel panelResistencias;
    public JTextArea areaResultados;

    public ResistenciaVista() {
        setTitle("Calculadora de Resistencia Equivalente");
        setSize(650, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Fuente general
        Font fuenteNormal = new Font("Segoe UI", Font.PLAIN, 14);

        // Panel principal con padding
        JPanel panelPrincipal = new JPanel(new BorderLayout(15, 15));
        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panelPrincipal.setBackground(new Color(245, 248, 255));
        add(panelPrincipal);

        // Título
        JLabel titulo = new JLabel("Calculadora de Resistencia Equivalente", JLabel.CENTER);
        titulo.setFont(new Font("Segoe UI", Font.BOLD, 20));
        titulo.setForeground(new Color(20, 40, 120));
        panelPrincipal.add(titulo, BorderLayout.NORTH);

        // Panel central con GridBagLayout
        JPanel panelCentro = new JPanel(new GridBagLayout());
        panelCentro.setBackground(new Color(245, 248, 255));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Tipo de circuito
        gbc.gridx = 0; gbc.gridy = 0;
        panelCentro.add(new JLabel("Tipo de circuito:"), gbc);
        comboTipo = new JComboBox<>(new String[]{"Serie", "Paralelo"});
        comboTipo.setFont(fuenteNormal);
        gbc.gridx = 1;
        panelCentro.add(comboTipo, gbc);

        // Número de resistencias
        gbc.gridx = 0; gbc.gridy = 1;
        panelCentro.add(new JLabel("Numero de resistencias:"), gbc);
        campoNumResistencias = new JTextField();
        campoNumResistencias.setFont(fuenteNormal);
        gbc.gridx = 1;
        panelCentro.add(campoNumResistencias, gbc);

        // Botón para generar campos
        gbc.gridx = 0; gbc.gridy = 2; gbc.gridwidth = 2;
        botonGenerarCampos = new JButton("Ingresar Resistencias");
        botonGenerarCampos.setFont(fuenteNormal);
        panelCentro.add(botonGenerarCampos, gbc);

        panelPrincipal.add(panelCentro, BorderLayout.CENTER);

        // Panel dinámico de resistencias
        panelResistencias = new JPanel();
        panelResistencias.setLayout(new GridLayout(0, 2, 10, 10));
        panelResistencias.setBorder(BorderFactory.createTitledBorder("Valores de las Resistencias (Ω)"));
        panelResistencias.setBackground(new Color(230, 240, 255));
        panelPrincipal.add(panelResistencias, BorderLayout.EAST);

        // Panel inferior
        JPanel panelInferior = new JPanel(new BorderLayout(10, 10));
        panelInferior.setBackground(new Color(245, 248, 255));

        // Botones
        JPanel botones = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
        botones.setBackground(new Color(245, 248, 255));
        botonCalcular = new JButton("Calcular");
        botonLimpiar = new JButton("Limpiar");
        botonCalcular.setFont(fuenteNormal);
        botonLimpiar.setFont(fuenteNormal);
        botones.add(botonCalcular);
        botones.add(botonLimpiar);
        panelInferior.add(botones, BorderLayout.NORTH);

        // Área de resultados
        areaResultados = new JTextArea(6, 40);
        areaResultados.setFont(new Font("Consolas", Font.PLAIN, 14));
        areaResultados.setEditable(false);
        areaResultados.setBorder(BorderFactory.createTitledBorder("Resultados"));
        panelInferior.add(new JScrollPane(areaResultados), BorderLayout.CENTER);

        panelPrincipal.add(panelInferior, BorderLayout.SOUTH);
    }
}
