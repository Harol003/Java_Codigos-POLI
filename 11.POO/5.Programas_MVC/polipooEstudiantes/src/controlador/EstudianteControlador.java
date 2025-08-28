/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Estudiante;
import vista.EstudianteVista;
import java.util.ArrayList;
import java.util.List;

// Clase que conecta la vista con el modelo
public class EstudianteControlador {
    private EstudianteVista vista;
    private List<Estudiante> estudiantes;

    public EstudianteControlador(EstudianteVista vista) {
        this.vista = vista;
        this.estudiantes = new ArrayList<>();
    }

    public void iniciar() {
        boolean salir = false;

        while (!salir) {
            int opcion = vista.mostrarMenu();

            switch (opcion) {
                case 1:
                    String nombre = vista.leerTexto("Ingrese el nombre del estudiante: ");
                    int edad = vista.leerEntero("Ingrese la edad del estudiante: ");
                    estudiantes.add(new Estudiante(nombre, edad));
                    vista.mostrarMensaje("Estudiante registrado con exito.");
                    break;

                case 2:
                    vista.mostrarEstudiantes(estudiantes);
                    break;

                case 3:
                    if (estudiantes.isEmpty()) {
                        vista.mostrarMensaje("No hay estudiantes registrados.");
                    } else {
                        String nombreNotas = vista.leerTexto("Ingrese el nombre del estudiante: ");
                        Estudiante estNotas = buscarEstudiante(nombreNotas);
                        if (estNotas != null) {
                            double nota1 = vista.leerDouble("Ingrese la nota 1: ");
                            double nota2 = vista.leerDouble("Ingrese la nota 2: ");
                            double nota3 = vista.leerDouble("Ingrese la nota 3: ");
                            estNotas.asignarNotas(nota1, nota2, nota3);
                            vista.mostrarMensaje("Notas asignadas con exito.");
                        } else {
                            vista.mostrarMensaje("Estudiante no encontrado.");
                        }
                    }
                    break;

                case 4:
                    if (estudiantes.isEmpty()) {
                        vista.mostrarMensaje("No hay estudiantes registrados.");
                    } else {
                        String nombreProm = vista.leerTexto("Ingrese el nombre del estudiante: ");
                        Estudiante estProm = buscarEstudiante(nombreProm);
                        if (estProm != null) {
                            double promedio = estProm.calcularPromedio();
                            vista.mostrarMensaje("El promedio de " + estProm.getNombre() + " es: " + promedio);
                        } else {
                            vista.mostrarMensaje("Estudiante no encontrado.");
                        }
                    }
                    break;

                case 5:
                    vista.mostrarMensaje("Saliendo del sistema...");
                    salir = true;
                    break;

                default:
                    vista.mostrarMensaje("Opcion invalida, intente de nuevo.");
            }
        }
    }

    private Estudiante buscarEstudiante(String nombre) {
        for (Estudiante e : estudiantes) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }
}
