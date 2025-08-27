/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polibarbershop;

/**
 *
 * @author Harol
 */


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

// Vista principal que muestra la UI con Swing
public class VistaPrincipal extends JFrame {
    // componentes para agregar barbero
    private JTextField campoNombreBarbero;
    private JButton btnAgregarBarbero;
    private JButton btnSubirFoto;
    private JLabel labelFoto;

    // lista/combo de barberos
    private JComboBox<Barbero> comboBarbero;

    // tabla para mostrar agenda
    private JTable tablaAgenda;
    private DefaultTableModel modeloTabla;

    // componentes para reservar
    private JTextField campoNombreCliente;
    private JTextField campoCelular;
    private JButton btnReservar;
    private JButton btnLiberar;

    // boton exportar
    private JButton btnExportar;

    // foto seleccionada (temporal hasta agregar barbero)
    private ImageIcon fotoSeleccionada;

    // formato de hora para mostrar
    private DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

    public VistaPrincipal() {
        setTitle("Polibarbershop - Agenda");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 600);
        setLocationRelativeTo(null);
        initComponentes();
    }

    // inicializar componentes y layout
    private void initComponentes() {
        // panel principal con BorderLayout
        JPanel panelPrincipal = new JPanel(new BorderLayout(10, 10));
        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // panel izquierdo: formulario barbero
        JPanel panelIzquierdo = new JPanel();
        panelIzquierdo.setLayout(new BoxLayout(panelIzquierdo, BoxLayout.Y_AXIS));
        panelIzquierdo.setPreferredSize(new Dimension(260, 0));
        panelIzquierdo.setBorder(BorderFactory.createTitledBorder("Agregar Barbero"));

        campoNombreBarbero = new JTextField();
        btnAgregarBarbero = new JButton("Agregar barbero");
        btnSubirFoto = new JButton("Subir foto");
        labelFoto = new JLabel();
        labelFoto.setPreferredSize(new Dimension(120, 120));
        labelFoto.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        labelFoto.setHorizontalAlignment(SwingConstants.CENTER);

        panelIzquierdo.add(new JLabel("Nombre del barbero:"));
        panelIzquierdo.add(campoNombreBarbero);
        panelIzquierdo.add(Box.createVerticalStrut(6));
        panelIzquierdo.add(btnSubirFoto);
        panelIzquierdo.add(Box.createVerticalStrut(6));
        panelIzquierdo.add(labelFoto);
        panelIzquierdo.add(Box.createVerticalStrut(10));
        panelIzquierdo.add(btnAgregarBarbero);

        // panel central: agenda y controles de reserva
        JPanel panelCentral = new JPanel(new BorderLayout(8, 8));
        panelCentral.setBorder(BorderFactory.createTitledBorder("Agenda"));

        // combo barberos
        comboBarbero = new JComboBox<>();
        JPanel panelCombo = new JPanel(new BorderLayout());
        panelCombo.add(new JLabel("Barbero:"), BorderLayout.WEST);
        panelCombo.add(comboBarbero, BorderLayout.CENTER);

        // tabla
        modeloTabla = new DefaultTableModel(new Object[]{"Hora", "Estado", "Cliente", "Celular"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tablaAgenda = new JTable(modeloTabla);
        tablaAgenda.setRowHeight(28);

        JScrollPane scroll = new JScrollPane(tablaAgenda);

        panelCentral.add(panelCombo, BorderLayout.NORTH);
        panelCentral.add(scroll, BorderLayout.CENTER);

        // panel inferior central: formulario reservas
        JPanel panelReservas = new JPanel();
        panelReservas.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelReservas.setBorder(BorderFactory.createTitledBorder("Reservar / Liberar"));

        campoNombreCliente = new JTextField(12);
        campoCelular = new JTextField(10);
        btnReservar = new JButton("Reservar");
        btnLiberar = new JButton("Liberar");
        btnExportar = new JButton("Exportar agenda");

        panelReservas.add(new JLabel("Nombre cliente:"));
        panelReservas.add(campoNombreCliente);
        panelReservas.add(new JLabel("Celular:"));
        panelReservas.add(campoCelular);
        panelReservas.add(btnReservar);
        panelReservas.add(btnLiberar);
        panelReservas.add(btnExportar);

        panelCentral.add(panelReservas, BorderLayout.SOUTH);

        // agregar paneles al principal
        panelPrincipal.add(panelIzquierdo, BorderLayout.WEST);
        panelPrincipal.add(panelCentral, BorderLayout.CENTER);

        add(panelPrincipal);

        // evento click en tabla para seleccionar hora
        tablaAgenda.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = tablaAgenda.getSelectedRow();
                if (fila >= 0) {
                    String horaStr = (String) modeloTabla.getValueAt(fila, 0);
                    // convertir a LocalTime
                    LocalTime hora = LocalTime.parse(horaStr, formatoHora);
                    // cuando el usuario presione reservar o liberar, se usara la hora seleccionada en la vista
                    tablaAgenda.setRowSelectionInterval(fila, fila);
                }
            }
        });
    }

    // metodos para que el controlador acceda a componentes
    public JButton getBtnAgregarBarbero() { return btnAgregarBarbero; }
    public JButton getBtnSubirFoto() { return btnSubirFoto; }
    public JTextField getCampoNombreBarbero() { return campoNombreBarbero; }
    public JComboBox<Barbero> getComboBarbero() { return comboBarbero; }
    public JButton getBtnReservar() { return btnReservar; }
    public JButton getBtnLiberar() { return btnLiberar; }
    public JButton getBtnExportar() { return btnExportar; }
    public JTextField getCampoNombreCliente() { return campoNombreCliente; }
    public JTextField getCampoCelular() { return campoCelular; }

    // metodo para actualizar el combo de barberos
    public void actualizarComboBarberos(Barbero[] lista) {
        DefaultComboBoxModel<Barbero> modelo = new DefaultComboBoxModel<>(lista);
        comboBarbero.setModel(modelo);
    }

    // muestra agenda en la tabla y la foto del barbero
    public void mostrarAgenda(Barbero barbero, Agenda agenda) {
        // mostrar foto
        if (barbero.getFoto() != null) {
            labelFoto.setIcon(new ImageIcon(barbero.getFoto().getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH)));
        } else {
            labelFoto.setIcon(null);
            labelFoto.setText("Sin foto");
        }

        // llenar tabla
        modeloTabla.setRowCount(0);
        for (Map.Entry<LocalTime, Reserva> e : agenda.obtenerTurnosMap().entrySet()) {
            LocalTime hora = e.getKey();
            Reserva r = e.getValue();
            String estado;
            String cliente = "";
            String celular = "";
            if (hora.getHour() == 13) {
                estado = "Almuerzo";
            } else if (r == null) {
                estado = "Libre";
            } else {
                estado = "Ocupado";
                cliente = r.getNombreCliente();
                celular = r.getCelular();
            }
            modeloTabla.addRow(new Object[]{hora.format(formatoHora), estado, cliente, celular});
        }
    }

    // obtiene la hora seleccionada en la tabla (null si no hay seleccion)
    public LocalTime getHoraSeleccionada() {
        int fila = tablaAgenda.getSelectedRow();
        if (fila < 0) return null;
        String horaStr = (String) modeloTabla.getValueAt(fila, 0);
        return LocalTime.parse(horaStr, formatoHora);
    }

    // limpiar formulario barbero
    public void limpiarFormularioBarbero() {
        campoNombreBarbero.setText("");
        fotoSeleccionada = null;
        labelFoto.setIcon(null);
        labelFoto.setText("");
    }

    // limpiar formulario reserva
    public void limpiarFormularioReserva() {
        campoNombreCliente.setText("");
        campoCelular.setText("");
    }

    // METODOS PARA SUBIR FOTO: abre JFileChooser y guarda fotoSeleccionada
    public void seleccionarFoto() {
        JFileChooser fc = new JFileChooser();
        int res = fc.showOpenDialog(this);
        if (res == JFileChooser.APPROVE_OPTION) {
            File archivo = fc.getSelectedFile();
            ImageIcon icon = new ImageIcon(archivo.getAbsolutePath());
            // escalar para mostrar en label temporal
            Image imgEscalada = icon.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
            fotoSeleccionada = new ImageIcon(imgEscalada);
            labelFoto.setIcon(fotoSeleccionada);
            labelFoto.setText("");
        }
    }

    // getter para foto seleccionada
    public ImageIcon getFotoSeleccionada() {
        return fotoSeleccionada;
    }
}