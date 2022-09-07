/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cide_byte;

/**
 *
 * @author Harol
 */
// CIDE  ENTERO 
// FUNDAMENTOS DE PROGRAMACION
public class CIDE_Byte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TIPO DE DE DATO BYTE
        byte a = 126;
 
        // byte tiene un valor de 8 bits
        System.out.println(a); //Impresion variable a
        
        a++;
        System.out.println(a);
         
        // Se desborda aquí porque
        // el byte puede contener valores de -128 a 127
        a++;
        System.out.println(a);
         
        // bucle dentro del rango
        a++;
        System.out.println(a);
    }
    
}
