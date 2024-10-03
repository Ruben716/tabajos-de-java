/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaprincipal;

/**
 *
 * @author ACER
 */
public class Habitacion {
    private String tipo;
    private double precio;
    private boolean disponible;

    public Habitacion(String tipo, double precio) {
        this.tipo = tipo;
        this.precio = precio;
        this.disponible = true;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void reservar() {
        this.disponible = false;
    }

    public void mostrarHabitacion() {
        System.out.println("Tipo de habitacion: " + tipo);
        System.out.println("Precio: " + precio);
        System.out.println("Disponible: " + (disponible ? "Si" : "No"));
    }
}

