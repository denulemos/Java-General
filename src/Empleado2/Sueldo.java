/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado2;


import java.time.LocalDate;

/**
 *
 * @author alumno
 */
public class Sueldo {
    //Entradas (Los pase a CSueldo)
   private Empleado emple0;
    
    //Salidas
    public int Anti;
    public double Sueldo1;
    public double Sueldo2;
    public double Sueldo3;

    
    public void CSueldo(double SBasico, LocalDate FIngreso, String Cate,
               int HTra) //Ahora todos los calculos se hacen con el parametro
                         //de CSueldo, que es publico
    {
        /*Anti = Fecha actual - Fecha de ingreso Como la piden en años, me vasta restar
                año actual menos año de ingreso*/
        
        Anti = LocalDate.now().getYear() - FIngreso.getYear();
        
        Sueldo1 = SBasico + SBasico * 10 / 100;
        Sueldo2 = Sueldo1 + Sueldo1 * (Anti/2) / 100;
        Sueldo3 = Sueldo2 + Sueldo2 * (HTra-160) / 100;
    }
     public void CSueldo(double SBasico, String Cate, int HTra) //Ahora todos los calculos se hacen con el parametro
                         //de CSueldo, que es publico
    {
        /*Anti = Fecha actual - Fecha de ingreso Como la piden en años, me vasta restar
                año actual menos año de ingreso*/
        
        
        
        Sueldo1 = SBasico + SBasico * 10 / 100;
        Sueldo2 = Sueldo1 ; //Calculo sin Antiguedad
        Sueldo3 = Sueldo2 + Sueldo2 * (HTra-160) / 100;
    
        //Como pueden haber dos metodos llamados igual? Porque el primero tiene
        //parametros distintos al segundo, el segundo no tiene antiguedad
        //si fueran exactamente iguales ahi si me tiraria un error.
        //Esto se llama SOBRECARGA DE METODOS, el nombre del metodo no es solo
        //el CSueldo, si no TODO, hasta los parametros que posee entre parentesis,
        //incluyendo el tipo de dato del mismo, puede ser int x y en otro es
        //string x y ya lo toma como distinto. 
        //Al llamarlo en el main por su nombre, aparece el nombre y sus
        //parametros para difrenciarlos, junto con su valor de retorno
        
        
     }
   
}
