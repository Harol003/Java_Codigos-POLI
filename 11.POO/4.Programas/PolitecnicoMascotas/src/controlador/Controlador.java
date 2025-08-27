/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Harol
 */


import vista.VistaPrincipal;
import modelo.GestorMascotas;
import modelo.Mascota;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador {
    private final VistaPrincipal vista;
    private final GestorMascotas gestor;

    public Controlador(VistaPrincipal vista, GestorMascotas gestor) {
        this.vista = vista;
        this.gestor = gestor;
    }

    public void iniciar() {
        vista.setVisible(true);
        configurarEventos();
    }

    private void configurarEventos() {
        vista.btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarMascota();
            }
        });
    }

    private void registrarMascota() {
        String usuario = vista.txtUsuario.getText().trim();
        String tipo = (String) vista.comboTipo.getSelectedItem();
        String nombreMascota = vista.txtMascota.getText().trim();

        if (usuario.isEmpty() || nombreMascota.isEmpty()) {
            vista.lblResultado.setText("Por favor completa todos los campos.");
            return;
        }

        Mascota mascota = gestor.crearMascota(tipo, nombreMascota);
        String saludo = mascota.saludar();

        vista.lblResultado.setText(
                "Hola " + usuario + ", tu mascota " + mascota.getNombre() + " dice: " + saludo
        );

        // Mostrar la imagen
        vista.mostrarImagen(tipo);
    }
}
