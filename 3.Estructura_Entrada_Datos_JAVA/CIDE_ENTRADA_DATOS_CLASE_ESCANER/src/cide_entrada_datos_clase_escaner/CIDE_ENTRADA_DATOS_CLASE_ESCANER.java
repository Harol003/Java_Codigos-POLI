/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cide_entrada_datos_clase_escaner;
import java.util.Scanner;
/**
 * 
 * @author Harol
 */
// CIDE  ENTRADA DE DATOS
// FUNDAMENTOS DE PROGRAMACION
public class CIDE_ENTRADA_DATOS_CLASE_ESCANER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          // Usando Scanner para obtener información del usuario
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println("Usted ingresó la cadena: "+s);
        int a = in.nextInt();
        System.out.println("Usted ingresó un entero: "+a);
        float b = in.nextFloat();
        System.out.println("Usted ingresó un float: "+b);
    }
    
}
