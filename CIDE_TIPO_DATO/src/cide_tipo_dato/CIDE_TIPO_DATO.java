/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cide_tipo_dato;

/**
 *
 * @author Harol
 */
// CIDE  TIPOS DE DATOS
// FUNDAMENTOS DE PROGRAMACION
// PROF. HAROL TORRES
public class CIDE_TIPO_DATO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         // declarando el carácter
        char a = 'G';
          
        // El tipo de datos enteros es generalmente
        // utilizado para valores numéricos
        int i=89;
        int G=89;
         
        // use byte y short si la memoria es una prioridad
        byte b = 4;
         
        // esto dará error ya que el número es
        // mayor que el rango de bytes
        // byte b1 = 7888888955;
         
        short s = 56;
         
        // esto dará error ya que el número es 
        // más grande que el rango de short
        // short s1 = 87878787878;
         
         
        // por defecto, el valor de la fracción es double en Java
        double d = 4.355453532;
         
        // para float use 'f' como sufijo
        float f = 4.7333434f;
        
        System.out.println("char: " + a); 
        System.out.println("integer: " + i); 
        System.out.println("byte: " + b); 
        System.out.println("short: " + s); 
        System.out.println("float: " + f); 
        System.out.println("double: " + d); 
        
        
    }
    
}
