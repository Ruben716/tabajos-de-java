/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico;

/**
 *
 * @author ACER
 */
public class NewClass {
    public void array() {
        String apellido = "Lipa";
        Object[] datos = {"daniel", "juan", "senati", 23, true, 3.12};

        // Obtener la cantidad de datos
        int cantidad = datos.length;
        System.out.println("La cantidad de datos de mi array es: " + cantidad);
        System.out.println(datos[0]);  

        // Recorrer el array
        for (int i = 0; i <= cantidad - 1; i++) {
            System.out.println(datos[i]);  

            // Verificar si el dato es "senati"
            if (datos[i] instanceof String && datos[i].equals("senati")) {
                System.out.println("Se encontró la palabra: senati");
            }
        }
    
}
}
