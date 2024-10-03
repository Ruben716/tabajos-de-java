/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class EstructurasControl {
    
    private int edad;
    public  void estructura (){
        System.out.print("ingreses su edad");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        
        if (edad >= 18 && edad<49){
            System.out.println("es mayor de edad");
            
            
        }else if (edad >= 50 && edad >89){
            System.out.println("estas viejo");
            
        }else;
            System.out.println("estas muerto");
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
