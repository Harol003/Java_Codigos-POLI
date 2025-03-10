/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package politecnicointernacionalregistro;

/**
 *
 * @author Harol
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// ====== MODELO ======
class Usuario {
    private String nombre;
    private String placaVehiculo;

    public Usuario(String nombre, String placaVehiculo) {
        this.nombre = nombre;
        this.placaVehiculo = placaVehiculo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }
}

// ====== VISTA ======
class Vista extends JFrame {
    private JTextField campoNombre, campoPlaca;
    private JButton botonGuardar;
    private JLabel etiquetaMensaje;

    public Vista() {
        setTitle("Politecnico Internacional - Registro");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        // Establecer fondo en tonos pastel azul
        getContentPane().setBackground(new Color(173, 216, 230));

        // Campo para el nombre
        campoNombre = new JTextField();
        campoNombre.setBorder(BorderFactory.createTitledBorder("Nombre"));
        add(campoNombre);

        // Campo para la placa del vehiculo
        campoPlaca = new JTextField();
        campoPlaca.setBorder(BorderFactory.createTitledBorder("Placa del Vehiculo"));
        add(campoPlaca);

        // Boton para guardar
        botonGuardar = new JButton("Guardar");
        add(botonGuardar);

        // Etiqueta de mensaje
        etiquetaMensaje = new JLabel(" ", SwingConstants.CENTER);
        add(etiquetaMensaje);

        // Centrar ventana
        setLocationRelativeTo(null);
    }

    public String getNombre() {
        return campoNombre.getText();
    }

    public String getPlaca() {
        return campoPlaca.getText();
    }

    public void setMensaje(String mensaje) {
        etiquetaMensaje.setText(mensaje);
    }

    public void addGuardarListener(ActionListener listener) {
        botonGuardar.addActionListener(listener);
    }
}

// ====== CONTROLADOR ======
class Controlador {
    private Vista vista;

    public Controlador(Vista vista) {
        this.vista = vista;
        this.vista.addGuardarListener(new GuardarListener());
    }

    class GuardarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String nombre = vista.getNombre().trim();
            String placa = vista.getPlaca().trim();

            // Verificar si los campos no estan vacios
            if (nombre.isEmpty() || placa.isEmpty()) {
                vista.setMensaje("Por favor, llena todos los campos.");
            } else {
                Usuario usuario = new Usuario(nombre, placa);
                vista.setMensaje("Hola " + usuario.getNombre() +
                        ", tu vehiculo con placa " + usuario.getPlacaVehiculo() + 
                        " ha sido registrado!");
            }
        }
    }
}

// ====== MAIN ======
public class PolitecnicoInternacionalRegistro {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Vista vista = new Vista();
            new Controlador(vista);
            vista.setVisible(true);
        });
    }
}
