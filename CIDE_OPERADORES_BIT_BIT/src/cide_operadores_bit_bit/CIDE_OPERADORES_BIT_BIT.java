/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cide_operadores_bit_bit;

/**
 *
 * @author Harol
 */
// CIDE  OPERADORES
// FUNDAMENTOS DE PROGRAMACION
// PROF. HAROL TORRES
public class CIDE_OPERADORES_BIT_BIT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int a = 0x0005;
        int b = 0x0007;
 
        // bitwise AND
        // 0101 & 0111=0101
        System.out.println("a&b = " + (a & b));
 
        // bitwise or
        // 0101 | 0111=0111
        System.out.println("a|b = " + (a | b));
 
        // bitwise xor
        // 0101 ^ 0111=0010
        System.out.println("a^b = " + (a ^ b));
 
        // bitwise complemento
        // ~0101=1010
        System.out.println("~a = " + ~a);
 
        // también se puede combinar con el
        // operador de asignación
        // a=a&b
        a &= b;
        System.out.println("a= " + a);
    }
    
}
