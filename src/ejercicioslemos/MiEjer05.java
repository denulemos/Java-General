/*
 *Un señor cobra un sueldo de 10k$ por 40 horas por semana, le suma a estas unas
 *25 horas extras, y se le hacen 2 descuentos, uno del 11% y otro del 3%. 
 *¿Cual es su sueldo bruto?
 *¿y su sueldo neto?
 */
package ejercicioslemos;

/**
 * @author Denisse Lemos
 */
public class MiEjer05 {
    public void MiEjer(){
        System.out.println(" Ejercicio 5= "
                + " Un señor cobra un sueldo de 10k$ por 40 horas"
                + " por semana, le suma unas 25 horas extras y se le hacen"
                + " dos descuentos, uno del 11% y otro del 3%. ¿Cual es su"
                + " sueldo bruto? ¿Cual es su sueldo neto? ");
        //Definicion
        float p1;
        float p2;
        float p3;
        float p4;
        float p5;
        //Proceso
        p1=1000/40;
        p2=p1*25+1000;
        p3=p2*11/100;
        p4=p3*3/100;
        p5=p2-p3-p4-p4;
        //Salidas
        System.out.println("El descuento por jubilacion es de= " + p3 );
        System.out.println(" El"
                + " descuento total por ley y otro, cada uno= " + p4);
        System.out.println(" El sueldo bruto es de= " + p5 +" El sueldo neto es de= " + p2);
              
    }
}
    
 
    
           
    

