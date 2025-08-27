/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polibarbershop;

/**
 *
 * @author Harol
 */

/* ------------------- Barbero.java ------------------- */
import java.awt.Image;
import javax.swing.ImageIcon;


// Modelo que representa un barbero
public class Barbero {
// nombre del barbero (sin tildes)
private String nombre;
// foto del barbero como ImageIcon (puede ser null si no hay foto)
private ImageIcon foto;


public Barbero(String nombre) {
this.nombre = nombre;
this.foto = null;
}


// getters y setters
public String getNombre() {
return nombre;
}


public void setNombre(String nombre) {
this.nombre = nombre;
}


public ImageIcon getFoto() {
return foto;
}


public void setFoto(ImageIcon foto) {
this.foto = foto;
}


@Override
public String toString() {
return nombre;
}
}