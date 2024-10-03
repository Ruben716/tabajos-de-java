/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservacion;

import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author ACER
 */



public class Reserva {
    private Cliente cliente;
    private Habitacion habitacion;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private double total;

    public Reserva(Cliente cliente, Habitacion habitacion, LocalDate fechaEntrada, LocalDate fechaSalida) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        calcularTotal();
    }

    public void calcularTotal() {
        Period periodo = Period.between(fechaEntrada, fechaSalida);
        int noches = periodo.getDays();
        total = noches * habitacion.getPrecioPorNoche();
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Cliente: " + cliente + "\n" +
               "Habitación: " + habitacion + "\n" +
               "Fecha Entrada: " + fechaEntrada + "\n" +
               "Fecha Salida: " + fechaSalida + "\n" +
               "Total: $" + total;
    }
}
