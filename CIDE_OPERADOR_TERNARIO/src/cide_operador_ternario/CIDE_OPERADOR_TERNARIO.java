/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cide_operador_ternario;

/**
 *
 * @author Harol
 */
// CIDE  OPERADORES
// FUNDAMENTOS DE PROGRAMACION
// PROF. HAROL TORRES
public class CIDE_OPERADOR_TERNARIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int a = 20, b = 10, c = 30, result;
 
        //el resultado obtiene el máximo de tres
        //numeros
        result = ((a > b) ? (a > c) ? a : 
                   c : (b > c) ? b : c);
        System.out.println("Máximo de tres números = "+result);
    }
    
}
