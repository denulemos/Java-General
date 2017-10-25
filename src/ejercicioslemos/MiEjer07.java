/*
 * Mostrar el numero que se ingreso de entrada (Poner nextLine en vez de
 * nextFloat para frase
 */
package ejercicioslemos;

/**
 * @author Denisse Lemos
 */
import java.util.Scanner;
public class MiEjer07 {
    public void MiEjer(){
        System.out.println("Ejercicio 7 = Mostrar el numero que se ingreso de entrada");
        Scanner entra0 = new Scanner(System.in);
        //Deficion
        float num0;
        //Entrada
        System.out.println("Ingese un numero cualquiera = ");
        num0=entra0.nextFloat();
        //Salida
        System.out.println(num0);
        
        
    }
}
