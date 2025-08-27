/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polibarbershop;

/**
 *
 * @author Harol
 */

import java.time.LocalTime;


// Modelo que representa una reserva de un turno
public class Reserva {
// nombre del cliente
private String nombreCliente;
// numero de celular del cliente
private String celular;
// hora del turno (solo hora, minutos 0)
private LocalTime hora;


public Reserva(String nombreCliente, String celular, LocalTime hora) {
this.nombreCliente = nombreCliente;
this.celular = celular;
this.hora = hora;
}


// getters y setters
public String getNombreCliente() {
return nombreCliente;
}


public void setNombreCliente(String nombreCliente) {
this.nombreCliente = nombreCliente;
}


public String getCelular() {
return celular;
}


public void setCelular(String celular) {
this.celular = celular;
}


public LocalTime getHora() {
return hora;
}


public void setHora(LocalTime hora) {
this.hora = hora;
}
}