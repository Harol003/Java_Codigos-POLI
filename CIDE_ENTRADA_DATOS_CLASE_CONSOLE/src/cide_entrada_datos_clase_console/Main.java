/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cide_entrada_datos_clase_console;

/**
 *
 * @author Harol
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Usar la consola para ingresar datos del usuario
        String name = System.console().readLine();
         
        System.out.println(name);
    }
    
}
