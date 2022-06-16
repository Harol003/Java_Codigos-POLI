/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cide_arreglo_captura_datos;
import java.util.*;

/**
 *
 * @author Harol
 */
public class CIDE_ARREGLO_CAPTURA_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Programa que evalua e indica cual es el numero mayor - HHTN");
        Scanner dato = new Scanner(System.in);
int mayor = 0; int menor = 0;
int[] numeros = new int[11]; 
for (int i = 0+1; i < 11; i++) {
 System.out.print("Ingrese el número " + (i) + " a evaluar :"); numeros[i] = dato.nextInt(); 
} 
for (int i = 1; i < numeros.length; i++) {
 if (mayor < numeros[i]) { 
mayor = numeros[i];
 } } menor = mayor; 
for (int i = 1; i < numeros.length; i++) {
if (menor > numeros[i]) {
 menor = numeros[i]; 
} 
}
 System.out.println(" el numero mayor es " + mayor + " el numero menor es :" + menor); }
    }
    

