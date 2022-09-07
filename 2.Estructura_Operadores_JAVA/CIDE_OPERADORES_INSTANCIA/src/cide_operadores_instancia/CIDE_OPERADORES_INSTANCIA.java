/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cide_operadores_instancia;

/**
 *
 * @author Harol
 */
// CIDE  OPERADORES
// FUNDAMENTOS DE PROGRAMACION
// PROF. HAROL TORRES
public class CIDE_OPERADORES_INSTANCIA {

        public static void main(String[] args) 
    {
 
        Person obj1 = new Person();
        Person obj2 = new Boy();
 
        // Como obj1 es de tipo Person, no es una
        // instancia de Boy o interfaz
        System.out.println("obj1 instanceof Person: " + 
                           (obj1 instanceof Person));
        System.out.println("obj1 instanceof Boy: " + 
                           (obj1 instanceof Boy));
        System.out.println("obj1 instanceof MyInterface: " + 
                           (obj1 instanceof MyInterface));
 
        // Dado que obj2 es de tipo Boy, cuya clase padre es
        // Person e implementa la interfaz Myinterface
        // es una instancia de todas estas clases
        System.out.println("obj2 instanceof Person: " + 
                           (obj2 instanceof Person));
        System.out.println("obj2 instanceof Boy: " + 
                           (obj2 instanceof Boy));
        System.out.println("obj2 instanceof MyInterface: " + 
                           (obj2 instanceof MyInterface));
    }
}
 
class Person 
{
 
}
 
class Boy extends Person implements MyInterface 
{
 
}
 
interface MyInterface 
{
    
}
