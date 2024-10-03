/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaprincipal;

/**
 *
 * @author ACER
 */
import java.util.List;

public class Reserva {
    private Persona persona;
    private Habitacion habitacion;
    private List<Servicio> servicios;
    private String fechaIngreso;
    private String fechaSalida;

    public Reserva(Persona persona, Habitacion habitacion, List<Servicio> servicios, String fechaIngreso, String fechaSalida) {
        this.persona = persona;
        this.habitacion = habitacion;
        this.servicios = servicios;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
    }

    public double calcularTotal() {
        double total = habitacion.getPrecio();
        for (Servicio servicio : servicios) {
            total += servicio.getCosto();
        }
        return total;
    }

    public void mostrarReserva() {
        System.out.println("Datos de la persona:");
        persona.mostrarDatos();
        System.out.println("\nHabitacion reservada:");
        habitacion.mostrarHabitacion();
        System.out.println("\nFecha de ingreso: " + fechaIngreso);
        System.out.println("Fecha de salida: " + fechaSalida);
        System.out.println("\nServicios seleccionados:");
        for (Servicio servicio : servicios) {
            servicio.mostrarServicio();
        }
        System.out.println("\nTotal a pagar: " + calcularTotal());
    }
}

