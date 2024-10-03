/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico;

import java.util.Scanner;

public class Practica {
    
    // switch case 
    public void menu (){
        System.out.println("1 elige una obcion:");
        System.out.println("2 opcion Desayuno");
        System.out.println("3 opcion almuerzo");
        System.out.println("4 opcion cena");
        System.out.println("5 opcion extras");
        System.out.println("6 opcion salir");
        
        System.out.print("elija una obcion");
        
        Scanner sc = new Scanner(System.in);
        int Usuario = sc.nextInt();
        
        switch (Usuario) {
            case 1:
                System.out.println("jugo de papaya");
                System.out.println("jugo de caldito de cabeza");
                System.out.println("jugo de caldito de cordero");
                
                break;
                
            case 2 :
                System.out.println("estofado");
                System.out.println("lomo montado");
                break;
           
                
            case 3:
                System.out.println("pollo ala brasa");
                break;
                
                
            case 4:
                System.out.println("no hay no exixte");
                break;
                
            case 5:
                System.out.println("no hay extras");
                
            case 6:
                System.out.println("salir");
                
             default:
                 System.out.println("gracias por la compra");
        }
    }
}
