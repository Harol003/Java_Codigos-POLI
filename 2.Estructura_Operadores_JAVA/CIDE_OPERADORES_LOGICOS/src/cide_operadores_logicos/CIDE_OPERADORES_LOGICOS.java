/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cide_operadores_logicos;
import java.util.Scanner;
/**
 *
 * @author Harol
 */
// CIDE  OPERADORES
// FUNDAMENTOS DE PROGRAMACION
// PROF. HAROL TORRES
public class CIDE_OPERADORES_LOGICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String x = "CIDE";
        String y = "FProgramacion*";
 
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese usuario:");
        String uuid = s.next();
        System.out.print("Ingrese contraseña:");
        String upwd = s.next();
 
        // Verifique si el nombre de usuario y la contraseña coinciden o no.
        if ((uuid.equals(x) && upwd.equals(y)) || 
                (uuid.equals(y) && upwd.equals(x))) {
            System.out.println("Bienvenido usuario.");
        } else {
            System.out.println("ID o Contraseña equivocada");
        }
    }
    
}
