/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cide_arreglos_notas;

/**
 *
 * @author Harol
 */
public class CIDE_ARREGLOS_NOTAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("POLITECNICO INTERNACIONAL -  HHTN");
        String cursos []={"Ingenieria de Software I", "Redes","Estructura de Datos"}; 
        double nota []={3.5,4.8,5.0};
        System.out.println("Promedio de notas por asignaturas");
        System.out.println("------ ----- ");
        double pp=(nota[0]+nota[1]+nota[2])/3;
                for (int s=0;s<cursos.length;s++){
                                    System.out.println(cursos[s] + " "+nota[s]);  } System.out.println("Su Promedio es : " +pp);
    }
    
}
