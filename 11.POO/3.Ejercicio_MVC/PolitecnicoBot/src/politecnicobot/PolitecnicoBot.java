/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package politecnicobot;

/**
 *
 * @author Harol
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// ======================= MODELO =======================
// Clase que representa un Bot generico
class Bot {
    protected String nombre;

    public Bot(String nombre) {
        this.nombre = nombre;
    }

    // Metodo que responde segun la opcion seleccionada por el usuario
    public String responder(String usuario, String mensaje) {
        if (mensaje.equals("1")) {
            return "Si " + usuario + ", el servicio de internet esta activo.";
        } else if (mensaje.equals("2")) {
            return "Para soporte tecnico, comunicate al correo: soporte@pi.edu.co";
        } else {
            return "Por favor " + usuario + ", ingresa una opcion valida:\n1. Verificar estado del internet\n2. Contacto de soporte tecnico.";
        }
    }
}

// Clase para un Bot con respuestas amigables
class BotAmigable extends Bot {
    public BotAmigable() {
        super("Bot Amigable");
    }

    @Override
    public String responder(String usuario, String mensaje) {
        if (mensaje.equals("1")) {
            return "Buenas noticias, " + usuario + "! El servicio de internet esta funcionando correctamente.";
        } else if (mensaje.equals("2")) {
            return "Si necesitas ayuda, puedes escribirnos a: soporte@pi.edu.co. Estamos aqui para ayudarte!";
        } else {
            return "Por favor " + usuario + ", selecciona una opcion valida:\n1. Verificar internet\n2. Contacto de soporte.";
        }
    }
}

// Clase para un Bot con respuestas mas serias
class BotSerio extends Bot {
    public BotSerio() {
        super("Bot Serio");
    }

    @Override
    public String responder(String usuario, String mensaje) {
        if (mensaje.equals("1")) {
            return "Confirmado, " + usuario + ". El servicio de internet esta operativo.";
        } else if (mensaje.equals("2")) {
            return "Para soporte tecnico, contacta a: soporte@pi.edu.co";
        } else {
            return "Error de entrada, " + usuario + ". Debes seleccionar:\n1. Verificar internet\n2. Contacto de soporte.";
        }
    }
}

// ======================= VISTA =======================
// Clase para la interfaz grafica del chat
class ChatGUI extends JFrame {
    private JTextArea chatArea;
    private JTextField inputField;
    private ChatController controller;

    public ChatGUI(ChatController controller, String usuarioNombre, String botNombre) {
        this.controller = controller;

        // Configuracion de la ventana
        setTitle("Sistema de Gestion - " + usuarioNombre);
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla

        // Configuracion de colores en tonos azul pastel
        getContentPane().setBackground(new Color(210, 230, 255)); // Azul pastel claro

        // Area de chat (donde se muestran los mensajes)
        chatArea = new JTextArea();
        chatArea.setEditable(false);
        chatArea.setBackground(new Color(235, 245, 255)); // Azul muy claro
        chatArea.setFont(new Font("Arial", Font.PLAIN, 14));
        add(new JScrollPane(chatArea), BorderLayout.CENTER);

        // Campo de entrada de texto
        inputField = new JTextField();
        inputField.setBackground(new Color(220, 240, 255)); // Azul pastel suave
        inputField.setForeground(Color.BLACK);
        add(inputField, BorderLayout.SOUTH);

        // Evento para enviar mensajes al presionar Enter
        inputField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.procesarMensaje(inputField.getText());
                inputField.setText("");
            }
        });

        // Mostrar mensaje de bienvenida en la interfaz
        bienvenida(usuarioNombre, botNombre);

        setVisible(true);
    }

    // Metodo para actualizar el area de chat con nuevos mensajes
    public void actualizarChat(String mensaje) {
        chatArea.append(mensaje + "\n");
    }

    // Mensaje de bienvenida que se muestra al iniciar la aplicacion
    private void bienvenida(String usuario, String bot) {
        actualizarChat("Bienvenido al Sistema de Gestion del Politecnico Internacional");
        actualizarChat("Has seleccionado interactuar con " + bot + ".");
        actualizarChat("Este es un sistema de soporte tecnico.");
        actualizarChat("Por favor, selecciona una opcion:");
        actualizarChat("1. Verificar si el servicio de internet esta activo.");
        actualizarChat("2. Obtener contacto de soporte tecnico.");
        actualizarChat("-----------------------------------\n");
    }
}

// ======================= CONTROLADOR =======================
// Clase que maneja la interaccion entre el usuario y el bot
class ChatController {
    private Bot bot;
    private ChatGUI vista;
    private String usuario;

    public ChatController(String usuario, Bot bot) {
        this.usuario = usuario;
        this.bot = bot;
        this.vista = new ChatGUI(this, usuario, bot.nombre);
    }

    // Metodo que procesa el mensaje ingresado por el usuario
    public void procesarMensaje(String mensajeUsuario) {
        if (mensajeUsuario.equalsIgnoreCase("salir")) {
            vista.actualizarChat("\nGracias por usar el sistema, " + usuario + ". Hasta pronto!");
            JOptionPane.showMessageDialog(null, "Gracias por usar el Sistema de Gestion, " + usuario + ".\nHasta pronto!");
            System.exit(0);
        } else {
            vista.actualizarChat(usuario + ": " + mensajeUsuario);
            vista.actualizarChat(bot.nombre + ": " + bot.responder(usuario, mensajeUsuario) + "\n");
        }
    }
}

// ======================= MAIN =======================
// Clase principal que inicia la aplicacion
public class PolitecnicoBot {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Pedir el nombre del usuario al iniciar
            String nombreUsuario = JOptionPane.showInputDialog("Sistema de Gestion del Politecnico\n\nPor favor, ingresa tu nombre:");
            if (nombreUsuario == null || nombreUsuario.trim().isEmpty()) {
                nombreUsuario = "Usuario";
            }

            // Seleccion de tipo de bot (amigable o serio)
            String[] opciones = {"Bot Amigable", "Bot Serio"};
            int seleccion = JOptionPane.showOptionDialog(null, "Selecciona el bot con el que deseas interactuar:", 
                    "Seleccionar Bot", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            // Crear el bot segun la seleccion del usuario
            Bot botSeleccionado = (seleccion == 1) ? new BotSerio() : new BotAmigable();

            // Iniciar el chat con el bot seleccionado
            new ChatController(nombreUsuario, botSeleccionado);
        });
    }
}
