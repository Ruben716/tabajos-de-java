/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ruben.pe.cmodelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ACER
 */
public class Billete {
    private int id_billete;
    private int numeroBillete;
    private Date fecha;
    private String hora;
    private String ITINERARIO;
    private int id_cliente;
    private int id_conpania;

    
    
    
    
    public int getId_billete() {
        return id_billete;
    }

    public void setId_billete(int id_billete) {
        this.id_billete = id_billete;
    }

    public int getNumeroBillete() {
        return numeroBillete;
    }

    public void setNumeroBillete(int numeroBillete) {
        this.numeroBillete = numeroBillete;
    }

    public String getFecha() {
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.format(fecha) ;
        
        
        
    }

    public void setFecha(String fecha) throws ParseException {
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        
        this.fecha = dateFormat.parse(fecha);
        
        
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getITINERARIO() {
        return ITINERARIO;
    }

    public void setITINERARIO(String ITINERARIO) {
        this.ITINERARIO = ITINERARIO;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_conpania() {
        return id_conpania;
    }

    public void setId_conpania(int id_conpania) {
        this.id_conpania = id_conpania;
    }
    
    
    
    
    
    
    
    
    
}
