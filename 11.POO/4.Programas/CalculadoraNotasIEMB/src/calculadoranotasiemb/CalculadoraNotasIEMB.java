/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoranotasiemb;

/**
 *
 * @author Harol
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;

public class CalculadoraNotasIEMB extends JFrame {
    private JTextField txtNombre, txtP1, txtP2;
    private JTextArea areaResultados;
    private LinkedList<String> historial = new LinkedList<>();
    private final double META = 3.3;

    public CalculadoraNotasIEMB() {
        // Configuración de ventana
        setTitle("Calculadora IEMB Notas");
        setSize(450, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel superior: Bienvenida y nombre
        JPanel panelSuperior = new JPanel(new GridLayout(3, 1));
        JLabel lblBienvenida = new JLabel("Calculadora IEMB Notas", SwingConstants.CENTER);
        lblBienvenida.setFont(new Font("Arial", Font.BOLD, 16));
        panelSuperior.add(lblBienvenida);

        JPanel panelNombre = new JPanel();
        panelNombre.add(new JLabel("Ingrese su nombre: "));
        txtNombre = new JTextField(15);
        panelNombre.add(txtNombre);
        panelSuperior.add(panelNombre);

        add(panelSuperior, BorderLayout.NORTH);

        // Panel central: notas y botón calcular
        JPanel panelCentral = new JPanel(new GridLayout(3, 2, 10, 10));
        panelCentral.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        panelCentral.add(new JLabel("Nota 1er periodo (30%):"));
        txtP1 = new JTextField();
        panelCentral.add(txtP1);

        panelCentral.add(new JLabel("Nota 2do periodo (30%):"));
        txtP2 = new JTextField();
        panelCentral.add(txtP2);

        JButton btnCalcular = new JButton("Calcular");
        panelCentral.add(btnCalcular);

        JButton btnLimpiar = new JButton("Limpiar");
        panelCentral.add(btnLimpiar);

        add(panelCentral, BorderLayout.CENTER);

        // Panel inferior: resultados
        areaResultados = new JTextArea(8, 40);
        areaResultados.setEditable(false);
        JScrollPane scroll = new JScrollPane(areaResultados);
        scroll.setBorder(BorderFactory.createTitledBorder("Últimos 5 resultados"));
        add(scroll, BorderLayout.SOUTH);

        // Acción Calcular
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular();
            }
        });

        // Acción Limpiar
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
            }
        });
    }

    private void calcular() {
        try {
            String nombre = txtNombre.getText().trim();
            double p1 = Double.parseDouble(txtP1.getText());
            double p2 = Double.parseDouble(txtP2.getText());

            double peso1 = 0.30, peso2 = 0.30, peso3 = 0.40;
            double necesarioP3 = (META - (p1 * peso1 + p2 * peso2)) / peso3;

            String resultado;
            if (necesarioP3 > 5.0) {
                resultado = nombre + ": requiere " + String.format("%.2f", necesarioP3) + 
                            " en el 3er periodo, lo cual no es posible (mayor a 5.0).";
            } else if (necesarioP3 <= 0) {
                resultado = nombre + ": ya alcanza la meta de " + META + " con las notas actuales.";
            } else {
                resultado = nombre + ": requiere " + String.format("%.2f", necesarioP3) + 
                            " en el 3er periodo para pasar.";
            }

            // Guardar en historial (máximo 5 resultados)
            if (historial.size() == 5) {
                historial.removeFirst();
            }
            historial.add(resultado);

            // Mostrar historial en el área de texto
            areaResultados.setText("");
            for (String r : historial) {
                areaResultados.append(r + "\n");
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese valores numéricos válidos (use punto para decimales).");
        }
    }

    private void limpiar() {
        txtNombre.setText("");
        txtP1.setText("");
        txtP2.setText("");
        areaResultados.setText("");
        historial.clear();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculadoraNotasIEMB app = new CalculadoraNotasIEMB();
            app.setVisible(true);
        });
    }
}

