/*
 * Se vende una casa en 10k$ con la comision del 2% del vendedor, 
 * y el comprador debe abonar, ademas, su parte de la comision (2%)
 * ¿Cuanto debe abonar el comprador?
 */
package ejercicioslemos;

/**
 * @author Denisse Lemos
 */
public class MiEjer06 {
    public void MiEjer(){
        System.out.println("Ejercicio 06= "
                + " Se vende una casa en 10k$ con la comision del 10%"
                + " del vendedor. El comprador, ademas, debe abonar su parte"
                +" de la comision que es un 2% tambien. ¿Cuanto debe pagar?" );
        //Definicion
        float pf;
        float comp;
        float finale;
        pf=10000;
        //Proceso
        comp=pf*2/100;
        finale=pf+comp;
        //Salida
        System.out.println("El comprador debe abonar= " + finale);
                
        
               
    }
    
}
