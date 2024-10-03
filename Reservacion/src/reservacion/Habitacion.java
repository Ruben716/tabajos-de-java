/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservacion;

/**
 *
 * @author ACER
 */

public class Habitacion {
    private int numero;
    private double precioPorNoche;

    public Habitacion(int numero, double precioPorNoche) {
        this.numero = numero;
        this.precioPorNoche = precioPorNoche;
    }

    public int getNumero() {
        return numero;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    @Override
    public String toString() {
        return "Habitacion " + numero + " - $" + precioPorNoche + " por noche";
    }
}
