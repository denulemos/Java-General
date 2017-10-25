/*
Dada la TNA que me brinda una financiera y el capital invertido, se pide:
Efectuar un programa que calcule el total obtenido al cabo de un año si
se invierte en periododo mensuales con capitalizacion y la TEA.
 */
package ejercicioslemos;

import java.util.Scanner;

/**
 * @author Denisse Lemos
 */
public class MiEjer13 {
    public void MiEjer()
    {
        System.out.println(" Ejercicio 13: "
                + " Dada la TNA que me brinda una financiera y el"
                + " capital invertido, se pide: Efectuar un programa"
                + " que calcule el total obetido al cabo de un año si"
                + " se invierte en periodo mensuales con capitalizacion"
                + " y la TEA ");
        Scanner entra0 = new Scanner(System.in);
        //Definicion de variables
        double capital, TNA = 0;
        double total, TEA;
        double tasa;
        int i = 0; //Variable de control para el ciclo repetitivo
        
        //Entradas
        System.out.print("Ingrese el Capital invertido: ");
        
        while (!entra0.hasNextDouble()) //Mientras la entrada no sea decimal, aparece ese cartel
        {
            System.out.println("Error: Ingrese un numero decimal");
            entra0.next();
        }
        TNA=entra0.nextDouble();
        
        System.out.println("Ingrese la TNA: ");
        if (entra0.hasNextDouble()) //Si la entrada es un decimal
        {
        TNA = entra0.nextDouble();
        }
        else //Si no es un decimal...
        {
            System.out.println("Error: Ingrese un numero decimal");
        }
        // PROCESO
        
        total = 1000;
        TEA = 10;
        
        //Salidas
        System.out.println("El total obtenido es: " + total);
        System.out.println("La TEA obtenida es: " + TEA);
    }
    
}
