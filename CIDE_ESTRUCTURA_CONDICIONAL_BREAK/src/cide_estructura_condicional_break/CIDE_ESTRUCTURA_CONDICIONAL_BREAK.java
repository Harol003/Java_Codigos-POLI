/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cide_estructura_condicional_break;

/**
 *
 * @author Harol
 */
 // CIDE  ESTRUCTURA CONDICIONAL
// FUNDAMENTOS DE PROGRAMACION
public class CIDE_ESTRUCTURA_CONDICIONAL_BREAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Inicialmente, el bucle está configurado para ejecutarse desde 0-9
        for (int i = 8; i < 10; i++)
        {
            // termina el bucle cuando llega a 5.
            if (i == 5)
                break;
 
            System.out.println("i: " + i);
        }
        System.out.println("Bucle completo.");
    }
    
}
