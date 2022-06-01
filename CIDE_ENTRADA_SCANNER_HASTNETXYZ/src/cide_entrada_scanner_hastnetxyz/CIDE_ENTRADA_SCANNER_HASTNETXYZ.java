/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cide_entrada_scanner_hastnetxyz;
import java.util.Scanner;
/**
 *
 * @author Harol
 */
// CIDE  ENTRADA DE DATOS
// FUNDAMENTOS DE PROGRAMACION
public class CIDE_ENTRADA_SCANNER_HASTNETXYZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Declarar un objeto e inicializar con
        // el objeto de entrada estándar predefinido
        Scanner sc = new Scanner(System.in);

        // Inicializar la suma y el recuento
        // de los elementos de entrada
        int sum = 0, count = 0;

        // Compruebe si un valor int está disponible
        while (sc.hasNextInt())
        {
            // Lee un valor int
            int num = sc.nextInt();
            sum += num;
            count++;
        }
        int mean = sum / count;
        System.out.println("La media es: " + mean);
        
    }
    
}
