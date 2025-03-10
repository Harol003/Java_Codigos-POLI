/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package politecnicointernacional;

/**
 *
 * @author Harol
 */
import javax.swing.*;
import java.awt.*;

// ====== MODELO ======
class Usuario {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

// ====== VISTA ======
class Vista extends JFrame {
    private JLabel etiqueta;
    
    public Vista() {
        setTitle("Politecnico Internacional");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Colores en tonos pastel
        getContentPane().setBackground(new Color(173, 216, 230)); // Azul pastel

        // Etiqueta para mostrar el mensaje
        etiqueta = new JLabel("Bienvenido al Politecnico Internacional");
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
        vista.actualizarMensaje("Hola " + usuario.getNombre() + ", bienvenido al sistema!");
        vista.setVisible(true);
    }
}

// ====== MAIN ======
public class PolitecnicoInternacional {
    public static void main(String[] args) {
        // Pedir nombre del usuario
        String nombre = JOptionPane.showInputDialog("Por favor, ingresa tu nombre:");
        if (nombre == null || nombre.trim().isEmpty()) {
            nombre = "Usuario"; // Nombre por defecto si no ingresa nada
        }

        // Crear modelo, vista y controlador
        Usuario usuario = new Usuario(nombre);
        Vista vista = new Vista();
        new Controlador(usuario, vista);
    }
}
