/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cide_operadores_relacionales;

/**
 *
 * @author Harol
 */
// CIDE  OPERADORES
// FUNDAMENTOS DE PROGRAMACION
// PROF. HAROL TORRES
public class CIDE_OPERADORES_RELACIONALES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 20, b = 10;
        String x = "Thank", y = "Thank";
        int ar[] = { 1, 2, 3 };
        int br[] = { 1, 2, 3 };
        boolean condicion = true;
 
        //varios operadores condicionales
        System.out.println("a == b :" + (a == b));
        System.out.println("a < b :" + (a < b));
        System.out.println("a <= b :" + (a <= b));
        System.out.println("a > b :" + (a > b));
        System.out.println("a >= b :" + (a >= b));
        System.out.println("a != b :" + (a != b));
 
        // Los Arrays no se pueden comparar con
        // operadores relacionales porque los objetos
        // almacenan referencias, mas no el valor
        System.out.println("x == y : " + (ar == br));
 
        System.out.println("condicion==true :" + (condicion == true));
    }
    
}
