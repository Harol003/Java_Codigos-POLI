/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cide_arreglo_captura_datos_2;
import java.util.*;

/**
 *
 * @author Harol
 */
public class CIDE_ARREGLO_CAPTURA_DATOS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Revisa tu promedio - HHTN ");
         Scanner dato=new Scanner(System.in); 
float notas[]=new float[6]; int con=1; 
float promedio,sum=0;
 while(con<6) { 
System.out.println("Ingrese la " + con + "° nota : "); notas[con]=dato.nextFloat(); 
sum=sum+notas[con]; con++; 
}
 promedio=sum/5; 
System.out.println("El promedio de sus notas es: " + promedio); 
 } 
    }
    

