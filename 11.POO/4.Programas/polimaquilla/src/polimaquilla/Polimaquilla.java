package polimaquilla;

/**
 *
 * @author Harol
 */
public class Polimaquilla {

    public static void main(String[] args) {
        // Ejecutar en el hilo de eventos de Swing
        javax.swing.SwingUtilities.invokeLater(() -> {
            TiendaVista vista = new TiendaVista();
            new TiendaControlador(vista);
            vista.setVisible(true);
        });
    } 

}
