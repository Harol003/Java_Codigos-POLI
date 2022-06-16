/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos_poli;

/**
 *
 * @author Harol
 */

import java.util.Arrays;

public class Arreglos_POLI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] enteros = new int[100]; // un arreglo de 100 enteros
		String[] strings = new String[5]; // un arreglo de 5 strings
		
		int N = 5; // esto se puede leer de la entrada estandar
		double[] datos = new double[N];
		
		for(int i = 0; i < N; i++) {
			datos[i] = 1.4523; // inicializar los valores
		}
		
		for(double d: datos) { // equivalente a "for d in datos:" de python
			// esta forma no sirve para inicializar un arreglo
			// pero puede ser mas rapido para leer
			// System.out.println(d); 
		}
		
		N = 3;
		int M = 4; 
		/* esto se puede ver como una matriz de N filas y M columnas
		 * ... o N columnas y M filas; lo que importa es que siempre se mantenga la misma convencion
		 */
		
		int[][] matriz = new int[N][M];
		// la matriz esta inicializada, no asi sus elementos
		
		for(int fila = 0; fila < N; fila ++) {
			matriz[fila] = new int[M]; // cada fila es un arreglo con M celdas (columnas)
			for(int c = 0; c < M; c ++) {
				matriz[fila][c] = c + 1;
			}
		}
		
		// esto es util para depurar, imprime arreglos
		System.out.println(Arrays.toString(datos));
		// > [1.4523, 1.4523, 1.4523, 1.4523, 1.4523]
		
		// y para imprimir arreglos de arreglos
		System.out.println(Arrays.deepToString(matriz));
		// > [[1, 2, 3, 4], [1, 2, 3, 4], [1, 2, 3, 4]]
        
        
    }
    
}
