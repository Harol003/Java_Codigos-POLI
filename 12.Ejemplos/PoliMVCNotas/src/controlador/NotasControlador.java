/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.NotasModelo;
import modelo.Estudiante;
import vista.NotasVista;

// Controlador: coordina la logica del sistema
public class NotasControlador {

    private NotasModelo modelo;
    private NotasVista vista;

    public NotasControlador(NotasModelo modelo, NotasVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {

        String usuario = vista.pedirNombreUsuario();
        vista.mostrarMensaje("Bienvenido " + usuario + " al sistema PoliMVCNotas");

        boolean continuar = true;

        while (continuar) {
            int opcion = vista.mostrarMenu();

            switch (opcion) {

                case 1: {
                    String nombre = vista.pedirTexto("Ingrese nombre del estudiante: ");
                    float n1 = vista.pedirNota("Ingrese nota 1: ");
                    float n2 = vista.pedirNota("Ingrese nota 2: ");
                    float n3 = vista.pedirNota("Ingrese nota 3: ");

                    modelo.registrarEstudiante(nombre, n1, n2, n3);
                    vista.mostrarMensaje("Estudiante registrado correctamente.");
                    break;
                }

                case 2: {
                    String nombre = vista.pedirTexto("Ingrese el nombre del estudiante: ");

                    Estudiante est = modelo.buscarEstudiante(nombre);
                    if (est != null) {
                        vista.mostrarMensaje("Promedio: " + est.calcularPromedio());
                    } else {
                        vista.mostrarMensaje("El estudiante no existe.");
                    }
                    break;
                }

                case 3: {
                    String nombre = vista.pedirTexto("Ingrese el nombre del estudiante: ");

                    Estudiante est = modelo.buscarEstudiante(nombre);
                    if (est != null) {
                        float prom = est.calcularPromedio();
                        vista.mostrarMensaje("Promedio: " + prom);

                        if (prom >= 3.0f) {
                            vista.mostrarMensaje("Estado: Aprobado");
                        } else {
                            vista.mostrarMensaje("Estado: Reprobado");
                        }
                    } else {
                        vista.mostrarMensaje("El estudiante no existe.");
                    }
                    break;
                }

                case 4:
                    vista.mostrarListaEstudiantes(modelo.obtenerEstudiantes());
                    break;

                case 5:
                    vista.mostrarMensaje("Gracias por usar PoliMVCNotas desarrollado por Harol.Torres@pi.educo - 2025.");
                    continuar = false;
                    break;

                default:
                    vista.mostrarMensaje("Opcion no valida.");
            }
        }
    }
}
