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
public class Excepciones {
    
    public void manejoError (){
       
        Scanner sc = new Scanner(System.in);
        
        try {//intentar 
            System.out.println("ingresa un numero");
            int num = sc.nextInt();
        } catch (Exception e) {
            System.out.println("ocurrio un error"  +e .getMessage());
        } finally {
            System.out.println("este bloque se ejecuta siempre");
            sc.close();
                    
              
        }
    }
    
}
