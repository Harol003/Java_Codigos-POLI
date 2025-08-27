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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.time.LocalTime;
import java.util.LinkedHashMap;
import java.util.Map;

// Controlador que conecta la vista con los modelos
public class Controlador {
    // mapa en memoria de barberos y sus agendas
    private Map<Barbero, Agenda> barberos;
    private VistaPrincipal vista;

    public Controlador(VistaPrincipal vista) {
        this.vista = vista;
        this.barberos = new LinkedHashMap<>();
        registrarOyentes();
    }

    // registra los oyentes de la vista
    private void registrarOyentes() {
        // boton para agregar barbero
        vista.getBtnAgregarBarbero().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = vista.getCampoNombreBarbero().getText().trim();
                if (nombre.isEmpty()) {
                    JOptionPane.showMessageDialog(vista, "Ingrese el nombre del barbero", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                Barbero nuevo = new Barbero(nombre);
                // si el usuario subio una foto, asignarla
                ImageIcon foto = vista.getFotoSeleccionada();
                if (foto != null) {
                    // redimensionar imagen para el label
                    ImageIcon iconEscalado = new ImageIcon(foto.getImage().getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH));
                    nuevo.setFoto(iconEscalado);
                }
                Agenda agenda = new Agenda();
                barberos.put(nuevo, agenda);
                vista.actualizarComboBarberos(barberos.keySet().toArray(new Barbero[0]));
                JOptionPane.showMessageDialog(vista, "Barbero agregado: " + nombre);
                vista.limpiarFormularioBarbero();
            }
        });

        // seleccion de barbero en combo
        vista.getComboBarbero().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Barbero b = (Barbero) vista.getComboBarbero().getSelectedItem();
                if (b != null) {
                    Agenda a = barberos.get(b);
                    vista.mostrarAgenda(b, a);
                }
            }
        });

        // boton para reservar
        vista.getBtnReservar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Barbero b = (Barbero) vista.getComboBarbero().getSelectedItem();
                if (b == null) {
                    JOptionPane.showMessageDialog(vista, "Seleccione un barbero", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                LocalTime hora = vista.getHoraSeleccionada();
                if (hora == null) {
                    JOptionPane.showMessageDialog(vista, "Seleccione una hora", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                String nombreCliente = vista.getCampoNombreCliente().getText().trim();
                String celular = vista.getCampoCelular().getText().trim();
                if (nombreCliente.isEmpty() || celular.isEmpty()) {
                    JOptionPane.showMessageDialog(vista, "Ingrese nombre y celular del cliente", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                Agenda a = barberos.get(b);
                Reserva r = new Reserva(nombreCliente, celular, hora);
                boolean ok = a.reservarTurno(hora, r);
                if (ok) {
                    JOptionPane.showMessageDialog(vista, "Reserva realizada: " + hora.toString());
                    vista.mostrarAgenda(b, a);
                    vista.limpiarFormularioReserva();
                } else {
                    JOptionPane.showMessageDialog(vista, "El turno no esta disponible.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // boton liberar turno
        vista.getBtnLiberar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Barbero b = (Barbero) vista.getComboBarbero().getSelectedItem();
                if (b == null) {
                    JOptionPane.showMessageDialog(vista, "Seleccione un barbero", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                LocalTime hora = vista.getHoraSeleccionada();
                if (hora == null) {
                    JOptionPane.showMessageDialog(vista, "Seleccione una hora", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                Agenda a = barberos.get(b);
                boolean ok = a.liberarTurno(hora);
                if (ok) {
                    JOptionPane.showMessageDialog(vista, "Turno liberado: " + hora.toString());
                    vista.mostrarAgenda(b, a);
                } else {
                    JOptionPane.showMessageDialog(vista, "No se pudo liberar el turno.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // boton exportar a CSV
        vista.getBtnExportar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Barbero b = (Barbero) vista.getComboBarbero().getSelectedItem();
                if (b == null) {
                    JOptionPane.showMessageDialog(vista, "Seleccione un barbero", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                Agenda a = barberos.get(b);
                JFileChooser fc = new JFileChooser();
                fc.setDialogTitle("Guardar agenda como CSV");
                int res = fc.showSaveDialog(vista);
                if (res == JFileChooser.APPROVE_OPTION) {
                    File archivo = fc.getSelectedFile();
                    boolean ok = ExportadorCSV.exportarAgendaCSV(archivo, b, a);
                    if (ok) JOptionPane.showMessageDialog(vista, "Agenda exportada correctamente");
                    else JOptionPane.showMessageDialog(vista, "Error al exportar agenda", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // boton para subir foto (en la vista hay un boton que abre JFileChooser y establece fotoSeleccionada)
        vista.getBtnSubirFoto().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.seleccionarFoto();
            }
        });
    }
}
