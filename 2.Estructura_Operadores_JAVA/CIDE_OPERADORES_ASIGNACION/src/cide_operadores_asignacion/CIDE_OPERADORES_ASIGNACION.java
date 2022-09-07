/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cide_operadores_asignacion;

/**
 *
 * @author Harol
 */
// CIDE  OPERADORES
// FUNDAMENTOS DE PROGRAMACION
// PROF. HAROL TORRES
public class CIDE_OPERADORES_ASIGNACION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 20, b = 10, c, d, e = 10, f = 4, g = 9;
 
        // operador de asignación simple
        c = b;
        System.out.println("Valor de c = " + c);
 
        // Esta siguiente declaración arrojaría una exception
        // porque el valor del operando derecho debe ser inicializado
        // antes de la asignación, entonces el programa no
        // compila.
        // c = d;
 
        // operadores de asignación simples
        a = a + 1;
        b = b - 1;
        e = e * 2;
        f = f / 2;
        System.out.println("a,b,e,f = " + a + ","
                           + b + "," + e + "," + f);
        a = a - 1;
        b = b + 1;
        e = e / 2;
        f = f * 2;
 
        // operados de asignación compuestos/cortos
        a += 1;
        b -= 1;
        e *= 2;
        f /= 2;
        System.out.println("a,b,e,f (usando operadores cortos)= " + 
                            a + "," + b + "," + e + "," + f);
    }
    
}
