package polimaquilla;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class TiendaVista extends JFrame {

    // Componentes de entrada
    private JTextField txtNombre;
    private JTextField txtPrecio;
    private JTextField txtStock;
    private JButton btnAgregar;
    private JButton btnLimpiar;
    private JButton btnComprar;

    // Tabla para mostrar los productos
    private JTable tablaProductos;
    private DefaultTableModel modeloTabla;

    public TiendaVista() {
        setTitle("PoliMaquilla - Tienda de Maquillaje");
        setSize(700, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel principal
        JPanel panelPrincipal = new JPanel(new BorderLayout(10, 10));
        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(panelPrincipal);

        // Panel superior (formulario)
        JPanel panelFormulario = new JPanel(new GridLayout(2, 4, 10, 10));
        panelFormulario.setBorder(BorderFactory.createTitledBorder("Agregar Producto"));

        panelFormulario.add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        panelFormulario.add(txtNombre);

        panelFormulario.add(new JLabel("Precio:"));
        txtPrecio = new JTextField();
        panelFormulario.add(txtPrecio);

        panelFormulario.add(new JLabel("Stock:"));
        txtStock = new JTextField();
        panelFormulario.add(txtStock);

        btnAgregar = new JButton("Agregar Producto");
        btnLimpiar = new JButton("Limpiar");
        btnComprar = new JButton("Comprar");
        panelFormulario.add(btnAgregar);
        panelFormulario.add(btnLimpiar);
        panelFormulario.add(btnComprar);

        panelPrincipal.add(panelFormulario, BorderLayout.NORTH);

        // Panel central (tabla de productos)
        String[] columnas = {"Nombre", "Precio", "Stock"};
        modeloTabla = new DefaultTableModel(columnas, 0) {
            // evitar edicion directa en la tabla
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tablaProductos = new JTable(modeloTabla);
        tablaProductos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane scrollTabla = new JScrollPane(tablaProductos);
        scrollTabla.setBorder(BorderFactory.createTitledBorder("Inventario de Productos"));
        panelPrincipal.add(scrollTabla, BorderLayout.CENTER);

        setVisible(true);
    }

    // Getters para acceder desde el controlador
    public JTextField getTxtNombre() { return txtNombre; }
    public JTextField getTxtPrecio() { return txtPrecio; }
    public JTextField getTxtStock() { return txtStock; }
    public JButton getBtnAgregar() { return btnAgregar; }
    public JButton getBtnLimpiar() { return btnLimpiar; }
    public JButton getBtnComprar() { return btnComprar; }
    public DefaultTableModel getModeloTabla() { return modeloTabla; }
    public JTable getTablaProductos() { return tablaProductos; }

    // Metodo para llenar la tabla desde una lista de productos
    public void mostrarProductos(java.util.List<Producto> productos) {
        // limpiar modelo
        modeloTabla.setRowCount(0);
        if (productos != null) {
            for (Producto p : productos) {
                Object[] fila = { p.getNombre(), p.getPrecio(), p.getStock() };
                modeloTabla.addRow(fila);
            }
        }
    }

    // Mensajes para el usuario
    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    // Limpiar formulario
    public void limpiarFormulario() {
        txtNombre.setText("");
        txtPrecio.setText("");
        txtStock.setText("");
        txtNombre.requestFocus();
    }
}
