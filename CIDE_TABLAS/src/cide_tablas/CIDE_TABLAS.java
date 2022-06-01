/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cide_tablas;

/**
 *
 * @author Harol
 */
// CIDE  TABLAS N-DIMENSIONAL
// FUNDAMENTOS DE PROGRAMACION
public class CIDE_TABLAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int t[][]; // definimos t como una tabla bidimensional
t = new int [5][5]; // creamos la tabla de 5x5
for (int i=0;i<5;i++) // utilizamos i para la primera dimensión
{
for (int j=0;j<5;j++) // utilizamos j para la segunda dimensión
{
t[i][j]=i+j;
}
}
System.out.println("TABLA: ");
for (int i=4;i>=0;i--)
{
System.out.println();
for (int j=0;j<5;j++)
{
System.out.print(t[i][j]+" ");
}
}
System.out.print("CIDE N*5 - PROF. HAROL TORRES ");
}

    }
    
