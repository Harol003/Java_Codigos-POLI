/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cide_operadores_unarios;

/**
 *
 * @author Harol
 */
// CIDE  OPERADORES
// FUNDAMENTOS DE PROGRAMACION
// PROF. HAROL TORRES
public class CIDE_OPERADORES_UNARIOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30;
    boolean condition = true;

    // operador de pre-incremento
    // a = a+1 y entonces c = a;
    c = ++a;
    System.out.println("Valor de c (++a) = " + c);

    // operador de post-incremento
    // c=b entonces b=b+1 (b pasa a ser 11)
    c = b++;
    System.out.println("Valor de c (b++) = " + c);

    // operador de pre-decremento
    // d=d-1 entonces c=d
    c = --d;
    System.out.println("Valor de c (--d) = " + c);

    // operador de post-decremento
    // c=e entonces e=e-1 (e pasa a ser 39)
    c = e--;
    System.out.println("Valor de c (e--) = " + c);

    // Operador lógico not
    System.out.println("Valor de !condition = " + !condition);
    }
    
}
