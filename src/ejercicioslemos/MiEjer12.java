/*
 * Dada una fecha cualquiera, cuantos meses pasaron desde el 8/5/5?
 */
package ejercicioslemos;

/**
 * @author denulemos
 */
import java.util.Scanner;
public class MiEjer12 {
    public void MiEjer(){
        //Definicion Variables
        Scanner entra0=new Scanner (System.in);
        float d;
        float m;
        float a;
        float p1;
        float p2;
        float mp;
        //Entradas
        System.out.println("INGRESE DIA, MES Y AÑO");
        d=entra0.nextFloat();
        m=entra0.nextFloat();
        a=entra0.nextFloat();
        //Proceso
        p1=a-05*12;
        p2=6-m;
        mp=p1+p2;
        //SALIDA
        System.out.println("Pasaron " + mp + " meses desde el 8/5/5 y "
                + d + " dias");
        
                
    }
}
