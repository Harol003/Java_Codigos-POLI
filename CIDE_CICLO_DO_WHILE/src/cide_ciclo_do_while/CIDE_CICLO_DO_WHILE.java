/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cide_ciclo_do_while;

/**
 *
 * @author Harol
 */
// CIDE  CICLO FOR EACH
// FUNDAMENTOS DE PROGRAMACION
public class CIDE_CICLO_DO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int x = 21;
        do
        {
            //El código dentro del do se imprime incluso
            //si la condición es falsa
            System.out.println("Valor de x :" + x);
            x++;
        }
        while (x < 20);
        
    }
    
}
