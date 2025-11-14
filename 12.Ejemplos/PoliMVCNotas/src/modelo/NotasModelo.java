/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

// Modelo: maneja datos y calculos del sistema de notas
public class NotasModelo {

    private ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

    public void registrarEstudiante(String nombre, float n1, float n2, float n3) {
        listaEstudiantes.add(new Estudiante(nombre, n1, n2, n3));
    }

    public ArrayList<Estudiante> obtenerEstudiantes() {
        return listaEstudiantes;
    }

    public Estudiante buscarEstudiante(String nombre) {
        for (Estudiante e : listaEstudiantes) {
            if (e.nombre.equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }
}
