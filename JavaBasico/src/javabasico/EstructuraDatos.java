/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ACER
*/
public class EstructuraDatos {
   public void array (){
       String apellido = "Lipa";
       Object [] datos = {"daniel","juan","senati","pedro",23,true,3.12}; 
       
       //obtener la cantidad de datos 
       int cantidad = datos.length;
       System.out.println("la cantidad de datos de mi array de datos es :  "+ cantidad);
       System.out.println(datos[0]);
       
       for(int i = 0 ;i <= cantidad -1; i++){
           System.out.println(datos[i]);
           if (datos [i] == "senati")
               System.out.println("se encomtro la palabra "+ datos [1]);
           
           //iterando usar est cont if ()si encuentra la palabra "senati" print por consola Se encontro la palabra : senati 
       }
   }
    public void list (){
        List <String> nombre = new ArrayList<>();
        nombre.add("Marco");
        nombre.add("Mateo");
        nombre.add("lucas");
        
        
        
        List <String> nombre1 = new ArrayList<>();
        nombre.add("juan");
        nombre.add("pedro");
        nombre.add("floriponcio");
        
        nombre.addAll( nombre1);
        
       int cantidad = nombre.size();
        
        System.out.println("cantidad de datos: "+cantidad);
        
        //obtener un dato de mi lista 
        nombre.get(0);
        System.out.println("el dato es "+ nombre.get(0));
        
        
        for(int i = 0 ;i <= cantidad -1; i+=1){
           System.out.println("el dato es: "+nombre.get(i));
           if (nombre.get(i) == "Marco"){
           System.out.println("se encomtro la palabra "+ nombre.get(1));}}
           //remover un objeto
           nombre.remove("juan");
           // para buscar un registro 
           nombre.contains("pedro");
           //para saber el indice
           nombre.indexOf("Mateo");
           //ordenas una lista 
           
           Collections.sort(nombre);
            
           Collections.reverse(nombre);
           
           //renplasar un dato 
           nombre.set(1, "polvitos");
           
           //nombre.clear();
           
        System.out.println("----------------------------------------------------");   
        for(String item:nombre){
            System.out.println("el dato es: "+item);
        } 
   
        
        
    }
 public void map (){
     Map<String, Integer > edades = new HashMap<>();
     edades.put("marta", 50);
     edades.put("julia", 20);
     edades.put("maria", 60);
     edades.put("pablo", 52);
     
     // remover un dato 
     edades.remove("julia");
     //cantidad de datos 
     edades.size();
     
     
     for (String item : edades.keySet()){
         System.out.println("clave: "+item + "valor: "+edades.get(item));
         if (edades.get(item)>=18)
             System.out.println("eres mayor de edad ");
         
         else{
            System.out.println("eres menor de edad");
         

         }
         
     }
     
     
 }       
       
   
}



   
  


