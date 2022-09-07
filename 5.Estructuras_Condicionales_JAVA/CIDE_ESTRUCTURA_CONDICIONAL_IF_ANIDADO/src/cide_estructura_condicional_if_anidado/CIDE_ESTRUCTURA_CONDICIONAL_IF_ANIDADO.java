/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cide_estructura_condicional_if_anidado;

/**
 *
 * @author Harol
 */
public class CIDE_ESTRUCTURA_CONDICIONAL_IF_ANIDADO {

    /**
     * @param args the command line arguments
     */
    // CIDE  ESTRUCTURA CONDICIONAL
   // FUNDAMENTOS DE PROGRAMACION
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i = 10;
 
        if (i == 10)
        {
            // Primera declaración if
            if (i < 15)
                System.out.println("soy menor que 15");
 
            // Declaración if anidada
            // Solo se ejecutará si la instrucción anterior
            // es verdad
            if (i < 12)
                System.out.println("yo también soy menor que 12");
            else
                System.out.println("soy mayor que 15");
    }
        }
    
  }

