/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioslemos;
import java.util.Scanner;


/**
 *
 * @author alumno
 */
public class Asteriscos {
    public void MiEjer(){
        Scanner entra0 = new Scanner(System.in);
        System.out.println("Ingrese un numero cualquiera");
        int num = entra0.nextInt();
        int i, v, f, l;
        f=num/2;
        for (v=0;v<num;v++){
            System.out.print("\n ");
            for (i=0;i<f;i++){
                System.out.print("*");
            }
            
                for (l=0;l<f;l++){
                    System.out.print("-");
                }
            }
                    
            
            
        }    
}
    









