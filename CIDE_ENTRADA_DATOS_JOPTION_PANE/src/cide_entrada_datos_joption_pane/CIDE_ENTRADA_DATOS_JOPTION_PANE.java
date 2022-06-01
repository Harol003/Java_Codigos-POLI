/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cide_entrada_datos_joption_pane;
import javax.swing.*;
/**
 *
 * @author Harol
 */
// CIDE  ENTRADA DE DATOS
// FUNDAMENTOS DE PROGRAMACION
public class CIDE_ENTRADA_DATOS_JOPTION_PANE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     JOptionPane.showMessageDialog(null, "Programa que muestra los primeros 20 Numeros pares");
     int i=0,ci;
     for (int c=0;c<=38;c++){
     i = i + 2;
     c = i;
     JOptionPane.showMessageDialog(null, c);
     }
     JOptionPane.showMessageDialog(null,"CIDE Fundamentos Programacion Harol Torres");
    }
    
}
