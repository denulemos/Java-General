/*Dada la fecha de ingreso de un empleado, hacer un algoritmo que diga su 
 * antiguedad
 */
package ejercicioslemos;

/**
 * @author denulemos
 */
import java.util.Scanner;
public class MiEjer11 {
    public void MiEjer(){
        System.out.println("Dada la fecha de ingreso de un emplado, hacer "
                + " un algoritmo que diga su antiguedad en años");
Scanner entra0=new Scanner (System.in);
//Definicion variables
float aa;
float ai;
float ant;
//entradas
System.out.println("INGRESE AÑO ACTUAL Y AÑO DE INGRESO");
aa=entra0.nextFloat();
ai=entra0.nextFloat();
//proceso
ant=aa-ai;
//salidas
System.out.println("El emplado posee= " + ant + "años de antiguedad");

       
    }
    
}
