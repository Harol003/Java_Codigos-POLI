/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package politecnicointernacionalvehiculos;

/**
 *
 * @author Harol
 */
import javax.swing.*;
import java.awt.*;

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
    private JLabel etiqueta;
    
    public Vista() {
        setTitle("Politecnico Internacional - Registro Vehicular");
        setSize(800, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Colores en tonos pastel azul
        getContentPane().setBackground(new Color(173, 216, 230));

        // Etiqueta para mostrar el mensaje
        etiqueta = new JLabel("Bienvenido al sistema de registro vehicular");
        etiqueta.setFont(new Font("Arial", Font.BOLD, 14));
        add(etiqueta);

        // Centrar ventana
        setLocationRelativeTo(null);
    }

    public void actualizarMensaje(String mensaje) {
        etiqueta.setText(mensaje);
    }
}

// ====== CONTROLADOR ======
class Controlador {
    private Usuario usuario;
    private Vista vista;

    public Controlador(Usuario usuario, Vista vista) {
        this.usuario = usuario;
        this.vista = vista;
        actualizarVista();
    }

    public void actualizarVista() {
        String mensaje = "Hola " + usuario.getNombre() + 
                         ", tu vehiculo con placa " + usuario.getPlacaVehiculo() + 
                         " ha sido registrado exitosamente!";
        vista.actualizarMensaje(mensaje);
        vista.setVisible(true);
    }
}

// ====== MAIN ======
public class PolitecnicoInternacionalVehiculos {
    public static void main(String[] args) {
        // Pedir datos del usuario
        String nombre = JOptionPane.showInputDialog("Ingresa tu nombre:");
        if (nombre == null || nombre.trim().isEmpty()) {
            nombre = "Usuario"; // Nombre por defecto
        }

        String placa = JOptionPane.showInputDialog("Ingresa la placa de tu vehiculo:");
        if (placa == null || placa.trim().isEmpty()) {
            placa = "Desconocida"; // Placa por defecto
        }

        // Crear modelo, vista y controlador
        Usuario usuario = new Usuario(nombre, placa);
        Vista vista = new Vista();
        new Controlador(usuario, vista);
    }
}
