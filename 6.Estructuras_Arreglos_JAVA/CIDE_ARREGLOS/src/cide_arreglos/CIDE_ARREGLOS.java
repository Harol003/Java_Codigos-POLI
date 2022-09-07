/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cide_arreglos;

/**
 *
 * @author Harol
 */
public class CIDE_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Declaracion Arreglo de precios partes de computadores
        System.out.println("Array Lista de Precios de Partes HHTN");
        String utiles []={"Disco Duro", "Procesador","RAM","Monitor"};
        double precios[]={180000,1200000,450000,800000};
        System.out.println("Lista de partes y precios");
        for (int u=0;u<utiles.length;u++){
           System.out.println(utiles[u]+ " "+ precios[u]); 
        
    }
    }
    }

