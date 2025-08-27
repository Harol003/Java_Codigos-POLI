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
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


// Modelo que gestiona la agenda de un barbero (almacena reservas en memoria)
public class Agenda {
// mapa de turnos: clave = hora (LocalTime), valor = Reserva o null si libre
private Map<LocalTime, Reserva> turnos;


// definicion de horario: desde 8 hasta 17 (ultimo turno 16-17), almuerzo 13-14
private static final int HORA_INICIO = 8; // 8:00
private static final int HORA_FIN_EXCLUSIVO = 17; // 17:00 (no se crea turno 17-18)
private static final int HORA_ALMUERZO = 13; // 13:00 (turno 13-14 reservado para almuerzo)


public Agenda() {
turnos = new LinkedHashMap<>();
inicializarTurnos();
}


// inicializa los turnos por hora excluyendo la hora de almuerzo
private void inicializarTurnos() {
turnos.clear();
for (int h = HORA_INICIO; h < HORA_FIN_EXCLUSIVO; h++) {
if (h == HORA_ALMUERZO) {
// marcar almuerzo con null o con una reserva especial si se quiere
turnos.put(LocalTime.of(h, 0), null);
continue;
}
turnos.put(LocalTime.of(h, 0), null);
}
}


// devuelve la lista de horas disponibles (en orden)
public List<LocalTime> obtenerHoras() {
return new ArrayList<>(turnos.keySet());
}


// verifica si un turno esta libre
public boolean estaLibre(LocalTime hora) {
if (!turnos.containsKey(hora)) return false;
return turnos.get(hora) == null;
}


// reserva un turno (retorna true si se pudo, false si ya estaba ocupado o no existe)
public boolean reservarTurno(LocalTime hora, Reserva reserva) {
if (!turnos.containsKey(hora)) return false;
if (hora.getHour() == HORA_ALMUERZO) return false; // no reservar almuerzo
if (turnos.get(hora) != null) return false; // ya ocupado
turnos.put(hora, reserva);
return true;
}


// liberar un turno
public boolean liberarTurno(LocalTime hora) {
if (!turnos.containsKey(hora)) return false;
turnos.put(hora, null);
return true;
}


// obtener reserva de una hora (puede ser null)
public Reserva obtenerReserva(LocalTime hora) {
return turnos.get(hora);
}


// obtener todas las reservas (hora -> reserva) en orden
public Map<LocalTime, Reserva> obtenerTurnosMap() {
return new LinkedHashMap<>(turnos);
}
}