/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package politecnico_volver_al_futuro;

/**
 *
 * @author Harol
 */
public class Politecnico_Volver_Al_Futuro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Crear objetos de la clase Reparto
        Reparto actor1 = new Reparto("Michael J. Fox", "Marty McFly");
        Reparto actor2 = new Reparto("Christopher Lloyd", "Dr. Emmett Brown");

        // Crear objeto de la clase Musica
        Musica bandaSonora = new Musica("Alan Silvestri");

        // Crear objetos de la clase Ventas con datos en dólares
        Ventas ventasUSA = new Ventas("Estados Unidos", 2100000);
        Ventas ventasColombia = new Ventas("Colombia", 500000);
        Ventas ventasMexico = new Ventas("México", 300000);

        // Mostrar la información en pantalla
        System.out.println("Politécnico Internacional, Asignatura: Programación Orientada a Objetos\n");
        System.out.println("=== Reparto ===");
        actor1.mostrarInformacion();
        actor2.mostrarInformacion();

        System.out.println("\n=== Banda Sonora ===");
        bandaSonora.mostrarInformacion();

        System.out.println("\n=== Ventas de la Película ===");
        ventasUSA.mostrarInformacion();
        ventasColombia.mostrarInformacion();
        ventasMexico.mostrarInformacion();
    }
    
}
