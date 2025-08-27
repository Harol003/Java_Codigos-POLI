/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author Harol
 */
import javax.swing.*;
import java.awt.*;

// GUI con colores pastel e imagenes
public class VistaPrincipal extends JFrame {

    public JTextField txtUsuario;
    public JTextField txtMascota;
    public JComboBox<String> comboTipo;
    public JButton btnRegistrar;
    public JLabel lblResultado;
    public JLabel lblImagen;

    public VistaPrincipal() {
        setTitle("PolitecnicoMascotas - Registro de Mascotas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(245, 245, 250));
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(8, 8, 8, 8);
        c.fill = GridBagConstraints.HORIZONTAL;

        // Usuario
        JLabel lblUsuario = new JLabel("Nombre usuario:");
        txtUsuario = new JTextField(15);
        c.gridx = 0; c.gridy = 0; panel.add(lblUsuario, c);
        c.gridx = 1; c.gridy = 0; panel.add(txtUsuario, c);

        // Tipo mascota
        JLabel lblTipo = new JLabel("Tipo mascota:");
        comboTipo = new JComboBox<>(new String[]{"Perro", "Gato"});
        c.gridx = 0; c.gridy = 1; panel.add(lblTipo, c);
        c.gridx = 1; c.gridy = 1; panel.add(comboTipo, c);

        // Nombre mascota
        JLabel lblMascota = new JLabel("Nombre mascota:");
        txtMascota = new JTextField(15);
        c.gridx = 0; c.gridy = 2; panel.add(lblMascota, c);
        c.gridx = 1; c.gridy = 2; panel.add(txtMascota, c);

        // Boton
        btnRegistrar = new JButton("Registrar");
        btnRegistrar.setBackground(new Color(200, 230, 250)); // azul pastel
        c.gridx = 0; c.gridy = 3; c.gridwidth = 2;
        panel.add(btnRegistrar, c);

        // Resultado
        lblResultado = new JLabel("Resultado: -");
        lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
        c.gridx = 0; c.gridy = 4; c.gridwidth = 2;
        panel.add(lblResultado, c);

        // Imagen
        lblImagen = new JLabel();
        lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
        c.gridx = 0; c.gridy = 5; c.gridwidth = 2;
        panel.add(lblImagen, c);

        setContentPane(panel);
    }

    // Metodo para mostrar imagen segun mascota
    public void mostrarImagen(String tipo) {
        String ruta = "/recursos/" + tipo.toLowerCase() + ".png";
        try {
            ImageIcon icon = new ImageIcon(getClass().getResource(ruta));
            Image img = icon.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
            lblImagen.setIcon(new ImageIcon(img));
        } catch (Exception e) {
            lblImagen.setText("No se encontro la imagen de " + tipo);
        }
    }
}