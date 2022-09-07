/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cide_ciclo_for_each;

/**
 *
 * @author Harol
 */
// CIDE  CICLO FOR EACH
// FUNDAMENTOS DE PROGRAMACION
public class CIDE_CICLO_FOR_EACH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String array[] = {"Harol", "Torres", "CIDE", "2020"};
 
        //mejorado para for
        for (String x:array)
        {
            System.out.println(x);
        }
 
        /*bucle for para la misma función
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
        */
    }
    
}
