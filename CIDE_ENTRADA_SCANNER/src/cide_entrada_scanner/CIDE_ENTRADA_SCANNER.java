/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cide_entrada_scanner;
import java.util.Scanner;
/**
 *
 * @author Harol
 */
// CIDE  ENTRADA DE DATOS
// FUNDAMENTOS DE PROGRAMACION
public class CIDE_ENTRADA_SCANNER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Declarar el objeto e inicializar con
        // el objeto de entrada estándar predefinido

        Scanner sc = new Scanner(System.in);

        // entrada de una cadena
        String name = sc.nextLine();

        // entrada de un carácter
        char gender = sc.next().charAt(0);

        // Entrada de datos numéricos
        // byte, short y float
        int age = sc.nextInt();
        long mobileNo = sc.nextLong();
        double average = sc.nextDouble();

        // Imprima los valores para verificar si la entrada
        // fue obtenida correctamente.
        System.out.println("Nombre Estudiante CIDE: "+name);
        System.out.println("Género Estudiante CIDE: "+gender);
        System.out.println("Edad Estudiante CIDE: "+age);
        System.out.println("Teléfono Estudiante CIDE: "+mobileNo);
        System.out.println("Promedio Estudiante CIDE: "+average);
        
        
    }
    
}
