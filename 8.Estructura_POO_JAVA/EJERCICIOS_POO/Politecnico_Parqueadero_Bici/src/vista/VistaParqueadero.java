package vista;

import java.util.Scanner;

/**
 * Clase VistaParqueadero que maneja la interacción con el usuario.
 */
public class VistaParqueadero {
    private Scanner scanner;

    /**
     * Constructor de la vista.
     */
    public VistaParqueadero() {
        scanner = new Scanner(System.in);
    }

    /**
     * Muestra un mensaje en la consola.
     * @param mensaje Texto a mostrar.
     */
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    /**
     * Solicita un dato al usuario.
     * @param mensaje Mensaje de solicitud.
     * @return Entrada del usuario.
     */
    public String pedirDato(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }
}
