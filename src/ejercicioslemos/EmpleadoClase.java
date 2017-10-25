/*
 * Construir un programa que solicite el sueldo basico, la categoria, 
 * la fecha de ingreso y las horas trabajadas en el mes de un empleado
 * Se debe calcular: antiguedad en años, sueldo 1 (sb + 10%)
 * s2 (s1+antiguedad/2) y s3 (sueldo2+/- (ht-160))
 */
package ejercicioslemos;
import java.util.Calendar;
import java.util.Scanner;
import java.util.GregorianCalendar;

/**
 *
 * @author denulemos
 */
public class EmpleadoClase {
    public void Emple(){
        int sb = 0, d, m, a, hs, ant, cat, s1 = 0,s2;
        
         Calendar fecha = new GregorianCalendar();
         int año = fecha.get(Calendar.YEAR);
        Scanner entra0 = new Scanner (System.in);
        System.out.println("Ingrese Sueldo basico");
        if (entra0.hasNextInt())
        {
            sb=entra0.nextInt();
        }
        else
        {
            System.out.println("ERROR= Ingrese un numero valido por favor");
        }
        System.out.println("Ingrese año de ingreso");
        if (entra0.hasNextInt())
        {
            a= entra0.nextInt();
            ant = (a-año);
        }
        else
        {
            System.out.println("ERROR = Ingrese un año valido");
        }
        System.out.println("Ingrese categoria");
       if (entra0.hasNextInt())
       {
           ant = entra0.nextInt();
       }
        else
       {
           System.out.println("ERROR Ingrese dato valido");
       }
       
      int s11=sb*10/100;
      int  ss1=s11+sb;
       int s21=s1*2/100;
      int ss2= ant/s21;
       ss2= s1+s2;
               
               
       
               System.out.println("Sueldo 1 = " ss1);
               System.out.println("Sueldo 2 = " ss2);
               
    }
}
