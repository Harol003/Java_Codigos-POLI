/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cide_entrada_datos_buffered_reader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Harol
 */
// CIDE  ENTRADA DE DATOS
// FUNDAMENTOS DE PROGRAMACION
public class CIDE_ENTRADA_DATOS_BUFFERED_READER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
         //Ingrese datos usando BufferReader
        BufferedReader reader = 
                   new BufferedReader(new InputStreamReader(System.in));
        // Leyendo datos usando readLine
        String name = reader.readLine();
 
        // Imprimir la línea de lectura
        System.out.println(name);        
    }
    
}
