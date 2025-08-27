/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polibarbershop;

/**
 *
 * @author Harol
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.format.DateTimeFormatter;
import java.util.Map;

// Clase utilitaria para exportar agenda a CSV o texto
public class ExportadorCSV {
    public static boolean exportarAgendaCSV(File archivo, Barbero barbero, Agenda agenda) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
            // cabecera
            bw.write("Barberia: Polibarbershop\n");
            bw.write("Barbero: " + barbero.getNombre() + "\n");
            bw.write("Hora,Estado,Cliente,Celular\n");
            for (Map.Entry<java.time.LocalTime, Reserva> e : agenda.obtenerTurnosMap().entrySet()) {
                String hora = e.getKey().format(formato);
                Reserva r = e.getValue();
                String estado;
                String cliente = "";
                String celular = "";
                if (e.getKey().getHour() == 13) {
                    estado = "Almuerzo";
                } else if (r == null) {
                    estado = "Libre";
                } else {
                    estado = "Ocupado";
                    cliente = r.getNombreCliente();
                    celular = r.getCelular();
                }
                bw.write(String.format("%s,%s,%s,%s\n", hora, estado, cliente, celular));
            }
            bw.flush();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}