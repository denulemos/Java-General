/*
 * Dado el sueldo basico mensual de un empleado trabajando 40 horas por semana
 * y la cantidad de horas extras simples efectuadas en un mes, confeccione
 * un algoritmo que calcule el sueldo neto, bruto y los descuentos
 * (11% y 3% y otro 3% mas)
 */
package ejercicioslemos;

/**
 * @author Denisse Lemos
 */
import java.util.Scanner;
public class MiEjer09 {
    public void MiEjer(){
        
         Scanner entra0 = new Scanner (System.in);
         System.out.println(" Ejercicio 9= "
                 + " Dado el sueldo basico mensual de un empleado"
                 + " trabajando 40 horas por semana, y la cantidad de horas"
                 + " extras simples efectuadas en un mes, confeccione un"
                 + " algoritmo que calcule el sueldo neto, bruto y los "
                 + " descuentos ");
         //Definicion
         float sm0;
         float hx1;
         float sh;
         float se;
         float dj;
         float dos;
         float sb;
         //Entradas
         sm0=entra0.nextFloat();
         hx1=entra0.nextFloat();
         //Proceso
         sh=40*4/sm0;
         se=hx1*sh+sm0;
         dj=se*11/100;
         dos=se*3/100;
         sb=se-dj-dos*2;
         //Salidas
         System.out.println("El sueldo neto es de = " + se);
         System.out.println("El decuento por jubilacion es de = " + dj);
         System.out.println("El descuento por obra social es de = " + dos);
         System.out.println("El descuento por ley es de = " + dos);
         System.out.println("El sueldo bruto es de= " + sb);
                
        
    }
    
}
