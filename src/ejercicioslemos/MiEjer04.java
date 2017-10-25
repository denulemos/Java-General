/*
 * Tengo un cupon de descuento del 10% del valor sin impuestos de mi compra, y 
 * estoy comprando 1000 unidades de 5$ cada uno, un objeto que despues de las
 * 800 unidades tiene un 10% de descuento, y tambien 50 unidades de 20$ c/u
 * todo esto con el 21% de impuesto. ¿Cuanto abono en total?
 */
package ejercicioslemos;

/**
 * @author Denisse Lemos
 */
public class MiEjer04 {
    public void MiEjer(){
        System.out.println(" Ejercicio 4= Tengo un cupon de descueno del 10% "
                + " del valor sin "
                + "impuestos de mi compra, y estoy comprando 1000 unidades "
                + "de 5$ cada uno, un objeto que despues de las 800 unidades "
                + "tiene un 10% de descuento, y tambien 50 unidades de 20$ "
                + "cada uno. Todo esto con el 21% de impuestos "
                + "¿Cuanto abono en total? ");
        //Definicion Variables
        float p1;
        float p2;
        float p3;
        float p4;
        float p5;
        //Proceso
        p1 = 1000*50;
        p2 = p1*90/100;
        p3 = p2+50*20;
        p4 = p3*90/100;
        p5 = p4*121/100;
        //Salidas
        System.out.println ("El resultado es= " + p5);
        
                
                
    }
    
}
