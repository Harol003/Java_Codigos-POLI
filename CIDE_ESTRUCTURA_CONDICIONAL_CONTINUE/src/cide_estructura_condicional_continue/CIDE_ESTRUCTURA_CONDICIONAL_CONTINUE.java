/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cide_estructura_condicional_continue;

/**
 *
 * @author Harol
 */
 // CIDE  ESTRUCTURA CONDICIONAL
// FUNDAMENTOS DE PROGRAMACION
public class CIDE_ESTRUCTURA_CONDICIONAL_CONTINUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         for (int i = 0; i < 10; i++)
        {
            // Si el número es par
            // omitir y continuar
            if (i%2 == 0)
                continue;
 
            // Si el número es impar, imprímalo
            System.out.print(i + " ");
        }
    }
    
}
