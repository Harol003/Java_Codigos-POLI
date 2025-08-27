/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculonotas;


import java.util.Scanner;
/**
 *
 * @author Harol
 */
public class CalculoNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Crear objeto Scanner para leer datos del usuario
        Scanner sc = new Scanner(System.in);

        // Pesos de los periodos
        double pesoP1 = 0.30;
        double pesoP2 = 0.30;
        double pesoP3 = 0.40;
        double meta = 3.3;

        // Pedir notas
        System.out.print("Ingrese la nota del primer periodo (ejemplo 2.5): ");
        double p1 = sc.nextDouble();

        System.out.print("Ingrese la nota del segundo periodo (ejemplo 3.0): ");
        double p2 = sc.nextDouble();

        // Calcular nota necesaria en el tercer periodo
        double necesarioP3 = (meta - (p1 * pesoP1 + p2 * pesoP2)) / pesoP3;

        // Mostrar resultado
        if (necesarioP3 > 5.0) {
            System.out.printf("El estudiante requiere %.2f en el tercer periodo, lo cual no es posible (mayor a 5.0).%n", necesarioP3);
        } else if (necesarioP3 <= 0) {
            System.out.println("El estudiante ya alcanza la meta de 3.3 con las notas actuales.");
        } else {
            System.out.printf("El estudiante requiere %.2f en el tercer periodo para pasar.%n", necesarioP3);
        }

        sc.close();
    }
    
}
