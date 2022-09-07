/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cide_arreglos_datos;

/**
 *
 * @author Harol
 */
public class CIDE_ARREGLOS_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ARREGLO CAPACIDADES DE DISCOS POR FABRICANTE HHTN");
        String discos []={"Kingstong", "AData","Seagate","Western"};
        int capacidad []={25,30,19,22}; 
        char tamano []={'G','G','T','T'};
        System.out.println("Datos de capacidad de los discos duros"); System.out.println("Discos por capacidad");
        System.out.println("------- ---- ----");
       for (int u=0;u<discos.length;u++){
                                             System.out.println(discos[u]+ " "+ capacidad [u] + " " + tamano[u]); 
} 
        
        
        
    }
    
}
