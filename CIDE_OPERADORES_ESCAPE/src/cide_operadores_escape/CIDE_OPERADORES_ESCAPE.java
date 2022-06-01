/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cide_operadores_escape;

/**
 *
 * @author Harol
 */
// CIDE  OPERADORES
// FUNDAMENTOS DE PROGRAMACION
// PROF. HAROL TORRES
public class CIDE_OPERADORES_ESCAPE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String cabecera = "\n\tPRONOSTICO DE CLIMA:\n" ;
        cabecera += "\n\tDia\t\tMañana\tNoche\tCondiciones\n" ;
        cabecera += "\t---\t\t-------\t----\t-----------\n" ;

        String pronostico = "\tDomingo\t25C\t\t23C\t\tSoleado\n";
        pronostico += "\tLunes\t24C\t\t19C\t\tSoleado\n";
        pronostico += "\tMartes\t26C\t\t15C\t\tNublado\n";

        System.out.print(cabecera+pronostico) ;
    }
    
}
