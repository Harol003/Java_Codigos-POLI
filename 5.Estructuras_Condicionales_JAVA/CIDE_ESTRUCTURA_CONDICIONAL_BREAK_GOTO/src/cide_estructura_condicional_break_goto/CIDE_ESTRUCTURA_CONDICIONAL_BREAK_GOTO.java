/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cide_estructura_condicional_break_goto;

/**
 *
 * @author Harol
 */
 // CIDE  ESTRUCTURA CONDICIONAL
// FUNDAMENTOS DE PROGRAMACION
public class CIDE_ESTRUCTURA_CONDICIONAL_BREAK_GOTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                boolean t = true;
 
        // etiqueta first
        first:
        {
            // Declaración de la etiqueta second
            second:
            {
                third:
                {
                    // Antes de break
                    System.out.println("Antes de la sentencia break");
 
                    // break tomará el control de
                    // la etiqueta second
                    if (t)
                        break second;
                    System.out.println("Esto no se ejecutará.");
                }
                System.out.println("Esto no se ejecutará.");
            }
 
            // Tercer bloque
            System.out.println("Esto es después del segundo bloque.");
    }
    
}
}