/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package politecnico_robot;

/**
 *
 * @author Harol
 */
class Entrenamiento {
    // Atributos del entrenamiento del robot
    private String nivel;
    private String tipoEntrenamiento;
    private int duracion; // en horas

    // Constructor para inicializar los atributos del entrenamiento
    public Entrenamiento() {
        this.nivel = "Avanzado";  
        this.tipoEntrenamiento = "Combate y estrategia";
        this.duracion = 120;  // Duración en horas
    }

    // Método para mostrar los detalles del entrenamiento
    public void mostrarEntrenamiento() {
        System.out.println("\n⚡ DETALLES DEL ENTRENAMIENTO ⚡");
        System.out.println("Nivel: " + nivel);
        System.out.println("Tipo de entrenamiento: " + tipoEntrenamiento);
        System.out.println("Duración: " + duracion + " horas");
    }
}