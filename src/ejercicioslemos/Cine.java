/*
 * Ingresamos las edad de la gente que entra a un cine y el limite de edad del 
* film, cuando ingresa
* un menor, mostramos un cartel indicando que no puede entrar por ser menor. 
* además se solicita al finalizar la funcion, poder consultar cuantos menores intentaron 
* ingresar  sus respectivas edades. La capacidad de la sala es de 10 personas
 */
package ejercicioslemos;
import java.util.Scanner;


/**
 *
 * @author Denisse Lemos
 */
public class Cine {
    public void MiEjer(){
        
 /*       "film" es la edad de referencia; 
"i" el contador del array guarda edades de menores;
 "b" es el contador de espectadores que ingresaron;
"c" sirve como aviso de dato correcto;
 "d" es el contador de cantidad de no-ingresantes;
(y "e", definida abajo, es un para recorrer el array.
        Podría usarse tambien i, b, c o d)
        
 "edades" array para guardar edades de no-ingresantes
 
*/
 
    int film=0, i=0, b=0, c=0,d=0;
        String ingreso="";
        int [] edades = new int[100];
        
        Scanner entrada = new Scanner (System.in);
  
//Permite ingresar la mínima edad permitida:

  
        System.out.println("Ingrese límite de edad del film: ");

//Corrobora que el dato ingresado sea válido:        

while(!entrada.hasNextInt()){
        System.out.println("Ingrese límite de edad del film: ");
    entrada.next();
    }

        film = entrada.nextInt();

/*El for sólo sumará si hay ingresantes, por eso la tercer condición está vacía,
        el contador incrementará dentro del programa
        */

        for(b=0;b<10;){
                   
/*La siguientes lineas comprueban que el dato sea correcto, utilizando una variable
a modo de bandera (o "flag") que alerte si lo ingresado correspoende a las opciones

Me tomé la libertad de utilizar un DO WHILE porque me pareció, en este caso,
lo más práctico para hacer el bucle:*/

       do{ System.out.print("¿Ingresa nuev@ espectador/a? (S para SI, N para NO)");
        ingreso = entrada.next();
        
        if(ingreso.equalsIgnoreCase("S")){
            c=1;
        }
        else{
            if(ingreso.equalsIgnoreCase("n")){
                c=1;
            }
        }
       }
       while(c!=1);
     
        
/*Se plantean los distintos casos. 
       En caso de que ingrese nuevo espectador, se analiza su
       edad y se decide su ingreso (suma contador de sala) o se lo niega (guarda edad)
       En caso de que no ingresen más espectadores, salta al fin del programa y se 
       muestran los resultados solictados:
       */           
        
        if(ingreso.equalsIgnoreCase("S")){
            System.out.println("Ingrese edad de espectador: ");
          while(!entrada.hasNextInt()){  
            System.out.println("Ingrese edad de espectador: ");
          entrada.next();
            
          }
          edades[i]= entrada.nextInt();
   /*
          Se define como condición que para quien tenga menos de 1 año no rige la
          restricción etaria
          
          */       
            if((edades[i]<film)&(edades[i]!=0)){
                System.out.println("NO INGRESA");
                
                i++;
                d++;
                
            }else{
                System.out.println("ADELANTE");
                b++;
                edades[i]=0;
            }               
        }
/*
        En caso de no haber más ingresos, se recorren todas las posiciones del array,
        se llenan todos con datos vacíos
        y se da por terminado así el for inicial
        */        
        else{
            if(ingreso.equalsIgnoreCase("N")){
                i++;
                        
            while(i<100){
                edades[i]=0;
                i++;
             }
            }
        }
        }
/*
        Agrego dato de salida, capicidad de sala para derminar por qué se detuvo el programa,
        si por sala llena o porque no hubo más ingresos (empezó la película)
        */        
        System.out.print("Sala llena al " +(b*100/10)+"% \n");
        
        /*
        Diferencio sentencia final para cuidar la redacción de la frase de salida
        Distinguiendo los casos: nulos, singular y plural de "no-ingresantes"
        */
        if(d==0){
            System.out.print("Ningún menor intentó ingresar. \n");
        }
        else{
            
        if(d==1){
           System.out.print("No ingresó " +d+ " menor. \n"); 
        } else{
            System.out.print("No ingresaron " +d+ " menores. \n");
        }
        /*
        Se listan las edades
        Se cuidó de al momento de hacer la lista, figure la primer posición sea 1° y no  0°
        */
        for(int e=0;e<10;e++){
            if(edades[e]!=0){
                System.out.println("La edad del " +(e+1)+ "° menor fue de "+edades[e]+ " años.");
            }
            
        }
        }
        /*
        TELÓN
        */
    }  
}
 
    

