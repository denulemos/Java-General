/*
 * Creo una clase que solicite 2 números enteros 
 * y muestre el cociente entre ambos validando la entrada y Ejericio de 
 * lineas y asteriscos
 */
package ejercicioslemos;

import java.util.Scanner;

/**
 * @author DenisseLemos
 */
public class ECiclos1 {
    /*public void MiEjer()
    {
        Scanner entra0 = new Scanner(System.in);
        
        int divisor, dividendo;
        double resultado;

        System.out.print("Ingrese el divisor entero: ");
        while(!entra0.hasNextInt())
        {
            System.out.print("\nERROR debe ingresar un entero: ");
            entra0.next();
        }
        divisor = entra0.nextInt();
        
        
        System.out.print("Ingrese el dividendo entero: ");
        while(!entra0.hasNextInt())
        {
            System.out.print("\nERROR debe ingresar un entero: ");
            entra0.next();
        }
        dividendo= entra0.nextInt();

        resultado = divisor / (double) dividendo;
        System.out.println("La division es: " + resultado); 
        
        
    }*/
       public void MiEjer(){ //Ejercicio Asteriscos y Lineas EJ1
        Scanner entra0 = new Scanner (System.in);
   
        
        //Validar que el numero ingresado este entre 5 y 80
        
        
         
        System.out.println("Ingrese un numero cualquiera (5 a 80)");
        int num1 = entra0.nextInt();  
        
        int i, v;
        
        for (v=0;v<num1;v++){
        System.out.print("\n *");
        
      for (i=1;i<num1;i++){
            System.out.print("*");
            
       }
              }
    
       

    
    // Cambiar la linea de comentario por los 2 ejercicios para
 //correrlos por separado

