/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cide_poo_objeto_perro;

/**
 *
 * @author Harol
 */
public class CIDE_POO_OBJETO_PERRO {

    /**
     * @param args the command line arguments
     */
    // CIDE  TIPOS DE DATOS
   // PROGRAMACION + POO + CREAR OBJETO
    
    
    // Variables de instancia
    String nombre;
    String raza;
    int edad;
    String color;
 
    // Declaración del constructor de clase
    public CIDE_POO_OBJETO_PERRO(String nombre, String raza,
                   int edad, String color)
    {
        this.nombre = nombre;
        this.raza= raza;
        this.edad = edad;
        this.color = color;
    }
    // Metodo 1
    public String getNombre ()
    {
        return nombre;
    }
      // Metodo 2
    public String getRaza ()
    {
        return raza;
    }
      // Metodo 3
    public int getEdad ()
    {
        return edad;
    }
      // Metodo 4
    public String getColor ()
    {
        return color;
    }
    
    @Override
    public String toString ()
    {
     return (
             "CIDE Mascota Virtual"+
             ".\n Humano soy tu mascota virtual mi nombre es "+ this.getNombre()+
               ".\n Mi raza, edad y color son: " +
               this.getRaza()+"," + this.getEdad()+
               ","+ this.getColor());
             
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        CIDE_POO_OBJETO_PERRO Lulu  = new   CIDE_POO_OBJETO_PERRO ("Lulu","Beagle", 5, "Blanco y Negro");
        System.out.println(Lulu.toString());
       
    }
    
}
