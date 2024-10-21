/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ruben.pe.cmodelo;

/**
 *
 * @author ACER
 */
public class ComboItem {

   

   
    private class ComboIten {
    private int id;
    private String nombre; // Cambiado de 'label' a 'nombre'

    public ComboIten(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() { // Cambiado de 'getLabel' a 'getNombre'
        return nombre;
    }

    @Override
    public String toString() {
        return nombre; // Mostrar 'nombre' en el combo box
    }
}

}
