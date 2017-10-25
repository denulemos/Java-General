/*
 * Al ingresar "Nombre y apellido", que la salida sea "Apellido, Nombre"
 */
package ejercicioslemos;

/**
 * @author Denisse Lemos
 */
import java.util.Scanner;
public class MiEjer08 {
    public void MiEjer(){
        
        Scanner entra0 = new Scanner (System.in);
        System.out.println ("Ejercicio 8 = Al ingresar Nombre y Apellido"
                + " va a aparecer el apellido,nombre");
       //Definicion
        String nom;
        String ape;
        //Entradas
        System.out.println("Ingrese Nombre y Apellido");
        nom = entra0.next();
        ape = entra0.next();
        //Salida
        System.out.println(ape + "," + nom);

    }
    
    
}
