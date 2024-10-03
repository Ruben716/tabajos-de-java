/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaprincipal;

/**
 *
 * @author ACER
 */
public class Servicio {
    private String descripcion;
    private double costo;

    public Servicio(String descripcion, double costo) {
        this.descripcion = descripcion;
        this.costo = costo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void mostrarServicio() {
        System.out.println("Servicio: " + descripcion);
        System.out.println("Costo: " + costo);
    }
}

