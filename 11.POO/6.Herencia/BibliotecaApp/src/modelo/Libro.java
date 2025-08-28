/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

// Clase hija Libro que hereda de Publicacion
// Agrega el atributo paginas
public class Libro extends Publicacion {
    private int paginas;

    // Constructor
    public Libro(String titulo, String autor, int paginas) {
        super(titulo, autor); // llamamos al constructor de la clase padre
        this.paginas = paginas;
    }

    // Sobreescritura del metodo mostrarInformacion
    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + ", Paginas: " + paginas;
    }
}
