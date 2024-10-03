
package javabasico;

import java.util.Scanner;


public class OperadoresLogicos {
    
    public void operador (){
        boolean esVerdadero = true;
        boolean esFalso = false;
        
        
        //and operador (&&)
        boolean resultado = esVerdadero && esFalso;
        System.out.println("el resulyado es de and " +resultado);
       
  
        boolean resuldato1 =esVerdadero || esFalso;
        System.out.println("el resultado de or  "+ resuldato1);
        
        
         boolean resuldato2 =  !esVerdadero  ;
        System.out.println("el resultado de or  "+ resuldato2);
    }
    
    public void operaciones(){
        
        System.out.print("ingrese los 2 numeros");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();


        int suma = n1 + n2;
        System.out.println("la suma es  " +suma);
        int resta = n1 -n2;
        System.out.println("la resta es "+  resta);
        int multiplicacion = n1 * n2 ;
        System.out.println("la multiplicacion es "+ multiplicacion);
        int divicion = n1 /n2 ;
        System.out.println("la divicion es " + divicion);
    }
    
public void detectarTipo() {

    int numero = 123;           // int
    double decimal = 12.34;     // double
    String string = "Hola mundo";  // String
    boolean valores = true;     // boolean
    Object cualquiera = 5;      // Object

    System.out.println("El tipo de dato de 'numero' es: " + ((Object) numero).getClass().getSimpleName());
    System.out.println("El tipo de dato de 'decimal' es: " + ((Object) decimal).getClass().getSimpleName());
    System.out.println("El tipo de dato de 'string' es: " + string.getClass().getSimpleName());
    System.out.println("El tipo de dato de 'valores' es: " + ((Object) valores).getClass().getSimpleName());
    System.out.println("El tipo de dato de 'cualquiera' es: " + cualquiera.getClass().getSimpleName());

}
}

