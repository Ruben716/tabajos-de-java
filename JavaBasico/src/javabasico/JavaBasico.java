/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico;

import java.util.Scanner;

public class JavaBasico {

    public void Principal (){
        System.out.println("bienbenido jsjsjs");
        System.out.println("operadores logicos ");
        System.out.println("tipos de datos  ");
        System.out.println("estructuras de comtrol ");
        System.out.println("exepciones manejo de errores  ");
        System.out.println("estructura de datos ");
        
        
        
        System.out.print("elija una obcion");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        
        switch (data) {
            case 1:
            OperadoresLogicos ol = new OperadoresLogicos();
            ol.operador();
            break;
                
            case 2:
                OperadoresLogicos la = new OperadoresLogicos();
                la.operaciones();
            break;
            
            case 3:
                OperadoresLogicos pa = new OperadoresLogicos();
                pa.detectarTipo();
                
            case 4:
                EstructurasControl es = new EstructurasControl();
                es.estructura();
                
            case 5:
                Excepciones ex = new Excepciones();
                ex.manejoError();
                break;
                
            case 6:
                EstructuraDatos ed = new EstructuraDatos();
                //ed.array();
                ed.map();
                break;
          
                
        }
    }
    
    public static void main(String[] args) {
        
        Practica pra = new Practica();
        JavaBasico jb = new JavaBasico();
        jb.Principal();
        //pra.menu();
        
        
    }
    
}
