/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cide_estructura_condicional_return;

/**
 *
 * @author Harol
 */
 // CIDE  ESTRUCTURA CONDICIONAL
// FUNDAMENTOS DE PROGRAMACION
public class CIDE_ESTRUCTURA_CONDICIONAL_RETURN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         boolean t = true;
        System.out.println("Antes de return.");
     
        if (t)
            return;
 
        // El compilador eludirá todas las declaraciones
        // después de return
        System.out.println("Esto no se ejecutará.");
    }
    
}
