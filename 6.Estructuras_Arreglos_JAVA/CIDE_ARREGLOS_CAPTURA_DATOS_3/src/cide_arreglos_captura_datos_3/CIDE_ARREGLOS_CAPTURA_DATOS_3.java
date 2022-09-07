/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cide_arreglos_captura_datos_3;
import java.util.*;

/**
 *
 * @author Harol
 */
public class CIDE_ARREGLOS_CAPTURA_DATOS_3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println("Programa que captura datos de una carrera -  HHTN");
        Scanner dato = new Scanner(System.in); 
int c=0; int a; float m =0;
 System.out.println("Ingresar la cantidad de atletas");
 c = dato.nextInt(); String atleta[] = new String[c];
 float tiempo[] = new float[c];
 for( a=0;a<c;a++){ 
System.out.println("Ingrese el nombre del atleta");
 atleta[a] = dato.next();
 System.out.println("Ingrese el tiempo del recorrido");
 tiempo[a] = dato.nextFloat();
 } 
for (int i = 1; i < tiempo.length; i++) { 
if (m > tiempo[i]) { m = tiempo[i]; 
}else{ 
 m = tiempo[i];            
System.out.println("El ganador es el atleta con el tiempo "+m);            }
 } 
    }
    
}
